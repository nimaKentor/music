package com.eurobaluchi.music.rest.configuration;

import com.eurobaluchi.music.rest.domain.Name;
import com.eurobaluchi.music.rest.dto.NameDto;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        modelMapper.createTypeMap(NameDto.class, Name.class)
                .addMappings(mapper -> mapper.skip(Name::setId))
        ;
        return modelMapper;
    }
}
