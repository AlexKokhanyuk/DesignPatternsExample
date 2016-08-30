package com.epam.dp.command;

/**
 * @author Ivan_Zhuravel
 */
public interface Operation {

    void commit();

    void rollback();
}
