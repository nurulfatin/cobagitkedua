package planegeometrycalculator;

import java.util.Scanner;

public class PlaneGeometryCalculator {

    Scanner input = new Scanner(System.in);
    int luas,keliling;
    String in;
    
    void menu(){
        int op;
        System.out.println("WELCOME TO PLANE GEOMETRY CALCULATOR");
        System.out.println("== Choose the shape ==");
        System.out.println("(1) Persegi");
        System.out.println("(2) Persegi Panjang");
        System.out.println("(3) Belah Ketupat");
        System.out.println("(4) Layang-layang");
        System.out.println("(5) Jajar Genjang");
        System.out.println("(6) Trapesium");
        System.out.println("(7) Lingkaran");
        System.out.println("(8) Segitiga");
        System.out.println("(9) Quit");
        op= input.nextInt();
        switch(op){
            case 1 : 
                persegi();
                break;
            case 2 :
                persegiPanjang();
                break;
            case 3 : 
                belahKetupat();
                break;
            case 4 : 
                layangLayang();
                break;
            case 5 : 
                jajarGenjang();
                break;
            case 6 : 
                trapesium();
                break;
            case 7 : 
                lingkaran();
                break;
            case 8 : 
                segitiga();
                break;
            case 9 : 
                System.exit(0);
                break;
            default :
                System.out.println("Invalid option");
                menu();
                break;
        }
    }
    
    public void persegi() {
        int sisi;
        System.out.println("== PERSEGI ==");
        System.out.println("Input sisi :");
        sisi = input.nextInt();
        
        luas = sisi*sisi;
        keliling = 4*sisi;
        
        System.out.println("Luas persegi : "+luas);
        System.out.println("Keliling persegi : "+keliling);
        System.out.println("Do you want to calculate another shape? (Y/N)");
        in = input.next();
        
        if(in.equalsIgnoreCase("Y"))
            menu();
        else
            System.exit(0);
    }
    
    public void persegiPanjang() {
        int pjg,lbr;
        System.out.println("== PERSEGI PANJANG ==");
        System.out.println("Input panjang : ");
        pjg = input.nextInt();
        System.out.println("Input lebar : ");
        lbr = input.nextInt();
        
        luas = pjg*lbr;
        keliling = 2*(pjg+lbr);
        
        System.out.println("Luas persegi panjang : "+luas);
        System.out.println("Keliling persegi panjang : "+keliling);
        System.out.println("Do you want to calculate another shape? (Y/N)");
        in = input.next();
        
        if(in.equalsIgnoreCase("Y"))
            menu();
        else
            System.exit(0);
    }
    
    public void belahKetupat() {
        int d1,d2,sisi;
        System.out.println("== BELAH KETUPAT ==");
        System.out.println("Input D1 : ");
        d1 = input.nextInt();
        System.out.println("Input D2 : ");
        d2 = input.nextInt();
        System.out.println("Input sisi : ");
        sisi = input.nextInt();
        
        luas = (d1*d2)/2;
        keliling = 4*sisi;
        
        System.out.println("Luas belah ketupat : "+luas);
        System.out.println("Keliling belah ketupat: "+keliling);
        System.out.println("Do you want to calculate another shape? (Y/N)");
        in = input.next();
        
        if(in.equalsIgnoreCase("Y"))
            menu();
        else
            System.exit(0);
    }
    
    public void layangLayang() {
        int d1,d2,sisi1,sisi2;
        System.out.println("== LAYANG-LAYANG ==");
        System.out.println("Input D1 : ");
        d1 = input.nextInt();
        System.out.println("Input D2 : ");
        d2 = input.nextInt();
        System.out.println("Input sisi miring 1 : ");
        sisi1 = input.nextInt();
        System.out.println("Input sisi miring 2 : ");
        sisi2 = input.nextInt();
        
        luas = (d1*d2)/2;
        keliling = (2*sisi1) + (2*sisi2);
        
        System.out.println("Luas layang-layang: "+luas);
        System.out.println("Keliling layang-layang : "+keliling);
        System.out.println("Do you want to calculate another shape? (Y/N)");
        in = input.next();
        
        if(in.equalsIgnoreCase("Y"))
            menu();
        else
            System.exit(0);
    }
    
    public void jajarGenjang() {
        int alas,tinggi,sisi;
        System.out.println("== JAJAR GENJANG ==");
        System.out.println("Input alas : ");
        alas = input.nextInt();
        System.out.println("Input tinggi : ");
        tinggi = input.nextInt();
        System.out.println("Input sisi : ");
        sisi = input.nextInt();
        
        luas = alas*tinggi;
        keliling = (2*alas)+(2*sisi);
        
        System.out.println("Luas jajar genjang : "+luas);
        System.out.println("Keliling jajar genjang : "+keliling);
        System.out.println("Do you want to calculate another shape? (Y/N)");
        in = input.next();
        
        if(in.equalsIgnoreCase("Y"))
            menu();
        else
            System.exit(0);
    }
    
    public void trapesium() {
        int sisiAtas,sisiBawah,sisiMiring,tinggi;
        System.out.println("== TRAPESIUM ==");
        System.out.println("Input sisi atas : ");
        sisiAtas = input.nextInt();
        System.out.println("Input sisi bawah : ");
        sisiBawah = input.nextInt();
        System.out.println("Input sisi miring : ");
        sisiMiring = input.nextInt();
        System.out.println("Input tinggi : ");
        tinggi = input.nextInt();
        
        luas = ((sisiAtas+sisiBawah)*tinggi)/2;
        keliling = sisiAtas+sisiBawah+(sisiMiring*2);
        
        System.out.println("Luas trapesium : "+luas);
        System.out.println("Keliling trapesium : "+keliling);
        System.out.println("Do you want to calculate another shape? (Y/N)");
        in = input.next();
        
        if(in.equalsIgnoreCase("Y"))
            menu();
        else
            System.exit(0);
    }
    
    public void lingkaran() {
        double jari,phi=3.14,luass,kel;
        System.out.println("== LINGKARAN ==");
        System.out.println("Input jari-jari : ");
        jari = input.nextInt();
        
        luass = phi*jari*jari;
        kel = 2*phi*jari;
        
        System.out.println("Luas lingkaran : "+luass);
        System.out.println("Keliling lingkaran : "+kel);
        System.out.println("Do you want to calculate another shape? (Y/N)");
        in = input.next();
        
        if(in.equalsIgnoreCase("Y"))
            menu();
        else
            System.exit(0);
    }
    
    public void segitiga() {
        int sisi1,sisi2,alas,tinggi;
        System.out.println("== SEGITIGA ==");
        System.out.println("Input sisi miring 1 : ");
        sisi1 = input.nextInt();
        System.out.println("Input sisi miring 2 : ");
        sisi2 = input.nextInt();
        System.out.println("Input alas : ");
        alas = input.nextInt();
        System.out.println("Input tinggi : ");
        tinggi = input.nextInt();
        
        luas = (alas*tinggi)/2;
        keliling = alas+sisi1+sisi2;
        
        System.out.println("Luas segitiga : "+luas);
        System.out.println("Keliling segitiga : "+keliling);
        System.out.println("Do you want to calculate another shape? (Y/N)");
        in = input.next();
        
        if(in.equalsIgnoreCase("Y"))
            menu();
        else
            System.exit(0);
    }
    
    public static void main(String[] args) {
        PlaneGeometryCalculator run = new PlaneGeometryCalculator();
        run.menu();
    }
    
}
