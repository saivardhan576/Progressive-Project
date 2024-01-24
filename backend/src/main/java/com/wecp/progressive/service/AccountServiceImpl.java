package com.wecp.progressive.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.wecp.progressive.dao.AccountDAO;
import com.wecp.progressive.entity.Accounts;

public class AccountServiceImpl  implements AccountService{
    private static List<Accounts> al=new ArrayList<>();
    private AccountDAO accountDAO;

    

    public AccountServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public List<Accounts> getAllAccounts() throws SQLException {
        return null;
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAllAccounts'");
    }

    @Override
    public List<Accounts> getAccountsByUser(int userId) throws SQLException {
        return null;
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAccountsByUser'");
    }

    @Override
    public Accounts getAccountById(int accountId) throws SQLException {
        return null;
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAccountById'");
    }

    @Override
    public int addAccount(Accounts accounts) throws SQLException {
        return -1;
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'addAccount'");
    }

    @Override
    public void updateAccount(Accounts accounts) throws SQLException {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'updateAccount'");
    }

    @Override
    public void deleteAccount(int accountId) throws SQLException {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'deleteAccount'");
    }

    @Override
    public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
        return null;
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAllAccountsSortedByBalance'");
    }

    @Override
    public List<Accounts> getAllAccountsFromArrayList() {
        return al;

        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAllAccountsFromArrayList'");
    }

    @Override
    public List<Accounts> addAccountToArrayList(Accounts accounts) {
        al.add(accounts);
        return al;
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'addAccountToArrayList'");
    }

    @Override
    public List<Accounts> getAllAccountsSortedByBalanceFromArrayList() {
        List<Accounts> sortedAl= al;
        Collections.sort(sortedAl);
        return sortedAl;
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAllAccountsSortedByBalanceFromArrayList'");
    }

    @Override
    public void emptyArrayList() {
        al=new ArrayList<>();
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'emptyArrayList'");
    }

}