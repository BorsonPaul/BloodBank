package com.example.application_bangladesh_bloodbank;

public class notice_data {

    String group,name,phone,division,district,location,key;


    public notice_data(String group, String name, String phone, String division, String district, String location, String key) {
        this.group = group;
        this.name = name;
        this.phone = phone;
        this.division = division;
        this.district = district;
        this.location = location;
        this.key = key;
    }

    public notice_data() {
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
