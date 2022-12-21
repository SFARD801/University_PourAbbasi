package ir.azad.pourabbas;

public class Person {

    private String Name;
    private int Age;
    private double Avg;
    private boolean Male;

    //Person
    public void setName(String n){
        this.Name = n;
    }
    public void setAge(int age) {
        this.Age = age;
    }
    public void setAvg(double avg) {
        this.Avg = avg;
    }
    public void setMale(boolean male) {
        Male = male;
    }

    //Getters
    public String getName() {
        return Name;
    }
    public int getAge() {
        return Age;
    }
    public double getAvg() {
        return Avg;
    }
    public boolean isMale() {
        return Male;
    }
}
