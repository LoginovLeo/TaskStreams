package OOP;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class PC {
    RAM ram;
    CPU cpu;
    Motherboard motherboard;
    PSU psu;
    SSD ssd;
    HDD hdd;
    List<Motherboard> pc;
    String nameOfAssembly;

    public PC(List<Motherboard> pc, String nameOfAssembly) {
        this.pc = pc;
        this.nameOfAssembly = nameOfAssembly;
    }

    public PC() {
    }


  /*  public PC(RAM ram, CPU cpu, Motherboard motherboard, PSU psu, SSD ssd, HDD hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.motherboard = motherboard;
        this.psu = psu;
        this.ssd = ssd;
        this.hdd = hdd;
    }*/



    public void discover(PC pc){
        /*Class<Motherboard> motherboardClass = Motherboard.class;
        Field[] declaredFields = motherboardClass.getDeclaredFields();
        for (Field field: declaredFields){
            System.out.println(field);
        }*/






    }
}
