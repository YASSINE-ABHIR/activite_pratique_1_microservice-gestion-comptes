package ma.yassine.apn1_banking_micro_service.repositories;

import ma.yassine.apn1_banking_micro_service.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
