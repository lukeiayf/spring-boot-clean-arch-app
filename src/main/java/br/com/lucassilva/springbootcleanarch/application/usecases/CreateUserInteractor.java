package br.com.lucassilva.springbootcleanarch.application.usecases;

import br.com.lucassilva.springbootcleanarch.application.gateways.UserGateway;
import br.com.lucassilva.springbootcleanarch.domain.entity.User;

public class CreateUserInteractor {
    private UserGateway userGateway;

    public CreateUserInteractor(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User createUser(User user){
        return userGateway.createUser(user);
    }
}
