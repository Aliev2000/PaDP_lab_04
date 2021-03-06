package lab4;

public final class TestResult {
    private final int packageId;
    private final String result;

    public TestResult(int packageId, String result) {
        this.packageId = packageId;
        this.result = result;

    public String getResult() {
        return result;

    public int getPackageId() {
        return packageId;

    @Override
    public String toString() {
        return String.format("lab4.TestResult{packageId=%d, result='%s'}", packageId, result);
}
