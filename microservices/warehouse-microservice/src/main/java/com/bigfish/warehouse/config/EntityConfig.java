package com.bigfish.warehouse.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan(basePackages = "com.bigfish.entity")
public class EntityConfig {
}
