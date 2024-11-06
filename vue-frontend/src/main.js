import {createApp} from 'vue';
import App from './App.vue';
import {createRouter, createWebHistory} from 'vue-router';
import TodoListComponent from './components/TodoListComponent.vue';
import AddTodoComponent from './components/AddTodoComponent.vue';
import HelloWorld from "@/components/HelloWorld";
import help from "@/components/Help";

const routes = [
  { path: '/', component: TodoListComponent },
  { path: '/add-todo', component: AddTodoComponent },
  { path: '/help', component: help },
  { path: '/HelloWorld', component: HelloWorld }
];

const router = createRouter({
  history: createWebHistory(),
  routes
});

const app = createApp(App);
app.use(router);
app.mount('#app');
