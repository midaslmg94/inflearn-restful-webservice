package com.example.restfulwebservice.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse { // 일반화 된 예외 클래스 생성(공통적으로 처리 되야할 기능) -> AOP 기능 사용
    private Date timestamp;
    private String msg;
    private String details;
    
}
