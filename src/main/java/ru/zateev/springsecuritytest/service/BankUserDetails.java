package ru.zateev.springsecuritytest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import ru.zateev.springsecuritytest.model.Customer;
import ru.zateev.springsecuritytest.model.SecurityCustomer;
import ru.zateev.springsecuritytest.repository.CustomerRepository;


import java.util.List;

@Service
public class BankUserDetails implements UserDetailsService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<Customer> customersList = customerRepository.findByEmail(username);
        if (customersList.size() == 0) {
            throw new UsernameNotFoundException("User details not founded:" + username);
        }
        return new SecurityCustomer(customersList.get(0));
    }
}
