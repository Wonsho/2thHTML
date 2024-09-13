//package url;
//
//public class Copy {
//    public static void main(String[] args) {
//        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
//
//        InputStream xmlInputStream = null;
//        try {
//            // XML 파일 URL
//            URL xmlUrl = new URL("https://www.work24.go.kr/cm/openApi/call/hr/callOpenApiSvcInfo310L03.do?authKey=402d8c9f-cca8-42c6-9dca-89105da014a7&returnType=XML&outType=2&srchTrprId=AIG20220000393457");
//
//            xmlInputStream = xmlUrl.openStream();
//
//            // DocumentBuilderFactory를 사용하여 DocumentBuilder 생성
//            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder builder = factory.newDocumentBuilder();
//
//            // URL로부터 Document 객체로 파싱 (인코딩 지정)
//            InputSource is = new InputSource(new InputStreamReader(xmlInputStream, StandardCharsets.UTF_8));
//            Document document = builder.parse(is);
//
//            // XML의 루트 엘리먼트
//            Element root = document.getDocumentElement();
//            root.normalize();
//
//            // XML 구조 출력
//            System.out.println("XML 구조:");
//            printXmlStructure(root, 0);
//
//            TotalList totalList = new TotalList();
//
//            // TrainingDate 파싱 및 설정
//            Element scnListElement = (Element) root.getElementsByTagName("scn_list").item(0);
//            if (scnListElement != null) {
//                TrainingDate trainingDate = parseTrainingDate(scnListElement);
//                totalList.setTrainingDate(trainingDate);
//            } else {
//                System.out.println("scn_list 요소를 찾을 수 없습니다.");
//            }
//
//            // 결과 출력
//            printTotalList(totalList);
//
//        } catch (Exception e) {
//            System.err.println("오류 발생: " + e.getMessage());
//            e.printStackTrace();
//        } finally {
//            if (xmlInputStream != null) {
//                try {
//                    xmlInputStream.close();
//                } catch (IOException e) {
//                    System.err.println("입력 스트림을 닫는 중 오류 발생: " + e.getMessage());
//                }
//            }
//        }
//    }
//
//    private static void printXmlStructure(Element element, int depth) {
//        System.out.println(" ".repeat(depth) + element.getTagName());
//        NodeList children = element.getChildNodes();
//        for (int i = 0; i < children.getLength(); i++) {
//            if (children.item(i) instanceof Element) {
//                printXmlStructure((Element) children.item(i), depth + 2);
//            }
//        }
//    }
//
//    // 기존의 parseTrainingDate, getElementTextContent, printTotalList, printTrainingDate 메서드는 그대로 유지
//
//    private static TrainingDate parseTrainingDate(Element element) {
//        TrainingDate trainingDate = new TrainingDate();
//        trainingDate.setEiEmplRate3(getElementTextContent(element, "eiEmplRate3"));
//        trainingDate.setEiEmplCnt3(getElementTextContent(element, "eiEmplCnt3"));
//        trainingDate.setEiEmplRate6(getElementTextContent(element, "eiEmplRate6"));
//        trainingDate.setEiEmplCnt6(getElementTextContent(element, "eiEmplCnt6"));
//        trainingDate.setHrdEmplRate6(getElementTextContent(element, "hrdEmplRate6"));
//        trainingDate.setHrdEmplCnt6(getElementTextContent(element, "hrdEmplCnt6"));
//        trainingDate.setInstIno(getElementTextContent(element, "instIno"));
//        trainingDate.setTotFxnum(getElementTextContent(element, "totFxnum"));
//        trainingDate.setTotParMks(getElementTextContent(element, "totParMks"));
//        trainingDate.setFiniCnt(getElementTextContent(element, "finiCnt"));
//        trainingDate.setTotTrco(getElementTextContent(element, "totTrco"));
//        trainingDate.setTotTrpCnt(getElementTextContent(element, "totTrpCnt"));
//        trainingDate.setTrEndDt(getElementTextContent(element, "trEndDt"));
//        trainingDate.setTrStaDt(getElementTextContent(element, "trStaDt"));
//        trainingDate.setTrprDegr(getElementTextContent(element, "trprDegr"));
//        trainingDate.setTrprId(getElementTextContent(element, "trprId"));
//        trainingDate.setTrprNm(getElementTextContent(element, "trprNm"));
//        return trainingDate;
//    }
//
//    private static String getElementTextContent(Element parent, String elementName) {
//        NodeList nodeList = parent.getElementsByTagName(elementName);
//        if (nodeList.getLength() > 0) {
//            return nodeList.item(0).getTextContent();
//        }
//        return "";
//    }
//
//    private static void printTotalList(TotalList totalList) {
//        System.out.println("TrainingDate:");
//        printTrainingDate(totalList.getTrainingDate());
//    }
//
//    private static void printTrainingDate(TrainingDate trainingDate) {
//        if (trainingDate == null) return;
//        System.out.println("3개월 고용보험 취업률(%): " + trainingDate.getEiEmplRate3());
//        System.out.println("3개월 고용보험 취업인원: " + trainingDate.getEiEmplCnt3());
//        System.out.println("6개월 고용보험 취업률(%): " + trainingDate.getEiEmplRate6());
//        System.out.println("6개월 고용보험 취업인원: " + trainingDate.getEiEmplCnt6());
//        System.out.println("6개월 고용보험 미가입 취업률(%): " + trainingDate.getHrdEmplRate6());
//        System.out.println("6개월 고용보험 미가입 취업인원: " + trainingDate.getHrdEmplCnt6());
//        System.out.println("훈련기관 코드: " + trainingDate.getInstIno());
//        System.out.println("모집인원(정원): " + trainingDate.getTotFxnum());
//        System.out.println("수강인원: " + trainingDate.getTotParMks());
//        System.out.println("수료인원: " + trainingDate.getFiniCnt());
//        System.out.println("총 훈련비: " + trainingDate.getTotTrco());
//        System.out.println("수강(신청) 인원: " + trainingDate.getTotTrpCnt());
//        System.out.println("훈련 종료일: " + trainingDate.getTrEndDt());
//        System.out.println("훈련 시작일: " + trainingDate.getTrStaDt());
//        System.out.println("훈련과정 회차: " + trainingDate.getTrprDegr());
//        System.out.println("훈련과정 ID: " + trainingDate.getTrprId());
//        System.out.println("훈련과정명: " + trainingDate.getTrprNm());
//    }
//
//}
