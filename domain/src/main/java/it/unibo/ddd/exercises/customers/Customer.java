package it.unibo.ddd.exercises.customers;

public interface Customer {
    CustomerID getID();
    String getName();
    Customer setName(String name);
    String getSurname();
}
