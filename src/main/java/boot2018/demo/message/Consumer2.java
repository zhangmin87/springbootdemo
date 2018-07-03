package boot2018.demo.message;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer2 {
    @JmsListener(destination = "my-destination")
    public void receiveQueue(String text) {
        System.out.println("consumer2收到的报文为："+text);
    }
}
