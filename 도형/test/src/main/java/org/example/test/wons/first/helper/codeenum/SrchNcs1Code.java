package org.example.test.wons.first.helper.codeenum;
public enum SrchNcs1Code {
    전체(null),
    사업관리("01"),
    경영_회계_사무("02"),
    금융_보험("03"),
    교육_자연과학_사회과학("04"),
    법률_경찰_소방_교도_국방("05"),
    보건_의료("06"),
    사회복지_종교("07"),
    문화_예술_디자인_방송("08"),
    운전_운송("09"),
    영업_판매("10"),
    경비_청소("11"),
    이용_숙박_여행_오락_스포츠("12"),
    음식서비스("13"),
    건설("14"),
    기계("15"),
    재료("16"),
    화학("17"),
    섬유_의복("18"),
    전기_전자("19"),
    정보통신("20"),
    식품가공("21"),
    인쇄_목재_가구_공예("22"),
    환경_에너지_안전("23"),
    농림어업("24");

    final private String code;

    public String getCode( ) {
        return this.code;
    }

    SrchNcs1Code(String name) {
        this.code = name;

    }
}