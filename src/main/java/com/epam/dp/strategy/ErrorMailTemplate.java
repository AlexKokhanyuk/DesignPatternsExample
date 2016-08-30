package com.epam.dp.strategy;

/**
 * @author Ivan_Zhuravel
 */
public class ErrorMailTemplate implements MailTemplate {
    @Override
    public String getTemplate() {
        return "<html><head>ERR</head><body>Error during operation</body></html>";
    }
}
