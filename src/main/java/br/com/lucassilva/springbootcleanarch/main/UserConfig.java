package br.com.lucassilva.springbootcleanarch.main;

import br.com.lucassilva.springbootcleanarch.application.gateways.UserGateway;
import br.com.lucassilva.springbootcleanarch.application.usecases.CreateUserInteractor;
import br.com.lucassilva.springbootcleanarch.infrastucture.controllers.UserDTOMapper;
import br.com.lucassilva.springbootcleanarch.infrastucture.gateways.UserEntityMapper;
import br.com.lucassilva.springbootcleanarch.infrastucture.gateways.UserRepositoryGateway;
import br.com.lucassilva.springbootcleanarch.infrastucture.persistence.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    CreateUserInteractor createUserCase(UserGateway userGateway) {
        return new CreateUserInteractor(userGateway);
    }

    @Bean
    UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        return new UserRepositoryGateway(userRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper userEntityMapper() {
        return new UserEntityMapper();
    }

    @Bean
    UserDTOMapper userDTOMapper() {
        return new UserDTOMapper();
    }
}
