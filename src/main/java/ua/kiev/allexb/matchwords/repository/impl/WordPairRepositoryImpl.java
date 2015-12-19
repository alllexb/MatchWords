package ua.kiev.allexb.matchwords.repository.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import ua.kiev.allexb.matchwords.repository.WordPairRepository;
import ua.kiev.allexb.matchwords.repository.entity.WordPairEntity;

import java.util.List;

/**
 * @author allexb
 * @version 1.0 18.12.2015
 */

@Repository
public class WordPairRepositoryImpl extends HibernateAbstractRepository<WordPairEntity> implements WordPairRepository{

    public WordPairRepositoryImpl() {
    }

    @Override
    public List<WordPairEntity> getAllByCategory(String category) {
        Criteria criteria = getSession().createCriteria(WordPairEntity.class);
        criteria.add(Restrictions.eq("category", category));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        return criteria.list();
    }

}
