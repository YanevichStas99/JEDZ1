package com.company;

import java.util.List;

public class Object {
    protected int number;
    protected String discr;

    public Object(int number, String discr) {
        this.number = number;
        this.discr = discr;
    }

    @Override
    public String toString() {
        return "Object{" +
                "number=" + number +
                ", discr='" + discr + '\'' +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDiscr() {
        return discr;
    }

    public void setDiscr(String discr) {
        this.discr = discr;
    }

    public static List<Object> deleter(List<Object> objects) {
        for (int i = 0; i <objects.size() ; i++) {
            Object object=objects.get(i);
            for (int j = i+1; j <objects.size() ; j++) {
                Object object1=objects.get(j);
                if (object.getNumber()==object1.getNumber()){
                    objects.remove(object1);
                }
            }
        }
        return objects;
    }
}
