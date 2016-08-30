package com.epam.dp.command;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Ivan_Zhuravel
 */
public class BankManager {

    private Deque<Operation> operations = new LinkedList<Operation>();

    public void add(Operation operation) {
        operation.commit();
        operations.add(operation);
    }

    public void remove() {
        operations.removeLast().rollback();
    }
}
