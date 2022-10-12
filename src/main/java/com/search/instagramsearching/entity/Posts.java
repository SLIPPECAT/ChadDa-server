package com.search.instagramsearching.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sid;
    @Column
    private String description;
    @Column
    private Long sidProfile;
    @Column
    private String postId;
    @Column
    private Long profileId;
    @Column
    private Long locationId;
    @Column
    private Date cts;
    @Column
    private int postType;
    @Column
    private Integer numbrLikes;
    @Column
    private Integer numberComments;
}
