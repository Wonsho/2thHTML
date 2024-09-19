package org.example.test.wons.first.helper;

public class SrchTraStDt {
    public SrchTraEndDt 훈련시작일_From(String date) {
        if (date == null) {
            throw new RuntimeException("훈련시작일_From 값이 NULL 입니다.");
        }
        date.trim();
        if (date.isEmpty() || date.isBlank()) {
            throw new RuntimeException("훈련시작일_From 값이 없습니다.");
        }

        HrdApiHelper.HRDUrlBuilder.srchTraStDt = date;
        return new SrchTraEndDt();
    }
}
