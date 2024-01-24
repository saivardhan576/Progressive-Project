package com.wecp.progressive.dao;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.entity.Accounts;

public class AccountDAOImpl implements AccountDAO {
    private List<AccountDAO> accountDAO=new ArrayList<>();

    @Override
    public int addAccount(Accounts accounts) {
       return -1;
    }

    @Override
    public Accounts getAccountById(int accountId) {
       return null;
    }

    @Override
    public void updateAccount(Accounts accounts) {
        
    }

    @Override
    public void deleteAccount(int accountId) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'deleteAccount'");
    }

    @Override
    public List<Accounts> getAllAccounts() {
        return null;
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAllAccounts'");
    }
}
