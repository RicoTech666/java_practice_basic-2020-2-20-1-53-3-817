package com.thoughtworks;

import com.thoughtworks.module.MemoryRepository;
import com.thoughtworks.module.RepositoryUtil;
import com.thoughtworks.module.Student;

public class App {

    public static void main(String[] args) {
        MemoryRepository<Student> memoryRepository = new MemoryRepository<>();
        memoryRepository.save("3", new Student("3", "张三"));
        memoryRepository.save("4", new Student("4", "李四"));
        memoryRepository.save("5", new Student("5", "王五"));
        memoryRepository.save("6", new Student("6", "赵六"));
        memoryRepository.save("7", new Student("7", "钱七"));

        System.out.println(memoryRepository.get("3"));
        memoryRepository.delete("4");
        memoryRepository.update("5", new Student("5", "冯五"));

        RepositoryUtil repositoryUtil = new RepositoryUtil();
        repositoryUtil.printList(memoryRepository);
    }
}
