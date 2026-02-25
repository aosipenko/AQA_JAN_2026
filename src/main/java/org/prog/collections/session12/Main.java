package org.prog.collections.session12;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Owner, List<Car>> phoneOwners = new HashMap<>();

        Owner owner1 = new Owner();
        owner1.name = "John";

        Owner owner2 = new Owner();
        owner2.name = "Mike";

        Owner owner3 = new Owner();
        owner3.name = "Anna";


        Car phone1 = new Car();
        phone1.model = "iPhone";

        Car phone2 = new Car();
        phone2.model = "Samsung";

        Car phone3 = new Car();
        phone3.model = "Nokia";


        phoneOwners.put(owner1, new ArrayList<>());
        phoneOwners.get(owner1).add(phone1);
        phoneOwners.get(owner1).add(phone2);

        phoneOwners.put(owner2, new ArrayList<>());
        phoneOwners.get(owner2).add(phone3);

        phoneOwners.put(owner3, new ArrayList<>());
        phoneOwners.get(owner3).add(phone1);


        Owner searchOwner = new Owner();
        searchOwner.name = "John";

        List<Car> phones = phoneOwners.get(searchOwner);

        if (phones != null) {
            for (Car c : phones) {
                System.out.println(c.model);
            }
        } else {
            System.out.println("Owner not found");
        }

    }
}