package com.example.todo_api.hw;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class MyController {
    private final MyService myService; 

    @Autowired 

    public MyController(MyService myService) {
        this.myService = myService;
    }
    public void controllerMethod() {
        System.out.println("contoller");
        myService.serviceMethod();
    }

}
