/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lfb2;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

/**
 *
 * @author Kuppuch
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface IssueService {
	
    @WebMethod
    public Issue getIssue(int id);

    @WebMethod
    public Issue[] getAllIssues();
}
