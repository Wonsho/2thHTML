package org.example.test.wons.first.helper.mapper;

import org.apache.tomcat.util.json.JSONParser;
import org.example.test.wons.first.helper.HrdApiHelper;
import org.example.test.wons.first.helper.codeenum.*;
import org.example.test.wons.first.helper.entity.academylist.AcademyList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class AcademyListDataApi {
    private int itemQuantity;
    private int searchCount;
    private int count = 0;


    private String getApiURL(int quantityOfPage, int page, SrchTraAreaCode areaCode, SrchNcs1Code ncs1Code, SrchTraGbnCode traGbnCode, CrseTracseSeCode crseTracseSeCode, String key) {
        String url = HrdApiHelper.setListParam()
                .키값(key)
                .리턴타입(ReturnTypeCode.JSON)
                .출력형태_1리스트_2상세(1)
                .시작페이지_기본값1_최대1000_검색_시작위치를_지정(page)
                .페이지당_출력건수_기본값10_최대100까지_가능(quantityOfPage)
                .훈련지역_대분류(areaCode)
                .NCS_직종_대분류_코드(ncs1Code)
                .훈련유형(crseTracseSeCode)
                .훈련구분코드(traGbnCode)
                .훈련시작일_From("20000101")
                .훈련시작일_To("21000101")
                .훈련과정명("")
                .훈련기관명("")
                .정렬방법(SortCode.ASC)
                .정렬컬럼(SortColCode.모집인원)
                .build();

        return url;
    }

    public ArrayList<AcademyList> getAllList(String key,
                                             SrchTraAreaCode areaCode, SrchNcs1Code ncs1Code, SrchTraGbnCode traGbnCode, CrseTracseSeCode crseTracseSeCode
    ) {

        ArrayList<AcademyList> list = new ArrayList<>();
        try {
                {
                    URL tUrl = new URL(getApiURL(10, 1, areaCode, ncs1Code, traGbnCode, crseTracseSeCode, key));
//                    System.out.println(tUrl.toString());
                    BufferedReader bf;
                    bf = new BufferedReader(new InputStreamReader(tUrl.openStream(), StandardCharsets.UTF_8));
                    String r = bf.readLine();
                    org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();
                    JSONObject jsonObject = (JSONObject) parser.parse(r);
                    this.itemQuantity = Integer.parseInt((jsonObject.get("scn_cnt")).toString());

                    if (itemQuantity%100 == 0) {

                        searchCount = itemQuantity/100;
                    } else {
                        searchCount = itemQuantity/100 + 1;
                    }
                }
            for (int i = 0; i < searchCount; i++) {

                this.count++;
                URL url = new URL (getApiURL(100, i+1, areaCode, ncs1Code, traGbnCode, crseTracseSeCode, key));
                BufferedReader bf;
                bf = new BufferedReader(new InputStreamReader(url.openStream(), StandardCharsets.UTF_8));
                String r = bf.readLine();
                org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();
                JSONObject jsonObject = (JSONObject) parser.parse(r);
                JSONArray data1 = (JSONArray) jsonObject.get("srchList");

                for (int j = 0; j < data1.size(); j++) {
                    AcademyList aData = new AcademyList();

                    JSONObject data = (JSONObject) data1.get(j);
                    aData.setAddress(data.get("address").toString());
                    aData.setContents(data.get("contents").toString());
                    aData.setCourseMan(data.get("courseMan").toString());
                    aData.setGrade(data.get("grade").toString());
                    aData.setInstCd(data.get("instCd").toString());
                    aData.setNcsCd(data.get("ncsCd").toString());
                    aData.setRealMan(data.get("realMan").toString());
                    aData.setRegCourseMan(data.get("regCourseMan").toString());
                    aData.setStdgScor(data.get("stdgScor").toString());
                    aData.setSubTitle(data.get("subTitle").toString());
                    aData.setSubTitleLink(data.get("subTitleLink").toString());
                    aData.setTelNo(data.get("telNo").toString());
                    aData.setTitle(data.get("title").toString());
                    aData.setTitleIcon(data.get("titleIcon").toString());
                    aData.setTitleLink(data.get("titleLink").toString());
                    aData.setTraEndDate(data.get("traEndDate").toString());
                    aData.setTraStartDate(data.get("traStartDate").toString());
                    aData.setTrainTarget(data.get("trainTarget").toString());
                    aData.setTrainTargetCd(data.get("trainTargetCd").toString());
                    aData.setTrainstCstId(data.get("trainstCstId").toString());
                    aData.setTrngAreaCd(data.get("trngAreaCd").toString());
                    aData.setTrprDegr(data.get("trprDegr").toString());
                    aData.setTrprId(data.get("trprId").toString());
                    aData.setYardMan(data.get("yardMan").toString());

                    list.add(aData);
                }
            }

        } catch (Exception e) {
            //todo 오류 메세지 저장!!
        }
        System.out.println(this.count);
        return list;
    }
}

