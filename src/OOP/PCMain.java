package OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class PCMain {

    public static void main(String[] args) {

        List<Motherboard> componentsOfFirstPC = new ArrayList<>();
        List<Motherboard> componentsOfSecondPC = new ArrayList<>();


        List<PC> groupOfPC = new ArrayList<>();


        Motherboard motherboard = new Motherboard(4, "Asus", "ROG STRIX B550-XE GAMING", "45318551134-662aA4D45", ConnectionType.POWER, 2655.32, 4, 2, 4, 2, 1);
        PSU psu = new PSU(3, "Power Supply", " VA-PSU-US1", "564665sfa", ConnectionType.POWER, 2569.42) ;
        RAM ram = new RAM(1, "Kingston", "DDR4 32Gb 2400MHz", "805353-B21", ConnectionType.POWER, 2048, 3024);
        RAM ram2 = new RAM(1, "Kingston", "DDR4 32Gb 2400MHz", "805353-B21", ConnectionType.POWER, 2048, 1024);
        HDD hdd = new HDD(5, "Kingston", "HDD512", "1256aAS-512", ConnectionType.PCI_E, 20560.98);
        CPU cpu = new CPU(2, "Intel", "I9", "asd5f5", ConnectionType.Socket1155, 2568.00);
        SSD ssd = new SSD(6, "Samsung", "SSD512", "asd5f5", ConnectionType.PCI_E, 9851.29);
        SoundCard soundCard = new SoundCard(1,"Kingston","Model34","234512asfSA", ConnectionType.DIMM,2332.28);
        VideoCard videoCard = new VideoCard(1,"NVidia","RTX 3080","A6526ASfH", ConnectionType.PCI_E,59661.22);


        Motherboard motherboard1 = new Motherboard(4, "Asus", "ROG STRIX B550-XE GAMING", "45318551134-662aA4D45", ConnectionType.POWER, 555.25, 3, 2, 2, 2, 1);
        PSU psu1 = new PSU(3, "Power Supply", " VA-PSU-US1", "564665sfaaee", ConnectionType.POWER, 3256.25);
        RAM ram1 = new RAM(1, "Kingston", "DDR4 32Gb 2400MHz", "805353-B21", ConnectionType.POWER, 1024, 2048);
        RAM ram3 = new RAM(1, "Kingston", "DDR4 32Gb 2400MHz", "805353-B21", ConnectionType.POWER, 1024, 2048);
        HDD hdd1 = new HDD(5, "Kingston", "HDD512", "1256aAS-512", ConnectionType.PCI_E, 2981.25);
        CPU cpu1 = new CPU(2, "Intel", "I9", "asd5f5", ConnectionType.PCI_E, 3645.54);
        SSD ssd1 = new SSD(25, "SamSung", "SSD512", "asd5f5", ConnectionType.PCI_E, 23651.25);
        SoundCard soundCard1 = new SoundCard(1,"Kingston","Model34","234512asfSA", ConnectionType.DIMM,2332.28);
        VideoCard videoCard1 = new VideoCard(1,"NVidia","RTX 3080","A6526ASfH", ConnectionType.PCI_E,56561.22);



        componentsOfFirstPC.add(motherboard);
        componentsOfFirstPC.add(psu);
        componentsOfFirstPC.add(ram);
        componentsOfFirstPC.add(hdd);
        componentsOfFirstPC.add(cpu);
        componentsOfFirstPC.add(ssd);
        componentsOfFirstPC.add(ssd);
        componentsOfFirstPC.add(soundCard);
        componentsOfFirstPC.add(videoCard);
        componentsOfFirstPC.add(ram2);

        componentsOfSecondPC.add(motherboard1);
        componentsOfSecondPC.add(psu1);
        componentsOfSecondPC.add(ram1);
        componentsOfSecondPC.add(hdd1);
        componentsOfSecondPC.add(cpu1);
        componentsOfSecondPC.add(ssd1);
        componentsOfSecondPC.add(soundCard1);
        componentsOfSecondPC.add(videoCard1);
        componentsOfSecondPC.add(ram3);



       // Map<ConnectionType, Integer> mapOfMotherboard = motherboard.createMap(motherboard, componentsOfFirstPC);


       /* motherboard.addComponent(componentsOfFirstPC, new SSD(7, "Samsung", "SSD512", "asd5f5", ConnectionType.DIMM,5654.58), mapOfMotherboard);
        motherboard.addComponent(componentsOfFirstPC, new SSD(8, "Samsung", "SSD512", "asd455f5", ConnectionType.POWER,3569.25), mapOfMotherboard);
        motherboard.deleteComponent(componentsOfFirstPC, "564665sfad", mapOfMotherboard);*/

        //motherboard.addComponent(componentsOfFirstPC, new SSD(9, "Samsung", "SSD512", "asd455f5", ConnectionType.POWER), mapOfMotherboard);


        PC computer1 = new PC(componentsOfFirstPC, "MyFirstPC");
        PC computer2 = new PC(componentsOfSecondPC, "MySecondPC");

        groupOfPC.add(computer1);
        groupOfPC.add(computer2);

       // computer1.sumOfPrice(groupOfPC);
       // computer1.listOfMotherboards(groupOfPC);
      //  computer1.averagePriceOfPC(groupOfPC);
      //  computer1.uniqueManufacturer(groupOfPC);
        computer1.memoryCapacity1(groupOfPC);








    }
}
