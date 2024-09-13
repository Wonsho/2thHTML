package org.example.test.wons.first.helper;

public class CourseInfo_2 {

    public ReturnType2 키값(String key) {
        if (key == null) {
            throw new RuntimeException("Key 값이 Null 입니다.");
        }

        HrdApiHelper.HRDUrlBuilder.key = key;
        return new ReturnType2();
    }

}
