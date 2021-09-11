package ru.zateev.springsecuritytest.model;

import javax.persistence.*;

@Entity
@Table(name = "authorities")
public class Authority {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String authority;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    Customer customer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
