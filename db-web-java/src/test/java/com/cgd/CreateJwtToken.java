package com.cgd;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
public class CreateJwtToken {
    @Test
    public static void main(String[] args) throws InterruptedException {
        //创建jwt令牌
        JwtBuilder builder = Jwts.builder()
                .setId("111321312311") // 设置附加信息
                .setSubject("陈国栋")
                .setIssuedAt(new Date()) //设置签发时间
                .setExpiration(new Date(System.currentTimeMillis() + 1000 *3)) // 设置3秒过期
                .signWith(SignatureAlgorithm.HS256, "chenguodong"); // signWith中的key不能短于四位数

        String token = builder.compact();
        System.out.println("builder = " + token);

        // Thread.sleep(10000);

        // token解析
        // 获取荷载
        Claims claims = Jwts.parser()
                .setSigningKey("chenguodong")
                .parseClaimsJws(token)
                .getBody();

        System.out.println("claims.getId() = " + claims.getId()); // 获取id
        System.out.println("claims.getSubject() = " + claims.getSubject()); // 获取附件信息
        System.out.println("claims.getIssuedAt() = " + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(claims.getIssuedAt())); // 获取签发时间
        System.out.println("claims.getExpiration() = " + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(claims.getExpiration())); // 获取过期时间

        Thread.sleep(5000);
        // 过期之后再次parser会报错, 但是claims.getId()等操作是正常的,因为解析的时候还未过期
        Claims claims2 = Jwts.parser()
                .setSigningKey("chenguodong")
                .parseClaimsJws(token)
                .getBody();



    }
}
