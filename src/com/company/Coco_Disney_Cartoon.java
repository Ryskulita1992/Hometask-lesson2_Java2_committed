package com.company;

public class Coco_Disney_Cartoon implements Printable{
    private String name;
    private String Talent;
    private int age;
    public String getName() {
        return name;
    }

    public String getTalent() {
        return Talent;
    }

    public int getAge() {
        return age;
    }

    public Coco_Disney_Cartoon(String name, String talent, int age) {
        this.name = name;
        Talent = talent;
        this.age = age;
    }


    @Override
    public void print() {
        System.out.println("name "+getName()+ "\n" +"talent"+getTalent()+"\n"+ "age"+getAge());
    }
}
