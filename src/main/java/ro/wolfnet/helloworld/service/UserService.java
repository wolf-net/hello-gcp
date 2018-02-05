package ro.wolfnet.helloworld.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.wolfnet.helloworld.entity.UserEntity;
import ro.wolfnet.helloworld.repository.UserRepository;

/**
 * The Class UserService.
 *
 * @author isti
 * @since Feb 5, 2018
 */
@Service
public class UserService {

  /** The user repository. */
  @Autowired
  private UserRepository userRepository;

  /**
   * Find all.
   *
   * @return the list
   */
  public List<UserEntity> findAll() {
    return this.userRepository.findAll();
  }

}
