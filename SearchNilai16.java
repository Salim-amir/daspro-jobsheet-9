public class SearchNilai16 {
    public static void main(String[] args) {
        int[] arrNilai = {80, 85, 78, 96, 90, 82, 86};
        int key = 90;
        int hasil = 0;

    for (int i = 0; i < arrNilai.length; i++){
        if (key == arrNilai[i]){
            hasil = 1;
            break;
        }
    }
    System.out.println();
    System.out.println("Nilai "+key+" ketemu di index ke-"+hasil);
    System.out.println();
    }
}
