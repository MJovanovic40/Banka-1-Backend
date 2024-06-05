package rs.edu.raf.banka1.services;

import rs.edu.raf.banka1.model.*;

import java.util.List;

public interface MarginTransactionService {
    void createTransaction(MarketOrder order, BankAccount userAccount, Currency currency, String description, TransactionType transactionType, Double price);
    void createTransactionMarginCall(MarginAccount marginAccount, Double amount);
    List<MarginTransaction> getAllTransactions();
    List<MarginTransaction> getTransactionsForMarginAccountId(Long marginAccountId);
}
