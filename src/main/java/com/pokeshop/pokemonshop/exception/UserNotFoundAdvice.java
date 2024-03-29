package com.pokeshop.pokemonshop.exception;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class UserNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(value = {UserNotFoundException.class,  UsernameNotFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String,String> userNotFoundHandler(UserNotFoundException ex){
        Map<String,String> map = new HashMap<>();
        map.put("errorMessage",ex.getMessage());
        return map;
    }
}
