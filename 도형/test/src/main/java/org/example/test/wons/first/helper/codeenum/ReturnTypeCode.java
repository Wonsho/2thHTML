package org.example.test.wons.first.helper.codeenum;

public enum ReturnTypeCode {
    JSON("JSON"),
    XML("XML");

    private String code;

    ReturnTypeCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
