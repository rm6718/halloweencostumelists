package com.ironyard.halloween.services;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import static org.junit.Assert.*;

/**
 * Created by sam on 10/13/16.
 */
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.ironyard.halloween.data."})
@EnableJpaRepositories(basePackages = {"com.ironyard.halloween.repositories"})
@EnableTransactionManagement
public class RepositroyConfigurationTest {
}
