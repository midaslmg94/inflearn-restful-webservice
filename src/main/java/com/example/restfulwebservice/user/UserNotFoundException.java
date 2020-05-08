package com.example.restfulwebservice.user;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// 200번대 code -> OK
// 400번대 code -> Client의 오류
// 500번대 code -> Server의 오류
@ResponseStatus(HttpStatus.NOT_FOUND) // 500번대의 오류를 400번대 오류로 바꿔줌
public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message) {
        super(message);
    }
}
