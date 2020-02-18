package com.shpl.farefinderbff.provider;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.stereotype.Component;

@Data
@Component
@ConstructorBinding
@ConfigurationProperties(prefix = "endpoints")
public class DataProperties {
    private String base;
    private String singleFares;
}
