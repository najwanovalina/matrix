import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan jumlah baris:");
        int baris = in.nextInt();
        System.out.println("Masukkan jumlah kolom:");
        int kolom = in.nextInt();

        int[][] matrix1 = new int[baris][kolom];
        int[][] matrix2 = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];

        System.out.println("Masukkan elemen matrix 1:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matrix1[i][j] = in.nextInt();
            }
        }
        System.out.println("Masukkan elemen matriks kedua:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matrix2[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.println("Hasil penjumlahan" + (matrix1[1][j] + matrix2[i][j]));

            }
            System.out.println();

        }
        in.close();

    }
}
