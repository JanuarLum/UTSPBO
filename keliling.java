public class keliling extends Lingkaran{
    
    float r;
    
    float luas(){
        float luas = (float) (22 / 7 * r * r);
        float kling = (float) (2 * 22 / 7 * r);
        System.out.println("Luas lingkaran: " + luas);
        System.out.println("Keliling Lingkaran: " + kling);
        return luas;
    }
}