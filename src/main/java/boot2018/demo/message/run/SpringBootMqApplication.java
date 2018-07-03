package boot2018.demo.message.run;

import boot2018.demo.message.text.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.core.JmsTemplate;

/**
 * CommandLinerRunner 接口中的run 方法,是在程序启动就会执行的代码
 * JmsTemplate是操作JMS 消息的操作类
 */
@SpringBootApplication
public class SpringBootMqApplication implements CommandLineRunner {

    @Autowired
    JmsTemplate jmsTemplate;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMqApplication.class, args);
    }

    @Override
    public void run(String... args) {
        for (int i=0;i<10;i++) {
            jmsTemplate.send("my-destination",new Msg());
        }
    }
}
