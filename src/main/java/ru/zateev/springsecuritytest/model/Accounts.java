package ru.zateev.springsecuritytest.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "accounts")
public class Accounts {
    @Column(
            name = "customer_id"
    )
    private int customerId;
    @Column(
            name = "account_number"
    )
    @Id
    private long accountNumber;
    @Column(
            name = "account_type"
    )
    private String accountType;
    @Column(
            name = "branch_address"
    )
    private String branchAddress;
    @Column(
            name = "create_dt"
    )
    private String createDt;

    public Accounts() {
    }

    public int getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBranchAddress() {
        return this.branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }

    public String getCreateDt() {
        return this.createDt;
    }

    public void setCreateDt(String createDt) {
        this.createDt = createDt;
    }
}
