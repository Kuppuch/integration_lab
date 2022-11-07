/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lfb2;

import jakarta.jws.WebService;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Kuppuch
 */
@WebService(endpointInterface = "com.mycompany.lfb2.IssueService") 
public class IssueServiceImpl implements IssueService {
    private static Map issues = new HashMap();


    @Override
    public Issue getIssue(int id) {
            return (Issue)issues.get(id);
    }

    @Override
    public Issue[] getAllIssues() {
            Set ids = issues.keySet();
            Issue[] p = new Issue[ids.size()];
            int i=0;
            for(Object id : ids){
                    p[i] = (Issue)issues.get((Integer)id);
                    i++;
            }
            return p;
    }
}
