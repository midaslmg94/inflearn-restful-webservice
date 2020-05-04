package com.example.restfulwebservice.user;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@AllArgsConstructor
@Data
public class User {
    @Id
    private Integer id;
    private String name;
    private Date joinDate;

}
