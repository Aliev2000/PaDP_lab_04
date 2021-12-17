package lab4;

public final class TestResult {
    private final int packageId;
    public TestResult(int packageId, String result) {
        this.packageId = packageId;
        this.result = result;

    public String getResult() {
        return result;

    public String toString() {
        return String.format("lab4.TestResult{packageId=%d, result='%s'}", packageId, result);
}
