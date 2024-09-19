package org.example.test.wons.first.helper;

import com.wons.first.helper.codeenum.SrchNcs1Code;

public class SrchNcs1 {

    public CrseTracseSe NCS_직종_대분류_코드(SrchNcs1Code srchNcs1) {
        if (srchNcs1 == null) {
            throw new RuntimeException("NCS_직종_대분류_코드 값이 NULL 입니다.");
        }
        HrdApiHelper.HRDUrlBuilder.srchNcs1 = srchNcs1.getCode();
        return new CrseTracseSe();
    }
}
