package ro.upb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {
    @Id //in aceasta data va fi salvat id-ul
    @GeneratedValue(strategy = GenerationType.AUTO) //generarea id-ului va fi facuta automat de spring
    private Long id;

    private String title;

    //TODO: autorul

    private String content;

    //TODO: cometarii

    private Boolean featured;

    public Post() {
    }

    public Post(String title, String content, Boolean featured) {
        this.title = title;
        this.content = content;
        this.featured = featured;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getFeatured() {
        return featured;
    }

    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }
}
