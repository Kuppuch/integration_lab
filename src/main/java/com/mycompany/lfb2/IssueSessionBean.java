/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lfb2;

import jakarta.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kuppuch
 */
@Stateless
public class IssueSessionBean implements IssueSessionBeanLocal {
    
    List<Issue> issues;
    
    @Override
    public List<Issue> addIssue(Issue issue){
        if (issues == null)
            issues = new ArrayList<>();
                    
        this.issues.add(issue);
        return issues;
    }
    
    @Override
    public List<Issue> getIssues(){
        return this.issues;
    }
}
