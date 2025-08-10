package com.mftplus.Tamrin.OfficeUml;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Department {
    private String name;
    private Organisation  organisation ;

    public Department(String name  ,Organisation  organisation ) {
        this.name = name;
        this.organisation =organisation;
    }

}
