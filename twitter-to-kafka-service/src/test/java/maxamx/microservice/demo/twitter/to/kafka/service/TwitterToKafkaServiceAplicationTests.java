package maxamx.microservice.demo.twitter.to.kafka.service;

import maxamx.microservices.demo.twitter.to.kafka.service.config.TwitterToKafkaServiceConfigData;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TwitterToKafkaServiceAplicationTests {

    private final TwitterToKafkaServiceConfigData twitterToKafkaServiceConfigData;

    public TwitterToKafkaServiceAplicationTests(TwitterToKafkaServiceConfigData configData){
            this.twitterToKafkaServiceConfigData = configData;
    }

    @Test
    public void contextLoad(){

    }

}
