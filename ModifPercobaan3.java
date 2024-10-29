import java.util.Scanner;

public class ModifPercobaan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlah = sc.nextInt();
        
        int[] Nilaimhs = new int[jumlah];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < Nilaimhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            Nilaimhs[i] = sc.nextInt();
            
          
            if (Nilaimhs[i] >= 70) {
                totalLulus += Nilaimhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += Nilaimhs[i];
                jumlahTidakLulus++;
            }
        }

        
        double rataLulus = (jumlahLulus > 0) ? totalLulus/jumlahLulus : 0;
        double rataTidakLulus = (jumlahTidakLulus > 0) ? totalTidakLulus/jumlahTidakLulus : 0;

        
        System.out.println("Jumlah mahasiswa yang lulus: " + jumlahLulus);
        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + jumlahTidakLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
    }
}