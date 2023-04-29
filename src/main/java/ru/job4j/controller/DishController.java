package ru.job4j.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.job4j.model.Dish;

@RestController
public class DishController {
    @GetMapping("/order/{id}")
    public Dish getDish(@PathVariable("id")int id) throws JsonProcessingException {
        return new Dish(1, "test_name", "test_description");
    }
}
