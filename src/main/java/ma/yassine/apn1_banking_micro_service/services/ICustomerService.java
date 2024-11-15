package ma.yassine.apn1_banking_micro_service.services;

import ma.yassine.apn1_banking_micro_service.entities.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAllCustomers();
}
