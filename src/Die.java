
public class Die {
    int num;

    public Die(){
        num = (int)(Math.random() * 6) + 1;
    }
    public void roll(){
        num = (int)(Math.random() * 6) + 1;
    }
}
