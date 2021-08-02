package com.loadsapi.loads.entitity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//entity class whic is alse name of table 
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Payload {
    
    @Id
    private String shipperId;

    private String loadingPoint;
    private String unloadingPoint;
    private String productType;
    private String truckType;
    private String noOfTrucks;
    private String weight;
    private String comment;
    private Date date;

    // default constructer
    public Payload(){
        
    }

    // Constructer
    public Payload(String shipperId, String loadingPoint, String unloadingPoint, String productType, String truckType,
            String noOfTrucks, String weight, String comment, Date date) {
        this.shipperId = shipperId;
        this.loadingPoint = loadingPoint;
        this.unloadingPoint = unloadingPoint;
        this.productType = productType;
        this.truckType = truckType;
        this.noOfTrucks = noOfTrucks;
        this.weight = weight;
        this.comment = comment;
        this.date = date;
    }
    public String getShipperId() {
        return shipperId;
    }
    public void setShipperId(String shipperId) {
        this.shipperId = shipperId;
    }
    public String getLoadingPoint() {
        return loadingPoint;
    }
    public void setLoadingPoint(String loadingPoint) {
        this.loadingPoint = loadingPoint;
    }
    public String getUnloadingPoint() {
        return unloadingPoint;
    }
    public void setUnloadingPoint(String unloadingPoint) {
        this.unloadingPoint = unloadingPoint;
    }
    public String getProductType() {
        return productType;
    }
    public void setProductType(String productType) {
        this.productType = productType;
    }
    public String getTruckType() {
        return truckType;
    }
    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }
    public String getNoOfTrucks() {
        return noOfTrucks;
    }
    public void setNoOfTrucks(String noOfTrucks) {
        this.noOfTrucks = noOfTrucks;
    }
    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return "Payload [comment=" + comment + ", date=" + date + ", loadingPoint=" + loadingPoint + ", noOfTrucks="
                + noOfTrucks + ", productType=" + productType + ", shipperId=" + shipperId + ", truckType=" + truckType
                + ", unloadingPoint=" + unloadingPoint + ", weight=" + weight + "]";
    }

}
