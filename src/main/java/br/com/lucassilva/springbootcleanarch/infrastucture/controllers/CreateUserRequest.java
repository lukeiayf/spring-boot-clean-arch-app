package br.com.lucassilva.springbootcleanarch.infrastucture.controllers;

public record CreateUserRequest(String username, String password, String email) {
}
