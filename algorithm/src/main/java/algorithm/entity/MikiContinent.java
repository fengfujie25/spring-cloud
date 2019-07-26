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
public class MikiContinent {
    /**
     * 洲code
     */
    private String isoCode;

    private List<MikiCountry> countries;

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public List<MikiCountry> getCountries() {
        return countries;
    }

    public void setCountries(List<MikiCountry> countries) {
        this.countries = countries;
    }
}
