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


    public void sumOfPrice(List<PC> groupOfPC) {
        List<Double> list = new ArrayList<>();
        for (PC pc : groupOfPC) {
            double sum = pc.getPc().stream().mapToDouble(Motherboard::getPrice)
                    .sum();
            list.add(sum);
        }
        List<Double> collectSorted = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        collectSorted.forEach(System.out::println);

    }

    public void listOfMotherboards(List<PC> groupOfPC) {

        groupOfPC.stream()
                .flatMap(e -> e.pc.stream())
                .collect(Collectors.filtering(
                        e -> e.getClass().equals(Motherboard.class),
                        Collectors.toList()))
                .forEach(System.out::println);
    }

    public void memoryCapacity(List<PC> groupOfPC) {
        groupOfPC.stream()
                .map(e -> e.pc.stream().collect(Collectors.filtering(
                        l -> l.getClass().equals(HDD.class),
                        Collectors.toList())))
                .forEach(System.out::println);



    }


    public void averagePriceOfPC(List<PC> groupOfPC) throws NoSuchElementException {
        List<Double> list = new ArrayList<>();
        for (PC pc : groupOfPC) {
            try {
                double average = pc.getPc().stream().mapToDouble(Motherboard::getPrice).average().getAsDouble();
                list.add(average);
            } catch (NoSuchElementException e) {
                e.printStackTrace();
            }

        }
        List<Double> sortedAveragePrice = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())
                .stream()
                .limit(3).collect(Collectors.toList());
        sortedAveragePrice.forEach(System.out::println);


    }


    public void uniqueManufacturer(List<PC> groupOfPC) {
        groupOfPC.stream()
                .flatMap(e -> e.pc.stream())

                .collect(Collectors.toList())
                .stream().map(e -> e.producer.toUpperCase())
                .distinct()
                .forEach(System.out::println);

    }

}
