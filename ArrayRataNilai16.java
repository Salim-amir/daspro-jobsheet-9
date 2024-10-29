import java.util.Scanner;

public class ArrayRataNilai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     int[] Nilaimhs = new int[10];
     double total = 0;
     double rata2 ;
     int jumlahLulus = 0;
     int jumlahTidakLulus = 0;

     for (int i = 0; i < Nilaimhs.length; i++) {
        System.out.print("Masukkan Nilai akhir ke-"+(i+1)+" : ");
        Nilaimhs[i] = sc.nextInt();
    }
    for (int i = 0; i < Nilaimhs.length; i++){
        total += Nilaimhs[i];
    }
    rata2 = total/Nilaimhs.length;
    System.out.println("Rata-Rata Nilai = " + rata2);
    
    }
}