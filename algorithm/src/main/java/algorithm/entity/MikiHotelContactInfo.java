/**
 * Copyright (c) 2018 Qunar.com. All Rights Reserved.
 */
package algorithm.entity;

/**
 * @author: create by qingxiang.zhu
 * @version: v1.0
 * @date:2018/10/16
 **/
public class MikiHotelContactInfo {

    private MikiHotelAddress address;

    private String telephoneNumber;

    private String faxNumber;

    public MikiHotelAddress getAddress() {
        return address;
    }

    public void setAddress(MikiHotelAddress address) {
        this.address = address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }
}
