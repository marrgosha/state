package fi.margokomarova.state.entity;

public class Region {
    private District[] districts;
    private String name;
    private static int counter = 0;
    private Integer number;
    private String centreName;

    public Region() {
        number = ++counter;
        name = getRandomWord(5);
        int districtAmount = (int) (Math.random() * 20);
        District[] districts = new District[districtAmount];
        for (int i = 0; i < districtAmount; i++) {
            districts[i] = new District();
        }
        this.districts = districts;
        centreName = getRandomWord(7);
    }

    public String getCentreName() {
        return centreName;
    }

    public String getRandomWord(int length) {
        String r = "";
        for (int i = 0; i < length; i++) {
            r += (char) (Math.random() * 26 + 97);
        }
        return r;
    }

    @Override
    public String toString() {
        return "\nRegion{" +
                "number=" + number +
                ",centre name=" + centreName +
                //",districts="+ Arrays.toString(districts)+
                "}";
    }
}
