package org.example.test.wons.first.helper;

public class SrchTrprId {
    public SrchTrprDegr 훈련과정_ID(String value) {
        HrdApiHelper.HRDUrlBuilder.srchTrprId = value;
        return new SrchTrprDegr();
    }
}
