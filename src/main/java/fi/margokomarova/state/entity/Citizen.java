package fi.margokomarova.state.entity;

public class Citizen {
    private final int id;
    private String name;
    private String surname;
    private int age;
    private State state;
    private static int counter=0;

    public Citizen(){
        id=++counter;
        name=getRandomName(5);
        surname=getRandomName(8);
        age=(int) (Math.random()*100);
        this.state=State.getInstance();

    }

    public int getId (){
        return this.id;
    }

    public void setName (String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setSurname(String surname){
        this.surname=surname;
    }

    public String getSurname(){
        return this.surname;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public State getState(){
        return this.state;
    }

    public void setState(State state){
        this.state=state;
    }

    public String getRandomName(int length){
        String r="";
        for (int i=0; i<length; i++) {
            r+=(char) (Math.random() * 26 + 97);
        }
        return r;
    }

    @Override
    public String toString() {
        return "citizen id=" + id +
                ",name=" + name +
                ",surname=" + surname+
                ",age="+age;
                //",state="+state;

    }

}
