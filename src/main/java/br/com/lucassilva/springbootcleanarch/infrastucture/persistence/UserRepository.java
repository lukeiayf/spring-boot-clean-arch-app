package br.com.lucassilva.springbootcleanarch.infrastucture.persistence;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
