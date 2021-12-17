package lab4;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
})

public class Test {
    @JsonProperty("testName")
    @JsonProperty("expectedResult")
    private String expectedResult;
    @JsonProperty("params")
    private List<String> params;

    @JsonProperty("testName")
    public String getTestName() {

    @JsonProperty("expectedResult")
    @JsonProperty("params")
    public List<String> getParams() {
        return params;

    public void setTestName(String testName) {
        this.testName = testName;

    @JsonProperty("expectedResult")
    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;

    @JsonProperty("params")
    public void setParams(List<String> params) {
        this.params = params;
}
