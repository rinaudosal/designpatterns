package com.github.rinaudosal.designpatterns.structural.adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class EmployeeLDAP {
    private String cn;
    private String firstName;
    private String lastName;
    private String mail;
}
