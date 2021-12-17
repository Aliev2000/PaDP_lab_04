package lab4;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    @JsonProperty("packageId")
    public String getJsScript() {
    }
    public List<Test> getTests() {
    }
