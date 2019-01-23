package com.eurobaluchi.music.rest.dto.converter;

import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;
import org.springframework.stereotype.Component;

@Component
public abstract class EntityToPropertyConverter<E, P> implements Converter<E, P> {
    @Override
    public P convert(MappingContext<E, P> context) {
        return getProperty(context.getSource());
    }

    public abstract P getProperty(E entity);
}
