package com.example.Quizzer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "Question Required")
    @NotNull
    private String question;
    @NotBlank(message = "At least 1 option Required")
    @NotNull
    private String option1;
    private String option2;
    private String option3;
    private String option4;
}
