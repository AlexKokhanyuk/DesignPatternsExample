package com.epam.dp.strategy;

/**
 * @author Ivan_Zhuravel
 */
public enum MailSender {

    SUCCESS("success", new SuccessMailTemplate()),
    ERROR("error", new ErrorMailTemplate()),
    INFO("info", new InfoMailTemplate());

    private final String templateId;
    private final MailTemplate mailTemplate;

    MailSender(String templateId, MailTemplate mailTemplate) {
        this.templateId = templateId;
        this.mailTemplate = mailTemplate;
    }

    public static void sendMail(String templateId) {
        MailSender[] values = values();

        for (MailSender mailSender : values) {
            if (mailSender.templateId.equalsIgnoreCase(templateId)) {
                System.out.println(mailSender.mailTemplate.getTemplate());
            }
        }
    }

    public String getTemplateId() {
        return templateId;
    }
}
