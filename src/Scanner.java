import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Scanner {
    private List<String> upcCodes; // list of upc codes
    private Random rand; // random number generator to pick upc code

    public Scanner(String filename) throws IOException {
        upcCodes = new ArrayList<>();
        rand = new Random();
        loadUPCs(filename);
    }

    private void loadUPCs(String filename) throws IOException {
        try (java.util.Scanner sc = new java.util.Scanner(new File(filename))) {
            while (sc.hasNext()) {
                String upc = sc.next(); // upc code
                sc.next(); // skip product name
                sc.nextDouble(); // skip price
                upcCodes.add(upc); // store upc code
            }
        }
    }

    public String scan() {
        int idx = rand.nextInt(upcCodes.size()); // random index
        return upcCodes.get(idx); // return upc code for the index
    }
}
