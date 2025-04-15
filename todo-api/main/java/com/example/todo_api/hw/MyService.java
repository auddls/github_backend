package com.example.todo_api.hw;
import org.springframework.stereotype.Component;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
@Getter
@Component
class MyService {
    private final MyRepository myRepository; 

    @Autowired 

    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }
    public void serviceMethod() {
        System.out.println("service");
        myRepository.repositoryMethod();
    }
}
