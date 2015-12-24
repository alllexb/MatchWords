package ua.kiev.allexb.matchwords.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.kiev.allexb.matchwords.model.WordPairsCategory;
import ua.kiev.allexb.matchwords.repository.WordPairsCategoryRepository;
import ua.kiev.allexb.matchwords.repository.entity.WordPairsCategoryEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author allexb
 * @version 1.0 24.12.2015
 */

@Service
public class WordPairsCategoryServiceImpl implements WordPairsCategoryService {

    @Autowired
    private WordPairsCategoryRepository wordPairsCategoryRepository;

    @Override
    @Transactional
    public List<WordPairsCategory> getAll() {
        List<WordPairsCategoryEntity> wordPairsCategoryEntities = wordPairsCategoryRepository.getAll();
        List<WordPairsCategory> wordPairsCategories = new ArrayList<>();
        for (WordPairsCategoryEntity entity: wordPairsCategoryEntities) {
            wordPairsCategories.add(new WordPairsCategory(entity));
        }
        return wordPairsCategories;
    }

    @Override
    @Transactional
    public WordPairsCategory getByTitle(String title) {
        WordPairsCategoryEntity wordPairsCategoryEntity = wordPairsCategoryRepository.getByTitle(title);
        return new WordPairsCategory(wordPairsCategoryEntity);
    }
}
