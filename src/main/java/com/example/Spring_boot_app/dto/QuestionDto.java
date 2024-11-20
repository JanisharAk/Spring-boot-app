package com.example.Spring_boot_app.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuestionDto {
    private String id;
    private String gradeID;
    private String subjectID;
    private String subjectCategoryID;
    private String chapterID;
    private String questionTypeID;
    private String statusID;
    private String complexity;
    private String question;
    private String answer;
    private String createdBy;
    private Date createdTime;
    private String lastmodifiedBy;
    private Date lastmodifiedTime;

}
