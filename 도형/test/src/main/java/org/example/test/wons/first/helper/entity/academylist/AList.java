package org.example.test.wons.first.helper.entity.academylist;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AList {
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
}
