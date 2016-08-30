package com.epam.dp.command;

/**
 * @author Ivan_Zhuravel
 */
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAmount(10);

        BankManager bankManager = new BankManager();

        Operation operation = new DepositOperation(200, account);

        bankManager.add(operation);

        System.out.println(account.getAmount());

        bankManager.remove();

        System.out.println(account.getAmount());


    }
}
