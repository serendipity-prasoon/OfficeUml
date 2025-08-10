package com.mftplus.Tamrin.OfficeUml;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Letter {
    private String type;
    private Employee sender;
    private Employee reciever;

    public Letter(String type, Employee sender, Employee reciever) {
        this.type = type;
        this.sender = sender;
        this.reciever = reciever;
    }

}
