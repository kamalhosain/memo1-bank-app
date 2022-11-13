package com.aninfo.service;

import com.aninfo.exceptions.DepositNegativeSumException;
import com.aninfo.exceptions.InsufficientFundsException;
import com.aninfo.model.Account;
import com.aninfo.model.Transaction;
import com.aninfo.repository.AccountRepository;
import com.aninfo.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction createTransaction(Long cbu, Double mountTransaction, String type){
        Transaction transaction = new Transaction(transactionRepository.count()+1,mountTransaction,cbu,type);
        return transactionRepository.save(transaction);
    }

    public List<Transaction> getAllTransactionsByCBU(Long cbu){
        return transactionRepository.findAllTransactionByCBU(cbu);
    }

    public Optional<Transaction> findTransactionByID(Long id){
        return transactionRepository.findById(id);
    }

    public void deleteTransactionByID(Long id){
        transactionRepository.deleteById(id);
    }
}
