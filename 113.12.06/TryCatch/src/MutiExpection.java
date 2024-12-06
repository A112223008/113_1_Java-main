import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MutiExpection {
    public static void main(String[] args) { int[] numbers = {1,2,3};
            try {
                File file = new File("nonexistentfile.txt");
                FileReader reader = new FileReader(file);
                System.out.println(numbers[5]);
            } catch (FileNotFoundException e) {
                System.out.println("處理受檢例外: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("處理未檢例外: " + e.getMessage());
        }
    }
}
