package com.project.blogengine.model;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.util.Date;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NonNull
    @Column(name = "is_active")
    private boolean isActive;
    @Column(name = "moderation_status")
    @NonNull
    private ModerationStatus status;
    @Column(name = "moderation_id")
    private int moderationId;
    @Column(name = "user_id")
    @NonNull
    private int userId;
    @NonNull
    private Date time;
    @NonNull
    private String title;
    @NonNull
    private String text;
    @NonNull
    @Column(name = "view_count")
    private int viewCount;

    protected Post(){}

    public Post(int userId, @NonNull String title, @NonNull String text) {
        this.userId = userId;
        this.title = title;
        this.text = text;
        this.isActive = false;
        this.status = ModerationStatus.NEW;
        this.time = new Date();
    }

    public long getId() {
        return id;
    }

    public boolean isActive() {
        return isActive;
    }

    @NonNull
    public ModerationStatus getStatus() {
        return status;
    }

    public int getModerationId() {
        return moderationId;
    }

    public int getUserId() {
        return userId;
    }

    @NonNull
    public Date getTime() {
        return time;
    }

    @NonNull
    public String getTitle() {
        return title;
    }

    @NonNull
    public String getText() {
        return text;
    }

    public int getViewCount() {
        return viewCount;
    }
    enum ModerationStatus{
        NEW,
        ACCEPTED,
        DECLINED
    }
}


