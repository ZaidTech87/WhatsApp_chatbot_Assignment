package com.assignment.WhatsApp_chatbot.service;


public class ChatService {

    public static String getReply(String message) {

        if (message == null) {
            return "Invalid message";
        }

        message = message.trim().toLowerCase();

        switch (message) {
            case "hi":
                return "Hello";
            case "bye":
                return "Goodbye";
            default:
                return "I don't understand";
        }
    }
}