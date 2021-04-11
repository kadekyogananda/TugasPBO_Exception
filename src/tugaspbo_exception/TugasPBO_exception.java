/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo_exception;

/**
 *
 * @author asus
 */
public class TugasPBO_exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        try{
            // berikut ini pernyataan yang dapat mengakibatkan exception
           String[] siswa = new String[2];
           siswa[0] = "Ucup";
           siswa[1] = "Udin";
           siswa[2] = "Taufiq";
           System.out.println(siswa[4]);
           //====================================
           int angka = 7;
           int hasil = angka/0;
           System.out.println(hasil);
        }catch(ArrayIndexOutOfBoundsException ex){
            // pernyataan disini akan di eksekusi jika terjadi Exception
            System.out.println("Data Array Yang Ingin Dikeluarkan Tidak Ada");
        }catch(ArithmeticException ex2){
            System.out.println("Tidak Boleh Menggunakan Pembagian dengan 0 (nol)");
        }finally{
            /*
            Pernyataan disini akan di eksekusi jika terjadi Exception
            Ataupun tidak terjadi Exception
            */
            System.out.println("Program Diakhiri");
    }
   }
}

//Program akan memeriksa catch ArrayIndexOutOfBoundsException terlebih dahulu 
//apakah ditemukan exception jenis ini di dalam try, jika iya,
// maka akan mengeluarkan pernyataan didalamnya, dan jika tidak, program akan memeriksa catch kedua yaitu ArithmeticException.
// program akan memeriksa catch kedua yaitu ArithmeticException.
//Jadi program tidak akan mengeluarkan output pada kedua catch tersebut secara bersamaan,
//walaupun ditemukan 2 jenis error didalam try, jenis exception paling atas dulu yang akan di tampilkan.