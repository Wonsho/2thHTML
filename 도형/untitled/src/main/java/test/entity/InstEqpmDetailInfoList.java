package test.entity;

public class InstEqpmDetailInfoList {
    private String cstmrNm; // 등록 훈련 기관
    private String eqpmnNm; // 장비명
    private String holdQy; // 보유수량

    public void setCstmrNm(String cstmrNm) {
        this.cstmrNm = cstmrNm;
    }

    public void setEqpmnNm(String eqpmnNm) {
        this.eqpmnNm = eqpmnNm;
    }

    public void setHoldQy(String holdQy) {
        this.holdQy = holdQy;
    }

    public String getCstmrNm() {
        return cstmrNm;
    }

    public String getEqpmnNm() {
        return eqpmnNm;
    }

    public String getHoldQy() {
        return holdQy;
    }
}
