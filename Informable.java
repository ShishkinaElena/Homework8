package Phone;

public interface Informable {
    default void infoD(){
              System.out.println("Phone is created");
    }
}
