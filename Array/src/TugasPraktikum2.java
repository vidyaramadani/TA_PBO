/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class TugasPraktikum2 {
    public static void main (String args []){
 int nilai [][]=new int [2][3];
 nilai [0][0]=90;
 nilai [0][1]=85;
 nilai [0][2]=75;
 nilai [1][0]=70;
 nilai [1][1]=80;
 nilai [1][2]=90;
 String MP[]={"PPB","PBO"};
 double ratarata[]= new double[nilai.length];
 for (int i=0; i<nilai.length; i++){
 for (int j=0; j<nilai[0].length; j++){
 ratarata[i]+=nilai [i][j];
 }
 ratarata[i]/=nilai[0].length;
 }
 System.out.println("Nilai Mata Pelajaran\n");
 System.out.println ("MK\tMinggu1\tMinggu2\tMinggu3\tRata-Rata");
 for (int i=0; i<nilai.length; i++){
 System.out.print(MP[i]+"\t");
 for (int j=0;j<nilai[0].length; j++){
 }
 System.out.print(ratarata[i]+"\n");
 }
 }
}