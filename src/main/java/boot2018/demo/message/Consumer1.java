package boot2018.demo.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class Consumer1 {

    @JmsListener(destination = "mytest.queue")
    public void receiveQueue(String text) {
        System.out.println("consumer1收到的报文为："+text);
    }
}
