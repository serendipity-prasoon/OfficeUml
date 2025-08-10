package com.mftplus.Tamrin.OfficeUml;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Employee {
    private String name;
    private Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

}
