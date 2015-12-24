package ua.kiev.allexb.matchwords.repository.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * @author allexb
 * @version 1.0 24.12.2015
 */

@Entity
@Table(name="word_pairs_category_tb")
public class WordPairsCategoryEntity extends AbstractEntity {

    private static final long serialVersionUID = -6768646751986770215L;

    @NotNull
    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "wordPairsCategory", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<WordPairEntity> wordPairs = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<WordPairEntity> getWordPairs() {
        return wordPairs;
    }

    public void setWordPairs(List<WordPairEntity> wordPairs) {
        this.wordPairs = wordPairs;
    }
}
