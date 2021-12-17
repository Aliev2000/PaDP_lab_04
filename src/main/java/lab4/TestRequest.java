package lab4;

import java.util.List;

public final class TestRequest {
    private final String function;
    private final List<String> arguments;
    private final String rightResult;
    private final int packageId;

    public TestRequest(String function, String script, List<String> arguments, String rightResult, int packageId) {
        this.function = function;
        this.script = script;
        this.arguments = arguments;
        this.rightResult = rightResult;
        this.packageId = packageId;

    public String getFunction() {
        return function;

    public List<String> getArguments() {
        return arguments;

    public String getRightResult() {
        return rightResult;

