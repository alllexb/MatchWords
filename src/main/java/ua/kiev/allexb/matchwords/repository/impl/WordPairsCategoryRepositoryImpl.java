package ua.kiev.allexb.matchwords.repository.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import ua.kiev.allexb.matchwords.repository.WordPairsCategoryRepository;
import ua.kiev.allexb.matchwords.repository.entity.WordPairsCategoryEntity;

/**
 * @author allexb
 * @version 1.0 24.12.2015
 */

@Repository
public class WordPairsCategoryRepositoryImpl extends HibernateAbstractRepository<WordPairsCategoryEntity> implements WordPairsCategoryRepository{

    public WordPairsCategoryRepositoryImpl() {
    }

    @Override
    public WordPairsCategoryEntity getByTitle(String title) {
        Criteria criteria = getSession().createCriteria(WordPairsCategoryEntity.class);
        criteria.add(Restrictions.eq("title", title));
        return (WordPairsCategoryEntity) criteria.uniqueResult();
    }
}
