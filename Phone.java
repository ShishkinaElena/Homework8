package Phone;

public class Phone implements Callable, Informable{
    static String number;
    static String model;
    static double weight;

    public Phone() {

    }


   /* public Phone() {
        System.out.println("Phone is created");*/



    public static String getNumber() {
        return number;
    }

    public Phone(String number) {
        this.number = number;
    }

    public static String getModel() {
        return model;
    }

    public static double getWeight() {
        return weight;
    }

    public Phone(double weight) {
        this.weight = weight;
    }

    public static void setNumber(String number) {
        Phone.number = number;
    }

    public static void setModel(String model) {
        Phone.model = model;
    }

    public static void setWeight(double weight) {
        Phone.weight = weight;
    }

    public void info() {
        System.out.println("Phone is created");
    }

    public void receiveCall() {

    }
}
