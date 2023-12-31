package com.habitsapp.model;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public record Habit(
        @Id
        Integer id,
        @NotBlank
        String habitText,
        Boolean isDone,
        Boolean isArchived
) {
}
