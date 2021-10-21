import java.util.Scanner;

class Inputan {

    float bb, tb;
    int max, min;

    Inputan(float bb, float tb) {
        this.bb = bb;
        this.tb = tb;
    }

    void show() {
        System.out.println("Berat badan = " + this.bb + " kg");
        System.out.println("Tinggi badan = " + this.tb + " cm");
    }

    public void berat(float a) {
        if ((a >= 18.5) && (a <= 22.9)) {
            System.out.println("Ideal");
        } else if (a > 22.9 ) {
            System.out.println("Overheight");
        } else {
            System.out.println("Underheight");
        }
    }
}

public class Soal2{
    public static void main(String[] args) {

        Inputan inputan1 = new Inputan(50,170);
        inputan1.show();
        inputan1.berat(50.0);
    }
}