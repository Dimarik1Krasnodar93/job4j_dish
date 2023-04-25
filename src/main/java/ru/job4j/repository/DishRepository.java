package ru.job4j.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.job4j.model.Dish;

public interface DishRepository extends JpaRepository<Dish, Integer> {
}
