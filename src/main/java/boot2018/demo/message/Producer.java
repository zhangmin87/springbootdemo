package boot2018.demo.message;
import javax.jms.Destination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;


@Service("producer")
public class Producer {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    //发送消息：destination 是发送到队列,message 是待发送的消息
    public void sendMessage(Destination destination, final String message) {
        jmsMessagingTemplate.convertAndSend(destination, message);
    }
}
