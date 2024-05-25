package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class Portfolio extends Client{

    @Id
    @GeneratedValue()
    protected long portfolioId;

    @Column(nullable = false)
    private Date creationDate;

    protected Portfolio() {

    }
    public Portfolio(long clientId, Date creationDate) {
        this.clientId = getClientId();
        this.creationDate = creationDate;
    }
    public java.lang.Long getPortfolioId() {
        return portfolioId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

}
