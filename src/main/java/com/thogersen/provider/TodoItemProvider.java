package com.thogersen.provider;


import com.thogersen.factory.TodoItemFactory;
import com.thogersen.storage.TodoItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TodoItemProvider {

    private final TodoItemRepository todoItemRepository;



    public void addTodoItem() {
        todoItemRepository.save(TodoItemFactory.createTodoItem());
    }
}
