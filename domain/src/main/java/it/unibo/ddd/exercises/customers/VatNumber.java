package it.unibo.ddd.exercises.customers;

public interface VatNumber extends CustomerID{
    @Override
    Object getValue();
}
