package org.example.test.wons.first.helper.entity.processinfo;

public class ProcessInfo {
    private InstBaseInfo instBaseInfo;
    private InstDetailInfo instDetailInfo;
    private InstEqpmDetailInfoList instEqpmDetailInfoList;
    private InstFacilityDetailInfoList instFacilityDetailInfoList;


    public ProcessInfo(InstBaseInfo instBaseInfo, InstDetailInfo instDetailInfo, InstEqpmDetailInfoList instEqpmDetailInfoList, InstFacilityDetailInfoList instFacilityDetailInfoList) {
        this.instBaseInfo = instBaseInfo;
        this.instDetailInfo = instDetailInfo;
        this.instEqpmDetailInfoList = instEqpmDetailInfoList;
        this.instFacilityDetailInfoList = instFacilityDetailInfoList;
    }
}
