package ua.kiev.allexb.matchwords.repository.impl;

import ua.kiev.allexb.matchwords.repository.Repository;
import ua.kiev.allexb.matchwords.repository.entity.AbstractEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * @author allexb
 * @version 1.0 14.12.2015
 */
public abstract class HibernateAbstractRepository<T extends AbstractEntity> implements Repository<T>{

    @Autowired
    private SessionFactory sessionFactory;

    private Class<T> clazz;

    public HibernateAbstractRepository() {
        final ParameterizedType superClass = (ParameterizedType) getClass().getGenericSuperclass();
        this.clazz = (Class<T>) superClass.getActualTypeArguments()[0];
    }

    public List<T> getAll() {
        Criteria criteria = getSession().createCriteria(this.clazz);
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        return criteria.list();
    }

    public T getById(Long id){
        Criteria criteria = getSession().createCriteria(this.clazz);
        criteria.add(Restrictions.eq("id", id));
        return (T)criteria.uniqueResult();
    }

    public void add(T model) {
        getSession().save(model);
    }

    public void update(T model) {
        getSession().merge(model);
    }

    public void remove(T model) {
        getSession().delete(model);
    }

    public Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }
}
