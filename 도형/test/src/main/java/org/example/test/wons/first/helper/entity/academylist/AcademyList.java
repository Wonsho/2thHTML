package org.example.test.wons.first.helper.entity.academylist;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AcademyList {

    private String address;         // 주소
    private String contents;        // 컨텐츠
    private String courseMan;       // 수강비
    private String eiEmplCnt3;      // 고용보험 3개월 취업 인원 수
    private String eiEmplCnt3Gt10;  // 고용보험 3개월 취업 인원 10인 이하 여부 (Y/N)
    private String eiEmplRate3;     // 고용보험 3개월 취업률
    private String eiEmplRate6;     // 고용보험 6개월 취업률
    private String grade;           // 등급
    private String instCd;          // 훈련기관 코드
    private String ncsCd;           // NCS 코드
    private String realMan;         // 실제 훈련비
    private String regCourseMan;    // 수강신청 인원
    private String stdgScor;        // 만족도 점수
    private String subTitle;        // 부 제목
    private String subTitleLink;    // 부 제목 링크
    private String telNo;           // 전화번호
    private String title;           // 제목
    private String titleIcon;       // 제목 아이콘
    private String titleLink;       // 제목 링크
    private String traEndDate;      // 훈련 종료일자
    private String traStartDate;    // 훈련 시작일자
    private String trainTarget;     // 훈련 대상
    private String trainTargetCd;   // 훈련 구분
    private String trainstCstId;    // 훈련 기관 ID
    private String trngAreaCd;      // 지역 코드 (중분류)
    private String trprDegr;        // 훈련 과정 순차
    private String trprId;          // 훈련 과정 ID
    private String yardMan;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public void setEiEmplCnt3(String eiEmplCnt3) {
        this.eiEmplCnt3 = eiEmplCnt3;
    }

    public void setCourseMan(String courseMan) {
        this.courseMan = courseMan;
    }

    public void setEiEmplCnt3Gt10(String eiEmplCnt3Gt10) {
        this.eiEmplCnt3Gt10 = eiEmplCnt3Gt10;
    }

    public void setEiEmplRate3(String eiEmplRate3) {
        this.eiEmplRate3 = eiEmplRate3;
    }

    public void setEiEmplRate6(String eiEmplRate6) {
        this.eiEmplRate6 = eiEmplRate6;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setInstCd(String instCd) {
        this.instCd = instCd;
    }

    public void setNcsCd(String ncsCd) {
        this.ncsCd = ncsCd;
    }

    public void setRealMan(String realMan) {
        this.realMan = realMan;
    }

    public void setStdgScor(String stdgScor) {
        this.stdgScor = stdgScor;
    }

    public void setRegCourseMan(String regCourseMan) {
        this.regCourseMan = regCourseMan;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public void setSubTitleLink(String subTitleLink) {
        this.subTitleLink = subTitleLink;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTitleIcon(String titleIcon) {
        this.titleIcon = titleIcon;
    }

    public void setTitleLink(String titleLink) {
        this.titleLink = titleLink;
    }

    public void setTraEndDate(String traEndDate) {
        this.traEndDate = traEndDate;
    }

    public void setTraStartDate(String traStartDate) {
        this.traStartDate = traStartDate;
    }

    public void setTrainTarget(String trainTarget) {
        this.trainTarget = trainTarget;
    }

    public void setTrainTargetCd(String trainTargetCd) {
        this.trainTargetCd = trainTargetCd;
    }

    public void setTrainstCstId(String trainstCstId) {
        this.trainstCstId = trainstCstId;
    }

    public void setTrngAreaCd(String trngAreaCd) {
        this.trngAreaCd = trngAreaCd;
    }

    public void setTrprDegr(String trprDegr) {
        this.trprDegr = trprDegr;
    }

    public void setTrprId(String trprId) {
        this.trprId = trprId;
    }

    public void setYardMan(String yardMan) {
        this.yardMan = yardMan;
    }

    public String getData(AcademyListParam param) {
        switch (param) {
            case J주소: {
                return this.address;
            }
            case C컨텐츠: {
                return this.contents;
            }
            case S수강비: {
                return this.courseMan;
            }
            case G고용보험3개월취업인원수: {
                return this.eiEmplCnt3;
            }
            case G고용보험3개월취업누적인원10이하여부: {
                return this.eiEmplCnt3Gt10;
            }
            case G고용보험3개월취업률: {
                return this.eiEmplRate3;
            }
            case G고용보험6개월취업률: {
                return this.eiEmplRate6;
            }
            case D등급: {
                return this.grade;
            }
            case H훈련기관코드: {
                return this.instCd;
            }
            case NCS코드: {
                return this.ncsCd;
            }
            case S실제훈련비: {
                return this.realMan;
            }
            case S수강신청인원: {
                return this.regCourseMan;
            }
            case M만족도점수: {
                return this.stdgScor;
            }
            case B부제목: {
                return this.subTitle;
            }
            case B부제목링크: {
                return this.subTitleLink;
            }
            case J전화번호: {
                return this.telNo;
            }
            case J제목: {
                return this.title;
            }
            case J제목아이콘: {
                return this.titleIcon;
            }
            case J제목링크: {
                return this.titleLink;
            }
            case H훈련종료일자: {
                return this.traEndDate;
            }
            case H훈련시작일자: {
                return this.traStartDate;
            }
            case H훈련대상: {
                return this.trainTarget;
            }
            case H훈련구분: {
                return this.trainTargetCd;
            }
            case H훈련기관ID: {
                return this.trainstCstId;
            }
            case J지역코드_중뷴류: {
                return this.trngAreaCd;
            }
            case H훈련과정순차: {
                return this.trprDegr;
            }
            case H훈련과정ID: {
                return this.trprId;
            }
            case J정원: {
                return this.yardMan;
            }
        }
        throw new RuntimeException("AcademyListError");
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder()
                .append("주소 : ").append(this.address).append("\n")
                .append("컨텐츠 : ").append(this.contents).append("\n")
                .append("수강비 : ").append(this.courseMan).append("\n")
                .append("등급 : ").append(this.grade).append("\n")
                .append("훈련기관 코드 : ").append(this.instCd).append("\n")
                .append("NCS코드 : ").append(this.ncsCd).append("\n")
                .append("실제훈련비 : ").append(this.realMan).append("\n")
                .append("수강신청 인원 : ").append(this.regCourseMan).append("\n")
                .append("만족도 점수 : ").append(this.stdgScor).append("\n")
                .append("부제목 : ").append(this.subTitle).append("\n")
                .append("부제목 링크 : ").append(this.subTitleLink).append("\n")
                .append("전화번호 : ").append(this.telNo).append("\n")
                .append("제목 : ").append(this.title).append("\n")
                .append("제목아이콘 : ").append(this.titleIcon).append("\n")
                .append("제목링크 : ").append(this.titleLink).append("\n")
                .append("훈련종료일자 : ").append(this.traEndDate).append("\n")
                .append("훈련시작일자 : ").append(this.traStartDate).append("\n")
                .append("훈련대상 : ").append(this.trainTarget).append("\n")
                .append("훈련구분 : ").append(this.trainTargetCd).append("\n")
                .append("훈련기관ID : ").append(this.trainstCstId).append("\n")
                .append("지역코드 : ").append(this.trngAreaCd).append("\n")
                .append("훈련과정 순차 : ").append(this.trprDegr).append("\n")
                .append("훈련과정 ID : ").append(this.trprId).append("\n")
                .append("정원 : ").append(this.yardMan).append("\n");
        return builder.toString();
    }
}
