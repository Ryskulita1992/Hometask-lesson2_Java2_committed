package com.company;

public class Miguel extends Coco_Disney_Cartoon{
    private String mainActor;

    public Miguel(String mainActor,String name, String talent, int age) {
        super(name, talent, age);
        this.mainActor=mainActor;
    }



    public String getMainActor() {
        return mainActor;
    }






    @Override
    public void print() {
        super.print();

        System.out.println("mainActor"+"-"+getMainActor()+ "\n"+ "name "+"-"+getName()+"\n"+"talent"+ "-"+getTalent()+"\n"+"age"+"-"+getAge());

    }
}
