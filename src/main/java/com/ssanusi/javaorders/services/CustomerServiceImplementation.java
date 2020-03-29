package com.ssanusi.javaorders.services;

import com.ssanusi.javaorders.models.Agent;
import com.ssanusi.javaorders.models.Customer;
import com.ssanusi.javaorders.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImplementation implements CustomerService {

    @Autowired
    private CustomerRepository customerRepo;


    private AgentService agentService;

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        customerRepo.findAll().iterator().forEachRemaining(customers::add);
        return customers;
    }

    @Override
    public Customer findById(long customerCode) {
        return customerRepo.findById(customerCode).orElseThrow(() -> new EntityNotFoundException("Not Found " + customerCode));
    }

    @Override
    public Customer save(Customer customer) {
        Customer newCustomer = new Customer();
        Agent agent = agentService.findById(customer.getAgent().getAgentcode());
        newCustomer.setCustname(customer.getCustname());
        newCustomer.setEmail(customer.getEmail());
        newCustomer.setPhone(customer.getPhone());
        newCustomer.setCustcity(customer.getCustcity());
        newCustomer.setGrade(customer.getGrade());
        newCustomer.setOpeningamt(customer.getOpeningamt());
        newCustomer.setOutstandingamt(customer.getOutstandingamt());
        newCustomer.setPaymentamt(customer.getPaymentamt());
        newCustomer.setReceiveamt(customer.getReceiveamt());
        newCustomer.setWorkingarea(customer.getWorkingarea());
        newCustomer.setAgent(agent);
        return customerRepo.save(newCustomer);
    }

    @Override
    public Customer update(Customer customer, long customerCode) {
        return null;
    }

    @Override
    public void delete(long customerCode) {

    }

    @Override
    public List<Customer> findCustomerByName(String customer) {
        List<Customer> customers = customerRepo.findAllBycustnameContains(customer);
        return customers;
    }
}
