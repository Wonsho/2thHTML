package url;

public class DetailUrl {

    private String srchTrprId;
    private String srchTrprDegr;
    private String srchTorgId; //	TRAINST_CST_ID 키값으로 줘야함 목록페이지 에 잇음

    public DetailUrl setSrchTrprDegr(String srchTrprDegr) {
        this.srchTrprDegr = srchTrprDegr;
        return this;
    }

    public DetailUrl setSrchTrprId(String srchTrprId) {
        this.srchTrprId = srchTrprId;
        return this;
    }

    public DetailUrl setSrchTorgId(String srchTorgId) {
        this.srchTorgId = srchTorgId;
        return this;
    }

    public String getUrl(){
        StringBuilder builder = new StringBuilder();
        String key = "402d8c9f-cca8-42c6-9dca-89105da014a7";
        String returnType = "XML";
        String outType = "2";

        builder.append("https://www.work24.go.kr/cm/openApi/call/hr/callOpenApiSvcInfo310L02.do?authKey="+key)
                .append("&returnType=").append(returnType)
                .append("&outType=").append(outType);


        if (srchTrprId != null){
            builder.append("&srchTrprId=").append(srchTrprId);
        } else{
            throwError("&srchTrprId","훈련과정ID");
        }

        if (srchTrprDegr != null){
            builder.append("&srchTrprDegr=").append(srchTrprDegr);
        }

        if(srchTorgId != null){
            builder.append("&srchTorgId=").append(srchTorgId);
        }

        return builder.toString();
    }
    private void throwError(String msg, String value) {
        RuntimeException exception = new RuntimeException("Prarameter :&"+msg +"=["+value+ "]는 필수값 입니다. setter 를 사용하여 값을 지정해주세요.");
        throw exception;
    }

    public static void main(String[] args) {
        DetailUrl detailUrl = new DetailUrl();
        detailUrl.setSrchTrprId("AIG20230000422651");
        detailUrl.setSrchTorgId("500020024867");
        detailUrl.setSrchTrprDegr("1");
        System.out.println(detailUrl.getUrl());

    }
}
