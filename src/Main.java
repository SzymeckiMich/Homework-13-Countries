import java.io.FileNotFoundException;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Map<String, Country> countries = Utils.mapCreator("Countries.txt");

        Utils.showInfo(countries);
    }
}
