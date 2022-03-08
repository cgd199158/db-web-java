package com.cgd;

import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

public class EqualsAndHashCodeDemo {
    public static void main(String[] args) {
        Dog xiaohuan = new Dog("1", "小黄", 3, "12");
        Dog xiaohei = new Dog("2", "小黑", 3, "12");

        // 在不写任何注释的情况下调用equals返回false
        System.out.println(xiaohei.equals(xiaohuan)); // false

        // 为Animal添加 @EqualsAndHashCode(callSuper = false)时
        // 表示在调用equals和hashCode不会使用父类的属性,那么就只会比较子类的属性,那么治理就会返回true
        // callSuper表示是否比较父类的属性
        // @Data注解等同于@Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode
        // @EqualsAndHashCode == @EqualsAndHashCode(callSuper = false)
        System.out.println(xiaohei.equals(xiaohuan)); // true

    }
}

class Animal{
    private String id;
    private String name;

    public Animal(String id, String name){
        this.id = id;
        this.name = name;
    }
}

@EqualsAndHashCode
class Dog extends Animal{
    private Integer age; // 身高
    private String weight; // 体重

    public Dog(String id, String name, Integer age, String weight){
        super(id, name);
        this.age = age;
        this.weight = weight;
    }
}
