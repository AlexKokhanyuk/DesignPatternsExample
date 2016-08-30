package com.epam.dp.command;

/**
 * @author Ivan_Zhuravel
 */
public class DepositOperation implements Operation {

    private final int count;
    private final BankAccount bankAccount;

    public DepositOperation(int count, BankAccount bankAccount) {
        this.count = count;
        this.bankAccount = bankAccount;
    }

    @Override
    public void commit() {
        bankAccount.setAmount(
                bankAccount.getAmount() + count);
    }

    @Override
    public void rollback() {

        bankAccount.setAmount(bankAccount.getAmount() - count);
    }
}
