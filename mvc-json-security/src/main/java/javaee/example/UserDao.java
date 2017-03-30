package javaee.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 3/30/2017.
 */
@Service
public class UserDao {
  //    public static final String PATHNAME = "/home/utilizator/books.json";
  private static final String PATHNAME = "C:/Users/student/IdeaProjects/univer/JavaEE/mvc-json-security/jsons/users.json";

  private List<User> users;

  public UserDao() {
    ObjectMapper mapper = new ObjectMapper();
    try {
      users = mapper.readValue(new File(PATHNAME), new TypeReference<List<User>>() {
      });
    } catch (IOException e) {
      e.printStackTrace();
      users = new ArrayList<>();
    }
  }

  private List<User> findAll() {
    return users;
  }

  public User findByUsername(String username) {
    User user = null;
    for (int i = 0; i < users.size(); i++) {
      if (users.get(i).getUsername().equals(username)) {
        user = users.get(i);
      }
    }
    return user;
  }
}
