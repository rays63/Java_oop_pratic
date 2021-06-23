public class CountSer {
    public static void main(String[] args) {
        int i = 0;
        int a = 0;

        do{
           a = a + i;
           i++;
        }
        while(i<10);
        System.out.println("1+2+3+4+5+6+7+8+9 = "+ a);
    }
}
