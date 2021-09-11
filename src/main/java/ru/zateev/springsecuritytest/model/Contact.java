package ru.zateev.springsecuritytest.model;

import java.sql.Date;
import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name = "contact_messages")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(
            name = "contact_id"
    )
    private int contactId;
    @Column(
            name = "contact_name"
    )
    private String contactName;
    @Column(
            name = "contact_email"
    )
    private String contactEmail;
    private String subject;
    private String message;
    @Column(
            name = "create_dt"
    )
    private LocalDate createDt;

    public Contact() {
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getContactName() {
        return this.contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactEmail() {
        return this.contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getCreateDt() {
        return createDt;
    }

    public void setCreateDt(LocalDate createDt) {
        this.createDt = createDt;
    }
}
