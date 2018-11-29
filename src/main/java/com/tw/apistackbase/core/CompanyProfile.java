package com.tw.apistackbase.core;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CompanyProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long registeredCapital;
    private String certId;

    public CompanyProfile(){}


    public void setRegisteredCapital(Long registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public Long getRegisteredCapital() {
        return registeredCapital;
    }

    public String getCertId() {
        return certId;
    }
}
