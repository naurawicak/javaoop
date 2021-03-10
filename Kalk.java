import java.util.Scanner;
/*
Nama : Naura Wicak Ibrahim
Nim  : A11.2018.11299
*/
class Kalkulator {
    int a,b ;
    Kalkulator (int a, int b){
        this.a=a;
        this.b=b;
    }
    int tambah() {return a + b ;}
    int kurang() {return a - b ;}
    int kali() {return a * b ;}
    int bagi() {return a / b ;}
    int modulus() {return a % b ;}
}
public class Kalk {
    public static void main(String args[]){
        Scanner sr=new Scanner(System.in);
        System.out.print("Masukkan a = ");
        int a=sr.nextInt();
        System.out.print("Masukkan b = ");
        int b=sr.nextInt();
        System.out.print("pilih perintah (+,-,*,/,%) : ");
        String op=sr.next();
        int c=0;
        Kalkulator obj=new Kalkulator(a,b);
        switch (op) {
            case "+" : c=obj.tambah(); break ;
            case "-" : c=obj.kurang(); break ;
            case "*" : c=obj.kali(); break ;
            case "/" : c=obj.bagi(); break ;
            case "%" : c=obj.modulus(); break ;
            default: System.out.println("salah aksi !!!");
        }
        System.out.println(a + op + b + "=" + c);
    }
}