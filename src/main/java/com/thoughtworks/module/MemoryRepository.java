package com.thoughtworks.module;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemoryRepository<E> implements Repository<E> {
    private Map<String, E> repoContent = new HashMap<>();

    public MemoryRepository() {
    }

    public MemoryRepository(Map<String, E> repoContent) {
        this.repoContent = repoContent;
    }

    @Override
    public void save(String id, E entity) {

        repoContent.put(id, entity);
    }

    @Override
    public E get(String id) {
        return repoContent.get(id);
    }

    @Override
    public E delete(String id) {
        return repoContent.remove(id);
    }

    @Override
    public void update(String id, E entity) {
        repoContent.replace(id, entity);
    }

    @Override
    public Collection<E> list() {
        return repoContent.values();
    }
}
