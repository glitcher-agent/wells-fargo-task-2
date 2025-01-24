package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long  clientId;
    @Column(nullable = false)
    private long finAdvisorId;
    @Column(nullable = false)
    private String clientName;
    @Column(nullable = false)
    private String clientEmail;
    @Column(nullable = false)
    private String clientPhone;
    @Column(nullable = false)
    private String clientAddress;

    public Client(long clientId, long finAdvisorId, String clientName, String clientEmail, String clientPhone, String clientAddress) {
        this.clientId = clientId;
        this.finAdvisorId = finAdvisorId;
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.clientPhone = clientPhone;
        this.clientAddress = clientAddress;
    }

    public Client() {

    }


    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public long getFinAdvisorId() {
        return finAdvisorId;
    }

    public void setFinAdvisorId(long finAdvisorId) {
        this.finAdvisorId = finAdvisorId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }
}
