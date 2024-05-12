package com.svalero.bicistopegama.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class Bike {
    private int id_bike;
    private String name_bike;
    private String type_bike;
    private float price_bike;
    private Date date_bike;
}
