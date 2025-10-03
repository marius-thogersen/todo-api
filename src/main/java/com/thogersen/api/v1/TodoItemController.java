package com.thogersen.api.v1;


import com.thogersen.service.TodoItemService;
import com.thogersen.storage.TodoItem;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todos")
@RequiredArgsConstructor
public class TodoItemController {

    private final TodoItemService todoItemService;



    @GetMapping
    public List<TodoItemApi> getTodos() {
        return todoItemService.getTodos();
    }

    @GetMapping("/{id}")
    public TodoItem getTodoById(@PathVariable Long id) {
        return todoItemService.getTodoById(id);
    }

    @PostMapping("/add")
    public void addTodo(@RequestBody TodoItemApi todoItemApi) {
        todoItemService.addTodoItem(todoItemApi);
    }

    @DeleteMapping("/todo/{id}/delete")
    public void deleteTodoById(@PathVariable Long id) {
        todoItemService.deleteTodoById(id);
    }

    @PutMapping("/todo/{id}/update")
    public void updateTodoById(@RequestBody TodoItemApi todoItemApi) {
        todoItemService.updateTodoItem(todoItemApi);
    }
}
