package com.nilesh.rbndj;

public class Members {
    String id ,name,fname,gotra,dob,hght,colorr,edu,job,hobby,addr,gender;

    public Members() {
    }

    public Members(String id, String name, String fname, String gotra, String dob, String hght, String colorr, String edu, String job, String hobby, String addr,String gender) {
        this.id = id;
        this.name = name;
        this.fname = fname;
        this.gotra = gotra;
        this.dob = dob;
        this.hght = hght;
        this.colorr = colorr;
        this.edu = edu;
        this.job = job;
        this.hobby = hobby;
        this.addr = addr;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getGotra() {
        return gotra;
    }

    public void setGotra(String gotra) {
        this.gotra = gotra;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getHght() {
        return hght;
    }

    public void setHght(String hght) {
        this.hght = hght;
    }

    public String getColorr() {
        return colorr;
    }

    public void setColorr(String colorr) {
        this.colorr = colorr;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
