package ro.wolfnet.helloworld.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class UserEntity.
 *
 * @author isti
 * @since Feb 5, 2018
 */
@Entity
public class UserEntity implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 5476745898491044394L;

  /** The id. */
  @Id
  @GeneratedValue
  private Long id;

  /** The name. */
  private String name;

  /** The email. */
  private String email;

  /**
   * Instantiates a new user entity.
   */
  protected UserEntity() {
  }

  /**
   * Instantiates a new user entity.
   *
   * @param name the name
   * @param email the email
   */
  @JsonCreator
  public UserEntity(@JsonProperty String name,
                    @JsonProperty String email) {
    this();
    this.name = name;
    this.email = email;
  }

  /**
   * Gets the id.
   *
   * @return the id
   */
  public Long getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the email.
   *
   * @return the email
   */
  public String getEmail() {
    return email;
  }
}