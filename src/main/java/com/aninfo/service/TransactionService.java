package com.aninfo.service;

import com.aninfo.model.Transaction;
import com.aninfo.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction createTransaction(Long cbu, Double mountTransaction, String type){
        Transaction transaction = new Transaction(transactionRepository.count()+1,mountTransaction,cbu,type);
        return transactionRepository.save(transaction);
    }

    public List<Transaction> getAllTransactionsByCbu(Long cbu){
        return transactionRepository.findAllTransactionByCbu(cbu);
    }

    public Optional<Transaction> findTransactionByID(Long id){
        return transactionRepository.findById(id);
    }

    public void deleteTransactionByID(Long id){
        transactionRepository.deleteById(id);
    }
}
