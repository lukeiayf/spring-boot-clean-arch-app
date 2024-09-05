package br.com.lucassilva.springbootcleanarch.service;

import org.springframework.stereotype.Service;

import br.com.lucassilva.springbootcleanarch.model.User;
import br.com.lucassilva.springbootcleanarch.repository.UserRepositoryInterface;

@Service
public class UserService {
  private UserRepositoryInterface userRepositoryInterface;

  public UserService(UserRepositoryInterface userRepositoryInterface) {
    this.userRepositoryInterface = userRepositoryInterface;
  }

  public User create(User user) {
    return userRepositoryInterface.save(user);
  }
}
