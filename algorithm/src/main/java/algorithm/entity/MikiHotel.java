/**
 * Copyright (c) 2018 Qunar.com. All Rights Reserved.
 */
package algorithm.entity;

/**
 * @author: create by qingxiang.zhu
 * @version: v1.0
 * @date:2018/10/16
 **/
public class MikiHotel {

    /**
     * 酒店code
     */
    private String productCode;

    private String productName;

    private MikiHotelGeoLocation geoLocation;

    private MikiHotelContactInfo contactInfo;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public MikiHotelGeoLocation getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(MikiHotelGeoLocation geoLocation) {
        this.geoLocation = geoLocation;
    }

    public MikiHotelContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(MikiHotelContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }
}
