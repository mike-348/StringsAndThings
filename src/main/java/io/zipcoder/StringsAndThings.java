package io.zipcoder;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){
        int count = 0;
        String str = input;
        String parts[] = str.split(" ");
        for(String part : parts) {
            if (str.charAt(str.length()-1) == 'z') {
                count++;
            }
            else if ((str.charAt(str.length()-1) == 'y')) {
                count++;
            }
            else return count;
        }
        return count;
    }; //passed
        // attempt without using arrays
        //        int count = 0;
//        for (int i = 0; i < input.length() - 1; i++){
//            if ((input.charAt(i) == 'y' || input.charAt(i) == 'z')) {
//                count++;
//            }
//            if (input.charAt(input.length() - 1) == 'y') {
//                count++;
//            }
//            else if (input.charAt(input.length() - 1) == 'z') {
//                count++;
//            }
//            else return count;
//        }
//        return count;


    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){
        String result = base.replace(remove, "");
        return result;
    }; //passed

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        int countIs = 0;
        int countNot = 0;
        int len = input.length();
        for (int i = 0; i < len-1; i++) {
            if ((input.charAt(i) == 'i') && (input.charAt(i+1) == 's')) {
                countIs++;
            }
            else if ((input.charAt(i) == 'n') && (input.charAt(i+1) == 'o') && (input.charAt(i+2) == 't')) {
                countNot++;
            }
        }
        System.out.print("# of is: " + countIs);
        System.out.print("# of not: " + countNot);
        return (countIs == countNot);
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {
        boolean happy = false;
        for (int i = 0; i < input.length()-1; i++) {
            if ((input.charAt(i) == 'g') && (input.charAt(i + 1) == 'g')) {
                happy = true;
                break;
            }
        }
        return happy;
    } //passed


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        int count = 0;
        for (int i = 0; i < input.length()-1; i++) {
            if (input.charAt(i) == (input.charAt(i + 1)) && input.charAt(i) == input.charAt(i + 2)) {
                count++;
            }
        }
        return count;
    }
}
