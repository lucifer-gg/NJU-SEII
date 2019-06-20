package com.example.cinema.vo;

import java.sql.Timestamp;

public class RechangeRecordVO {
    private int id;
    private int userId;
    private double amountOfMoney;//充值总额
    private Timestamp rechangeTime;//充值时间
    private int consumeCardId;//用于消费的会员卡/银行卡号
    private double balance;//余额
    private double bonus;//赠送金额
    public RechangeRecordVO(){

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public Timestamp getRechangeTime() {
        return rechangeTime;
    }

    public void setRechangeTime(Timestamp rechangeTime) {
        this.rechangeTime = rechangeTime;
    }

    public int getConsumeCardId() {
        return consumeCardId;
    }

    public void setConsumeCardId(int consumeCardId) {
        this.consumeCardId = consumeCardId;
    }
}
