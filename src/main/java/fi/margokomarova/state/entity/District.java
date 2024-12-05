package fi.margokomarova.state.entity;

import java.util.Arrays;

public class District {

    private Town[] towns;
    private String name;
    private static int counter=0;
    private int number;

    public District() {
        number = ++counter;
        name=getRandomWord(8);
        int townAmount = (int) (Math.random() * 30);
        Town[] towns = new Town[townAmount];
        for (int i = 0; i < townAmount; i++) {
            towns[i] = new Town();
        }
        this.towns = towns;

    }

    public Town[]getTowns(){
        return towns;

    }

    public String getRandomWord(int length){
        String r="";
        for (int i=0; i<length; i++) {
            r+=(char) (Math.random() * 26 + 97);
        }
        return r;
    }

    @Override
    public String toString(){
        return "\nDistrict{"+
                "number="+number+
                ",name="+name+
                ",towns="+ Arrays.toString(towns)+
                "}";
    }

}
