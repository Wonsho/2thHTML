package url;

public class CatalogURL {
    public enum State {
        전체(null),
        서울("11"),
        부산("26"),
        대구("27"),
        인천("28"),
        광주("29"),
        대전("30"),
        울산("31"),
        세종("36"),
        경기("41"),
        충북("43"),
        충남("44"),
        전북("45"),
        전남("46"),
        경북("47"),
        경남("48"),
        제주("50"),
        강원("51");

        final private String code;

        public String getCode(State state) {
            return state.code;
        }
        State(String name){
            this.code = name;
        }
    }

    public enum SrchNcs1 {
        전체(null),
        사업관리 ("01"),
        경영_회계_사무 ("02"),
        금융_보험 ("03"),
        교육_자연과학_사회과학 ("04"),
        법률_경찰_소방_교도_국방 ("05"),
        보건_의료 ("06"),
        사회복지_종교 ("07"),
        문화_예술_디자인_방송 ("08"),
        운전_운송 ("09"),
        영업_판매 ("10"),
        경비_청소 ("11"),
        이용_숙박_여행_오락_스포츠 ("12"),
        음식서비스 ("13"),
        건설 ("14"),
        기계 ("15"),
        재료 ("16"),
        화학 ("17"),
        섬유_의복 ("18"),
        전기_전자 ("19"),
        정보통신 ("20"),
        식품가공 ("21"),
        인쇄_목재_가구_공예 ("22"),
        환경_에너지_안전 ("23"),
        농림어업 ("24");

        final private String code;

        public String getCode(SrchNcs1 srchNcs1) {
            return srchNcs1.code;
        }
        SrchNcs1(String name){
            this.code = name;
        }
    }

    public enum CrseTracseSe {
        전체(null),
        국민내일배움카드_일반 ("C0061"),
        국민내일배움카드_주_훈련대상_구직자 ("C0061S"),
        국민내일배움카드주_훈련대상_재직자 ("C0061I"),
        국가기간전략산업직종 ("C0054"),
        과정평가형훈련 ("C0055C"),
        기업맞춤형훈련 ("C0054G"),
        스마트혼합훈련 ("C0054Y"),
        일반고특화훈련 ("C0054S"),
        _4차산업혁명인력양성훈련 ("C0054I"),
        K_디지털_트레이닝 ("C0104"),
        K_디지털_기초역량훈련 ("C0105"),
        플랫폼종사자훈련 ("C0103"),
        산업구조변화대응 ("C0102"),
        중장년새출발카운슬링 ("C0106"),
        실업자_원격훈련 ("C0055"),
        근로자_원격훈련 ("C0031"),
        근로자_외국어훈련 ("C0031F");


        final private String code;

        public String getCode(CrseTracseSe crseTracseSe) {
            return crseTracseSe.code;
        }
        CrseTracseSe(String name){
            this.code = name;
        }
    }


    public enum SrchTraGbn {
        전체(null),
        일반과정 ("M1001"),
        인터넷과정 ("M1005"),
        혼합과정_BL ("M1010"),
        스마트혼합훈련 ("M1014");

        final private String code;

        public String getCode(SrchTraGbn srchTraGbn) {
            return srchTraGbn.code;
        }
        SrchTraGbn(String name){
            this.code = name;
        }
    }

    public enum SortCol {
        모집인원 ("TOT_FXNUM"),
        훈련시작일 ("TRNG_BGDE"),
        훈련과정명 ("TRNG_CRSN");

        final private String code;

        public String getCode(SortCol sortCol) {
            return sortCol.code;
        }
        SortCol(String name){
            this.code = name;
        }
    }





    private String outType;
    private String pageNum;
    private String pageSize;
    private String srchTraArea1;
    private String srchTraArea2;
    private String srchNcs1;
    private String srchNcs2;
    private String srchNcs3;
    private String crseTracseSe;
    private String srchTraGbn;
    private String srchTraType;
    private String srchTraStDt;
    private String srchTraEndDt;
    private String srchTraProcessNm;
    private String srchTraOrganNm;
    private String sort;
    private String sortCol;

    public void setOutType(String outType) {

        this.outType = outType;
    }

    public void setPageNum(String pageNum) {
        this.pageNum = pageNum;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public void setSrchTraArea1(State srchTraArea1) {
        this.srchTraArea1 = srchTraArea1.code;
    }

    public void setSrchTraArea2(String srchTraArea2) {
        this.srchTraArea2 = srchTraArea2;
    }

    public void setSrchNcs1(SrchNcs1 srchNcs1) {
        this.srchNcs1 = srchNcs1.code;
    }

    public void setSrchNcs2(String srchNcs2) {
        this.srchNcs2 = srchNcs2;
    }

    public void setSrchNcs3(String srchNcs3) {
        this.srchNcs3 = srchNcs3;
    }

    public void setCrseTracseSe(String crseTracseSe) {
        this.crseTracseSe = crseTracseSe;
    }

    public void setSrchTraGbn(SrchTraGbn srchTraGbn) {
        this.srchTraGbn = srchTraGbn.code;
    }

    public void setSrchTraType(String srchTraType) {
        this.srchTraType = srchTraType;
    }

    public void setSrchTraStDt(String srchTraStDt) {
        this.srchTraStDt = srchTraStDt;
    }

    public void setSrchTraEndDt(String srchTraEndDt) {
        this.srchTraEndDt = srchTraEndDt;
    }

    public void setSrchTraProcessNm(String srchTraProcessNm) {
        this.srchTraProcessNm = srchTraProcessNm;
    }

    public void setSrchTraOrganNm(String srchTraOrganNm) {
        this.srchTraOrganNm = srchTraOrganNm;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public void setSortCol(SortCol sortCol) {
        this.sortCol = sortCol.code;

    }
    public String geturl(){
        StringBuilder builder = new StringBuilder();
        String key = "402d8c9f-cca8-42c6-9dca-89105da014a7";
        String returnType = "JSON";

        builder.append("https://www.work24.go.kr/cm/openApi/call/hr/callOpenApiSvcInfo310L01.do?authKey=" + key)
                .append("&returnType=").append(returnType)
                .append("&outType=");

        if (outType != null) {
            builder.append("&outType=").append(outType);
        } else {
            throwError("outType", "구분자 : 출력형태('1':리스트 '2':상세)");
        }

        if (pageNum != null) {
            builder.append("&pageNum=").append(pageNum);
        } else {
            throwError("pageNum", "시작페이지. 기본값 1, 최대 1000 검색 시작위치를 지정할 수 있습니다. 최대 1000 까지 가능.");
        }

        if (pageSize != null) {
            builder.append("&pageSize=").append(pageSize);
        } else {
            throwError("pageSize", "페이지당 출력건수, 기본값 10, 최대 100까지 가능.");
        }

        if (srchTraArea1 != null) {
            builder.append("&srchTraArea1=").append(srchTraArea1);
        }

        if (srchTraArea2 != null) {
            builder.append("&srchTraArea2=").append(srchTraArea2);
        }

        if (srchNcs1 != null) {
            builder.append("&srchNcs1=").append(srchNcs1);
        }
        if (srchNcs2 != null) {
            builder.append("&srchNcs2=").append(srchNcs2);
        }
        if (srchNcs3 != null) {
            builder.append("&srchNcs3=").append(srchNcs3);
        }

        if (crseTracseSe != null) {
            builder.append("&crseTracseSe=").append(crseTracseSe);
        }

        if (srchTraGbn != null) {
            builder.append("&srchTraGbn=").append(srchTraGbn);
        }

        if (srchTraType != null) {
            builder.append("&srchTraType=").append(srchTraType);
        }

        if (srchTraStDt != null) {
            builder.append("&srchTraStDt=").append(srchTraStDt);
        } else {
            throwError("srchTraStDt", "훈련시작일 From");
        }


        if(srchTraEndDt != null) {
            builder.append("&srchTraEndDt=").append(srchTraEndDt);
        }  else {
            throwError("srchTraEndDt", "훈련시작일 To");
        }


        if (srchTraProcessNm != null) {
            builder.append("&srchTraProcessNm=").append(srchTraProcessNm);
        }

        if (srchTraOrganNm != null) {
            builder.append("&srchTraOrganNm=").append(srchTraOrganNm);
        }

        if (sort != null) {
            builder.append("&sort=").append(sort);
        }  else {
            if (!sort.equals("ASC") || !sort.equals("DESC")) {
                throwError("sort", "정렬방법 : ASC,DESC");
            }
            throwError("sort", "정렬방법 : ASC,DESC");
        }

        if (sortCol != null) {
            builder.append("&sortCol=").append(sortCol);
        } else {
            throwError("sortCol", "모집인원 (\"TOT_FXNUM\"),\n" +
                    "훈련시작일 (\"TRNG_BGDE\"),\n" +
                    "훈련과정명 (\"TRNG_CRSN\")");
        }

        return  builder.toString();
    }

    private void throwError(String msg, String value) {
        RuntimeException exception = new RuntimeException("Prarameter :&"+msg +"=["+value+ "]는 필수값 입니다. setter 를 사용하여 값을 지정해주세요.");
        throw exception;
    }


    public static void main(String[] args) {
        CatalogURL url = new CatalogURL();
        url.setSrchNcs1(SrchNcs1.경영_회계_사무);

        url.geturl();
    }

}
