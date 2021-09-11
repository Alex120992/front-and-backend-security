package ru.zateev.springsecuritytest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.scheduling.concurrent.ScheduledExecutorTask;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    @Column(
            name = "customer_id"
    )
    private int id;
    private String name;
    private String email;
    @Column(
            name = "mobile_number"
    )
    private String mobileNumber;
    @JsonIgnore
    private String pwd;
    private String role;
    @Column(
            name = "create_dt"
    )
    private String createDt;
    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<Authority> authorities;

    public Customer() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPwd() {
        return this.pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCreateDt() {
        return this.createDt;
    }

    public void setCreateDt(String createDt) {
        this.createDt = createDt;
    }

    public Set<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<Authority> authorities) {
        this.authorities = authorities;
    }
}
