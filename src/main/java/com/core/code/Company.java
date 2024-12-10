package com.core.code;

public class Company implements Registration{

    private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void register() {
        System.out.println("Company Registration " + companyName);
    }
}
