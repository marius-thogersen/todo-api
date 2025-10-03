package com.thogersen.provider;


import com.thogersen.api.v1.TodoItemApi;
import com.thogersen.mapper.TodoItemMapper;
import com.thogersen.storage.TodoItem;
import com.thogersen.storage.TodoItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class TodoItemProvider {

    private final TodoItemRepository todoItemRepository;

    public void addTodoItem(TodoItemApi todoItemApi) {
        TodoItem entity = TodoItemMapper.toEntity(todoItemApi);
        todoItemRepository.save(entity);
    }

    public List<TodoItemApi> getTodos() {
        List<TodoItem> todoItems = todoItemRepository.findAll();
        return todoItems.stream().map(TodoItemMapper::toApi).toList();
    }

    public TodoItem getTodoById(Long id) {
        return todoItemRepository.findById(id).orElse(null);
    }

    public void deleteTodoById(Long id) {
        todoItemRepository.deleteById(id);
    }

    public void updateTodoItem(TodoItemApi todoItemApi) {
        var entity = TodoItemMapper.toEntity(todoItemApi);
        todoItemRepository.save(entity);
    }
}
