package com.example.todo_app.service;

import com.example.todo_app.model.Todo;

import java.util.List;

public interface TodoService {

    List<Todo> getAllTodos();

    Todo saveTodo(Todo todo);

    Todo getTodoById(Long id);

    void deleteTodoById(Long id);

    Todo updateTodoList(Todo existingTodo);
}
