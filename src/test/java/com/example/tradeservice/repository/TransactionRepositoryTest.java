package com.example.tradeservice.repository;

import com.example.tradeservice.TradeServiceApplication;
import com.example.tradeservice.entity.Transaction;
import com.example.tradeservice.enums.SecurityCode;
import com.example.tradeservice.enums.TradeActionType;
import com.example.tradeservice.enums.TradeType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TradeServiceApplication.class)
@ActiveProfiles(profiles = "test")
public class TransactionRepositoryTest {

    @Autowired
    private TransactionRepository transactionRepository;


    @Test
    public void testSaveTransaction() {
        Transaction transaction = Transaction.builder()
                .transactionId(1)
                .tradeId(1)
                .securityCode(SecurityCode.REL)
                .quantity(60)
                .tradeActionType(TradeActionType.INSERT)
                .tradeType(TradeType.Buy)
                .build();


        Transaction newTrans = transactionRepository.save(transaction);

        Assert.assertNotNull(newTrans.getTradeId());
        Assert.assertNotNull(newTrans.getSecurityCode());
        Assert.assertNotNull(newTrans.getQuantity());
        Assert.assertNotNull(newTrans.getTradeActionType());
        Assert.assertNotNull(newTrans.getTradeType());
    }

}
