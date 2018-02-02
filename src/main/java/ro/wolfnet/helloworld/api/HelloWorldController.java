package ro.wolfnet.helloworld.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Class HelloWorldController.
 *
 * @author isti
 * @since Feb 2, 2018
 */
@RestController
public class HelloWorldController {

  /**
   * Test.
   *
   * @return the response entity
   */
  @RequestMapping(value = "/test", method = RequestMethod.GET)
  public ResponseEntity<String> test() {
    return new ResponseEntity<String>("Greetings from Isti!", HttpStatus.OK);
  }

}
