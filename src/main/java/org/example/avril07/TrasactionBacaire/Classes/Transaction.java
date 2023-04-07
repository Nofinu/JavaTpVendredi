package org.example.avril07.TrasactionBacaire.Classes;

import org.example.avril07.TrasactionBacaire.Enums.StandardAccountOperations;

import java.util.AbstractCollection;

public class Transaction {

    private Account accountFrom;
    private Account accountFor;
    private double moneyAmount;
    private StandardAccountOperations oper;

    public Transaction(Account accountFrom, Account accountFor, double moneyAmount, StandardAccountOperations oper) {
        this.accountFrom = accountFrom;
        this.accountFor = accountFor;
        this.moneyAmount = moneyAmount;
        this.oper = oper;
    }
}
