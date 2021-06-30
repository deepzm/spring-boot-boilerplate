package io.cyberia.example.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import javax.annotation.PostConstruct;
import java.util.Arrays;

import static org.springframework.hateoas.MediaTypes.HAL_JSON;

/**
 * https://github.com/spring-projects/spring-hateoas/issues/263
 * application/hal+json is the only enabled mediat type for hal conversion.
 * As a result resource representations do not follow HAL rendering and results
 * in nasty output.
 */
@Component
public class HalMediaTypeEnabler {
    private static final MediaType CUSTOM_MEDIA_TYPE = new MediaType("application", "*+json");
    private final RequestMappingHandlerAdapter requestMappingHandlerAdapter;

    @Autowired
    HalMediaTypeEnabler(RequestMappingHandlerAdapter requestMappingHandlerAdapter) {
        this.requestMappingHandlerAdapter = requestMappingHandlerAdapter;
    }

    @PostConstruct
    public void enableVndHalJson() {
        for (HttpMessageConverter<?> converter : requestMappingHandlerAdapter.getMessageConverters()) {
            registerConverterForAllVndHalJson(converter);
        }
    }

    private void registerConverterForAllVndHalJson(HttpMessageConverter<?> converter) {
        if (converter instanceof MappingJackson2HttpMessageConverter && converter.getSupportedMediaTypes().contains(HAL_JSON)) {
            MappingJackson2HttpMessageConverter messageConverter = (MappingJackson2HttpMessageConverter) converter;
            messageConverter.setSupportedMediaTypes(Arrays.asList(HAL_JSON, CUSTOM_MEDIA_TYPE));
        }
    }
}
