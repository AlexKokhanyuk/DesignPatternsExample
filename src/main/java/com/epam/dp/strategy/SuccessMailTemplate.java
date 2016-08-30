package com.epam.dp.strategy;

/**
 * @author Ivan_Zhuravel
 */
public class SuccessMailTemplate implements MailTemplate {
    @Override
    public String getTemplate() {
        return "<html><head>Success</head><body>Success operation</body></html>";
    }
}
