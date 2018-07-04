package boot2018.demo.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Destination;


/**
 * 报警消息producer
 */
@Component
public class AlarmProducer {

    //也可以注入JmsTemplate,JmsMessagingTemplate对JmsTemplate进行了封装
    @Autowired
    private JmsTemplate jmsTemplate;

    //private JmsMess
    public void sendMessage(Destination destination, String message) {
        // jmsTemplate.convertAndSend(destinationName,payload,messagePostProcessor);
        this.jmsTemplate.convertAndSend(destination,message);
    }
}
