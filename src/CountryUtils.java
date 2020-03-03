import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryUtils {
    public static Map createCountryCodes(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        Map<String, Country> countries = new HashMap<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] split = line.split(";");
            int population = Integer.parseInt(split[2]);
            countries.put(split[0], new Country(split[0], split[1], population));

        }
        scanner.close();
        return countries;
    }

    public static void showInfo(Map<String, Country> countries) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Podaj kod kraju do wyświetlenia: ");
            String code = scanner.nextLine();
            if (countries.get(code) != null) {
                System.out.println("Kod kraju: " + countries.get(code).getCode() + "\nNazwa kraju: " +
                        countries.get(code).getName() + "\nPopulacja: " + countries.get(code).getPopulation());
            } else {
                System.err.println("Zły kod kraju");
            }
        }
    }
}
