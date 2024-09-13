package org.example.test.wons.first.helper;

public class SrchTorgId {
    public Builder 훈련기관ID(String value) {
        HrdApiHelper.HRDUrlBuilder.srchTorgId = value;
        return new Builder();
    }
}
