package org.example.test.wons.first.helper.codeenum;

public enum CrseTracseSeCode {
    전체(null),
    국민내일배움카드_일반("C0061"),
    국민내일배움카드_주_훈련대상_구직자("C0061S"),
    국민내일배움카드주_훈련대상_재직자("C0061I"),
    국가기간전략산업직종("C0054"),
    과정평가형훈련("C0055C"),
    기업맞춤형훈련("C0054G"),
    스마트혼합훈련("C0054Y"),
    일반고특화훈련("C0054S"),
    _4차산업혁명인력양성훈련("C0054I"),
    K_디지털_트레이닝("C0104"),
    K_디지털_기초역량훈련("C0105"),
    플랫폼종사자훈련("C0103"),
    산업구조변화대응("C0102"),
    중장년새출발카운슬링("C0106"),
    실업자_원격훈련("C0055"),
    근로자_원격훈련("C0031"),
    근로자_외국어훈련("C0031F");

    final private String code;
    public String getCode() {
        return this.code;
    }
    CrseTracseSeCode(String name) {
        this.code = name;
    }
}
