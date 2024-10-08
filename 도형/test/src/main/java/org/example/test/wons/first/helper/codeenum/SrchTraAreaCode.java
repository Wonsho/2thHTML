package org.example.test.wons.first.helper.codeenum;
public enum SrchTraAreaCode {
    전체(null),
    서울("11"),
    부산("26"),
    대구("27"),
    인천("28"),
    광주("29"),
    대전("30"),
    울산("31"),
    세종("36"),
    경기("41"),
    충북("43"),
    충남("44"),
    전북("45"),
    전남("46"),
    경북("47"),
    경남("48"),
    제주("50"),
    강원("51");

    final private String code;

    public String getCode() {
        return this.code;
    }

    SrchTraAreaCode(String name) {
        this.code = name;
    }
}
