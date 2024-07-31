package dao;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public void findCustomerById(int id) {
        System.out.println("Searching Customer with id: "+id);
    }
}
