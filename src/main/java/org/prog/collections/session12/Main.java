package org.prog.collections.session12;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Owner, Set<Phone>> phoneOwners = new HashMap<>();

        Owner owner1 = new Owner("John");
        Owner owner2 = new Owner("Mike");
        Owner owner3 = new Owner("Anna");

        Phone phone1 = new Phone("iPhone");
        Phone phone2 = new Phone("Samsung");
        Phone phone3 = new Phone("Nokia");

        phoneOwners.put(owner1, new HashSet<>());
        phoneOwners.put(owner2, new HashSet<>());
        phoneOwners.put(owner3, new HashSet<>());

        phoneOwners.get(owner1).add(phone1);
        phoneOwners.get(owner1).add(phone2);

        phoneOwners.get(owner2).add(phone3);

        phoneOwners.get(owner3).add(phone1);


        Owner searchOwner = new Owner("John");

        Set<Phone> phones = phoneOwners.get(searchOwner);

        for (Phone p : phones) {
            System.out.println(p.model);
        }

    }
}