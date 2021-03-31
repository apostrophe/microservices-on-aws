package com.microservicesonaws.api.utility;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.FileCopyUtils;

@Configuration
public class Utility {

	private String path = "classpath:apikey";
	
	@Bean
	public String apiKey() {
		return readFileToString(path);
	}

	public static String readFileToString(String path) {
	    Resource resource = null;
		try {
		    ResourceLoader resourceLoader = new DefaultResourceLoader();
		    resource = resourceLoader.getResource(path);
		    if (!resource.exists()) {
		    	throw new IOException("resource doesn't exist");
		    }
		} catch (Exception e) {
			
		}
	    return asString(resource);
	}
	
    public static String asString(Resource resource) {
        try (Reader reader = new InputStreamReader(resource.getInputStream(), Charset.defaultCharset())) {
            return FileCopyUtils.copyToString(reader);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
