package fi.margokomarova.state.entity;

import java.util.Arrays;

public class Region {
    private District[]districts;
    private String name;
    private static int counter=0;
    private int number;

    public Region(){
        number = ++counter;
        name=getRandomWord(5);
        int districtAmount=(int)(Math.random()*20);
        District[]districts=new District[districtAmount];
        for (int i=0; i<districtAmount; i++) {
            districts[i] = new District();
        }
        this.districts=districts;

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
        return "\nRegion{"+
                "number="+number+
                ",name="+name+
                ",districts="+ Arrays.toString(districts)+
                "}";
    }
}
