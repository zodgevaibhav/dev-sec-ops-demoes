package org.dnyanyog.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Component
@Table
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Users { // Table

  @GeneratedValue // Auto generated (DB => sequence), primary key
  @Id
  @Column(name = "userCode", nullable = false, updatable = false, insertable = false)
  private long userCode;

  @Column(name = "userId", nullable = false, updatable = true)
  private String userId;

  @Column(name = "username", nullable = false, length = 50)
  private String username;

  @Column private String password;
  @Column private String email;
  @Column private String age;

  public static Users getInstance() { // create, getInstance
    return new Users();
  }

  public String getUsername() {
    return username;
  }

  public Users setUsername(String username) {
    this.username = username;

    return this;
  }

  public String getPassword() {
    return password;
  }

  public Users setPassword(String password) {
    this.password = password;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public Users setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getAge() {
    return age;
  }

  public Users setAge(String age) {
    this.age = age;
    return this;
  }

  public String getUserId() {
    return userId;
  }

  public Users setUserId(String userId) {
    this.userId = userId;
    return this;
  }

  public long getUserCode() {
    return userCode;
  }

  public Users setUserCode(long userCode) {
    this.userCode = userCode;

    return this;
  }

  @Override
  public String toString() {
    return "Users [userId="
        + userId
        + ", username="
        + username
        + ", password="
        + password
        + ", email="
        + email
        + ", age="
        + age
        + "]";
  }
}
