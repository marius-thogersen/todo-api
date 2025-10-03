package com.thogersen.api.v1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/layout")
public class LayoutController {

    @GetMapping
    public LayoutApi getLayout() {
       return new LayoutApi(
                List.of("Todo", "In progress", "Done")
        );
    }
}
