package com.thogersen.service;


import com.thogersen.api.v1.TodoItemApi;
import com.thogersen.mapper.TodoItemMapper;
import com.thogersen.provider.TodoItemProvider;
import com.thogersen.storage.TodoItem;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class TodoItemService {


    private final TodoItemProvider todoItemProvider;


    public void addTodoItem(TodoItemApi todoItemApi) {
        todoItemProvider.addTodoItem(todoItemApi);
    }

    public List<TodoItemApi> getTodos() {
        return todoItemProvider.getTodos();
    }

    public TodoItem getTodoById(Long id) {
        TodoItem todo = todoItemProvider.getTodoById(id);
        if(todo == null) {
            log.warn("No todoItem found for id: {}", id);
            return null;
        }
        return todo;
    }

    public void deleteTodoById(Long id) {
        todoItemProvider.deleteTodoById(id);
    }

    public void updateTodoItem(TodoItemApi todoItemApi) {
        if(todoItemApi.id() == null) {
            log.warn("TodoItem id is null. Will save as new todo item");
        }
        todoItemProvider.updateTodoItem(todoItemApi);
    }
}
