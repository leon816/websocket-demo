package com.example.demo;

import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * @author LiLiang
 * @version 2018-07-19
 */
@Component
public class MyHandler extends TextWebSocketHandler {
	@Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) throws IOException {
        //session.getAttributes();
		session.sendMessage(new TextMessage("hello".getBytes()));
    }
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		
	}
}
