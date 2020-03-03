import java.io.FileNotFoundException;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Map<String, Country> countries = CountryUtils.createCountryCodes("Countries.txt");

        CountryUtils.showInfo(countries);
    }
}
