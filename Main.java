package Phone;
/*Д/з создать в проекте с Phone интерфейсы: Callable с методом receiveCall()
 и Informable c default методом info() с default реализацией,
 применить интерфейсы к абстрактному классу Phone и классам-наследникам.
 */

import static Phone.Phone.number;

public class Main {
    public static void main(String[] args){
        SamsungPhone samsungPhone = new SamsungPhone("999-999-999", "Sumsung",100.123, "Sasha");
        XiaomiPhone xiaomiPhone= new XiaomiPhone("888-888-888", "Xiaomi", 192, "Yolca");
        ApplePhone applePhone = new ApplePhone("777-777-777", "Apple", 200.16, "Misha");
        samsungPhone.info();
        xiaomiPhone.info();
        applePhone.info();

        samsungPhone.receiveCall();
        xiaomiPhone.receiveCall();
        applePhone.receiveCall();

        Informable informable = new Phone();
        informable.infoD();
    }
}
