package com.example.todoapp.model;

import android.widget.ImageView;

import java.time.LocalDate;
import java.time.LocalTime;

public class Task {

    // TODO code setters restrictions

    private int taskId;
    private String taskTitle;
    private String taskDescription;
    private String taskCategory;
    private LocalDate taskDate;
    private LocalTime taskTime;
    private ImageView taskCategoryImg;

    public Task() {
    }


    public Task(int taskId, String taskTitle, String taskDescription, String taskCategory, LocalDate taskDate, LocalTime taskTime, ImageView taskCategoryImg){
        setTaskId(taskId);
        setTaskTitle(taskTitle);
        setTaskDescription(taskDescription);
        setTaskCategory(taskCategory);
        setTaskDate(taskDate);
        setTaskTime(taskTime);
        setTaskCategoryImg(taskCategoryImg);
    }

    public int getTaskId(){
        return taskId;
    }

    public void setTaskId(int taskId){
        this.taskId = taskId;
    }

    public String getTaskTitle(){
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle){
        this.taskTitle = taskTitle;
    }

    public String getTaskDescription(){
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription){
        this.taskDescription = taskDescription;
    }

    public String getTaskCategory(){
        return taskCategory;
    }

    public void setTaskCategory(String taskCategory){
        this.taskCategory = taskCategory;
    }

    public LocalDate getTaskDate(){
        return taskDate;
    }

    public void setTaskDate(LocalDate taskDate){
        this.taskDate = taskDate;
    }

    public LocalTime getTaskTime(){
        return taskTime;
    }

    public void setTaskTime(LocalTime taskTime){
        this.taskTime = taskTime;
    }

    public ImageView getTaskCategoryImg(){
        return taskCategoryImg;
    }

    public void setTaskCategoryImg(ImageView taskCategoryImg){
        this.taskCategoryImg = taskCategoryImg;
    }

}
