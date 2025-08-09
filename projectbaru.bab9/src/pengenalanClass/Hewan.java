/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pengenalanClass;

/**
 *
 * @author ali
 */
public class Hewan {
    public String jenisKelamin;
    public int umur;
    public String warnaBulu;
    
    //constructor defult 
    public Hewan(){
    }
    
    
    //constructor dengan paramenter
    public Hewan(String jenisKelamin, int umur, String warnaBulu){
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
        this.warnaBulu = warnaBulu;
    }
    public String melompat(){
    String perilaku = "Anjing melompati pagar.";
    return perilaku;
    }
    //contoh function menerima paramenter
    public String melompat(String paramenter){
        String perilaku = "Anjing melompati" + paramenter + ".";
        return perilaku;
    }
    //contoh prosedure di class hewan
    public void memakan(){
    System.out.println("Anjing sedang mamakan daging.");
    }
    //contoh prosedure menerima paramenter
    public void memakan(String paramenter){
        System.out.println("Anjing sedang memakan" + paramenter + ".");
    }
    

public static void main(String[] args){
    Hewan anjing = new Hewan();
    anjing.jenisKelamin = "Jantan";
    anjing.umur = 5;
    anjing.warnaBulu = "coklat";
    System.out.println("Anjing " + anjing.jenisKelamin + " berumur " + anjing.umur + " tahun berbulu " + anjing.warnaBulu);
    //cara memanggil prosedure 
    System.out.println(anjing.melompat());
    //cara memanggil prosedure function dengan paramenter
    System.out.println(anjing.melompat(" kursi"));
    //cara memanggil prodesure di class hewan
    anjing.memakan();
    // cara memanggil prosedure dengan paramenter
    anjing.memakan(" Daging");
    }

   
}
