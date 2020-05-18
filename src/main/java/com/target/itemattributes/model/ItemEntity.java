package com.target.itemattributes.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "item_attributes", schema = "item_dev")
public class ItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String description;

    private String abbreviation;

    @Column(name = "manufactured_date")
    private LocalDateTime manufacturedDate;

    @Column(name = "expiry_date")
    private LocalDateTime expiryDate;

    @Column(name = "purchase_date")
    private LocalDateTime purchaseDate;

    @Column(name = "manufacturer_id")
    private String manufacturerId;

    @Column(name = "manufacturer_name")
    private String manufacturerName;

    private float rating;

    private String color;

    private float height;

    private float width;

    private float depth;

    private float weight;

    @Column(name = "units_per_pack")
    private int unitsPerPack;

    private String brand;

    @Column(name = "vendor_case_pack")
    private int vendorCasePack;

    @Column(name = "is_fragile")
    private boolean isFragile;

    @Column(name = "is_returnable")
    private boolean isReturnable;

    @Column(name = "is_item_hazardous")
    private boolean isItemHazardous;

    private String status;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_by")
    private String updatedBy;

    public ItemEntity() {
    }

    public ItemEntity(int id, String name, String description, String abbreviation, LocalDateTime manufacturedDate, LocalDateTime expiryDate, LocalDateTime purchaseDate, String manufacturerId, String manufacturerName, float rating, String color, float height, float width, float depth, float weight, int unitsPerPack, String brand, int vendorCasePack, boolean isFragile, boolean isReturnable, boolean isItemHazardous, String status, String createdBy, String updatedBy) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.abbreviation = abbreviation;
        this.manufacturedDate = manufacturedDate;
        this.expiryDate = expiryDate;
        this.purchaseDate = purchaseDate;
        this.manufacturerId = manufacturerId;
        this.manufacturerName = manufacturerName;
        this.rating = rating;
        this.color = color;
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.weight = weight;
        this.unitsPerPack = unitsPerPack;
        this.brand = brand;
        this.vendorCasePack = vendorCasePack;
        this.isFragile = isFragile;
        this.isReturnable = isReturnable;
        this.isItemHazardous = isItemHazardous;
        this.status = status;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public LocalDateTime getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(LocalDateTime manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    public LocalDateTime getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDateTime expiryDate) {
        this.expiryDate = expiryDate;
    }

    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDateTime purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getUnitsPerPack() {
        return unitsPerPack;
    }

    public void setUnitsPerPack(int unitsPerPack) {
        this.unitsPerPack = unitsPerPack;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVendorCasePack() {
        return vendorCasePack;
    }

    public void setVendorCasePack(int vendorCasePack) {
        this.vendorCasePack = vendorCasePack;
    }

    public boolean getIsFragile() {
        return isFragile;
    }

    public void setIsFragile(boolean fragile) {
        isFragile = fragile;
    }

    public boolean getIsReturnable() {
        return isReturnable;
    }

    public void setIsReturnable(boolean returnable) {
        isReturnable = returnable;
    }

    public boolean getIsItemHazardous() {
        return isItemHazardous;
    }

    public void setIsItemHazardous(boolean itemHazardous) {
        isItemHazardous = itemHazardous;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public String toString() {
        return "ItemEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", manufacturedDate=" + manufacturedDate +
                ", expiryDate=" + expiryDate +
                ", purchaseDate=" + purchaseDate +
                ", manufacturerId='" + manufacturerId + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", rating=" + rating +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                ", weight=" + weight +
                ", unitsPerPack=" + unitsPerPack +
                ", brand='" + brand + '\'' +
                ", vendorCasePack=" + vendorCasePack +
                ", isFragile=" + isFragile +
                ", isReturnable=" + isReturnable +
                ", isItemHazardous=" + isItemHazardous +
                ", status='" + status + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                '}';
    }
}
