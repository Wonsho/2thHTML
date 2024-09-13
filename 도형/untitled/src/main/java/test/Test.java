package test;

public class Test {
   private String authKey;
   private String returnType;
   private String outType;
   private String srchTrprid;
   private String srchTrprDegr;

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public void setOutType(String outType) {
        this.outType = outType;
    }

    public void setSrchTrprid(String srchTrprid) {
        this.srchTrprid = srchTrprid;
    }

    public void setSrchTrprDegr(String srchTrprDegr) {
        this.srchTrprDegr = srchTrprDegr;
    }

    public String getUrl() {
        return "https://www.work24.go.kr/cm/openApi/call/hr/callOpenApiSvcInfo310L02.do?authKey="+authKey+"-cca8-42c6-9dca-89105da014a7&returnType="+returnType+"&outType="+outType+"&srchTrprId="+srchTrprid+"&srchTrprDegr="+srchTrprDegr+"";
    }
public static void main(String[] args) {
    Test test = new Test();
    test.setAuthKey("바보");
    test.setReturnType("JSON");
    test.setOutType("2");
    test.setSrchTrprid("3");
    test.setSrchTrprDegr("4");
    System.out.println(test.getUrl());
}
}

