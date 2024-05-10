package com.sam.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Id")
	private Long id;
	
	private String title;
	
	private String type;
	
	private Date dueDate;
	
	private String description;
     
	public String getType() {
        return type;
    }
    
	// Setter method for type field
    public void setType(String type) {
        this.type = type;
    }

	public void setDescription(String description) {
        this.description = description;
    }
	
	public String getDescription() {
        return description;
    }
	
	// Getter method for title field
    public String getTitle() {
        return title;
    }
     
    public void setTitle(String title) {
        this.title = title;
    }
    
    public Date getDueDate() {
        return dueDate;
    }
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

	
}
