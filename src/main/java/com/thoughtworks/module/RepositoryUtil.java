package com.thoughtworks.module;

import java.util.Collection;

public class RepositoryUtil {
    public static void printList(MemoryRepository memoryRepository) {
        Collection list = memoryRepository.list();
        System.out.println(list);
    }
}
