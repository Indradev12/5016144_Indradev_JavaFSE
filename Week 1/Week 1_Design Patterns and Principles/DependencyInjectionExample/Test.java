import dao.CustomerRepository;
import dao.CustomerRepositoryImpl;
import service.CustomerService;

public class Test {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        
        CustomerService customerService = new CustomerService(customerRepository);
        
        int customerId = 1;
        customerService.getCustomerById(customerId);
    }
}
