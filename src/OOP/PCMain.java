package OOP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class PCMain {

    public static void main(String[] args) {

        List<Motherboard> componentsOfFirstPC = new ArrayList<>();
        List<Motherboard> componentsOfSecondPC = new ArrayList<>();


        List<PC> groupOfPC = new ArrayList<>();

        Motherboard motherboard = new Motherboard(4, "Asus", "ROG STRIX B550-XE GAMING", "45318551134-662aA4D45", ConnectionType.POWER, 2655.32, 4, 2, 4, 2, 1);
        PSU psu = new PSU(3, "Power Supply", " VA-PSU-US1", "564665sfa", ConnectionType.POWER, 2569.42);
        RAM ram = new RAM(1, "Kingston", "DDR4 32Gb 2400MHz", "805353-B21", ConnectionType.POWER, 2322.23);
        HDD hdd = new HDD(5, "Kingston", "HDD512", "1256aAS-512", ConnectionType.PCI_E, 20560.98);
        CPU cpu = new CPU(2, "Intel", "I9", "asd5f5", ConnectionType.PCI_E, 2568.00);
        SSD ssd = new SSD(6, "Samsung", "SSD512", "asd5f5", ConnectionType.PCI_E, 9851.29);

        Motherboard motherboard1 = new Motherboard(4, "Asus", "ROG STRIX B550-XE GAMING", "45318551134-662aA4D45", ConnectionType.POWER, 555.25, 3, 2, 2, 2, 1);
        PSU psu1 = new PSU(3, "Power Supply", " VA-PSU-US1", "564665sfaaee", ConnectionType.POWER, 3256.25);
        RAM ram1 = new RAM(1, "Kingston", "DDR4 32Gb 2400MHz", "805353-B21", ConnectionType.POWER, 2566.02);
        HDD hdd1 = new HDD(5, "Kingston", "HDD512", "1256aAS-512", ConnectionType.PCI_E, 2981.25);
        CPU cpu1 = new CPU(2, "Intel", "I9", "asd5f5", ConnectionType.PCI_E, 3645.54);
        SSD ssd1 = new SSD(25, "Samsung", "SSD512", "asd5f5", ConnectionType.PCI_E, 23651.25);


        componentsOfFirstPC.add(motherboard);
        componentsOfFirstPC.add(psu);
        componentsOfFirstPC.add(ram);
        componentsOfFirstPC.add(hdd);
        componentsOfFirstPC.add(cpu);
        componentsOfFirstPC.add(ssd);

        componentsOfSecondPC.add(motherboard1);
        componentsOfSecondPC.add(psu1);
        componentsOfSecondPC.add(ram1);
        componentsOfSecondPC.add(hdd1);
        componentsOfSecondPC.add(cpu1);
        componentsOfSecondPC.add(ssd1);

        Map<ConnectionType, Integer> mapOfMotherboard = motherboard.createMap(motherboard, componentsOfFirstPC);


        /*motherboard.addComponent(componentsOfFirstPC, new SSD(7, "Samsung", "SSD512", "asd5f5", ConnectionType.DIMM), mapOfMotherboard);
        motherboard.addComponent(componentsOfFirstPC, new SSD(8, "Samsung", "SSD512", "asd455f5", ConnectionType.POWER), mapOfMotherboard);
        motherboard.deleteComponent(componentsOfFirstPC, "564665sfad", mapOfMotherboard);*/
        //motherboard.addComponent(componentsOfFirstPC, new SSD(9, "Samsung", "SSD512", "asd455f5", ConnectionType.POWER), mapOfMotherboard);


        PC computer1 = new PC(componentsOfFirstPC, "MyFirstPC");
        PC computer2 = new PC(componentsOfSecondPC, "MySecondPC");

        groupOfPC.add(computer1);
        groupOfPC.add(computer2);

        computer1.sumOfPrice(groupOfPC);
        computer1.listOfMotherboards(groupOfPC);
        computer1.averagePrice(groupOfPC);






        //.collect(Collectors.toList())
                //.forEach(System.out::println);


        //computer1.getPCInformation(computer1);


        //componentsOfFirstPC.forEach(System.out::println);
        //System.out.println(" ");
        // psu.powerOn(pc);
        //motherboard.deleteComponent(components, components.get(1));
        //motherboard.addComponent(components, new PSU(33, "Power Supply", " VA-PSU-US1", "564665sfa", ConnectionType.POWER));
        //System.out.println(" ");
        //psu.powerOn(components);


    }
}
