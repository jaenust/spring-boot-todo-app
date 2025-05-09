package com.example.todo.dto;

import com.example.todo.model.TodoItem;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class TodoItemsDTO {

    private int count;
    private UUID listId;
    private Instant fromDate;
    private Instant toDate;
    private String listName;
    private List<TodoItem> todoItemList;

    public TodoItemsDTO(){}

    public TodoItemsDTO(int count, UUID listId, Instant fromDate, Instant toDate, String listName, List<TodoItem> todoItemList){
        this.count = count;
        this.listId = listId;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.listName = listName;
        this.todoItemList = todoItemList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public UUID getListId() {
        return listId;
    }

    public void setListId(UUID listId) {
        this.listId = listId;
    }

    public List<TodoItem> getTodoItemList() {
        return todoItemList;
    }

    public void setTodoItemList(List<TodoItem> todoItemList) {
        this.todoItemList = todoItemList;
    }

    public Instant getFromDate() {
        return fromDate;
    }

    public void setFromDate(Instant fromDate) {
        this.fromDate = fromDate;
    }

    public Instant getToDate() {
        return toDate;
    }

    public void setToDate(Instant toDate) {
        this.toDate = toDate;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }
}
