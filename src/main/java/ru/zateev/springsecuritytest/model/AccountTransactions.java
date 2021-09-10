package ru.zateev.springsecuritytest.model;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(
        name = "account_transactions"
)
public class AccountTransactions {
    @Id
    @Column(
            name = "transaction_id"
    )
    private String transactionId;
    @Column(
            name = "account_number"
    )
    private long accountNumber;
    @Column(
            name = "customer_id"
    )
    private int customerId;
    @Column(
            name = "transaction_dt"
    )
    private Date transactionDt;
    @Column(
            name = "transaction_summary"
    )
    private String transactionSummary;
    @Column(
            name = "transaction_type"
    )
    private String transactionType;
    @Column(
            name = "transaction_amt"
    )
    private int transactionAmt;
    @Column(
            name = "closing_balance"
    )
    private int closingBalance;
    @Column(
            name = "create_dt"
    )
    private String createDt;

    public AccountTransactions() {
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Date getTransactionDt() {
        return this.transactionDt;
    }

    public void setTransactionDt(Date transactionDt) {
        this.transactionDt = transactionDt;
    }

    public String getTransactionSummary() {
        return this.transactionSummary;
    }

    public void setTransactionSummary(String transactionSummary) {
        this.transactionSummary = transactionSummary;
    }

    public String getTransactionType() {
        return this.transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public int getTransactionAmt() {
        return this.transactionAmt;
    }

    public void setTransactionAmt(int transactionAmt) {
        this.transactionAmt = transactionAmt;
    }

    public int getClosingBalance() {
        return this.closingBalance;
    }

    public void setClosingBalance(int closingBalance) {
        this.closingBalance = closingBalance;
    }

    public String getCreateDt() {
        return this.createDt;
    }

    public void setCreateDt(String createDt) {
        this.createDt = createDt;
    }
}

