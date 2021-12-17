package lab4;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tests"})
public class Package {
    @JsonProperty("functionName") private String functionName;
    @JsonProperty("tests") private List<Test> tests;
    @JsonProperty("packageId")
    public String getJsScript() {
    }
    @JsonProperty("functionName")
    public List<Test> getTests() {
    }
    public void setJsScript(String jsScript) {
    }
    public void setFunctionName(String functionName) {
    }
    public void setTests(List<Test> tests) {
        this.tests = tests;
}
