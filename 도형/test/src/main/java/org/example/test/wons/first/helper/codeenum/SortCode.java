package org.example.test.wons.first.helper.codeenum;

public enum SortCode {
    ASC("ASC"),
    DESC("DESC");
    final private String code;

    SortCode(String str) {
        this.code = str;
    }

    public String getCode() {
        return this.code;
    }

}
