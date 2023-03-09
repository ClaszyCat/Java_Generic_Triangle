import java.util.Scanner;

public class Segitiga<T> {

    private T alas;
    private T tinggi;

    public int getResultAsInt(T alas, T tinggi){
        return (int)alas * (int)tinggi/2;
    }

    public Double getResultAsDouble(T alas, T tinggi){
        return (Double)alas * (Double)tinggi/2;
    }

    public T setAlas(T alas) {
        return this.alas = alas;
    }

    public T setTinggi(T tinggi) {
        return this.tinggi = tinggi;
    }

    public static void main(String[] args) {
        Segitiga<Integer>luasTipeInt = new Segitiga<>();
        Segitiga<Double>luasTipeDouble = new Segitiga<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("===HITUNG LUAS SEGITIGA ===\n\n Mau menampilkan hasil luas dalam bentuk apa? : \n 1.  Hasil to Integer\n 2.  Hasil to Double\n Masukkan pilihan 1 atau 2 : ");

       int pilihan = sc.nextInt();
        System.out.println("Masukkan Nilai Alas dan Tinggi Secara Berurutan : ");

        if (pilihan==1){
            int alasT = luasTipeInt.setAlas(sc.nextInt());
            int tinggiT = luasTipeInt.setTinggi(sc.nextInt());
            System.out.println(luasTipeInt.getResultAsInt(alasT, tinggiT));
        }
        else if(pilihan==2){
            double alasT = luasTipeDouble.setAlas(sc.nextDouble());
            double tinggiT = luasTipeDouble.setTinggi(sc.nextDouble());
            System.out.println(luasTipeDouble.getResultAsDouble(alasT, tinggiT));
        }
    }
}