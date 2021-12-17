package lab4;
import java.util.ArrayList;

public class PackageResults {
    private final ArrayList<String> results;
    private final int packageId;

    public ArrayList<String> getResults() {
        return results;

    public int getPackageId() {

    public PackageResults(int packageId, ArrayList<String> results) {
        this.results = results;
        this.packageId = packageId;
    }
}
