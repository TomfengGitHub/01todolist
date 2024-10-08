import axios from 'axios';

const API_BASE_URL = "http://localhost:8080/todos"; // Ensure your backend runs on this URL

class TodoService {
    getAllTodos() {
        return axios.get(API_BASE_URL).catch(error => {
            console.error("Error fetching todos:", error);
        });
    }

    getTodoById(todoId) {
        return axios.get(`${API_BASE_URL}/${todoId}`).catch(error => {
            console.error(`Error fetching todo with ID ${todoId}:`, error);
        });
    }

    createTodo(todo) {
        return axios.post(API_BASE_URL, todo).catch(error => {
            console.error("Error creating todo:", error);
        });
    }

    updateTodo(todo) {
        return axios.put(`${API_BASE_URL}/${todo.id}`, todo).catch(error => {
            console.error(`Error updating todo with ID ${todo.id}:`, error);
        });
    }

    deleteTodo(todoId) {
        return axios.delete(`${API_BASE_URL}/${todoId}`).catch(error => {
            console.error(`Error deleting todo with ID ${todoId}:`, error);
        });
    }
}

export default new TodoService();
