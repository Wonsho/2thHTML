package test;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import test.entity.*;
import url.DetailUrl;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;


public class XmlToObjectMapper {
    public static void main(String[] args) {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));

        InputStream xmlInputStream = null;

        try {



            // XML 파일 URL
            String url = new DetailUrl().setSrchTorgId("500020024861")
                    .setSrchTrprDegr("2")
                    .setSrchTrprId("AIG20230000422651").getUrl();
            System.out.println(url);
            URL xmlUrl = new URL(url);


            xmlInputStream = xmlUrl.openStream();

            // DocumentBuilderFactory를 사용하여 DocumentBuilder 생성
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // URL로부터 Document 객체로 파싱 (인코딩 지정)
            InputSource is = new InputSource(new InputStreamReader(xmlInputStream, StandardCharsets.UTF_8));
            Document document = builder.parse(is);


            // XML의 루트 엘리먼트
            Element root = document.getDocumentElement();
            root.normalize();

            // TotalList 객체 생성 및 설정
            TotalList totalList = new TotalList();

            // InstBaseInfo 파싱 및 설정
            Element baseInfoElement = (Element) root.getElementsByTagName("inst_base_info").item(0);
            InstBaseInfo baseInfo = parseInstBaseInfo(baseInfoElement);
            totalList.setBaseInfo(baseInfo);

            // InstDetailInfo 파싱 및 설정
            Element detailInfoElement = (Element) root.getElementsByTagName("inst_detail_info").item(0);
            InstDetailInfo detailInfo = parseInstDetailInfo(detailInfoElement);
            totalList.setDetailInfo(detailInfo);

            // InstFacilityDetailInfoList 파싱 및 설정
            NodeList facilityNodes = root.getElementsByTagName("inst_facility_detail_info_list");
            if (facilityNodes.getLength() > 0) {
                InstFacilityDetailInfoList facilityDetailInfoList = parseInstFacilityDetailInfoList((Element) facilityNodes.item(0));
                totalList.setFacilityDetailInfoList(facilityDetailInfoList);
            }

            // InstEqpmDetailInfoList 파싱 및 설정
            NodeList eqpmNodes = root.getElementsByTagName("inst_eqpm_detail_info_list");
            if (eqpmNodes.getLength() > 0) {
                InstEqpmDetailInfoList eqpmDetailInfoList = parseInstEqpmDetailInfoList((Element) eqpmNodes.item(0));
                totalList.setEqpmDetailInfoList(eqpmDetailInfoList);
            }

            // 결과 출력 (예: 디버깅 용도)
            printTotalList(totalList);



        } catch (Exception e) {
            System.err.println("오류 발생: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (xmlInputStream != null) {
                try {
                    xmlInputStream.close();
                } catch (IOException e) {
                    System.err.println("입력 스트림을 닫는 중 오류 발생: " + e.getMessage());
                }

            }
        }
    }

    private static InstBaseInfo parseInstBaseInfo(Element element) {
        InstBaseInfo baseInfo = new InstBaseInfo();
        baseInfo.setAddr1(getElementTextContent(element, "addr1"));
        baseInfo.setAddr2(getElementTextContent(element, "addr2"));
        baseInfo.setFilePath(getElementTextContent(element, "filePath"));
        baseInfo.setHpAddr(getElementTextContent(element, "hpAddr"));
        baseInfo.setInoNm(getElementTextContent(element, "inoNm"));
        baseInfo.setInstIno(getElementTextContent(element, "instIno"));
        baseInfo.setInstPerTrco(getElementTextContent(element, "instPerTrco"));
        baseInfo.setNcsCd(getElementTextContent(element, "ncsCd"));
        baseInfo.setNcsNm(getElementTextContent(element, "ncsNm"));
        baseInfo.setNcsYn(getElementTextContent(element, "ncsYn"));
        baseInfo.setNonNcsCoursePrcttqTime(getElementTextContent(element, "nonNcsCoursePrcttqTime"));
        baseInfo.setNonNcsCourseTheoryTime(getElementTextContent(element, "nonNcsCourseTheoryTime"));
        baseInfo.setpFileName(getElementTextContent(element, "pFileName"));
        baseInfo.setPerTrco(getElementTextContent(element, "perTrco"));
        baseInfo.setTorgParGrad(getElementTextContent(element, "torgParGrad"));
        baseInfo.setTrDcnt(getElementTextContent(element, "trDcnt"));
        baseInfo.setTraingMthCd(getElementTextContent(element, "traingMthCd"));
        baseInfo.setTrprChap(getElementTextContent(element, "trprChap"));
        baseInfo.setTrprChapEmail(getElementTextContent(element, "trprChapEmail"));
        baseInfo.setTrprChapTel(getElementTextContent(element, "trprChapTel"));
        baseInfo.setTrprDegr(getElementTextContent(element, "trprDegr"));
        baseInfo.setTrprGbn(getElementTextContent(element, "trprGbn"));
        baseInfo.setTrprId(getElementTextContent(element, "trprId"));
        baseInfo.setTrprNm(getElementTextContent(element, "trprNm"));
        baseInfo.setTrprTarget(getElementTextContent(element, "trprTarget"));
        baseInfo.setTrprTargetNm(getElementTextContent(element, "trprTargetNm"));
        baseInfo.setTrprUpYn(getElementTextContent(element, "trprUpYn"));
        baseInfo.setTrtm(getElementTextContent(element, "trtm"));
        baseInfo.setZipCd(getElementTextContent(element, "zipCd"));
        return baseInfo;
    }

    private static InstDetailInfo parseInstDetailInfo(Element element) {
        InstDetailInfo detailInfo = new InstDetailInfo();
        detailInfo.setGovBusiNm(getElementTextContent(element, "govBusiNm"));
        detailInfo.setTorgGbnCd(getElementTextContent(element, "torgGbnCd"));
        detailInfo.setTotTraingDyct(getElementTextContent(element, "totTraingDyct"));
        detailInfo.setTotTraingTime(getElementTextContent(element, "totTraingTime"));
        detailInfo.setTotalCrsAt(getElementTextContent(element, "totalCrsAt"));
        detailInfo.setTrprDegr(getElementTextContent(element, "trprDegr"));
        detailInfo.setTrprId(getElementTextContent(element, "trprId"));
        detailInfo.setTrprNm(getElementTextContent(element, "trprNm"));
        return detailInfo;
    }

    private static InstFacilityDetailInfoList parseInstFacilityDetailInfoList(Element element) {
        InstFacilityDetailInfoList facilityDetailInfoList = new InstFacilityDetailInfoList();
        facilityDetailInfoList.setChangeCstmrId(getElementTextContent(element, "changeCstmrId"));
        facilityDetailInfoList.setCstmrId(getElementTextContent(element, "cstmrId"));
        facilityDetailInfoList.setCstrmrNm(getElementTextContent(element, "cstrmrNm"));
        facilityDetailInfoList.setFcltyArCn(getElementTextContent(element, "fcltyArCn"));
        facilityDetailInfoList.setHoldQy(getElementTextContent(element, "holdQy"));
        facilityDetailInfoList.setOcuAcptnCn(getElementTextContent(element, "ocuAcptnCn"));
        facilityDetailInfoList.setTrafcltyNm(getElementTextContent(element, "trafcltyNm"));
        return facilityDetailInfoList;
    }

    private static InstEqpmDetailInfoList parseInstEqpmDetailInfoList(Element element) {
        InstEqpmDetailInfoList eqpmDetailInfoList = new InstEqpmDetailInfoList();
        eqpmDetailInfoList.setCstmrNm(getElementTextContent(element, "cstmrNm"));
        eqpmDetailInfoList.setEqpmnNm(getElementTextContent(element, "eqpmnNm"));
        eqpmDetailInfoList.setHoldQy(getElementTextContent(element, "holdQy"));
        return eqpmDetailInfoList;
    }

    private static String getElementTextContent(Element parent, String elementName) {
        NodeList nodeList = parent.getElementsByTagName(elementName);
        if (nodeList.getLength() > 0) {
            return nodeList.item(0).getTextContent();
        }
        return "";
    }

    private static void printTotalList(TotalList totalList) {
        System.out.println("InstBaseInfo:");
        printInstBaseInfo(totalList.getBaseInfo());
        System.out.println("InstDetailInfo:");
        printInstDetailInfo(totalList.getDetailInfo());
        System.out.println("InstFacilityDetailInfoList:");
        printInstFacilityDetailInfoList(totalList.getFacilityDetailInfoList());
        System.out.println("InstEqpmDetailInfoList:");
        printInstEqpmDetailInfoList(totalList.getEqpmDetailInfoList());
    }



    private static void printInstBaseInfo(InstBaseInfo baseInfo) {
        if (baseInfo == null) return;
        System.out.println("주소1: " + baseInfo.getAddr1());
        System.out.println("주소2: " + baseInfo.getAddr2());
        System.out.println("파일 경로: " + baseInfo.getFilePath());
        System.out.println("홈페이지: " + baseInfo.getHpAddr());
        System.out.println("기관명: " + baseInfo.getInoNm());
        System.out.println("기관번호: " + baseInfo.getInstIno());
        System.out.println("연수원연계기관: " + baseInfo.getInstPerTrco());
        System.out.println("NCS 코드: " + baseInfo.getNcsCd());
        System.out.println("NCS 명: " + baseInfo.getNcsNm());
        System.out.println("NCS 여부: " + baseInfo.getNcsYn());
        System.out.println("비NCS교과 실기시간: " + baseInfo.getNonNcsCoursePrcttqTime());
        System.out.println("비NCS교과 이론시간: " + baseInfo.getNonNcsCourseTheoryTime());
        System.out.println("로고 파일명: " + baseInfo.getpFileName());
        System.out.println("정부지원금: " + baseInfo.getPerTrco());
        System.out.println("평가등급: " + baseInfo.getTorgParGrad());
        System.out.println("총 훈련일수: " + baseInfo.getTrDcnt());
        System.out.println("훈련방법코드: " + baseInfo.getTraingMthCd());
        System.out.println("담당자명: " + baseInfo.getTrprChap());
        System.out.println("담당자 이메일: " + baseInfo.getTrprChapEmail());
        System.out.println("담당자 전화번호: " + baseInfo.getTrprChapTel());
        System.out.println("훈련관정 회차: " + baseInfo.getTrprDegr());
        System.out.println("훈련과정 구분: " + baseInfo.getTrprGbn());
        System.out.println("훈련과정ID: " + baseInfo.getTrprId());
        System.out.println("훈련과정명: " + baseInfo.getTrprNm());
        System.out.println("주요 훈련과정 구분: " + baseInfo.getTrprTarget());
        System.out.println("주요 후련과정 구분명: " + baseInfo.getTrprTargetNm());
        System.out.println("국가기간전략산업직종훈련 여부: " + baseInfo.getTrprUpYn());
        System.out.println("총 훈련시간: " + baseInfo.getTrtm());
        System.out.println("우편번호: " + baseInfo.getZipCd());
    }

    private static void printInstDetailInfo(InstDetailInfo detailInfo) {
        if (detailInfo == null) return;
        System.out.println("훈련분야명: " + detailInfo.getGovBusiNm());
        System.out.println("훈련종류: " + detailInfo.getTorgGbnCd());
        System.out.println("훈련일수: " + detailInfo.getTotTraingDyct());
        System.out.println("훈련시간: " + detailInfo.getTotTraingTime());
        System.out.println("수강료: " + detailInfo.getTotalCrsAt());
        System.out.println("훈련과정 회차: " + detailInfo.getTrprDegr());
        System.out.println("훈련과정코드: " + detailInfo.getTrprId());
        System.out.println("훈련과정명: " + detailInfo.getTrprNm());
    }

    private static void printInstFacilityDetailInfoList(InstFacilityDetailInfoList facilityDetailInfoList) {
        if (facilityDetailInfoList == null) return;
        System.out.println("변동훈련기관ID: " + facilityDetailInfoList.getChangeCstmrId());
        System.out.println("훈련기관ID: " + facilityDetailInfoList.getCstmrId());
        System.out.println("등록훈련기관: " + facilityDetailInfoList.getCstrmrNm());
        System.out.println("시설 면적: " + facilityDetailInfoList.getFcltyArCn());
        System.out.println("시설 수: " + facilityDetailInfoList.getHoldQy());
        System.out.println("인원 수: " + facilityDetailInfoList.getOcuAcptnCn());
        System.out.println("시설명: " + facilityDetailInfoList.getTrafcltyNm());
    }

    private static void printInstEqpmDetailInfoList(InstEqpmDetailInfoList eqpmDetailInfoList) {
        if (eqpmDetailInfoList == null) return;
        System.out.println("등록 훈련 기관: " + eqpmDetailInfoList.getCstmrNm());
        System.out.println("장비명: " + eqpmDetailInfoList.getEqpmnNm());
        System.out.println("보유수량: " + eqpmDetailInfoList.getHoldQy());
    }
}
