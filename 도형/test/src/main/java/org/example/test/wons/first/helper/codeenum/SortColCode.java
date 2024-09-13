package org.example.test.wons.first.helper.codeenum;

public enum SortColCode {
    모집인원("TOT_FXNUM"),
    훈련시작일("TRNG_BGDE"),
    훈련과정명("TRNG_CRSN");

    final private String code;

    public String getCode() {
        return this.code;
    }

    SortColCode(String name) {
        this.code = name;
    }
}