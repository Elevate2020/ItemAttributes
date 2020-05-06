package com.target.itemattributesreactive.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.Id;

@Table(value = "item_dev.item_attributes")//name = "item_attributes", schema = "item_dev")
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
