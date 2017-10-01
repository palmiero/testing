package com.lsoftware.testing.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.UUID;

import com.lsoftware.testing.domain.model.Client;

@Entity
public class Account {

    @Column(nullable = false, unique = true)
    private String code;

    @OneToOne(optional = false)
    private Client client;

    public Account(com.lsoftware.testing.domain.model.Client client) {
        this.code = UUID.randomUUID().toString();
        this.client = client;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public com.lsoftware.testing.domain.model.Client getClient() {
        return client;
    }

    public void setClient(com.lsoftware.testing.domain.model.Client client) {
        this.client = client;
    }
}
