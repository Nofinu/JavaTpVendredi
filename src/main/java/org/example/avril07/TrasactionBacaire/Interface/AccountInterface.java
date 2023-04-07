package org.example.avril07.TrasactionBacaire.Interface;

import org.example.avril07.TrasactionBacaire.Classes.Account;
import org.example.avril07.TrasactionBacaire.Classes.Transaction;

import java.util.List;

public interface AccountInterface {

    public void sendMoney (Account accountTo , double money);

    public void receiveMOney(Account accountFrom, double money);

    public void removeMoney (double money);

    public List<Transaction> getTransaction();
}
