package com.magalu.notification.sender;

import org.springframework.stereotype.Component;

@Component
public class EmailSender extends BaseSender {
    @Override
    public boolean send(String receiver, String message) {
        System.out.println("Email notification not yet implemented");
        return Boolean.TRUE;
    }
}
