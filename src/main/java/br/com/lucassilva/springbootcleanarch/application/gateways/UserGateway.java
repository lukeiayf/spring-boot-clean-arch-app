package br.com.lucassilva.springbootcleanarch.application.gateways;

import br.com.lucassilva.springbootcleanarch.domain.entity.User;

public interface UserGateway {
    User createUser(User user);
}
