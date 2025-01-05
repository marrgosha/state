package fi.margokomarova.state.service;

import fi.margokomarova.state.entity.*;

import java.util.Arrays;
import java.util.Scanner;

public class StateService {
    public void printTown (Town town){
        System.out.println(town);
    }

    public void printDistrict(District district){
        System.out.println(district);
    }

    public void printRegion(Region region){
        System.out.println(region);
    }

    public void printState(State state){
        System.out.println(state);
    }

    public void printCitizen(Citizen citizen){
        System.out.println(citizen);
    }

    public float calculateMeanAge(int[]ageCitizens){
        int sum=0;
        for (int i=0; i<ageCitizens.length; i++ ){
            sum +=ageCitizens[i];
        }
        float mean=((float) sum /ageCitizens.length);
        return mean;
    }

    public void printFirstCharacterCitizens(Citizen[]stateCitizens){
        Scanner m=new Scanner(System.in);
        System.out.println("Enter first letter of citizen name");
        char clientEntry=m.next().charAt(0);
        for (int i=0; i<stateCitizens.length; i++){
            char firstLetter;
            firstLetter=stateCitizens[i].getName().charAt(0);
            if (firstLetter==clientEntry){
                System.out.println(stateCitizens[i]);
            }

        }
    }

    public void printCertainLengthNameCitizens(Citizen[]stateCitizens){
        System.out.println("Enter citizen name length: from 5 to 10");
        Scanner n=new Scanner(System.in);
        int clientEntry=n.nextInt();
        for (int i=0; i<stateCitizens.length; i++){
            if (stateCitizens[i].getName().length()==clientEntry){
                System.out.println(stateCitizens[i]);
            }
        }

    }



}
