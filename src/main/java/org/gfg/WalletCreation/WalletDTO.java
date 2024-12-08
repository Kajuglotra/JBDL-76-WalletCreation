package org.gfg.WalletCreation;

import lombok.*;

public class WalletDTO {

    private String walletIdentifier;

    private int amount;

    private int userId;

    public WalletDTO(String walletIdentifier, int amount, int userId) {
        this.walletIdentifier = walletIdentifier;
        this.amount = amount;
        this.userId = userId;
    }

    public String getWalletIdentifier() {
        return walletIdentifier;
    }

    public void setWalletIdentifier(String walletIdentifier) {
        this.walletIdentifier = walletIdentifier;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "WalletDTO{" +
                "walletIdentifier='" + walletIdentifier + '\'' +
                ", amount=" + amount +
                ", userId=" + userId +
                '}';
    }
}
