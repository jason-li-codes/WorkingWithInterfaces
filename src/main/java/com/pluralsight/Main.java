package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> myFamily = new ArrayList<>();
        myFamily.add(new Person("Jason", "Li", 92));
        myFamily.add(new Person("Alwin", "Zhao", 25));
        myFamily.add(new Person("Ahsan", "Baseer", 36));
        myFamily.add(new Person("Harman", "Sing", 50));
        myFamily.add(new Person("Jazzy", "Germosen", 5));
        myFamily.add(new Person("Ashley", "Mendez", 21));

        Collections.sort(myFamily);
    }

}
