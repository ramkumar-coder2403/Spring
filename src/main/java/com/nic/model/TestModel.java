package com.nic.model;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor @NoArgsConstructor
public class TestModel {
 private int id;
 private String name,email;
 private Date created_date;
}
