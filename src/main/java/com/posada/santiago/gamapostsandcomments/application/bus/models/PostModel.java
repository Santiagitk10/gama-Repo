package com.posada.santiago.gamapostsandcomments.application.bus.models;

import java.util.ArrayList;
import java.util.List;

public class PostModel {

    private String id;
    private String postId;
    private String author;
    private String title;
    private List<CommentModel> comments;

    public PostModel() {
        this.comments = new ArrayList<>();
    }

    public PostModel(String postId, String author, String title, List<CommentModel> comments) {
        this.postId = postId;
        this.author = author;
        this.title = title;
        this.comments = comments;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAggregateId() {
        return postId;
    }

    public void setAggregateId(String aggregateId) {
        this.postId = aggregateId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<CommentModel> getComments() {
        return comments;
    }

    public void setComments(List<CommentModel> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "PostModel{" +
                "id='" + id + '\'' +
                ", postId='" + postId + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", comments=" + comments +
                '}';
    }
}
