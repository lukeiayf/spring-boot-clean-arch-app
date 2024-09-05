package br.com.lucassilva.springbootcleanarch.infrastucture.controllers;

import br.com.lucassilva.springbootcleanarch.domain.entity.User;

public class UserDTOMapper {
    public CreateUserResponse toResponse(User user) {
        return new CreateUserResponse(user.username(), user.email());
    }

    public User toUser(CreateUserRequest request) {
        return new User(request.username(), request.password(), request.email());
    }
}
