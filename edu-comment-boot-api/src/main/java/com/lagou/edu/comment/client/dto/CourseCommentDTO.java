package com.lagou.edu.comment.client.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseCommentDTO {

    private String id;

    private Integer courseId;

    private Integer userId;

    private String comment;

    private boolean isOwner = false;

    private String nickName;

    private boolean favoriteTag;

    private Integer likeCount;
}