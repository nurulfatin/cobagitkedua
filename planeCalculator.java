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

	public static void main(String[] args) {
        PlaneGeometryCalculator run = new PlaneGeometryCalculator();
        run.menu();
    	}
}