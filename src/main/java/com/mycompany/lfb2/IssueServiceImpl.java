/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lfb2;

import jakarta.ejb.EJB;
import jakarta.jws.WebService;
import java.util.List;

/**
 * @author Kuppuch
 */
@WebService(endpointInterface = "com.mycompany.lfb2.IssueService")
public class IssueServiceImpl implements IssueService {
    
    @EJB
    private IssueSessionBeanLocal bean;

    @Override
    public Issue getIssue(int id) {
        return new Issue();
    }

    @Override
    public Issue[] getAllIssues() {
        List<Issue> issueList = this.bean.getIssues();
        Issue[] issues = new Issue[issueList.size()];
        Issue[] array = issueList.toArray(issues);
        return array;
    }

    @Override
    public boolean addIssue(Issue i) {
        bean.addIssue(i);
        return true;
    }

    @Override
    public boolean deleteIssue(int id) {
        return false;
    }
}
