package com.application.blog.user;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
//    private  UserRepositary userRepositary;
//
//    public UserService(UserRepositary userRepositary) {
//        this.userRepositary = userRepositary;
//    }
    @Autowired
    private UserRepositary userRepositary;

    public UserEntity createUser(String username, String password, String email)
    {
        var newUser = UserEntity.builder()
                .username(username)
//                .password(password)
                .email(email)
                .build();
        return userRepositary.save(newUser);

    }

    public UserEntity getUser(String username)
    {
        return userRepositary.findByUsername(username);
    }

    public UserEntity login(String username, String password)
    {
        var userlogin = userRepositary.findByUsername(username);
        if(userlogin == null)
        {
            throw  new UserNotFoundException(username);
        }
        return userlogin;
    }

    static  class UserNotFoundException extends IllegalArgumentException
    {
        public UserNotFoundException(String username)
        {
            super("User" + username + "not found");
        }
    }

}
