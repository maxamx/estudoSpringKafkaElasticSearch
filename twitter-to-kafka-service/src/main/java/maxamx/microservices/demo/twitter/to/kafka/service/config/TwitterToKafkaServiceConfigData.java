package maxamx.microservices.demo.twitter.to.kafka.service.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@ConfigurationProperties(prefix = "twitter-to-kafka-service")
public record TwitterToKafkaServiceConfigData(List<String> twitterKeywords, String welcomeMessage){
}
