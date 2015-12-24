package ua.kiev.allexb.matchwords.repository;

import ua.kiev.allexb.matchwords.repository.entity.WordPairsCategoryEntity;

/**
 * @author allexb
 * @version 1.0 24.12.2015
 */

public interface WordPairsCategoryRepository extends Repository<WordPairsCategoryEntity>{

    public WordPairsCategoryEntity getByTitle(String title);

}
