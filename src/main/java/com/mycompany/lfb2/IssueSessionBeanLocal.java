/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lfb2;

import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author Kuppuch
 */
@Local
public interface IssueSessionBeanLocal {
    public List<Issue> addIssue(Issue issue);
    public List<Issue> getIssues();
}
