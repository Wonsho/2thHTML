package org.example.test.wons.first.helper;

public class SrchTrprDegr {

    public SrchTorgId 훈련과정_회차(String value) {
        HrdApiHelper.HRDUrlBuilder.srchTrprDegr = value;
        return new SrchTorgId();
    }


}
