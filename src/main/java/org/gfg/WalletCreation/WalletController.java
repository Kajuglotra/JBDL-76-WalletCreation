package org.gfg.WalletCreation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalletController {

    @Autowired
    private WalletService walletService;

    private static final Log logger = LogFactory.getLog(WalletController.class);

    @PostMapping("/addWallet")
    public WalletDTO addWallet(@RequestBody WalletDTO dto, @RequestHeader String requestId){
//        MDC.put("requestId", requestId);
        logger.info("request landed to add user "+ dto);
        return walletService.addWallet(dto);
    }
}
