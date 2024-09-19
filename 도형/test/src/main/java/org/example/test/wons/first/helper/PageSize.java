package org.example.test.wons.first.helper;

public class PageSize {

    public SrchTraArea1 페이지당_출력건수_기본값10_최대100까지_가능(int outputSize) {
        if (10> outputSize || outputSize > 100 ) {
            throw new RuntimeException("PageSize 값은 10 ~ 100 까지 가능합니다. inputValue:" + outputSize);
        }
        HrdApiHelper.HRDUrlBuilder.pageSize = String.valueOf(outputSize);
        return new SrchTraArea1();
    }
}
