package ua.kiev.allexb.matchwords.serviceapi;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.kiev.allexb.matchwords.entity.UserEntity;
import ua.kiev.allexb.matchwords.model.User;
import ua.kiev.allexb.matchwords.repository.UserRepository;
import ua.kiev.allexb.matchwords.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author allexb
 * @version 1.0 14.12.2015
 */
@Service
public class UserServiceAPI implements UserService{

    @Autowired
    private UserRepository userRepository;

    public UserServiceAPI() {
    }

    @Transactional
    public List<User> getAll() {
        List<UserEntity> userEntities = userRepository.getAll();
        List<User> users = new ArrayList<>();
        for (UserEntity entity : userEntities) {
            users.add(new User(entity));
        }
        return users;
    }
}
