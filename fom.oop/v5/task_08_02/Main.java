package fom.oop.v5.task_08_02;

public class Main {

    public static void main(String[] args) {
        System.out.println("Baue Membranpumpe:");
        Membranpumpe membranpumpe = new Membranpumpe("Polymermembrane");
        membranpumpe.print();

        System.out.println("\nBaue Kreiselpumpe:");
        Kreiselpumpe kreiselpumpe = new Kreiselpumpe(1, 10);
        kreiselpumpe.print();

        System.out.println("\nBaue Auffangbecken:");
        Auffangbecken auffangbecken = new Auffangbecken(88);
        auffangbecken.print();
    }

}
