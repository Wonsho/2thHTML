package org.example.test.wons.first.helper;

public class SrchTraEndDt {

    public SrchTraProcessNm 훈련시작일_To(String date) {
        if (date == null) {
            throw new RuntimeException("훈련시작일_To 값이 NULL입니다.");
        }
        date.trim();
        if (date.isBlank() || date.isEmpty()) {
            throw new RuntimeException("훈련시작일_To 값이 없습니다.");
        }
        HrdApiHelper.HRDUrlBuilder.srchTraEndDt = date;
        return new SrchTraProcessNm();
    }
}
