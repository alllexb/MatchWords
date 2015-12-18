package ua.kiev.allexb.matchwords.repository;

import ua.kiev.allexb.matchwords.repository.entity.UserEntity;

/**
 * @author allexb
 * @version 1.0 14.12.2015
 */
public interface UserRepository extends Repository<UserEntity> {

    public UserEntity getByNickName(String nickName);

}
