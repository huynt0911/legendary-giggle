package com.example.dentalclinicmanagementsystem.exception;

import lombok.Data;

@Data
public class WrongPasswordException extends RuntimeException {

    public WrongPasswordException(String message) {
        super(message);
    }
}
