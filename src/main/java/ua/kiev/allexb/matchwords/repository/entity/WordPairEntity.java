package ua.kiev.allexb.matchwords.repository.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author allexb
 * @version 1.0 18.12.2015
 */

@Entity
@Table(name = "word_pairs_tb")
public class WordPairEntity extends AbstractEntity {

    private static final long serialVersionUID = 3647739362619225812L;

    @NotNull
    @Column(name = "first_word")
    private String firstWord;

    @NotNull
    @Column(name = "second_word")
    private String secondWord;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private WordPairsCategoryEntity wordPairsCategory;

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

   public WordPairsCategoryEntity getWordPairsCategory() {
        return wordPairsCategory;
    }

    public void setWordPairsCategory(WordPairsCategoryEntity wordPairsCategory) {
        this.wordPairsCategory = wordPairsCategory;
    }
}
