package services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {
    @RequestMapping("/helloWorld")
    public String returnHelloWorld(){
        return "Hello World";
    }
}
