package com.eurobaluchi.music.rest.service;

import com.eurobaluchi.music.rest.exception.ResourceNotFoundException;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public class AbstractService<T, N, R extends CrudRepository<T, N>> implements BaseServiceApi<T, N> {
    R repository;

    public AbstractService(R repo) {
        this.repository =  repo;
    }

    public List<T> getAll(){
        List<T> all = new ArrayList<>();
        Iterable<T> users = repository.findAll();
        users.forEach(u -> all.add(u));
        return all;
    }
    public T getById(N id){
        if(repository.existsById(id)) {
            return repository.findById(id).get();
        } else {
            throw new ResourceNotFoundException("Resource with id = " + id + " not found!");
        }
    }

    public T create(T t) {
        System.out.println("Create a new object " + t.toString());
        return repository.save(t);
    }

    public R getRepository() {
        return repository;
    }

    public void setRepository(R repository) {
        this.repository = repository;
    }

    public void removeById(N id){
        if(repository.existsById(id))
            repository.deleteById(id);
        else
            throw new ResourceNotFoundException("An object with id  = " + id + " not found!");
    }

    @Override
    public T update(T t, N id) {
        System.out.println("Update an already existing object " + t.toString());
        if(repository.existsById(id)){
            return repository.save(t);
        } else
            throw new ResourceNotFoundException("An object with id = " + id + " not found!");
    }

    public <E> void validateIfSameEntity(E e1, E e2) {
        if (!e1.equals(e2)) {
            throw new ResourceNotFoundException("Mismatch " + e1.getClass().getSimpleName() + " = " + e1 + " with " + e2.getClass().getSimpleName() + " = " + e2);
        }
    }
}
