package ru.zateev.springsecuritytest.repositry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.zateev.springsecuritytest.model.Customers;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customers, Long> {
    List<Customers> findByEmail(String email);
}
