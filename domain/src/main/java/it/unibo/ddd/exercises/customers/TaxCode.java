package it.unibo.ddd.exercises.customers;

public interface TaxCode extends CustomerID{
    @Override
    Object getValue();
}
