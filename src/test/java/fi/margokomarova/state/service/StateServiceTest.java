package fi.margokomarova.state.service;

import fi.margokomarova.state.entity.Citizen;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class StateServiceTest {

    private StateService stateService;
    private int[] ageCitizens;

    @BeforeSuite
    public void setUp() {
        stateService = new StateService();
        Citizen citizen1 = new Citizen();
        Citizen citizen2 = new Citizen();
        Citizen citizen3 = new Citizen();
        Citizen citizen4 = new Citizen();
        Citizen citizen5 = new Citizen();
        citizen1.setAge(58);
        citizen2.setAge(45);
        citizen3.setAge(51);
        citizen4.setAge(23);
        citizen5.setAge(78);
        Citizen[] stateCitizens = new Citizen[5];
        stateCitizens[0] = citizen1;
        stateCitizens[1] = citizen2;
        stateCitizens[2] = citizen3;
        stateCitizens[3] = citizen4;
        stateCitizens[4] = citizen1;
        ageCitizens = new int[5];
        ageCitizens[0] = citizen1.getAge();
        ageCitizens[1] = citizen2.getAge();
        ageCitizens[2] = citizen3.getAge();
        ageCitizens[3] = citizen4.getAge();
        ageCitizens[4] = citizen5.getAge();
    }

    @Test
    public void testCalculateMeanAge() {
        float mean = stateService.calculateMeanAge(ageCitizens);
        assertEquals(mean, 51, "result should be 51");

    }
}
