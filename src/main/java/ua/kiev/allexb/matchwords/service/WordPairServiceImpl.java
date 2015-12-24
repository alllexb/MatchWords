package ua.kiev.allexb.matchwords.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.kiev.allexb.matchwords.model.WordPair;
import ua.kiev.allexb.matchwords.model.WordPairsCategory;
import ua.kiev.allexb.matchwords.repository.WordPairRepository;
import ua.kiev.allexb.matchwords.repository.WordPairsCategoryRepository;
import ua.kiev.allexb.matchwords.repository.entity.WordPairEntity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author allexb
 * @version 1.0 18.12.2015
 */

@Service
public class WordPairServiceImpl implements WordPairService{

    @Autowired
    private WordPairRepository wordPairRepository;

    @Autowired
    private WordPairsCategoryRepository wordPairsCategoryRepository;

    @Override
    @Transactional
    public List<WordPair> getAll() {
        List<WordPairEntity> wordPairEntities = wordPairRepository.getAll();
        List<WordPair> wordPairs = new ArrayList<>();
        for (WordPairEntity entity : wordPairEntities) {
            wordPairs.add(new WordPair(entity));
        }
        return wordPairs;
    }

    @Override
    @Transactional
    public List<WordPair> getSized(int number) {
        if (number < 0) {
            return this.getAll();
        }
        List<WordPairEntity> wordPairEntities = wordPairRepository.getAll();
        List<WordPair> wordPairs = new ArrayList<>();
        Iterator<WordPairEntity> wordPairIterator = wordPairEntities.iterator();
        int counter = 0;
        while (wordPairIterator.hasNext() && counter < number) {
            wordPairs.add(new WordPair(wordPairIterator.next()));
            counter++;
        }
        return wordPairs;
    }

    @Override
    @Transactional
    public List<WordPair> getAllByCategory(WordPairsCategory category) {

        List<WordPairEntity> wordPairEntities = wordPairRepository.getAllByCategory(wordPairsCategoryRepository.getById(category.getId()));
        List<WordPair> wordPairs = new ArrayList<>();
        for (WordPairEntity entity : wordPairEntities) {
            wordPairs.add(new WordPair(entity));
        }
        return wordPairs;
    }

    @Override
    @Transactional
    public List<WordPair> getSizedByCategory(int number, WordPairsCategory category) {
        List<WordPair> wordPairs = getAllByCategory(category);
        if (wordPairs.size() < number) return wordPairs;
        return wordPairs.subList(0, number);
    }
}
