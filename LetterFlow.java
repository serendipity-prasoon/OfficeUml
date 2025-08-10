package com.mftplus.Tamrin.OfficeUml;

public class LetterFlow {

    public void send(Letter letter){
        System.out.println("start....");
        System.out.println("\t"+"Sending   Letter: " + letter.getSender().getDepartment().getName() + " from " + letter.getSender().getName());
    }

    public void reciever(Letter letter){
        // اصلاح این خط: دریافت‌کننده باید نمایش داده بشه
        System.out.println("\t"+"Recieving Letter: " + letter.getReciever().getDepartment().getName() + " from " + letter.getReciever().getName());
    }
}

