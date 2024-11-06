<template>
  <div id="app">
    <nav>
      <router-link to="/">ALL Todos</router-link>
      <span> | </span>
      <router-link to="/add-todo">Add Todo</router-link>
      <router-link to="/helloworld">helloworld</router-link>
      <router-link to="/help">help</router-link>
    </nav>
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  name: 'App',
  components: {}

};
</script>

<style>
/* 设置导航栏 */
nav {
  background-color: #4CAF50;
  padding: 15px;
  display: flex;
  justify-content: center;
  align-items: center;
  gap: 20px;
  margin-bottom: 20px;
  border-radius: 5px;
}

/* 设置导航链接 */
nav a {
  color: #fff;
  text-decoration: none;
  font-weight: bold;
  font-size: 16px;
  transition: color 0.3s;
}

/* 悬停效果 */
nav a:hover {
  color: #ffeb3b;
}

/* 居中内容 */
#app {
  display: flex;
  flex-direction: column;
  align-items: center;
  font-family: Arial, sans-serif;
}

/* 视图内容样式 */
router-view {
  width: 80%;
  max-width: 600px;
  margin-top: 20px;
}
</style>
