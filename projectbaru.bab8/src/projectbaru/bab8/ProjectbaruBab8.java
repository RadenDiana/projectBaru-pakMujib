/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectbaru.bab8;

import javax.swing.JOptionPane;

/**
 *
 * @author ali
 */
public class ProjectbaruBab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        for (int a = 0; a < 10; a++){
//            System.out.println("How Beautiful Star");
//        }
//                    for (int a = 2; a< 12; a += 2){
//                    System.out.println("Bilangan Genap :" + a);
//                    }

//           int baris = 5;
//           for(int i = 0; i <= baris; i++){
//               for(int j = 0; j < i; j++){
//                   System.out.print("* ");
//               }
//               System.out.println("");
//           }

//                       int jumlahkelas = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan jumlah kelas : ","Input", JOptionPane.INFORMATION_MESSAGE));
//                       String isikelas[][] = new
//                       String[jumlahkelas][];
//                       
//                       for (int kelas = 0; kelas < jumlahkelas; kelas++){
//                           String namakelas = JOptionPane.showInputDialog(null, "Nama Kelas : ", "Masukan Nama Kelas",JOptionPane.INFORMATION_MESSAGE);
//                           int jumlahkursi = Integer.parseInt(JOptionPane.showInputDialog(null, "Jumlah murid masing-masing kelas : ","Input", JOptionPane.INFORMATION_MESSAGE));
//                           isikelas[kelas] = new 
//                           String[jumlahkursi];
//                           System.out.println("kelas" + " " + namakelas + ":");
//                           for (int kursi = 0; kursi< jumlahkursi; kursi++){
//                               String namaSiswa = JOptionPane.showInputDialog(null,"Nama Siswa","kelas" + namakelas,JOptionPane.INFORMATION_MESSAGE);
//                               isikelas[kelas][kursi] = namaSiswa;
//                               System.out.println("Nama Siswa" + " " + isikelas[kelas][kursi]);
//                           }
//                           System.out.println("----------------------------------------");
//                       }  

//               int arr[] = new int[4];
//               boolean hasil = true;
//               arr[0] = 2;
//               arr[1] = 5;
//               arr[2] = 7;
//               arr[3] = 1;
//               while (hasil == true){
//                   String input = JOptionPane.showInputDialog(null,"masukan bilangan bulat :");
//                   int cekInputan = Integer.parseInt(input);
//                   for (int a = 0; a < 4; a++){
//                       if(cekInputan == arr[a]){
//                           hasil = false;
//                           break;
//                       }
//                       else {
//                           hasil = true;
//                       }
//                   }
//                   if (hasil == true){
//                       JOptionPane.showMessageDialog(null,"Angka" + " " + cekInputan + " " + "tidak ada di dalam array.");
//                   }
//                   else{
//                       JOptionPane.showMessageDialog(null,"Angka" + " " + cekInputan + " " + "ada di dalam array.");
//                   }
//               }

                                   String input = "";
                                   int cekbil = 0;
                                   do{
                                       input = JOptionPane.showInputDialog(null, "4 x 3 :");
                                       cekbil = Integer.parseInt(input);
                                   } while(cekbil !=12);
                                   
    }
    
}
