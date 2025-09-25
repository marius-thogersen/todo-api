package com.thogersen.service;


import com.thogersen.provider.TodoItemProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class TodoItemService {


    private final TodoItemProvider todoItemProvider;


    public void addTodoItem() {
        todoItemProvider.addTodoItem();
    }
}
