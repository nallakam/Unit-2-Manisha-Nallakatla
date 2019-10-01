import java.util.Random;

class PhoneNumber {
    public static void main(String[] args){

        Random rand = new Random();

        int digits1and4 = rand.nextInt(8)+2;
        int digit2 = rand.nextInt(9);
        int regDigits = rand.nextInt(9)+1;

        System.out.println("My phone number is: "+ digits1and4 + digit2 + regDigits + "-" + digits1and4 + regDigits + regDigits + "-" + regDigits + regDigits + regDigits + regDigits);
        
    }
}
