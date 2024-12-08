package org.gfg.WalletCreation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WalletService {

    @Autowired
    private WalletRepository walletRepository;
    public WalletDTO addWallet(WalletDTO dto) {
        Wallet wallet  = new Wallet(dto.getWalletIdentifier(), dto.getUserId(), dto.getAmount());
        wallet =  walletRepository.save(wallet);
        return new WalletDTO(wallet.getWalletIdentifier(),wallet.getAmount(), wallet.getUserId());
    }
}
