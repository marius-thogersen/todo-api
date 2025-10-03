package com.thogersen.api.v1;

import com.thogersen.storage.Status;

public record TodoItemApi(Long id, String title, String description, Status status) {

    public TodoItemApi(String title, String description, Status status) {
        this(null, title, description, status);
    }
}
