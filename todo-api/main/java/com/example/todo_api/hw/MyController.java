package com.example.todo_api.hw;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class MyController {
    private final MyService myService; //의존성 추가

    @Autowired //의존성 주입 , 생성자가 1개일 때는 Autowired 를 생략 할 수 있음

    public MyController(MyService myService) {
        this.myService = myService;
    }
    public void controllerMethod() {
        System.out.println("contoller");
        myService.serviceMethod();
    }

}
