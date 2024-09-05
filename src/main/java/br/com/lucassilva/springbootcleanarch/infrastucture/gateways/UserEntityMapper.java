package br.com.lucassilva.springbootcleanarch.infrastucture.gateways;

import br.com.lucassilva.springbootcleanarch.domain.entity.User;
import br.com.lucassilva.springbootcleanarch.infrastucture.persistence.UserEntity;

public class UserEntityMapper {
    UserEntity toEntity(User userDomainObj) {
        return new UserEntity(userDomainObj.username(), userDomainObj.password(), userDomainObj.email());
    }

    User toDomainObject(UserEntity userEntity) {
        return new User(userEntity.getUsername(), userEntity.getPassword(), userEntity.getEmail());
    }
}
