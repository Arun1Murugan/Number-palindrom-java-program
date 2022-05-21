public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        if(isPalindrome(121)){
            System.out.println("it is a palindrome");
            System.out.println(1 % 121);
        }else{
            System.out.println("it is not a palindrome");
        }
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int temporaryNumber=number;
        while (number!=0){
            reverse = reverse * 10 + number % 10;
            /*System.out.println("r"+reverse); 1st iteration --> 0*10 + 121 % 10 (i.e 1) = 1.
                                                   2nd iteration --> 1*10 + 12 % 10(i.e 2) = 12.
                                                   3rd ieration --> 12*10 = 1 % 10(i.e 1) = 1.*/
            number = number / 10;
            /*System.out.println("l"+number); remove the lst digit. 1st iteration --> 121 / 10 = 12.
                                    2nd iteration --> 12 / 10 = 1.
                                    3rd iteration --> 1/10 = 0,
                                    loop terminates because of number is 0.*/
        }
        if(reverse == temporaryNumber){
            return true;
        }else{
            return false;
        }
    }
}