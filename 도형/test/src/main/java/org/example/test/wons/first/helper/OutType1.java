package org.example.test.wons.first.helper;

public class OutType1 {
    public PageNum 출력형태_1리스트_2상세(int code) {
        if (code != 1 && code != 2) {
            throw new RuntimeException("출력형태_1리스트_2상세 값이 옳바르지 않습니다. 1 또는 2 inputValue:" + code);
        }
        HrdApiHelper.HRDUrlBuilder.outType = String.valueOf(code);
        return new PageNum();
    }
}
