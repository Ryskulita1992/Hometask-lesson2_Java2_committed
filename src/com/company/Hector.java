package com.company;

public class Hector extends Coco_Disney_Cartoon {


    private String Hector;

    public String getHector() {
        return Hector;
    }

    public Hector(String Hector, String name, String talent, int age) {
        super(name, talent, age);
        this.Hector=Hector;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Hector"+" "+getHector()+ "\n" + "name "+"-"+getName()+ "\n" +"talent"+"-"+getTalent()+"\n"+ "age"+"-"+getAge());
    }
}
