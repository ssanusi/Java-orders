package com.ssanusi.javaorders.services;

import com.ssanusi.javaorders.models.Agent;
import com.ssanusi.javaorders.models.Customer;
import com.ssanusi.javaorders.repositories.CustomerRepository;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CustomerServiceImplementation implements CustomerService {

    private CustomerRepository customerRepo;

    private AgentService agentService;

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        customerRepo.findAll().iterator().forEachRemaining(customers::add);
        return customers;
    }

    @Override
    public Customer findById(UUID customerCode) {
        return customerRepo.findById(customerCode).orElseThrow(() -> new EntityNotFoundException("Not Found " + customerCode));
    }

    @Override
    public Customer save(Customer customer) {
        Customer newCustomer = new Customer();
        Agent agent = agentService.findById(customer.getAgent().getAgentCode());
        newCustomer.setCustomerName(customer.getCustomerName());
        newCustomer.setEmail(customer.getEmail());
        newCustomer.setPhone(customer.getPhone());
        newCustomer.setCustomerCity(customer.getCustomerCity());
        newCustomer.setGrade(customer.getGrade());
        newCustomer.setOpeningAmount(customer.getOpeningAmount());
        newCustomer.setOutstandingAmount(customer.getOutstandingAmount());
        newCustomer.setPaymentAmount(customer.getPaymentAmount());
        newCustomer.setReceiveAmount(customer.getReceiveAmount());
        newCustomer.setWorkingArea(customer.getWorkingArea());
        newCustomer.setAgent(agent);
        return customerRepo.save(newCustomer);
    }

    @Override
    public Customer update(Customer customer, UUID customerCode) {
        return null;
    }

    @Override
    public void delete(UUID customerCode) {

    }
}
