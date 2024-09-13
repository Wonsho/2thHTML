package test.entity;

public class InstFacilityDetailInfoList {
    private String changeCstmrId; //변동훈련기관ID
    private String cstmrId; //훈련기관ID
    private String cstrmrNm; // 등록훈련기과
    private String fcltyArCn; // 시설 면적(m x m)
    private String holdQy; // 시설 수
    private String ocuAcptnCn; // 인원 수(명)
    private String trafcltyNm; // 시설명

    public void setChangeCstmrId(String changeCstmrId) {
        this.changeCstmrId = changeCstmrId;
    }

    public void setCstmrId(String cstmrId) {
        this.cstmrId = cstmrId;
    }

    public void setCstrmrNm(String cstrmrNm) {
        this.cstrmrNm = cstrmrNm;
    }

    public void setFcltyArCn(String fcltyArCn) {
        this.fcltyArCn = fcltyArCn;
    }

    public void setHoldQy(String holdQy) {
        this.holdQy = holdQy;
    }

    public void setOcuAcptnCn(String ocuAcptnCn) {
        this.ocuAcptnCn = ocuAcptnCn;
    }

    public void setTrafcltyNm(String trafcltyNm) {
        this.trafcltyNm = trafcltyNm;
    }

    public String getChangeCstmrId() {
        return changeCstmrId;
    }

    public String getCstmrId() {
        return cstmrId;
    }

    public String getCstrmrNm() {
        return cstrmrNm;
    }

    public String getFcltyArCn() {
        return fcltyArCn;
    }

    public String getHoldQy() {
        return holdQy;
    }

    public String getOcuAcptnCn() {
        return ocuAcptnCn;
    }

    public String getTrafcltyNm() {
        return trafcltyNm;
    }
}
