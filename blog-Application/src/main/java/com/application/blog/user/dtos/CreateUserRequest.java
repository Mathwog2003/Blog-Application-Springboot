package com.application.blog.user.dtos;

import lombok.Data;
import lombok.NonNull;
import lombok.Setter;

@Data
@Setter
public class CreateUserRequest {
    @NonNull
    private String name;
    @NonNull
    private String Password;
    @NonNull
    private String email;
}
