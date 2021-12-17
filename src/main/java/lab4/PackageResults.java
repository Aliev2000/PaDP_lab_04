package lab4;
import java.util.ArrayList;

public class PackageResults {
    private final ArrayList<String> results;
    private final int packageId;

    public PackageResults(int packageId, ArrayList<String> results) {
        this.results = results;
        this.packageId = packageId;
    }
}
