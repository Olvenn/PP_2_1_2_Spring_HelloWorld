import org.springframework.context.annotation.Scope;

public class Cat {
    public Cat() {
        System.out.println("Cat bean is created.");
    }

    public String say() {
        return "Meow-Meow";
    }
}
