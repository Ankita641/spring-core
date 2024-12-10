package com.core.code;

public class Organization implements Registration{

    private String orgName;

    public Organization(String orgName) {
        this.orgName = orgName;
    }

    @Override
    public void register() {
        System.out.println("Organization registration " + orgName);
    }
}
