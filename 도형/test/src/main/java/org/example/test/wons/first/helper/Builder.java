package org.example.test.wons.first.helper;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Builder{


    public String build() {

        StringBuilder sb = new StringBuilder();
        sb.append("https://www.work24.go.kr/cm/openApi/call/hr/callOpenApiSvcInfo310L")
                .append(HrdApiHelper.HRDUrlBuilder.code)
                .append(".do?")
                .append("authKey=")
                .append(HrdApiHelper.HRDUrlBuilder.key)
                .append("&returnType=")
                .append(HrdApiHelper.HRDUrlBuilder.returnType)
                .append("&outType=")
                .append(HrdApiHelper.HRDUrlBuilder.outType);

        if (HrdApiHelper.HRDUrlBuilder.pageNum != null && !HrdApiHelper.HRDUrlBuilder.pageNum.trim().isEmpty()) {
            sb.append("&pageNum=").append(HrdApiHelper.HRDUrlBuilder.pageNum);
        }

        if (HrdApiHelper.HRDUrlBuilder.pageSize != null && !HrdApiHelper.HRDUrlBuilder.pageSize.trim().isEmpty()) {
            sb.append("&pageSize=").append(HrdApiHelper.HRDUrlBuilder.pageSize);
        }

        if (HrdApiHelper.HRDUrlBuilder.srchTraArea1 != null && !HrdApiHelper.HRDUrlBuilder.srchTraArea1.trim().isEmpty()) {
            sb.append("&srchTraArea1=").append(HrdApiHelper.HRDUrlBuilder.srchTraArea1);
        }

        if (HrdApiHelper.HRDUrlBuilder.srchNcs1 != null && !HrdApiHelper.HRDUrlBuilder.srchNcs1.trim().isEmpty()) {
            sb.append("&srchNcs1=").append(HrdApiHelper.HRDUrlBuilder.srchNcs1);
        }

        if (HrdApiHelper.HRDUrlBuilder.crseTracseSe != null && !HrdApiHelper.HRDUrlBuilder.crseTracseSe.trim().isEmpty()) {
            sb.append("&crseTracseSe=").append(HrdApiHelper.HRDUrlBuilder.crseTracseSe);
        }

        if (HrdApiHelper.HRDUrlBuilder.srchTraGbn != null && !HrdApiHelper.HRDUrlBuilder.srchTraGbn.trim().isEmpty()) {
            sb.append("&srchTraGbn=").append(HrdApiHelper.HRDUrlBuilder.srchTraGbn);
        }

        if (HrdApiHelper.HRDUrlBuilder.srchTraStDt != null && !HrdApiHelper.HRDUrlBuilder.srchTraStDt.trim().isEmpty()) {
            sb.append("&srchTraStDt=").append(HrdApiHelper.HRDUrlBuilder.srchTraStDt);
        }

        if (HrdApiHelper.HRDUrlBuilder.srchTraEndDt != null && !HrdApiHelper.HRDUrlBuilder.srchTraEndDt.trim().isEmpty()) {
            sb.append("&srchTraEndDt=").append(HrdApiHelper.HRDUrlBuilder.srchTraEndDt);
        }

        if (HrdApiHelper.HRDUrlBuilder.srchTraProcessNm != null && !HrdApiHelper.HRDUrlBuilder.srchTraProcessNm.trim().isEmpty()) {
            sb.append("&srchTraProcessNm=").append(URLEncoder.encode(HrdApiHelper.HRDUrlBuilder.srchTraProcessNm, StandardCharsets.UTF_8));
        }

        if (HrdApiHelper.HRDUrlBuilder.srchTraOrganNm != null && !HrdApiHelper.HRDUrlBuilder.srchTraOrganNm.trim().isEmpty()) {
            sb.append("&srchTraOrganNm=").append(URLEncoder.encode(HrdApiHelper.HRDUrlBuilder.srchTraOrganNm, StandardCharsets.UTF_8));
        }

        if (HrdApiHelper.HRDUrlBuilder.sort != null && !HrdApiHelper.HRDUrlBuilder.sort.trim().isEmpty()) {
            sb.append("&sort=").append(HrdApiHelper.HRDUrlBuilder.sort);
        }

        if (HrdApiHelper.HRDUrlBuilder.sortCol != null && !HrdApiHelper.HRDUrlBuilder.sortCol.trim().isEmpty()) {
            sb.append("&sortCol=").append(HrdApiHelper.HRDUrlBuilder.sortCol);
        }

        if (HrdApiHelper.HRDUrlBuilder.srchTrprId != null && !HrdApiHelper.HRDUrlBuilder.srchTrprId.trim().isEmpty()) {
            sb.append("&srchTrprId=").append(HrdApiHelper.HRDUrlBuilder.srchTrprId);
        }

        if (HrdApiHelper.HRDUrlBuilder.srchTrprDegr != null && !HrdApiHelper.HRDUrlBuilder.srchTrprDegr.trim().isEmpty()) {
            sb.append("&srchTrprDegr=").append(HrdApiHelper.HRDUrlBuilder.srchTrprDegr);
        }

        if (HrdApiHelper.HRDUrlBuilder.srchTorgId != null && !HrdApiHelper.HRDUrlBuilder.srchTorgId.trim().isEmpty()) {
            sb.append("&srchTorgId=").append(HrdApiHelper.HRDUrlBuilder.srchTorgId);
        }

        return sb.toString();
    }

}
