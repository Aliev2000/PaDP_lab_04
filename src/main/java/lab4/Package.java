package lab4;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "packageId",
    "functionName",
    "tests"})
public class Package {
    @JsonProperty("functionName") private String functionName;
    @JsonProperty("tests") private List<Test> tests;
    @JsonProperty("packageId")
    public String getPackageId() {
    }
    @JsonProperty("jsScript")
    public String getJsScript() {
    }
    @JsonProperty("functionName")
    public String getFunctionName() {
    }
    public List<Test> getTests() {
    }
    @JsonProperty("packageId")
    @JsonProperty("jsScript")
    public void setJsScript(String jsScript) {
    }
    @JsonProperty("functionName")
    public void setFunctionName(String functionName) {
    }
    @JsonProperty("tests")
    public void setTests(List<Test> tests) {
        this.tests = tests;
}
