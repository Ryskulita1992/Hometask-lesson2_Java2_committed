package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        createObject("Miguel").print();
        createObject("Ernesto_dela_Cruz").print();
        createObject("Hector").print();
    }




    public static Printable createObject(String className) {
        Printable printable = null;

        switch (className) {
            case "Miguel":
                printable = new Miguel("Miguel","Miguel", "Musician", 13);
                break;
            case "Ernesto_dela_Cruz":
                printable = new Ernesto_dela_Cruz("of main actor","Ernesto De La Cruz", "Famous Guitar Musician", 65);
                break;
            case "Hector":
                printable = new Hector("father of main actor","Hector", "Unknown Musician", 40);
                break;


        }
            return printable;
    }
}






