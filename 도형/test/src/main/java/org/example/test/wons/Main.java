package org.example.test.wons;



import org.example.test.wons.first.helper.codeenum.CrseTracseSeCode;
import org.example.test.wons.first.helper.codeenum.SrchNcs1Code;
import org.example.test.wons.first.helper.codeenum.SrchTraAreaCode;
import org.example.test.wons.first.helper.codeenum.SrchTraGbnCode;
import org.example.test.wons.first.helper.entity.academylist.AcademyList;
import org.example.test.wons.first.helper.mapper.AcademyListDataApi;
import org.example.test.wons.first.helper.repository.TestRepository;
import org.example.test.wons.first.helper.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;

@Controller
public class Main {

         @Autowired
         TestService service;

    //getAllAcademyList()

     public static void main(String[] args) {


         AcademyListDataApi academyListDataApi = new AcademyListDataApi();
         ArrayList<AcademyList> list = academyListDataApi.getAllList("402d8c9f-cca8-42c6-9dca-89105da014a7", SrchTraAreaCode.전체, SrchNcs1Code.정보통신, SrchTraGbnCode.전체, CrseTracseSeCode.K_디지털_트레이닝);
         System.out.println(list);
         System.out.println(list.size());

//         System.out.println(i
//         );
//         try {
//             URL tUrl = new URL(i);
//             BufferedReader bf;
//             bf = new BufferedReader(new InputStreamReader(tUrl.openStream(), StandardCharsets.UTF_8));
//             String r = bf.readLine();
//             JSONParser jsonParser = new JSONParser();
//             JSONObject jsonObject = (JSONObject) jsonParser.parse(r);
//             int itemQuantity = Integer.parseInt((jsonObject.get("scn_cnt")).toString());
//             System.out.println(itemQuantity);
//
//
//         } catch (Exception e) {
//             //todo 오류 메세지 저장!!
//         }
         System.out.println();


    }


}