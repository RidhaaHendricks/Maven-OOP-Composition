package za.ac.cput;

public class RunVehicle {

    public static void main(String args[]){
        Brake brk = new Brake("Ceramic", "Perreli", "Yellow");
        Engine eng = new Engine("13245","6", true);
        Car cr = new Car("98765", "1996","Toyota", 20000, "4", eng, brk);

        System.out.println(cr.toString());
    }

}
