package com.example.todo_app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.todo_app.mapper.TodoMapper;
import com.example.todo_app.model.Todo;
import com.example.todo_app.service.TodoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @author Tomfe
 * @description 针对表【todo】的数据库操作Service实现
 * @createDate 2024-11-06 00:29:07
 */
@Service
public class TodoServiceImpl extends ServiceImpl<TodoMapper, Todo> implements TodoService {
    @Resource
    TodoMapper todoMapper;


    @Override
    public List<Todo> getAllTodos() {
        return todoMapper.selectList(null);
    }

    @Override
    public Todo saveTodo(Todo todo) {
        todoMapper.insert(todo);
        return todo;

    }

    @Override
    public Todo getTodoById(Long id) {

        return Optional.ofNullable(todoMapper.selectById(id)).orElse(null);
    }

    @Override
    public void deleteTodoById(Long id) {
        todoMapper.deleteById(id);
    }

    @Override
    public Todo updateTodoList(Todo existingTodo) {
         todoMapper.updateById(existingTodo);
        return existingTodo;
    }

}




