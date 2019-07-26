package algorithm.entity;

import com.opencsv.bean.CsvBindByName;


import java.util.Objects;


public class CSVMikiHotelInfo {

    @CsvBindByName(column = "PRODUCT CODE")
    private String productCode;

    @CsvBindByName(column = "DESTINATION CITY")
    private Integer destinationCity;

    @CsvBindByName(column = "CITY NAME")
    private String cityName;

    @CsvBindByName(column = "COUNTRY NAME")
    private String COUNTRY_NAME;

    @CsvBindByName(column = "SUPPLIER CODE")
    private Integer supplierCode;

    @CsvBindByName(column = "PRODUCT NAME")
    private String productName;

    @CsvBindByName(column = "ADDRESS 1")
    private String address1;

    @CsvBindByName(column = "ADDRESS 2")
    private String address2;

    @CsvBindByName(column = "ADDRESS 3")
    private String address3;

    @CsvBindByName(column = "LATITUDE")
    private String latitude;

    @CsvBindByName(column = "LONGITUDE")
    private String longitude;

    @CsvBindByName(column = "TELEPHONE")
    private String telephone;

    @CsvBindByName(column = "FAX")
    private String fax;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CSVMikiHotelInfo that = (CSVMikiHotelInfo) o;
        return Objects.equals(productCode, that.productCode) &&
                Objects.equals(destinationCity, that.destinationCity) &&
                Objects.equals(cityName, that.cityName) &&
                Objects.equals(COUNTRY_NAME, that.COUNTRY_NAME) &&
                Objects.equals(supplierCode, that.supplierCode) &&
                Objects.equals(productName, that.productName) &&
                Objects.equals(address1, that.address1) &&
                Objects.equals(address2, that.address2) &&
                Objects.equals(address3, that.address3) &&
                Objects.equals(latitude, that.latitude) &&
                Objects.equals(longitude, that.longitude) &&
                Objects.equals(telephone, that.telephone) &&
                Objects.equals(fax, that.fax);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productCode, destinationCity, cityName, COUNTRY_NAME, supplierCode, productName, address1, address2, address3, latitude, longitude, telephone, fax);
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Integer getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(Integer destinationCity) {
        this.destinationCity = destinationCity;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCOUNTRY_NAME() {
        return COUNTRY_NAME;
    }

    public void setCOUNTRY_NAME(String COUNTRY_NAME) {
        this.COUNTRY_NAME = COUNTRY_NAME;
    }

    public Integer getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(Integer supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
