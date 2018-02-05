package ro.wolfnet.helloworld.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ro.wolfnet.helloworld.entity.UserEntity;
import ro.wolfnet.helloworld.service.UserService;

/**
 * The Class HelloWorldController.
 *
 * @author isti
 * @since Feb 2, 2018
 */
@RestController
public class HelloWorldController {

  /** The user service. */
  @Autowired
  private UserService userService;

  /**
   * Test.
   *
   * @return the response entity
   */
  @RequestMapping(value = "/test", method = RequestMethod.GET)
  public ResponseEntity<String> test() {
    String greetingsFrom = System.getenv("CLOUD_SQL_DATABASE_NAME");
    List<UserEntity> users = userService.findAll();
    if (users != null) {
      for (UserEntity user : users) {
        greetingsFrom += ", " + user.getName();
      }
    }
    return new ResponseEntity<String>("Greetings from: " + greetingsFrom, HttpStatus.OK);
  }

  /**
   * Insert.
   *
   * @return the response entity
   */
  @RequestMapping(value = "/insert", method = RequestMethod.GET)
  public ResponseEntity<Void> insert() {
    userService.dummyInsert();
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
