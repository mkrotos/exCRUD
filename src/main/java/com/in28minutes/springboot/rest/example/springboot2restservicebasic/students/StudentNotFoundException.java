package com.in28minutes.springboot.rest.example.springboot2restservicebasic.students;

public class StudentNotFoundException extends Throwable {
    public StudentNotFoundException(String message) {
        super(message);
    }
}
