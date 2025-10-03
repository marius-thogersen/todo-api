package com.thogersen.mapper;

import com.thogersen.api.v1.TodoItemApi;
import com.thogersen.storage.TodoItem;

public class TodoItemMapper {

    public static TodoItemApi toApi(TodoItem todoItem) {
        return new TodoItemApi(todoItem.getId(), todoItem.getTitle(), todoItem.getDescription(), todoItem.getStatus());
    }

    public static TodoItem toEntity(TodoItemApi todoItemApi) {
        TodoItem todoItem = new TodoItem();
        if (todoItemApi.id() != null) {
            todoItem.setId(todoItemApi.id());
        }
        todoItem.setTitle(todoItemApi.title());
        todoItem.setDescription(todoItemApi.description());
        todoItem.setStatus(todoItemApi.status());
        return todoItem;
    }
}
