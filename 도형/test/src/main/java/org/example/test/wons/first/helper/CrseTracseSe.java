package org.example.test.wons.first.helper;

import com.wons.first.helper.codeenum.CrseTracseSeCode;

public class CrseTracseSe {

    public SrchTraGbn 훈련유형(CrseTracseSeCode value) {
        if (value == null) {
            throw new RuntimeException("훈련유형 값이 NULL 입니다.");
        }
        HrdApiHelper.HRDUrlBuilder.crseTracseSe = value.getCode();
        return new SrchTraGbn();
    }
}
