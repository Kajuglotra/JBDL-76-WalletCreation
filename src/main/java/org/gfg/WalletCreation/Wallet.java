package org.gfg.WalletCreation;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String walletIdentifier;

    private int userId;
    private int amount;

    public Wallet(String walletIdentifier, int userId, int amount) {
        this.walletIdentifier = walletIdentifier;
        this.userId = userId;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWalletIdentifier() {
        return walletIdentifier;
    }

    public void setWalletIdentifier(String walletIdentifier) {
        this.walletIdentifier = walletIdentifier;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
