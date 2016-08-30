package com.epam.dp.strategy;

/**
 * @author Ivan_Zhuravel
 */
public class InfoMailTemplate implements MailTemplate {
    @Override
    public String getTemplate() {
        return "info";
    }
}
