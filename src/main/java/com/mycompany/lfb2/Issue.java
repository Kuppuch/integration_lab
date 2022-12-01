/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lfb2;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 *
 * @author Kuppuch
 */
@XmlRootElement(name = "Issue")
public class Issue {
    String name;
    String description;
    Date created_at;
    Date start_at;
    Date due_date;
    //Author assigned_to;
    //Author author;
    String status;
    String SrsBlock;
    int priority;
    int parent;
    long id;

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    @XmlElement
    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated_at() {
        return created_at;
    }

    @XmlElement
    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getStart_at() {
        return start_at;
    }

    @XmlElement
    public void setStart_at(Date start_at) {
        this.start_at = start_at;
    }

    public Date getDue_date() {
        return due_date;
    }

    @XmlElement
    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }

//    public Author getAssigned_to() {
//        return assigned_to;
//    }
//
//    @XmlElement
//    public void setAssigned_to(Author assigned_to) {
//        this.assigned_to = assigned_to;
//    }
//
//    public Author getAuthor() {
//        return author;
//    }
//
//    @XmlElement
//    public void setAuthor(Author author) {
//        this.author = author;
//    }

    public String getStatus() {
        return status;
    }

    @XmlElement
    public void setStatus(String status) {
        this.status = status;
    }

    public String getSrsBlock() {
        return SrsBlock;
    }

    @XmlElement
    public void setSrsBlock(String srsBlock) {
        SrsBlock = srsBlock;
    }

    public int getPriority() {
        return priority;
    }

    @XmlElement
    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getParent() {
        return parent;
    }

    @XmlElement
    public void setParent(int parent) {
        this.parent = parent;
    }

    public long getId() {
        return id;
    }

    @XmlAttribute
    public void setId(long id) {
        this.id = id;
    }
}
