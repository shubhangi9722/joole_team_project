package com.itlizesession.Entity;

import javax.persistence.*;

/**
 Created by Zehui Lu
 */
@Entity
@Table(name = "technical_detail")
public class TechnicalDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "technical_detail_id")
    private int technicalDetailId;

    @Column(name = "airflow")
    private int airflow;

    @Column(name = "power")
    private int power;

    @Column(name = "operation_voltage")
    private int operationVoltage;

    @Column(name = "fan_speed")
    private int fanSpeed;

    @Column(name = "sound_at_max_speed")
    private int soundAtMaxSpeed;

    @Column(name = "fan_sweep_diameter")
    private int fanSweepDiameter;

    @Column(name = "height")
    private int height;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "product_id")
    private Product product;

    public TechnicalDetail() {

    }

    public TechnicalDetail(int airflow, int power, int operationVoltage, int fanSpeed, int soundAtMaxSpeed,
                           int fanSweepDiameter, int height) {
        this.airflow = airflow;
        this.power = power;
        this.operationVoltage = operationVoltage;
        this.fanSpeed = fanSpeed;
        this.soundAtMaxSpeed = soundAtMaxSpeed;
        this.fanSweepDiameter = fanSweepDiameter;
        this.height = height;
    }

    public int getTechnicalDetailId() {
        return technicalDetailId;
    }

    public void setTechnicalDetailId(int technicalDetailId) {
        this.technicalDetailId = technicalDetailId;
    }

    public int getAirflow() {
        return airflow;
    }

    public void setAirflow(int airflow) {
        this.airflow = airflow;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getOperationVoltage() {
        return operationVoltage;
    }

    public void setOperationVoltage(int operationVoltage) {
        this.operationVoltage = operationVoltage;
    }

    public int getFanSpeed() {
        return fanSpeed;
    }

    public void setFanSpeed(int fanSpeed) {
        this.fanSpeed = fanSpeed;
    }

    public int getSoundAtMaxSpeed() {
        return soundAtMaxSpeed;
    }

    public void setSoundAtMaxSpeed(int soundAtMaxSpeed) {
        this.soundAtMaxSpeed = soundAtMaxSpeed;
    }

    public int getFanSweepDiameter() {
        return fanSweepDiameter;
    }

    public void setFanSweepDiameter(int fanSweepDiameter) {
        this.fanSweepDiameter = fanSweepDiameter;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

