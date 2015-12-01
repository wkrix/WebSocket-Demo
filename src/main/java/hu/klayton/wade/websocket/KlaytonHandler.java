package hu.klayton.wade.websocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

/**
 * @author Walter Krix <walter.krix@inbuss.hu>
 */
@Component
public class KlaytonHandler extends AbstractWebSocketHandler {

    private static final Logger logger = LoggerFactory.getLogger(KlaytonHandler.class);

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        logger.info("Recieved message: " + message.getPayload());
        Thread.sleep(2000);

        TextMessage textMessage = new TextMessage("Wade!");
        session.sendMessage(textMessage);
        logger.info("Sent message: " + textMessage.getPayload());
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        logger.info("Connection established");
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        logger.info("Connection closed. Status: [{}]", status);
    }
}
