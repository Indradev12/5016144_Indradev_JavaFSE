package service;

import dao.CustomerRepository;

public class CustomerService {

    private final CustomerRepository customerRepository;

    // Constructor injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void getCustomerById(int id) {
        System.out.println("Processing....");
        customerRepository.findCustomerById(id);
    }
}
