package ua.kiev.allexb.matchwords.service;

import org.springframework.transaction.annotation.Transactional;
import ua.kiev.allexb.matchwords.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ua.kiev.allexb.matchwords.repository.UserRepository;

import java.util.List;

/**
 * @author allexb
 * @version 1.0 14.12.2015
 */
@Service(value = "userService")
public class UserService {

    @Autowired
    @Qualifier(value = "userRepository")
    private UserRepository userRepository;

    public UserService() {
    }

    @Transactional
    public List<User> getAll() {
        return userRepository.getAll();
    }
}
