package com.thogersen.api.v1;

import com.thogersen.service.TodoItemService;
import com.thogersen.storage.TodoItem;
import com.thogersen.storage.TodoItemRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class BaseController {


    private final TodoItemService todoItemService;


    @GetMapping(value = {"", "/"})
    public String base() {
        return "I am alive...";
    }


    @PostMapping("/add-todo")
    public void addTodo() {
        todoItemService.addTodoItem();
    }
}
