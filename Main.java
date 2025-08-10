package com.mftplus.Tamrin.OfficeUml;

public class Main {
    public static void main(String[] args) {
        Organisation org = new Organisation("MFT");

        Department dept = new Department("ItDepartment", org);
        Department dept2 = new Department("HrDepartment", org);

        // اصلاح این خط: گیرنده را عضو دپارتمان IT کن
        Employee sender = new Employee("Shayan", dept2);
        Employee receiver = new Employee("Aminaei", dept); // تغییر اینجا

        Letter letter = new Letter("Official", sender, receiver);
        LetterFlow flow = new LetterFlow();
        flow.send(letter);
        flow.reciever(letter);


        System.out.println("So: ");
        System.out.println("\t"+sender.getName()+" is sender.");
        System.out.println("\t"+receiver.getName()+" is receiver."+"\n");
        System.out.println("End....");
    }
}
