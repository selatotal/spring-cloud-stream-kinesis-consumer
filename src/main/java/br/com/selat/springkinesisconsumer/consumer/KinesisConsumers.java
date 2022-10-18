package br.com.selat.springkinesisconsumer.consumer;

import br.com.selat.springkinesisconsumer.SpringCloudStreamKinesisConsumerApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class KinesisConsumers {
    private static final Logger LOGGER = LoggerFactory.getLogger(KinesisConsumers.class);

    @Bean
    public Consumer<String> mqttEvents(){
        return LOGGER::info;
    }
}
