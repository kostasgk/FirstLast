public class Main {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(257) );
        System.out.println(sumFirstAndLastDigit(7647654));
    }

    public static int sumFirstAndLastDigit(int number) {
        int number_r = number;

        if(number<0){
            return -1;
        } else {
            int lastdigit =0 , firstdigit=0,count=0;
            lastdigit = number%10;
            while(number_r>0){
                number_r /= 10;
                count++;
            }

            firstdigit= (int)(number/(Math.pow(10,count-1)));
            return firstdigit+lastdigit ;
        }

    }

}

