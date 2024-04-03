class PalindromeNumber extends Thread {
    private int num;

    public PalindromeNumber(int num) {
        this.num = num;
    }

    public void run() {
        int originalNum = num;
        int rev = 0;

        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        if (originalNum == rev) {
            System.out.println("Number is a palindrome.");
        } else {
            System.out.println("Number is not a palindrome.");
        }
    }
}

class PalindromeString extends Thread {
    private String str;

    public PalindromeString(String str) {
        this.str = str;
    }

    public void run() {
        int length = str.length();
        boolean isPalindrome = true;

        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("String is a palindrome.");
        } else {
            System.out.println("String is not a palindrome.");
        }
    }
}

public class Palindrome {
    public static void main(String[] args) {
        int num = 121;  
        String str = "radar";  

        PalindromeNumber numThread = new PalindromeNumber(num);
        PalindromeString strThread = new PalindromeString(str);

        numThread.start();
        strThread.start();
    }
}