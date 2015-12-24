package ua.kiev.allexb.matchwords.service;

import ua.kiev.allexb.matchwords.model.WordPair;
import ua.kiev.allexb.matchwords.model.WordPairsCategory;

import java.util.List;

/**
 * @author allexb
 * @version 1.0 18.12.2015
 */

public interface WordPairService {

    public List<WordPair> getAll();

    public List<WordPair> getSized(int count);

    public List<WordPair> getAllByCategory(WordPairsCategory category);

    public List<WordPair> getSizedByCategory(int count, WordPairsCategory category);

}
