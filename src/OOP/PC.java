package OOP;

import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PC {

    List<Motherboard> pc;
    String nameOfAssembly;

    public List<Motherboard> getPc() {
        return pc;
    }

    public PC(List<Motherboard> pc, String nameOfAssembly) {
        this.pc = pc;
        this.nameOfAssembly = nameOfAssembly;
    }

    public PC() {
    }

    public String getNameOfAssembly() {
        return nameOfAssembly;
    }

/*  public PC(RAM ram, CPU cpu, Motherboard motherboard, PSU psu, SSD ssd, HDD hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.motherboard = motherboard;
        this.psu = psu;
        this.ssd = ssd;
        this.hdd = hdd;
    }*/


    public void sumOfPrice (List<PC> groupOfPC){
        List<Double> list = new ArrayList<>();
        for (PC pc : groupOfPC) {
            double sum = pc.getPc().stream().mapToDouble(Motherboard::getPrice)
                    .sum();
            list.add(sum);
        }
        List<Double> collectSorted = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collectSorted);

    }

    public void listOfMotherboards(List<PC> groupOfPC){
        List<Motherboard> motherboards = new ArrayList<>();
        groupOfPC.stream()
                .map(PC::getPc)

                .collect(Collectors.toList())
                .forEach(System.out::println);
        }

    public void averagePrice(List<PC> groupOfPC) throws NoSuchElementException{
        List<Double> list = new ArrayList<>();
        for (PC pc : groupOfPC){
            try {
                double average = pc.getPc().stream().mapToDouble(Motherboard::getPrice).average().getAsDouble();
                System.out.println(average);
                list.add(average);
            } catch (NoSuchElementException e){
                e.printStackTrace();
            }

         }
        List<Double> collectSorted = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        collectSorted.forEach(System.out::println);




    }

    public void discover(PC pc){
        /*Class<Motherboard> motherboardClass = Motherboard.class;
        Field[] declaredFields = motherboardClass.getDeclaredFields();
        for (Field field: declaredFields){
            System.out.println(field);
        }*/






    }
}
