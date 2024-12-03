package fi.margokomarova.state.entity;

import java.util.Arrays;

public final class State {
    private static State instance;
    private String name;
    private Region [] regions;

public State(){
    name=getRandomWord(6);
    int regionAmount = 5+(int) (Math.random()*20);
    Region[]regions=new Region[regionAmount];
    for (int i=0; i<regionAmount; i++) {
        regions[i] = new Region();
    }
    this.regions=regions;
}
    public String getRandomWord(int length){
        String r="";
        for (int i=0; i<length; i++) {
            r+=(char) (Math.random() * 26 + 97);
        }
        return r;
    }

    public static State getInstance(){
        if (instance==null){
            instance=new State();
        }
        return instance;

    }

    @Override
    public String toString() {
        return "State{" +
                "name=" + name +
                ",regions=" + Arrays.toString(regions) +
                '}';

    }
}
