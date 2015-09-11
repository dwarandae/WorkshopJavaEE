/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic.Controller;

import DataAccess.DAO.AccountDAO;
import DataAccess.Entity.Account;

/**
 *
 * @author root
 */
public class ManageAccount {
    
    public String createAccount(String name, String password, long document){
        
        Account account = new Account();
        account.setDocument(document);
        account.setPassword(password);
        account.setName(name);
        account.setBalance(0);
        
        AccountDAO accountDAO = new AccountDAO();
        Account accountE = accountDAO.persist(account);
        if(accountE != null) {
            return "The account was created, your account number is: " + account.getAccountNumber();
        } else {
            return "The account could not be created!";
        }
        
    }
    
}
