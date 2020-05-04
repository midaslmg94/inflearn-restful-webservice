package com.example.restfulwebservice.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// 비즈니스 로직에 사용
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int usersCount = users.size();
    static {
        users.add(new User(1,"Eric",new Date()));
        users.add(new User(2,"Alice",new Date()));
        users.add(new User(3,"Elena",new Date()));

    }
    public List<User> findAll(){
        return users;
    }

    public User save(User user){
        if(user.getId()==null){
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id){
        for(User user : users){
            if(user.getId()==id){
                return user;
            }
        }
        return null;
    }
}
