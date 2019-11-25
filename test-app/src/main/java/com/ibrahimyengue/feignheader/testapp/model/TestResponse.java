package com.ibrahimyengue.feignheader.testapp.model;

public class TestResponse {
    private String value;

    public TestResponse(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
