package com.wecp.progressive.dao;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.dto.CustomerAccountInfo;
import com.wecp.progressive.entity.Customers;

public class CustomerDAOImpl implements CustomerDAO {
    private List<Customers> customer=new ArrayList<>();

    @Override
    public int addCustomer(Customers customers) {
        return -1;
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'addCustomer'");
    }

    @Override
    public Customers getCustomerById(int customerId) {
        return null;
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getCustomerById'");
    }

    @Override
    public void updateCustomer(Customers customers) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'updateCustomer'");
    }

    @Override
    public void deleteCustomer(int customerId) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'deleteCustomer'");
    }

    @Override
    public List<Customers> getAllCustomers() {
        return null;
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAllCustomers'");
    }

    @Override
    public CustomerAccountInfo getCustomerAccountInfo(int customerId) {
        return null;
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getCustomerAccountInfo'");
    }


}
