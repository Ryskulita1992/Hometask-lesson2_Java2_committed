package com.company;

public class Ernesto_dela_Cruz extends Coco_Disney_Cartoon{
    private String grandfather;

    public String getGrandfather() {
        return grandfather;
    }

    public Ernesto_dela_Cruz(String grandfather, String name, String talent, int age) {
        super(name, talent, age);
        this.grandfather=grandfather;
    }




    @Override
    public void print() {
        super.print();
        System.out.println("Grandfather:" +" "+ getGrandfather()+"\n"+ "name "+"-"+getName()+ "\n" +"talent"+"-"+getTalent()+"\n"+ "age"+"-"+getAge());


    }
}
