package boot2018.demo.message;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class AlarmConsumer {
    //使用JmsListener 配置消费者监听的队列，其中text 是接收到的消息
    @JmsListener(destination = "mytest.queue")
    //@SendTo("out.queue") 为了实现双向队列
    public void receiveQueue(String text) {
        System.out.println("AlarmConsumer收到的报文为:" +text);
        System.out.println("把报警信息["+text+"]发送邮件给xxx");
        System.out.println("把报警信息["+text+"]发送短信给xxx");
        System.out.println("..........");
    }
}
