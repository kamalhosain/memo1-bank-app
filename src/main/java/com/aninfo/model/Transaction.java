package com.aninfo.model;

import javax.persistence.*;

public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double mountTransaction;

    private Long cbu;

    private String type;

    public Transaction(){}

    public Transaction(Long id, Double mountTransaction, Long cbu, String type){
        this.id = id;
        this.mountTransaction = mountTransaction;
        this.cbu = cbu;
        this.type = type;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return this.id;
    }

    public void setMountTransaction(Double mountTransaction){
        this.mountTransaction = mountTransaction;
    }

    public Double getMountTransaction(){
        return this.mountTransaction;
    }

    public void setCBU(Long cbu){
        this.cbu = cbu;
    }

    public Long getCBU(){
        return this.cbu;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }
}
