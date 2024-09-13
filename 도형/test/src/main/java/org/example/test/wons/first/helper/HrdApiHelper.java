package org.example.test.wons.first.helper;

public class HrdApiHelper {

    static class HRDUrlBuilder {
        static String code;
        static String key;
        static String returnType;
        static String outType;
        static String pageNum;
        static String pageSize;
        static String srchTraArea1;
        static String srchNcs1;
        static String crseTracseSe;
        static String srchTraGbn;
        static String srchTraStDt;
        static String srchTraEndDt;
        static String srchTraProcessNm;
        static String srchTraOrganNm;
        static String sort;
        static String sortCol;
        static String srchTrprId;
        static String srchTrprDegr;
        static String srchTorgId;
    }

    public static CourseInfo_2 setCourseInfoParam() {
        HRDUrlBuilder.code = "02";
        return new CourseInfo_2();
    }

    public static CourseInfo_2 setTrainingDatePram() {
        HRDUrlBuilder.code = "03";
        return new CourseInfo_2();
    }

    public static ListParam_1 setListParam() {
        HRDUrlBuilder.code = "01";
        return new ListParam_1();
    }

}


