package ua.kiev.allexb.matchwords.repository.impl;

import ua.kiev.allexb.matchwords.entity.User;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import ua.kiev.allexb.matchwords.repository.UserRepository;

/**
 * @author allexb
 * @version 1.0 14.12.2015
 */
@Repository(value = "userRepository")
public class UserRepositoryImpl extends HibernateAbstractRepository<User> implements UserRepository{

    public UserRepositoryImpl() {
    }

    @Override
    public User getByNickName(String nickName) {
        Criteria criteria = getSession().createCriteria(User.class);
        criteria.add((Restrictions.eq("nick_name", nickName)));
        return (User) criteria.uniqueResult();
    }
}
