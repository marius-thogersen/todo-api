package com.thogersen.factory;

import com.thogersen.storage.TodoItem;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TodoItemFactory {

    public static TodoItem createTodoItem() {

        var todoItem = new TodoItem();
        todoItem.setTitle("Test Title");
        todoItem.setDescription("Test Description");
        return todoItem;
    }
}
