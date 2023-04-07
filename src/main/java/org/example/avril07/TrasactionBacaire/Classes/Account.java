package org.example.avril07.TrasactionBacaire.Classes;

import org.example.avril07.TrasactionBacaire.Enums.StandardAccountOperations;
import org.example.avril07.TrasactionBacaire.Interface.AccountInterface;

import java.util.ArrayList;
import java.util.List;

public class Account implements AccountInterface {
    private int id;
    private List<Transaction> transactions = new ArrayList<>();

    public Account(int id) {
        this.id = id;
    }

    @Override
    public void receiveMOney(Account accountFrom, double money) {
        this.transactions.add(new Transaction(accountFrom,this,money,StandardAccountOperations.MONEY_TRANSFER_RECEIVE));
    }

    @Override
    public void sendMoney(Account accountTo, double money) {
        this.transactions.add(new Transaction(this,accountTo,money,StandardAccountOperations.MONEY_TRANSFER_SEND));
    }

    @Override
    public void removeMoney(double money) {
        this.transactions.add(new Transaction(this,this,money, StandardAccountOperations.MONEY_TRANSFER_SEND));
    }

    @Override
    public List<Transaction> getTransaction() {
        return this.transactions;
    }
}
