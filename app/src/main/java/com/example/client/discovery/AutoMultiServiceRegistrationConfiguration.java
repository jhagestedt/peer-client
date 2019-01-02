package com.example.client.discovery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.serviceregistry.AutoServiceRegistrationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(AutoServiceRegistrationProperties.class)
@ConditionalOnProperty(value = "spring.cloud.client-registry.auto-multi-registration.enabled", havingValue = "true")
public class AutoMultiServiceRegistrationConfiguration {
}