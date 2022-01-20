package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class ServiceInfo {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @OneToOne(mappedBy = "serviceInfo")
    private STO sto;
    private String[] brands;
    private String[] listOfServices;
    private String[] additionalServices;

    public ServiceInfo(){

    }

    public ServiceInfo(Integer id, String[] brands, String[] listOfServices, String[] additionalServices) {
        this.id = id;
        this.brands = brands;
        this.listOfServices = listOfServices;
        this.additionalServices = additionalServices;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String[] getBrands() {
        return brands;
    }

    public void setBrands(String[] brands) {
        this.brands = brands;
    }

    public String[] getListOfServices() {
        return listOfServices;
    }

    public void setListOfServices(String[] listOfServices) {
        this.listOfServices = listOfServices;
    }

    public String[] getAdditionalServices() {
        return additionalServices;
    }

    public void setAdditionalServices(String[] additionalServices) {
        this.additionalServices = additionalServices;
    }
}
