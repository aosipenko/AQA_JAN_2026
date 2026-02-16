package org.prog.session6;

import javax.print.attribute.standard.Destination;

public class Main {

    public static void main(String[] args) {
        Truck firstTruck = new Truck();
        Truck secondTruck = new Truck();
        Truck thirdTruck = new Truck();

        firstTruck.setTruckInfo("Volvo", "Alisa", "BM7777AA");
        secondTruck.setTruckInfo("MAN", "Anna", "CA6666HP");
        thirdTruck.setTruckInfo("Scania", "Irina", "CE3333KM");

        firstTruck.delivery("Sumy", "Odessa");
        secondTruck.delivery("Kyiv", "Lviv");
        thirdTruck.delivery("Poltava", "Lutsk");

        firstTruck.getTruckInfo();
        secondTruck.getTruckInfo();
        thirdTruck.getTruckInfo();
        System.out.println(firstTruck.getTruckInfo());
        System.out.println(secondTruck.getTruckInfo());
        System.out.println(thirdTruck.getTruckInfo());

        Truck[] array = new Truck[]{
                firstTruck, // 0
                secondTruck,// 1
                thirdTruck  // 2
        };
        String[] destinations = new String[]{
                " Going from Sumy to Odessa", //0
                " Going from Kyiv to Lviv", //1
                " Going from Poltava to Lutsk", //2
        };
        int i = 0;
        while (i < array.length) {
            array[i].goTO(destinations[i]);
            i++;
        }
    }
}
//        int i = Calc.add(1, 10);
//        String s = Calc.concat("1", "2");
//
//        System.out.println(i);
//        System.out.println(s);

//        System.out.println(Calc.countTo(20));
//        System.out.println(Calc.countTo(49));
//        System.out.println(Calc.countTo(100));
//        Calc.countFromTo(30, 60);

//        Truck truck1 = new Truck();
//        truck1.name = "Vasya";
//        truck1.delivery("Lviv", "Kyiv");
//        truck1.delivery("Kyiv", "Odessa");
//        truck1.delivery("Odessa", "Kyiv");


