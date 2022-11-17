// package com.bh.tb.config;

// import org.springframework.context.annotation.Configuration;
// import org.springframework.web.socket.config.annotation.EnableWebSocket;
// import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
// import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

// import com.bh.tb.handler.ChatHandler;

// import lombok.RequiredArgsConstructor;

// @Configuration
// @RequiredArgsConstructor
// @EnableWebSocket
// public class WebSocketConfig implements WebSocketConfigurer{
	
// 	private final ChatHandler chatHandler = new ChatHandler();

// 	@Override
// 	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
// 		registry.addHandler(chatHandler, "/ws/chat")
// 						.setAllowedOriginPatterns("*")
// 						.withSockJS()
// 						// .setClientLibraryUrl("http://localhost:8080/js/chat/websocket.js")
// 						.setClientLibraryUrl("https://cdnjs.cloudflare.com/ajax/libs/sockjs-client/1.1.2/sockjs.js")
// 						.setHeartbeatTime(30000);
// 	}

// }
