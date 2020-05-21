package com.target.itemattributes.model;

import java.time.LocalDateTime;

public class Item {

    private Integer id;

    private String name;

    private String description;

    private String abbreviation;

    private LocalDateTime manufactured_date;

    private LocalDateTime expiry_date;

    private LocalDateTime purchase_date;

    private String manufacturer_id;

    private String manufacturer_name;

    private Float user_rating;

    private String color;

    private Float height;

    private Float width;

    private Float depth;

    private Float weight;

    private Integer units_per_pack;

    private String brand;

    private Integer vendor_case_pack;

    private Boolean is_fragile;

    private Boolean is_returnable;

    private Boolean is_item_hazardous;

    private String status;

    private String created_by;

    private String updated_by;

    public Item(Integer id, String name, String description, String abbreviation, LocalDateTime manufactured_date, LocalDateTime expiry_date, LocalDateTime purchase_date, String manufacturer_id, String manufacturer_name, Float user_rating, String color, Float height, Float width, Float depth, Float weight, Integer units_per_pack, String brand, Integer vendor_case_pack, Boolean is_fragile, Boolean is_returnable, Boolean is_item_hazardous, String status, String created_by, String updated_by) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.abbreviation = abbreviation;
        this.manufactured_date = manufactured_date;
        this.expiry_date = expiry_date;
        this.purchase_date = purchase_date;
        this.manufacturer_id = manufacturer_id;
        this.manufacturer_name = manufacturer_name;
        this.user_rating = user_rating;
        this.color = color;
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.weight = weight;
        this.units_per_pack = units_per_pack;
        this.brand = brand;
        this.vendor_case_pack = vendor_case_pack;
        this.is_fragile = is_fragile;
        this.is_returnable = is_returnable;
        this.is_item_hazardous = is_item_hazardous;
        this.status = status;
        this.created_by = created_by;
        this.updated_by = updated_by;
    }

    public Item() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public LocalDateTime getManufactured_date() {
        return manufactured_date;
    }

    public void setManufactured_date(LocalDateTime manufactured_date) {
        this.manufactured_date = manufactured_date;
    }

    public LocalDateTime getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(LocalDateTime expiry_date) {
        this.expiry_date = expiry_date;
    }

    public LocalDateTime getPurchase_date() {
        return purchase_date;
    }

    public void setPurchase_date(LocalDateTime purchase_date) {
        this.purchase_date = purchase_date;
    }

    public String getManufacturer_id() {
        return manufacturer_id;
    }

    public void setManufacturer_id(String manufacturer_id) {
        this.manufacturer_id = manufacturer_id;
    }

    public String getManufacturer_name() {
        return manufacturer_name;
    }

    public void setManufacturer_name(String manufacturer_name) {
        this.manufacturer_name = manufacturer_name;
    }

    public Float getUser_rating() {
        return user_rating;
    }

    public void setUser_rating(Float user_rating) {
        this.user_rating = user_rating;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public Float getDepth() {
        return depth;
    }

    public void setDepth(Float depth) {
        this.depth = depth;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Integer getUnits_per_pack() {
        return units_per_pack;
    }

    public void setUnits_per_pack(Integer units_per_pack) {
        this.units_per_pack = units_per_pack;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getVendor_case_pack() {
        return vendor_case_pack;
    }

    public void setVendor_case_pack(Integer vendor_case_pack) {
        this.vendor_case_pack = vendor_case_pack;
    }

    public Boolean isIs_fragile() {
        return is_fragile;
    }

    public void setIs_fragile(Boolean is_fragile) {
        this.is_fragile = is_fragile;
    }

    public Boolean isIs_returnable() {
        return is_returnable;
    }

    public void setIs_returnable(Boolean is_returnable) {
        this.is_returnable = is_returnable;
    }

    public Boolean isIs_item_hazardous() {
        return is_item_hazardous;
    }

    public void setIs_item_hazardous(Boolean is_item_hazardous) {
        this.is_item_hazardous = is_item_hazardous;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public String getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(String updated_by) {
        this.updated_by = updated_by;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", manufactured_date=" + manufactured_date +
                ", expiry_date=" + expiry_date +
                ", purchase_date=" + purchase_date +
                ", manufacturer_id='" + manufacturer_id + '\'' +
                ", manufacturer_name='" + manufacturer_name + '\'' +
                ", user_rating=" + user_rating +
                ", color='" + color + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                ", weight=" + weight +
                ", units_per_pack=" + units_per_pack +
                ", brand='" + brand + '\'' +
                ", vendor_case_pack=" + vendor_case_pack +
                ", is_fragile=" + is_fragile +
                ", is_returnable=" + is_returnable +
                ", is_item_hazardous=" + is_item_hazardous +
                ", status='" + status + '\'' +
                ", created_by='" + created_by + '\'' +
                ", updated_by='" + updated_by + '\'' +
                '}';
    }
}
