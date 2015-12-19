package ua.kiev.allexb.matchwords.repository;

import ua.kiev.allexb.matchwords.repository.entity.WordPairEntity;

import java.util.List;

/**
 * @author allexb
 * @version 1.0 18.12.2015
 */
public interface WordPairRepository extends Repository<WordPairEntity> {

    public List<WordPairEntity> getAllByCategory(String category);

}
