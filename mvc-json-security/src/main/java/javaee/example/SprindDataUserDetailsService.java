package javaee.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by student on 3/30/2017.
 */
@Component
public class SprindDataUserDetailsService implements UserDetailsService {

  private final UserDao userDao;

  @Autowired
  public SprindDataUserDetailsService(UserDao userDao) {
    this.userDao = userDao;
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user = userDao.findByUsername(username);
    return new org.springframework.security.core.userdetails.User(
        user.getUsername(), user.getPassword(),
        Stream.of(user.getRoles())
            .map(SimpleGrantedAuthority::new)
            .collect(Collectors.toList())
    );
  }
}
