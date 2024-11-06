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

    <div v-if="errorMessage" style="color: red;">
      {{ errorMessage }}  
    </div>
  </div>
</template>

<script>
import TodoService from '../TodoService'; // api service in TodoService.js

export default {
  data() {
    return {
      todos: [],
      editingTodo: null,
      errorMessage: '' 
    };
  },
  created() {
    this.fetchTodos();
  },
  methods: {
    async fetchTodos() {
      try {
        const response = await TodoService.getAllTodos();
        this.todos = response.data;
      } catch (error) {
        console.error('Error fetching todos:', error);
        this.errorMessage = 'Failed to load todos. Please try again later.'; 
      }
    },
    editTodo(todo) {
      this.editingTodo = { ...todo }; // Create a copy of the todo to edit
    },
    async updateTodo() {
      try {
        await TodoService.updateTodo(this.editingTodo);
        await this.fetchTodos(); // Refresh todos after update
        this.editingTodo = null; // Reset editing state
      } catch (error) {
        console.error('Error updating todo:', error);
        this.errorMessage = 'Failed to update todo. Please try again.'; 
      }
    },
    async deleteTodo(todoId) {
      try {
        await TodoService.deleteTodo(todoId);
        await this.fetchTodos();
      } catch (error) {
        console.error('Error deleting todo:', error);
        this.errorMessage = 'Failed to delete todo. Please try again.';
      }
    }
  }
};
</script>
