package com.example.beijingcustomizedbus;

import org.litepal.crud.LitePalSupport;

public class CustomizedCircuit  {


    private  int id;

    private String name;

    private String code;

    private String pickupPoint ;

    private String dropoffPoint;

    private String pickupTime;

    private String dropoffTime;

    private String price;

    public CustomizedCircuit (String name){
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {return name;}

    public void  setName(String name) {this.name= name; }

    public String getcode() {
        return code;
    }

    public void setcode(String code) {this.code = code; }

    public String getpickupPoint() {
        return  pickupPoint;
    }

    public void setpickupPoint(String  pickupPoint) {
        this. pickupPoint =  pickupPoint;
    }

    public String getdropoffPoint() {
        return dropoffPoint;
    }

    public void setdropoffPoint(String dropoffPoint) {
        this.dropoffPoint = dropoffPoint;
    }

    public String getpickupTime() {
        return pickupTime;
    }

    public void setpickupTime(String pickupTime) {
        this.pickupTime = pickupTime;
    }










}
