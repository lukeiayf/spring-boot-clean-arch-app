package br.com.lucassilva.springbootcleanarch.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.lucassilva.springbootcleanarch.model.User;

public interface UserRepositoryInterface extends CrudRepository<User, Long> {

}
