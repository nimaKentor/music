package com.eurobaluchi.music.rest.repository;

import com.eurobaluchi.music.rest.domain.Singer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SingerRepository extends CrudRepository<Singer, Integer> {
}
