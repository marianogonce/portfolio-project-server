package com.porfolioserver.portfolioserver.properties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {

    @Getter @Setter
    private String uploadDir;
}
