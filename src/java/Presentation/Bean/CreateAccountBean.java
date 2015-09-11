/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.Bean;

import BusinessLogic.Controller.ManageAccount;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author root
 */
@ManagedBean
@ViewScoped
public class CreateAccountBean {
    
    private String name;
    private long document;
    private String password;
    private String message;

    /**
     * Creates a new instance of CreateAccountBean
     */
    public CreateAccountBean() {
    }
    
    public String getName() {
        return name;
    }

    public long getDocument() {
        return document;
    }

    public String getPassword() {
        return password;
    }

    public String getMessage() {
        return message;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDocument(long document) {
        this.document = document;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public void createAccount(){
        ManageAccount manageAccount = new ManageAccount();
        message = manageAccount.createAccount(name, password, document);
    }
}
