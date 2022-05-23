package cs.di.one;


import org.springframework.stereotype.Controller;

@Controller
public class TestClass {
    public void print() {
        System.out.println("Hello from another package!");
    }
}
