package com.epam.dp.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ivan_Zhuravel
 */
public class Main {

    public static void main(String[] args) {

        Map<String, MailTemplate> mailTemplateMap = new HashMap<>();
        mailTemplateMap.put("success", new SuccessMailTemplate());
        mailTemplateMap.put("info", new InfoMailTemplate());
        mailTemplateMap.put("error", new ErrorMailTemplate());

        MapMailSender mapMailSender = new MapMailSender(mailTemplateMap);

        mapMailSender.sendMail("error");



        MailSender.sendMail(MailSender.ERROR.getTemplateId());
    }
}
