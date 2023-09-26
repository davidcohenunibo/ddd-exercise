package it.unibo.ddd.exercises.customers;

public interface CustomerRegistry {
    Iterable<Customer> getAllCustomers();

    Customer findCustomerByID(CustomerID id);

    Iterable<Customer> findCustomersByName(String name);

    Iterable<Customer> findCustomersByEmail(String email);

    void addNewCustomer(Customer customer);

    void updateCustomer(Customer customer);

    void deleteCustomer(Customer customer);
}
