package org.example.test.wons.first.helper;

import com.wons.first.helper.codeenum.SortCode;

public class Sort {
    public SortCol 정렬방법(SortCode sort) {
        if (sort == null) {
            throw new RuntimeException("정렬방법 값이 null 입니다.");
        }

        HrdApiHelper.HRDUrlBuilder.sort = sort.getCode();
        return new SortCol();
    }
}
