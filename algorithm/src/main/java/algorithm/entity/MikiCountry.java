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
public class MikiCountry {

    /**
     * 国家code
     */
    private String isoCode;

    private List<MikiCity> cities;

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public List<MikiCity> getCities() {
        return cities;
    }

    public void setCities(List<MikiCity> cities) {
        this.cities = cities;
    }
}
