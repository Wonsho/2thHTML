package org.example.test.wons.first.helper;

public class PageNum {

    public PageSize 시작페이지_기본값1_최대1000_검색_시작위치를_지정(int page) {
        if (0 >= page || page > 1000) {
            throw new RuntimeException("PageNum 값은 1 ~ 1000 까지 가능합니다. inputValue:" + page);
        }
        HrdApiHelper.HRDUrlBuilder.pageNum = String.valueOf(page);
        return new PageSize();
    }
}
