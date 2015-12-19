package ua.kiev.allexb.matchwords.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author allexb
 * @version 1.0 18.12.2015
 */

@Entity
@Table(name = "word_pairs_tb")
public class WordPairEntity extends AbstractEntity implements Serializable{

    private static final long serialVersionUID = 3647739362619225812L;

    @NotNull
    @Column(name = "first_word")
    private String firstWord;

    @NotNull
    @Column(name = "second_word")
    private String secondWord;

    @NotNull
    @Column(name = "category")
    private String category;

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
