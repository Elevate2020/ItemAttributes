package com.target.itemattributes.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "item_attributes", schema = "item_dev")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String description;

    private String abbreviation;

    private LocalDateTime manufactured_date;

    private LocalDateTime expiry_date;

    private LocalDateTime purchase_date;

    private String manufacturer_id;

    private String manufacturer_name;

    private float rating;

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
