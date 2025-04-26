package com.iamdevnitesh.anpr.dataclass;

public class License {
    String license_plate, img_Url;
    Long date;

    public String getLicense_plate() {
        return license_plate;
    }

    public Long getDate() {
        return date;
    }

    public String getImg_Url() {
        return img_Url;
    }
}
