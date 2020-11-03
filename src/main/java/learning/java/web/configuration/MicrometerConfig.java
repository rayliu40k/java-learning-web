/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package learning.java.web.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.spring.autoconfigure.MeterRegistryCustomizer;

/**
 * Micrometer 配置
 * 
 * @author Rayliu40k
 * @version $Id: MicrometerConfig.java, v 0.1 Jun 10, 2019 6:35:37 PM Rayliu40k Exp $
 */
@Component
public class MicrometerConfig {

    /** 应用名称 */
    @Value("#{'${spring.application.name}'}")
    private String springApplicationName;

    @Bean
    public MeterRegistryCustomizer<MeterRegistry> metricsCommonTags() {
        return registry -> {
            registry.config().commonTags("application", this.springApplicationName);
        };
    }

}
