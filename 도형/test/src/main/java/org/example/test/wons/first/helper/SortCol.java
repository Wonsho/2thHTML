package org.example.test.wons.first.helper;

import com.wons.first.helper.codeenum.SortColCode;

public class SortCol {
    public Builder 정렬컬럼(SortColCode sortCol) {
        if (sortCol == null) {
            throw new RuntimeException("정렬컬럼 값이 NULL 입니다.");
        }
        HrdApiHelper.HRDUrlBuilder.sortCol = sortCol.getCode();
        return new Builder();
    }
}
