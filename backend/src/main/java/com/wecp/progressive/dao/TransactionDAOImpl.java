package com.wecp.progressive.dao;

<<<<<<< HEAD

public class TransactionDAOImpl {
=======
import java.util.List;

import com.wecp.progressive.entity.Transactions;

public class TransactionDAOImpl implements TransactionDAO{

    @Override
    public int addTransaction(Transactions transaction) {
        // TODO Auto-generated method stub
        return-1;//throw new UnsupportedOperationException("Unimplemented method 'addTransaction'");
    }

    @Override
    public Transactions getTransactionById(int transactionId) {
        return null;
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getTransactionById'");
    }

    @Override
    public void updateTransaction(Transactions transaction) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'updateTransaction'");
    }

    @Override
    public void deleteTransaction(int transactionId) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'deleteTransaction'");
    }

    @Override
    public List<Transactions> getAllTransactions() {
        return null;
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAllTransactions'");
    }
>>>>>>> 425cf6c3dd05ee760d5b51005e99e955c0d54ff9



}
