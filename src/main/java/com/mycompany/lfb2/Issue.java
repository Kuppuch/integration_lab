/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lfb2;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Kuppuch
 */
public class Issue implements Serializable{

    String name;
    String description;
    Date created_at;
    Date start_at;
    Date due_date;
    User assigned_to;
    User author;
    String status;
    public SrsBlock srsBlock;
    int priority;
    int parent;
    int id;
    String text;

}
