import java.util.ArrayList;
import java.util.List;

public class MainProgram {

    public static void main(String[] args) throws Exception {
        // test your method here
        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");

        System.out.println(returnSize(names));
    }

    // Implement here a method returnSize
    // which returns the size of the list given to it
    // as a parameter
    public static int returnSize(List<String> names) {
        return names.size();
    }
}