package com.sparta.jk;

public class Main {
    public static void main(String[] args) {
        PalindromeChecker palindromeCheck = new PalindromeChecker();
        System.out.println(palindromeCheck.checkForPalindrome("Tattarrattat")); //prints out whether input is a palindrome using checkForPalindrome method
        System.out.println(palindromeCheck.checkForPalindrome2("Tattarrattat")); //prints out whether input is a palindrome using checkForPalindrome2 method
    }
}
