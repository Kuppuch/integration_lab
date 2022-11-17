/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lfb2;

import jakarta.jws.WebService;
import jakarta.xml.bind.JAXBContext;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Kuppuch
 */
@WebService(endpointInterface = "com.mycompany.lfb2.IssueService")
public class IssueServiceImpl implements IssueService {
    private static Map issues = new HashMap();
    //private static final String BOOKSTORE_XML = "src/main/resources/bookstore.xml";
    private static final String ISSUE_XML = "src/main/resources/example.xml";


    @Override
    public Issue getIssue(int id) {
        return (Issue) issues.get(id);
    }

    @Override
    public Issue[] getAllIssues() {
        Issue[] issues = new Issue[10];
        
        Issue issue = new Issue();
        try {
            JAXBContext context = JAXBContext.newInstance(Issue.class);
            jakarta.xml.bind.Marshaller m = context.createMarshaller();
            jakarta.xml.bind.Unmarshaller u = context.createUnmarshaller();

            issue = (Issue) u.unmarshal(new File(ISSUE_XML));
            issues[0] = issue;
            System.out.println(issue.author.name);
            System.out.println(issue.name);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return issues;
    }
}
