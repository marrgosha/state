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
        //Scanner m=new Scanner(System.in);
        //System.out.println("Enter first letter of citizen name");
        //char clientEntry=;
        for (int i=0; i<stateCitizens.length; i++){
            char firstLetter;
            firstLetter=stateCitizens[i].getName().charAt(0);
            if (firstLetter==109){
                System.out.println(stateCitizens[i]);
            }

        }
    }





}
