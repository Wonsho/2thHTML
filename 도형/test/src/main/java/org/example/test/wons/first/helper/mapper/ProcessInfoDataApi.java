package org.example.test.wons.first.helper.mapper;


import org.example.test.wons.first.helper.HrdApiHelper;
import org.example.test.wons.first.helper.codeenum.ReturnTypeCode;

public class ProcessInfoDataApi {
    public String getURL(String key, String processId, String academyID) {
        return HrdApiHelper.setCourseInfoParam()
                .키값(key)
                .리턴타입(ReturnTypeCode.JSON)
                .출력형태_1리스트_2상세(2)
                .훈련과정_ID(processId)
                .훈련과정_회차("0")
                .훈련기관ID(academyID)
                .build();
    }

}

class Test {
    public static void main(String[] args) {

    }
}
