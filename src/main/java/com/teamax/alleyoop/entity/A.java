package com.teamax.alleyoop.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class A {
    private String http;
    private Integer id;
    private Integer pid;
    private String name;
    private String type;
    private String category;
    private String pictures;
    private String[] picArray;
    private String[] picUrlArray;

    public String getHttp() {
        return http;
    }

    public void setHttp(String http) {
        this.http = http;
        if(this.picArray!=null){
            this.picUrlArray = new String[this.picArray.length];
            for(int i=0;i<this.picArray.length;i++){
                this.picUrlArray[i] = this.http + this.picArray[i];
            }
        }
    }

    public String[] getPicArray() {
        return picArray;
    }

    public void setPicArray(String[] picArray) {
        this.picArray = picArray;
    }

    public String[] getPicUrlArray() {
        return picUrlArray;
    }

    public void setPicUrlArray(String[] picUrlArray) {
        this.picUrlArray = picUrlArray;
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.picArray = pictures.split(";");
        this.pictures = pictures;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
