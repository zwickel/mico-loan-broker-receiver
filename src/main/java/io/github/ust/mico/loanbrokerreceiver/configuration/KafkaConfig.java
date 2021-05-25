package io.github.ust.mico.loanbrokerreceiver.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;

/**
 * Configuration of the kafka connection.
 */
@Component
@Setter
@Getter
@ConfigurationProperties("kafka")
public class KafkaConfig {

    /**
     * The URL of the Kafka bootstrap server.
     */
    @NotBlank
    private String bootstrapServer;

    /**
     * The Kafka input topic.
     */
    @NotBlank
    private String inputTopic;

    /**
     * The group id is a string that uniquely identifies the group of consumer
     * processes to which this consumer belongs.
     */
    @NotBlank
    private String groupId;
}
