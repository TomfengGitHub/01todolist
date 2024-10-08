<template>
  <div id="app">
    <nav>
      <router-link to="/">Todos</router-link>
      <router-link to="/add-todo">Add Todo</router-link>
    </nav>
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  name: 'App'
};
</script>

<style>
nav {
  margin-bottom: 20px;
}
</style>