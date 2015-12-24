package ua.kiev.allexb.matchwords.service;

import ua.kiev.allexb.matchwords.model.WordPairsCategory;

import java.util.List;

/**
 * @author allexb
 * @version 1.0 24.12.2015
 */

public interface WordPairsCategoryService {

    public List<WordPairsCategory> getAll();

    public WordPairsCategory getByTitle(String title);

}
