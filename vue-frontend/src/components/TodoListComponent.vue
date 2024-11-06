<template>
  <div>
    <h2>Todos</h2>
    <ul>
      <li v-for="todo in todos" :key="todo.id">
        {{ todo.title }} - {{ todo.description }} - {{ todo.completed ? 'Completed' : 'Not Completed' }}
        <button @click="editTodo(todo)">Edit</button>
        <button @click="deleteTodo(todo.id)">Delete</button>
      </li>
    </ul>
    <div v-if="editingTodo">
      <h3>Edit Todo</h3>
      <form @submit.prevent="updateTodo">
        <input v-model="editingTodo.title" placeholder="Todo Title" />
        <input v-model="editingTodo.description" placeholder="Todo Description" />
        <label>
          Completed:
          <input type="checkbox" v-model="editingTodo.completed" />
        </label>
        <button type="submit">Update</button>
      </form>
    </div>
  </div>
</template>

<script>
import TodoService from '../TodoService';

export default {
  data() {
    return {
      todos: [],
      editingTodo: null
    };
  },
  created() {
    this.fetchTodos();
  },
  methods: {
    fetchTodos() {
      TodoService.getAllTodos().then(response => {
        this.todos = response.data;
      });
    },
    editTodo(todo) {
      this.editingTodo = { ...todo };
    },
    updateTodo() {
      TodoService.updateTodo(this.editingTodo).then(() => {
        this.fetchTodos();
        this.editingTodo = null;
      });
    },
    deleteTodo(todoId) {
      TodoService.deleteTodo(todoId).then(() => {
        this.fetchTodos();
      });
    }
  }
};
</script>
