package br.com.giulianabezerra.springbootcleanarch.infrastucture.persistence;

import br.com.giulianabezerra.springbootcleanarch.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
