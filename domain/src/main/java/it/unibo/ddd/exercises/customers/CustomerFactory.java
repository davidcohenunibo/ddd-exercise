package it.unibo.ddd.exercises.customers;

public interface CustomerFactory {

    TaxCode computeTaxCode(String name, String surname, String birthDate, String birthPlace);

    Customer newCustomerPerson(String name, String surname, String birthDate, String birthPlace, String email);

    Customer NewCustomerPerson(TaxCode code, String fullName, String email);

    Customer NewCustomerCompany(TaxCode taxCode, String fullName, String email);

}
