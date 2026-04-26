package com.assignment.WhatsApp_chatbot.controller;


import com.assignment.WhatsApp_chatbot.model.MessageRequest;
import com.assignment.WhatsApp_chatbot.model.MessageResponse;
import com.assignment.WhatsApp_chatbot.service.ChatService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    @PostMapping
    public MessageResponse handleMessage(@RequestBody MessageRequest request) {

        // Log incoming message
        System.out.println("Received message: " + request.getMessage());

        String reply = ChatService.getReply(request.getMessage());

        return new MessageResponse(reply);
    }
}