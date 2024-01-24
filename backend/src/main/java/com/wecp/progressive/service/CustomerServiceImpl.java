package com.wecp.progressive.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.wecp.progressive.dao.CustomerDAO;
import com.wecp.progressive.entity.Customers;

public class CustomerServiceImpl implements CustomerService{
    private static List<Customers> al=new ArrayList<>();
    private CustomerDAO customerDAO;
    

    public CustomerServiceImpl(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    public List<Customers> getAllCustomers() throws SQLException {
        return null;
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAllCustomers'");
    }

    @Override
    public Customers getCustomerById(int customerId) throws SQLException {
        return null;
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getCustomerById'");
    }

    @Override
    public int addCustomer(Customers customers) throws SQLException {
        return -1;
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'addCustomer'");
    }

    @Override
    public void updateCustomer(Customers customers) throws SQLException {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'updateCustomer'");
    }

    @Override
    public void deleteCustomer(int customerId) throws SQLException {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'deleteCustomer'");
    }

    @Override
    public List<Customers> getAllCustomersSortedByName() throws SQLException {
        return null;
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAllCustomersSortedByName'");
    }

    @Override
    public List<Customers> getAllCustomersFromArrayList() {
        return null;
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAllCustomersFromArrayList'");
    }

    @Override
    public List<Customers> addCustomersToArrayList(Customers customers) {
        al.add(customers);
        return al;
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'addCustomersToArrayList'");
    }

    @Override
    public List<Customers> getAllCustomersSortedByNameFromArrayList() {
        List<Customers> sortedal=al;
        Collections.sort(sortedal);
        return sortedal;
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAllCustomersSortedByNameFromArrayList'");
    }

    @Override
    public void emptyArrayList() {
        al=new ArrayList<>();
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'emptyArrayList'");
    }

}