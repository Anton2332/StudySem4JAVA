import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Test> tests = new ArrayList<>();
        String[] arr = {"1","2","3","4"};
        tests.add(new Test("Питання 1",arr,"1"));
        tests.add(new Test("Питання 2",arr,"2"));
        tests.add(new Test("Патання 3",arr,"3"));
        tests.add(new Test("1",arr,"4"));
        new View(tests);
    }
}