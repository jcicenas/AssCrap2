import java.util.*;
public class Main {
    private Die d1 = new Die();
    private Die d2 = new Die();
    Scanner scan = new Scanner(System.in);
    private boolean sentinel = true, sentinel2 = true;
    private int initial;
    String tempString;
    public static void main(String[] args) throws Exception {
        Main m1 = new Main();
        System.out.println("Welcome to Craps Simulator");
        while (m1.sentinel2) {
            m1.d1.roll();
            m1.d2.roll();
            System.out.println("Die 1: " + m1.d1.num);
            System.out.println("Die 2: " + m1.d2.num);
            System.out.println("Sum " + (m1.d1.num + m1.d2.num));
            m1.wl(m1.d1.num + m1.d2.num);
            if((m1.initial) != 0){
                do{
                        m1.d1.roll();
                        m1.d2.roll();
                        System.out.println("Rerolling");
                        System.out.println("Die 1: " + m1.d1.num);
                        System.out.println("Die 2: " + m1.d2.num);
                        System.out.println("Sum " + (m1.d1.num + m1.d2.num));
                        
                        if((m1.d1.num + m1.d2.num) == m1.initial){
                            System.out.println("You Win");
                            m1.sentinel = false;
                            System.out.println("Continue Y/N\n");
                            m1.tempString = m1.scan.nextLine();
                                if(m1.tempString.equalsIgnoreCase("n")){
                                    m1.sentinel2 = false;
                                }
                        }else if((m1.d1.num + m1.d2.num) == 7){
                            System.out.println("You Lose");
                            m1.sentinel = false;
                            System.out.println("Continue Y/N\n");
                            m1.tempString = m1.scan.nextLine();
                                if(m1.tempString.equalsIgnoreCase("n")){
                                    m1.sentinel2 = false;
                                }
                        }
                        
                }while(m1.sentinel);
                m1.sentinel = true;
            }
        }
    }
    private void wl(int sum){
        HashMap<Integer, String> winloseMap = new HashMap<>();
        winloseMap.put(2, "Lose");
        winloseMap.put(3, "Lose");
        winloseMap.put(12, "Lose");
        winloseMap.put(7, "Win");
        winloseMap.put(11, "Win");
        if (winloseMap.containsKey(sum)) {
            System.out.println("You " + winloseMap.get(sum));
            System.out.println("Continue Y/N\n");
            tempString = scan.nextLine();
            if(tempString.equalsIgnoreCase("n")){
                sentinel2 = false;
            }
            
        }else{
            initial = sum;
        }
    }
}
