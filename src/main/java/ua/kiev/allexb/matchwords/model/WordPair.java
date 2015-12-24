package ua.kiev.allexb.matchwords.model;

import ua.kiev.allexb.matchwords.repository.entity.WordPairEntity;

import java.io.Serializable;

/**
 * @author allexb
 * @version 1.0 18.12.2015
 */

public class WordPair implements Serializable{

    private static final long serialVersionUID = 8524310063306541297L;

    private Long id;
    private String firstWord;
    private String secondWord;
    private WordPairsCategory category;

    public WordPair() {
    }

    public WordPair(WordPairEntity wordPairEntity) {
        this.id = wordPairEntity.getId();
        this.firstWord = wordPairEntity.getFirstWord();
        this.secondWord = wordPairEntity.getSecondWord();
        this.category = new WordPairsCategory(wordPairEntity.getWordPairsCategory());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstWord() {
        return firstWord;
    }

    public void setFirstWord(String firstWord) {
        this.firstWord = firstWord;
    }

    public String getSecondWord() {
        return secondWord;
    }

    public void setSecondWord(String secondWord) {
        this.secondWord = secondWord;
    }

    public WordPairsCategory getCategory() {
        return category;
    }

    public void setCategory(WordPairsCategory category) {
        this.category = category;
    }
}

