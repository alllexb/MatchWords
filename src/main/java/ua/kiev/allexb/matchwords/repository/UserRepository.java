package ua.kiev.allexb.matchwords.repository;

import ua.kiev.allexb.matchwords.entity.User;

/**
 * @author allexb
 * @version 1.0 14.12.2015
 */
public interface UserRepository extends Repository<User> {

    public User getByNickName(String nickName);

}