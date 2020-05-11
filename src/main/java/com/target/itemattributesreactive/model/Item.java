package com.target.itemattributesreactive.model;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Item {

    private Integer id;

    private String name;

    private String description;

    private String abbreviation;

    private LocalDate manufactured_date;

    private LocalDate expiry_date;

    private LocalDate purchase_date;

    private String manufacturer_id;

    private String manufacturer_name;

    private float user_rating;

    private String color;

    private float height;

    private float width;

    private float depth;

    private float weight;

    private int units_per_pack;

    private String brand;

    private int vendor_case_pack;

    private boolean is_fragile;

    private boolean is_returnable;

    private boolean is_item_hazardous;

    private String status;

    private String created_by;

    private String updated_by;

    //    public Item() {
//        this.id  = 0;
//        this.name = null;
//        this.description = null;
//        this.abbreviation = null;
//        this.manufacturer_id = null;
//        this.manufacturer_name = null;
//        this.user_rating = 0;
//        this.color = null;
//        this.height = 0;
//        this.width = 0;
//        this.depth = 0;
//        this.weight = 0;
//        this.units_per_pack = 0;
//        this.brand = null;
//        this.vendor_case_pack = 0;
//        this.is_fragile = false;
//        this.is_item_hazardous = false;
//        this.is_returnable = false;
//        this.status = null;
//        this.created_by = null;
//        this.updated_by = null;
//    }

}
