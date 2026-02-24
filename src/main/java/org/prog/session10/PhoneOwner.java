package org.prog.session10;
import java.util.*;

public class PhoneOwner {
    private final String name;

    public PhoneOwner(String name) { this.name = name; }

    // Эти два метода позволяют находить данные по новому объекту с тем же именем
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return Objects.equals(name, ((PhoneOwner) o).name);
    }

    @Override
    public int hashCode() { return Objects.hash(name); }

    public static void main(String[] args) {
        Map<PhoneOwner, List<String>> phoneOwners = new HashMap<>();

        // Наполняем данными
        phoneOwners.put(new PhoneOwner("Owner1"), new ArrayList<>(List.of("iPhone 13", "Nokia 3310")));
        phoneOwners.put(new PhoneOwner("Owner2"), new ArrayList<>(List.of("Samsung S23")));
        phoneOwners.put(new PhoneOwner("Owner3"), new ArrayList<>(List.of("Pixel 8", "iPhone 15 Pro")));

        // Теперь это вернет список телефонов, а не null
        List<String> result = phoneOwners.get(new PhoneOwner("Owner2"));
        System.out.println(result);
    }
}

