package com.eurobaluchi.music.rest.dto.converter;

import com.eurobaluchi.music.rest.domain.Name;
import org.springframework.stereotype.Component;

@Component
public class NameToIdConverter extends EntityToPropertyConverter<Name, Integer> {
    @Override
    public Integer getProperty(Name name) {
        return name.getId();
    }
}
