
public class R632 {
    public static void main(String[] args){
        int travelnumber = (int) (1 + (Math.random() * 15));
        if (travelnumber >= 1 && travelnumber <= 10){
            System.out.println("Go to California");
        }
        if (travelnumber > 10 && travelnumber <= 13){
            System.out.println("Go to Nevada");
        }
        if (travelnumber > 13 && travelnumber <= 15){
            System.out.println("Go to Utah");
        }
    }
}
