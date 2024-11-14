package com.example.todoapp.model;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    private List<Task> taskList;    // Simulation of using a DDBB

    public TaskRepository(){
        taskList = new ArrayList<>();
    }

    public List<Task> getAllTasks(){
        return new ArrayList<>(taskList);   // Returns a copy instead of the object itself to offer protection from modifications
    }

    public Task getTaskById(int id){
        for (Task task : taskList){
            if(task.getTaskId() == id){
                return task;
            }
        }
        return null;
    }

    public void saveTask(Task task){
        taskList.add(task);
    }

    public void updateTask(Task updatedTask){
        for (Task task : taskList){
            if(updatedTask.getTaskId() == task.getTaskId()){
                taskList.set(task.getTaskId(), task);
            }
        }
    }

    public void deleteTask(int id){
        taskList.remove(id);
    }
}
