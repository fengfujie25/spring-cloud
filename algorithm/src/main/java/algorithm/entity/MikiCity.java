/**
 * Copyright (c) 2018 Qunar.com. All Rights Reserved.
 */
package algorithm.entity;

import java.util.List;

/**
 * @author: create by qingxiang.zhu
 * @version: v1.0
 * @date:2018/10/16
 **/
public class MikiCity {

    /**
     * 城市编号
     */
    private String cityNumber;

    private String name;

    private String isoStateCode;

    private List<MikiHotel> hotels;

    public String getCityNumber() {
        return cityNumber;
    }

    public void setCityNumber(String cityNumber) {
        this.cityNumber = cityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsoStateCode() {
        return isoStateCode;
    }

    public void setIsoStateCode(String isoStateCode) {
        this.isoStateCode = isoStateCode;
    }

    public List<MikiHotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<MikiHotel> hotels) {
        this.hotels = hotels;
    }
}
