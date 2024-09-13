package org.example.test.wons.first.helper.codeenum;


public enum SrchTraGbnCode {
    전체(null),
    일반과정("M1001"),
    인터넷과정("M1005"),
    혼합과정_BL("M1010"),
    스마트혼합훈련("M1014");

    final private String code;

    public String getCode() {
        return this.code;
    }

    SrchTraGbnCode(String name) {
        this.code = name;
    }
}