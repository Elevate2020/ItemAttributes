package com.target.itemattributes.model;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Item {

    private int id;

    private String name;

    private String description;

    private String abbreviation;

    private LocalDateTime manufactured_date;

    private LocalDateTime expiry_date;

    private LocalDateTime purchase_date;

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

}
