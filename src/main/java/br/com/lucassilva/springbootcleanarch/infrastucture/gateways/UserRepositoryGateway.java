package br.com.lucassilva.springbootcleanarch.infrastucture.gateways;

import br.com.lucassilva.springbootcleanarch.application.gateways.UserGateway;
import br.com.lucassilva.springbootcleanarch.domain.entity.User;
import br.com.lucassilva.springbootcleanarch.infrastucture.persistence.UserEntity;
import br.com.lucassilva.springbootcleanarch.infrastucture.persistence.UserRepository;

public class UserRepositoryGateway implements UserGateway {
    private final UserRepository userRepository;
    private  final UserEntityMapper userEntityMapper;

    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User createUser(User userDomainObj) {
        UserEntity userEntity = userEntityMapper.toEntity(userDomainObj);
        UserEntity savedObj = userRepository.save(userEntity);
        return userEntityMapper.toDomainObject(savedObj);
    }
}
