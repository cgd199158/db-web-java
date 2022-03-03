<!-- 作者：cgd  邮箱：349008059@qq.com  时间：2022年03月03日 11:11:56  -->
<template>
  <div>home.vue</div>
</template>

<script lang="ts">
import { ref } from "@vue/reactivity";
import { onMounted } from '@vue/runtime-core';
interface LoginInterface {
  username: string;
  password: string;
}

export default {
  props: {},
  setup(): void {
    let loginForm = ref<LoginInterface>({
      username: "",
      password: "",
    });
    onMounted(()=>{
      console.log("12", loginForm.value.username)
    })
  },
};
</script>
<style lang="scss" scoped></style>
