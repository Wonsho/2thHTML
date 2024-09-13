package org.example.test.wons.first.helper;

public class SrchTraOrganNm {

    public Sort 훈련기관명(String value) {
        if (value == null) {
            throw new RuntimeException("훈련기관명 값이 NULL 입니다. 값이 없을 경우 String 형 빈값:[\"\"]를 입력하세요.");
        }
        HrdApiHelper.HRDUrlBuilder.srchTraOrganNm = value;
        return new Sort();
    }
}
