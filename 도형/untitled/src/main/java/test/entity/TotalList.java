package test.entity;

public class TotalList {
     private InstBaseInfo baseInfo;
     private InstDetailInfo detailInfo;
     private InstFacilityDetailInfoList facilityDetailInfoList;
     private InstEqpmDetailInfoList eqpmDetailInfoList;

     public void setBaseInfo(InstBaseInfo baseInfo) {
          this.baseInfo = baseInfo;
     }

     public void setDetailInfo(InstDetailInfo detailInfo) {
          this.detailInfo = detailInfo;
     }

     public void setFacilityDetailInfoList(InstFacilityDetailInfoList facilityDetailInfoList) {
          this.facilityDetailInfoList = facilityDetailInfoList;
     }

     public void setEqpmDetailInfoList(InstEqpmDetailInfoList eqpmDetailInfoList) {
          this.eqpmDetailInfoList = eqpmDetailInfoList;
     }

     public InstBaseInfo getBaseInfo() {
          return baseInfo;
     }

     public InstDetailInfo getDetailInfo() {
          return detailInfo;
     }

     public InstFacilityDetailInfoList getFacilityDetailInfoList() {
          return facilityDetailInfoList;
     }

     public InstEqpmDetailInfoList getEqpmDetailInfoList() {
          return eqpmDetailInfoList;
     }


}
