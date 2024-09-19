package org.example.test.wons.first.helper;

import com.wons.first.helper.codeenum.SrchTraAreaCode;

public class SrchTraArea1 {
    public SrchNcs1 훈련지역_대분류(SrchTraAreaCode srchNcs1) {
        if (srchNcs1 == null) {
            throw new RuntimeException("훈련지역_대분류 값이 NULL 입니다.");
        }
        HrdApiHelper.HRDUrlBuilder.srchTraArea1 = srchNcs1.getCode();
        return new SrchNcs1();
    }
}
