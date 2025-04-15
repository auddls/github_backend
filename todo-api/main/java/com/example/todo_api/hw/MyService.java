package com.example.todo_api.hw;
import org.springframework.stereotype.Component;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
@Getter
@Component
class MyService {
    private final MyRepository myRepository; //의존성 추가

    @Autowired //의존성 주입 , 생성자가 1개일 때는 Autowired 를 생략 할 수 있음

    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }
    public void serviceMethod() {
        System.out.println("service");
        myRepository.repositoryMethod();
    }
}
