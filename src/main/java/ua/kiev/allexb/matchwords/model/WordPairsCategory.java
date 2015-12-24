package ua.kiev.allexb.matchwords.model;

import ua.kiev.allexb.matchwords.repository.entity.WordPairsCategoryEntity;

import java.io.Serializable;

/**
 * @author allexb
 * @version 1.0 24.12.2015
 */

public class WordPairsCategory implements Serializable{

    private static final long serialVersionUID = -9117357906724133371L;

    private Long id;
    private String title;
    private String description;

    public WordPairsCategory(WordPairsCategoryEntity wordPairsCategoryEntity) {
        this.id = wordPairsCategoryEntity.getId();
        this.title = wordPairsCategoryEntity.getTitle();
        this.description = wordPairsCategoryEntity.getDescription();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

}
