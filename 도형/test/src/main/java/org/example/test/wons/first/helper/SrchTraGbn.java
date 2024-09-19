package org.example.test.wons.first.helper;

import com.wons.first.helper.codeenum.SrchTraGbnCode;

public class SrchTraGbn {

    public SrchTraStDt 훈련구분코드(SrchTraGbnCode srchTraGbn) {
        if(srchTraGbn==null) {
            throw new RuntimeException("훈련구분코드 값이 NULL 입니다.");
        }
        HrdApiHelper.HRDUrlBuilder.srchTraGbn = srchTraGbn.getCode();
        return new SrchTraStDt();
    }

}
