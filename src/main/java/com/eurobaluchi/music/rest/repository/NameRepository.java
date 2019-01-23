package com.eurobaluchi.music.rest.repository;

import com.eurobaluchi.music.rest.domain.Name;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NameRepository extends CrudRepository<Name, Integer> {
}
