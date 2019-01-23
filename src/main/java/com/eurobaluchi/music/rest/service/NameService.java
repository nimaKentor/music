package com.eurobaluchi.music.rest.service;

import com.eurobaluchi.music.rest.domain.Name;
import com.eurobaluchi.music.rest.repository.NameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NameService extends AbstractService<Name, Integer, NameRepository> {

    @Autowired
    public NameService(NameRepository repo) {
        super(repo);
    }
}
