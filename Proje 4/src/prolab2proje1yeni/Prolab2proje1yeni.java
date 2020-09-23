/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab2proje1yeni;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;


/**
 *
 * @author 180202039-180202052
 */
public class Prolab2proje1yeni {
    public static LinkedList<sehirler> coklu = new LinkedList(); 
    public static int sayacc=0;
    public static int x1=100,y1=100,x2=100,y2=100;
    static ArrayList<Integer>yedekliste=new ArrayList<>();
    static ArrayList<yollar>yollarxy=new ArrayList<>();
    static ArrayList<yollar>yollarxy1=new ArrayList<>();
    static ArrayList<yollar>yollarxy2=new ArrayList<>();
    static ArrayList<yollar>yollarxy3=new ArrayList<>();
    static ArrayList<yollar>yollarxy4=new ArrayList<>();
    static int kacinci=0;
    static int toplam=0;
    static ArrayList<Integer>toplamliste=new ArrayList<>();
    static final int N = 81;
    
    static int [][]P=new int[81][81];
    static int [][]M=new int[81][81];
    
    public static int[][] FloydAlgo(int[][] M) {
		for (int k = 0; k < N; k++) {         
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
                            M[i][j] = min(M[i][j], M[i][k] + M[k][j]);
                                    
                                      if(i==51 && j==0){
//                                          System.out.println("k "+k+" i "+i+" j "+j+" sonuc "+M[i][j]+"tersten sonuc "+M[j][i]);
                                      }         
				}
			}
		}
                
		return M;
	}

//	public static void printMatrix(int[][] Matrix) {
//		System.out.print("\n\t");
//		for (int j = 0; j < N; j++) {
//			System.out.print(j + "\t");
//		}
//		System.out.println();
//		for (int i = 0; i < N; i++) {
//			System.out.print(i + " |\t");
//			for (int j = 0; j < N; j++) {
//				System.out.print(Matrix[i][j]);
//				System.out.print("\t");
//			}
//			System.out.println("\n");
//		}
//		System.out.println("\n");
//	}
        
        public static int min(int i, int j) {
		if (i > j) {
			return j;
		}
		return i;
	}
        
        public static int yol(LinkedList<sehirler>sehirler,String sehir,int[][] dizi,int konum,LinkedList <sehirler>coklu) throws IOException{
             
            File files = new File("5yol.txt");


        FileWriter fileWriter = new FileWriter(files,true);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        
       
            
             
            int gidilcekplaka=0;
            boolean komsumu=false;
            
             for (int i = 0; i < 81.; i++)
            {
                 if(sehirler.get(i).isim.compareTo(sehir)==0)
                    {
                 gidilcekplaka=sehirler.get(i).plaka;
                    }
            }
//             for (int i = 0; i < sehirler.get(konum-1).komsusayisi; i++) {
//             if(sehirler.get(konum-1).komsular.get(i).plaka==gidilcekplaka){
//                 System.out.println("komsu sehre varıldı");
//                 komsumu=true;
//                 
//                 
//                 System.out.println("gidilen mesafe="+dizi[40][gidilcekplaka-1]);
//               
//             }   
//            }
             int sayac=0;
               
            while(sayac==0 && komsumu==false){
                if(sehirler.get(konum-1).isim.compareTo(sehirler.get(gidilcekplaka-1).isim)==0){
                    sayac++;
               //     System.out.println(sehirler.get(gidilcekplaka-1).isim+" sehrine ulaşılmıştır.");
                    if(sehirler.get(gidilcekplaka-1).plaka==41){
                        bWriter.append("=="+sehirler.get(gidilcekplaka-1).isim+" sehrine ulaşılmıştır.== \n \n ");
                        bWriter.append("Maliyet:"+yedekliste.get(kacinci)+" \n \n");
                        if(sayacc==4){
                          
                              RotaFrame ekran4=new RotaFrame();
                              
                              ekran4.setVisible(true);
                               String hepsi ="Kocaeli==>";
                              
                               for (int i = 0; i <coklu.size(); i++) {
                                
                                 hepsi=hepsi.concat(coklu.get(i).isim);
                                 if(coklu.get(i).plaka!=41){
                                     hepsi=hepsi.concat("==>");
                                 }
                                   
                                  
                            }
                             ekran4.setTitle("En kısa 5.yol güzergahı: "+hepsi);
                                   
                             sayacc++;
                        }
                        if(sayacc==3){
                        
                              RotaFrame ekran3=new RotaFrame();
                            
                              ekran3.setVisible(true);
                               String hepsi ="Kocaeli==>";
                          
                               for (int i = 0; i <coklu.size(); i++) {
                               
                                 hepsi=hepsi.concat(coklu.get(i).isim);
                                if(coklu.get(i).plaka!=41){
                                     hepsi=hepsi.concat("==>");
                                 }
                                
                            }
                             
                                  ekran3.setTitle("En kısa 4.yol güzergahı: "+hepsi);
                             sayacc++;
                        }
                        if(sayacc==2){
                          
                              RotaFrame ekran2=new RotaFrame();
                             
                              ekran2.setVisible(true);
                               String hepsi ="Kocaeli==>";
                              
                               for (int i = 0; i <coklu.size(); i++) {
                                
                                 hepsi=hepsi.concat(coklu.get(i).isim);
                                 if(coklu.get(i).plaka!=41){
                                     hepsi=hepsi.concat("==>");
                                 }
                                  
                            }
                              ekran2.setTitle("En kısa 3.yol güzergahı: "+hepsi);
                                  
                             sayacc++;
                        }
                        if(sayacc==1){
                         
                              RotaFrame ekran1=new RotaFrame();
                              ekran1.setTitle("En kısa 2.yol");
                              ekran1.setVisible(true);
                              String hepsi ="Kocaeli==>";
                              
                              for (int i = 0; i <coklu.size(); i++) {
                                
                                 hepsi=hepsi.concat(coklu.get(i).isim);
                                 if(coklu.get(i).plaka!=41){
                                     hepsi=hepsi.concat("==>");
                                 }
                                 
                            }
                              ekran1.setTitle("En kısa 2.yol güzergahı: "+hepsi);
                                 
                             sayacc++;
                        }
                        
                        if(sayacc==0){
                    
                              RotaFrame ekran=new RotaFrame();
                              ekran.setTitle("En kısa yol");
                              ekran.setVisible(true);
                              String hepsi ="Kocaeli==>";
                              
                               for (int i = 0; i <coklu.size(); i++) {
                                
                                 hepsi=hepsi.concat(coklu.get(i).isim);
                                 if(coklu.get(i).plaka!=41){
                                     hepsi=hepsi.concat("==>");
                                 }
                                
                            }
                              ekran.setTitle("En kısa yol güzergahı: "+hepsi);
                                    
                             sayacc++;
                             
                        }
                             
                    }
                    else
                    bWriter.append("=="+sehirler.get(gidilcekplaka-1).isim+" sehrine ulaşılmıştır.== \n");
                    bWriter.close();
                }else{
//                  System.out.println(sehirler.get(konum-1).isim+" hahahaha");
                    konum=MesafeBul(sehirler,sehir,dizi,konum-1,gidilcekplaka-1);
                    
                     }
            }
         //   System.out.println("Döndürülen yer  "+konum);
          return konum;
            
        }
        
        
        public static int MesafeBul(LinkedList<sehirler>sehirler,String sehir,int[][] dizi,int konum,int varis) throws IOException{
             File files = new File("5yol.txt");


        FileWriter fileWriter = new FileWriter(files,true);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
            
        
            int ekm=100000;
            int plaka=0;
            int kontrol=0;
            for (int i = 0; i < sehirler.get(konum).komsusayisi; i++) {
               
                if((dizi[konum][sehirler.get(konum).komsular.get(i).plaka-1])+(dizi[sehirler.get(konum).komsular.get(i).plaka-1][varis])<ekm){
                ekm=(dizi[konum][sehirler.get(konum).komsular.get(i).plaka-1])+(dizi[sehirler.get(konum).komsular.get(i).plaka-1][varis]);
                kontrol=i;
                }
            }
  //     System.out.println(sehirler.get(konum).isim+" sehrinden "+sehirler.get(konum).komsular.get(kontrol).isim+" sehrine ilerlemiştir");
       
      bWriter.append(sehirler.get(konum).isim+" sehrinden "+sehirler.get(konum).komsular.get(kontrol).isim+" sehrine ilerlemiştir \n");
      
      
      x1=sehirler.get(konum).pixelX;
      x2=sehirler.get(konum).komsular.get(kontrol).pixelX;
      y1=sehirler.get(konum).pixelY;
      y2=sehirler.get(konum).komsular.get(kontrol).pixelY;
      if(sayacc==0){
       
        yollarxy.add(new yollar(x1,x2,y1,y2));  
      }
      if(sayacc==1){
        yollarxy1.add(new yollar(x1,x2,y1,y2));  
      }
      if(sayacc==2){
        yollarxy2.add(new yollar(x1,x2,y1,y2));  
      }
      if(sayacc==3){
        yollarxy3.add(new yollar(x1,x2,y1,y2));  
      }
      if(sayacc==0){
        yollarxy4.add(new yollar(x1,x2,y1,y2));  
      }
        //ekran.paint(g,sehirler.get(konum).pixelX,sehirler.get(konum).komsular.get(kontrol).pixelX,sehirler.get(konum).pixelY,sehirler.get(konum).komsular.get(kontrol).pixelY);
       
       bWriter.close();
             
            konum=sehirler.get(konum).komsular.get(kontrol).plaka;
           return konum;
        }
        
       
        
        public static void cokluyolmesafe(LinkedList<sehirler>sehirler,int[][] dizi,int konum,LinkedList<sehirler>coklu){
            toplam+=dizi[40][coklu.get(0).plaka-1];
            for (int i = 0; i <coklu.size(); i++) {
                if(i!=coklu.size()-1){
                    toplam+=dizi[coklu.get(i).plaka-1][coklu.get(i+1).plaka-1];
                }
                
            }
           
        //    System.out.println("Gidilen toplam mesafe:"+toplam);
            toplamliste.add(toplam);
            toplam=0;
            
            
        }
        
           public static void yolhesabi(LinkedList<sehirler>sehirler,int[][] dizi,int konum,LinkedList<sehirler>coklu) throws IOException{
                for (int i = 0; i <coklu.size();i++) {
                konum=yol(sehirler,coklu.get(i).isim,dizi,konum,coklu);
             //   System.out.println("Burdayiz:"+konum);
            }
           }
        
   
        
     
 


 

        
   
        
    
    public static void main(String[] args) throws IOException {
        
      
       int []dizi=new int[N];
            int sutun=0;
        
        try{
            FileReader fr =new FileReader("komsuuzaklik.txt");
            BufferedReader br =new BufferedReader(fr);
            String line;
            String []kelimeler = null;
            int counter=0;
            int satir=0;
            
            for (int p = 0; p < N; p++) {
                dizi[p]=0;
            }
            while((line=br.readLine())!=null){
                //System.out.println(""+line);
                kelimeler=line.split(" ");
                //System.out.println(""+kelimeler.length);
                String str1="i";
                String str2="i\n";     
                
                for(int i=0;i<N;i++){
                    
                    if(kelimeler[i].compareTo(str1)==0 || kelimeler[i].compareTo(str2)==0){
                        M[satir][i]=99999;
//                        System.out.println("if de"+kelimeler[i]);
                    }else{
                        M[satir][i]=parseInt(kelimeler[i]);
//                       System.out.println("else de"+kelimeler[i]);
                    }
                    dizi[sutun]++;
                }
                sutun++;
                satir++;
                  
            }
      
        }catch(IOException e){
            System.out.println(e.getMessage());
            
        }

        FloydAlgo(M);
       

        LinkedList<sehirler> Sehirler = new LinkedList(); 
        File file=new File("sehirler.txt");
       FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException ex) {
          
        }
       String line = null;
       String ayrac=",";
    BufferedReader br = new BufferedReader(fileReader);
   int a=-1;
    String[]kelimeler;
        try {
            while ((line = br.readLine()) != null) {
               
             //   System.out.println(line);
                kelimeler=line.split(",");
                int plaka=0;
                
                for(int i=0;i<kelimeler.length;i++){
             
                    if(i==0){
                       plaka=Integer.valueOf(kelimeler[i]);
                    }
                    if(i==1){
                        
                        Sehirler.add(new sehirler(kelimeler[i],plaka));
                     //   System.out.println("Eklendi"+kelimeler[i]);
                        a++;
                    }
                    
                    
                    if(i!=0 && i!=1){
                     Sehirler.get(a).komsular.add(new Komsu(kelimeler[i]));
                    Sehirler.get(a).komsusayisi++;
                    //    System.out.println("a nin degeri"+a+"i nin degeri:"+i);
                    }
                   
                }
              
            }       } catch (IOException ex) {
           
        }
        
        try{
            FileReader frx =new FileReader("ilpixelsxy.txt");
            BufferedReader brx =new BufferedReader(frx);
            String linex;
            String []kelimelerx = null;
            int counter=0;
            int satir=0;
            
            
            while((linex=brx.readLine())!=null){
                //System.out.println(""+linex);
                kelimelerx=linex.split(" ");
                //System.out.println(""+kelimelerx.length);

                    Sehirler.get(counter).pixelX=parseInt(kelimelerx[0]);
                    Sehirler.get(counter).pixelY=parseInt(kelimelerx[1]);
                    counter++;   
                  
            }
      
        }catch(IOException e){
            System.out.println(e.getMessage());
            
        }
//        System.out.println("pixel");
//        for (int i = 0; i < 81; i++) {
//            System.out.print(""+Sehirler.get(i).pixelX+" ");
//            System.out.println(""+Sehirler.get(i).pixelY);
//        }
        
        

        try {
            br.close();
        } catch (IOException ex) {
           
        }
        
        
        
         for (int i = 0; i < 81.; i++) {     
            for (int j = 0; j < Sehirler.get(i).komsusayisi; j++) {
                for (int k = 0; k < 81; k++) {
                    if(Sehirler.get(i).komsular.get(j).isim.compareTo(Sehirler.get(k).isim)==0)
                    {
                        Sehirler.get(i).komsular.get(j).plaka=Sehirler.get(k).plaka;
                        Sehirler.get(i).komsular.get(j).pixelX=Sehirler.get(k).pixelX;
                        Sehirler.get(i).komsular.get(j).pixelY=Sehirler.get(k).pixelY;
                    }
                }
            }
        }
        
  
       Scanner sc=new Scanner(System.in);
       Scanner sce=new Scanner(System.in);
        System.out.println("Kaç şehire gideceksiniz?");
         int kacsehir;
         kacsehir=sc.nextInt();
         while(kacsehir<=0 || kacsehir>10){
             System.out.println("1 den küçük 10 dan büyük girdiniz.Lütfen tekrar deneyin.");
              kacsehir=sc.nextInt();
              
         }
          String gidileceksehirismi;
       
          LinkedList<sehirler> Gidilecek = new LinkedList(); 
         
             for(int i=0;i<kacsehir;i++){
                 System.out.println("Şehirin ismini giriniz(Lütfen ilk harfi büyük giriniz ve Türkçe karakter kullanmayınız.)");
                  gidileceksehirismi=sce.nextLine();
                  for(int j=0;j<81;j++){
                      if(gidileceksehirismi.compareTo(Sehirler.get(j).isim)==0){
                          Gidilecek.add(Sehirler.get(j));
                          
                      }
                      
                  }
                 
                 
             }
             for(int i=0;i<kacsehir;i++){
                 System.out.println(Gidilecek.get(i).plaka);
             }
             
    
           
         
         
         int [] plakalar=new int[kacsehir];
            for(int i=0;i<kacsehir;i++){
                plakalar[i]=Gidilecek.get(i).plaka;
            }
            
         int[] arr= {10, 20, 30};
        
     
     
         int faktoriyel = 1;
        for(int i = 1; i<= kacsehir; i++){
            faktoriyel = faktoriyel * i;
        }
       
    int[][]matris=new int[faktoriyel][kacsehir];
       PermutateArray pa=new PermutateArray(arr);
		
		List<List<Integer>> permute = pa.permute(plakalar);
		
		int j=0;
                
		System.out.println("=========================================");
		for(List<Integer> perm:permute)
		{
			for(int i=0;i<kacsehir;i++){
                    Integer.parseInt(perm.get(i).toString());
                            matris[j][i]=perm.get(i);
                            
                        }
                        j++;
                      
		}
//         for (int i = 0; i < faktoriyel; i++) {
//             for (int k = 0; k < kacsehir; k++) {
//                System.out.print(" "+matris[i][k]); 
//                
//             }
//             System.out.println(" ");
//        }



         int k=0;
         
          for(int i=0;i<faktoriyel;i++){
         coklu = new LinkedList(); 
                  for(k=0;k<kacsehir;k++){
                      for(j=0;j<81;j++){
                          if(Sehirler.get(j).plaka==matris[i][k]){
                           coklu.add(Sehirler.get(j));
                       }
                      }

                  }
              for ( j = 0; j <coklu.size(); j++) {
              //    System.out.println(coklu.get(j).isim);
              }
              coklu.add(Sehirler.get(40));
              
             cokluyolmesafe(Sehirler,M,41,coklu);
            //  System.out.println("=========================================");
          }
          
          
             
         for (int i = 0; i <toplamliste.size(); i++) {
             //System.out.println(toplamliste.get(i)+" i:"+i);
        }
         int enkisa=0;
         int indeks=0;
          enkisa=toplamliste.get(0);
         for (int i = 0; i <toplamliste.size(); i++) {
             
             if(i!=toplamliste.size()-1){
            if(enkisa>toplamliste.get(i+1)){
                enkisa=toplamliste.get(i+1);
                indeks=i+1;
            }
          
             }
             
        }
         
         System.out.println("En kisa mesafe:"+enkisa);
         for (int i = 0;i<kacsehir;i++) {
             System.out.println("Sehrine gidilmistir."+Sehirler.get((matris[indeks][i])-1).isim);
             
        }
         
        
         
           yedekliste=(ArrayList)toplamliste.clone();
          int []indeksler=new int [5];
          Collections.sort(yedekliste);
          if(kacsehir==1){
             
         for (int i = 0; i <1; i++) {
             for (int l = 0; l <toplamliste.size(); l++) {
                 if(yedekliste.get(i)==toplamliste.get(l)){
                     indeksler[i]=l;
                     toplamliste.set(l,100000);
             }
        }
        }
          }
         
          else if(kacsehir==2){
             
         for (int i = 0; i <2; i++) {
             for (int l = 0; l <toplamliste.size(); l++) {
                 if(yedekliste.get(i)==toplamliste.get(l)){
                     indeksler[i]=l;
                     toplamliste.set(l,100000);
             }
        }
        }
          }
          else {
             
         for (int i = 0; i <5; i++) {
             for (int l = 0; l <toplamliste.size(); l++) {
                 if(yedekliste.get(i)==toplamliste.get(l)){
                     indeksler[i]=l;
                     toplamliste.set(l,100000);
             }
        }
        }
          
          }
          
        
        for (int i = 0; i <5; i++) {
          //  System.out.println("en kisa:"+yedekliste.get(i)+" indeks:"+indeksler[i]);
        }
        System.out.println("=========================================");
        if(kacsehir==1){
            for (int i = 0; i <1; i++){
            LinkedList<sehirler> coklu = new LinkedList(); 
            for(k=0;k<kacsehir;k++){
                      for(j=0;j<81;j++){
                          if(Sehirler.get(j).plaka==matris[indeksler[i]][k]){
                             
                           coklu.add(Sehirler.get(j));
                       }
                      }

                  }
            coklu.add(Sehirler.get(40));
       
            kacinci=i;
            yolhesabi(Sehirler,M,41,coklu);
         
        }
        }
        if(kacsehir==2){
            for (int i = 0; i <2; i++){
            LinkedList<sehirler> coklu = new LinkedList(); 
            for(k=0;k<kacsehir;k++){
                      for(j=0;j<81;j++){
                          if(Sehirler.get(j).plaka==matris[indeksler[i]][k]){
                             
                           coklu.add(Sehirler.get(j));
                       }
                      }

                  }
            coklu.add(Sehirler.get(40));
            
            kacinci=i;
            yolhesabi(Sehirler,M,41,coklu);
         
        }
        }
        if(kacsehir>2){
            for (int i = 0; i <5; i++){
            LinkedList<sehirler> coklu = new LinkedList(); 
            for(k=0;k<kacsehir;k++){
                      for(j=0;j<81;j++){
                          if(Sehirler.get(j).plaka==matris[indeksler[i]][k]){
                             
                           coklu.add(Sehirler.get(j));
                       }
                      }

                  }
            coklu.add(Sehirler.get(40));
          
            kacinci=i;
            yolhesabi(Sehirler,M,41,coklu);
                  
        }
        }
        
         }
                
    }
    
