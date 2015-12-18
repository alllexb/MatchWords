package ua.kiev.allexb.matchwords.repository.impl;

import ua.kiev.allexb.matchwords.repository.entity.UserEntity;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import ua.kiev.allexb.matchwords.repository.UserRepository;

/**
 * @author allexb
 * @version 1.0 14.12.2015
 */
@Repository
public class UserRepositoryImpl extends HibernateAbstractRepository<UserEntity> implements UserRepository {

    public UserRepositoryImpl() {
    }

    @Override
    public UserEntity getByNickName(String nickName) {
        Criteria criteria = getSession().createCriteria(UserEntity.class);
        criteria.add((Restrictions.eq("nick_name", nickName)));
        return (UserEntity) criteria.uniqueResult();
    }
}
