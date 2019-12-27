package com.carlos1991rocha.stockquotemanager;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="stock")
public class Stock {
    @Id
    
    private String id;
    private String description;
    @OneToMany(mappedBy="stock")
    private List<Quote> quote;

    public String getId() {
        return id;
    }

    public List<Quote> getQuote() {
        return quote;
    }

    public void setQuote(List<Quote> quote) {
        this.quote = quote;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }



}