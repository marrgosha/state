package fi.margokomarova.state.entity;

public class Town {
    private String name;
    private static int counter = 0;
    private Integer number;

    public Town() {
        number = ++counter;
        name = getRandomWord(6);
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
        return "Town{" +
                "number=" + number +
                ",name=" + name +
                "}";
    }
}
