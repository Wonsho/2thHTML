package org.example.test.wons.first.helper;


import org.example.test.wons.first.helper.codeenum.ReturnTypeCode;

public class ReturnType1 {

    public OutType1 리턴타입(ReturnTypeCode code) {
        if (code == null) {
            throw  new RuntimeException("리턴타입이 NULL 입니다.");
        }

        HrdApiHelper.HRDUrlBuilder.returnType = code.getCode();

        return new OutType1();
    }
}
