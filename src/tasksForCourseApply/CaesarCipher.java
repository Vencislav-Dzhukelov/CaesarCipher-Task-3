/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tasksForCourseApply;

/**
 *
 * @author Darkstar
 */
public class CaesarCipher {

    public static String caesar_encrypt(String str, int n) {
        char[] ciphertext;
        ciphertext = str.toCharArray();

        for (int i = 0; i < ciphertext.length; i++) {
            if (Character.isUpperCase(ciphertext[i])) {
                ciphertext[i] = (char) ((ciphertext[i] + n - 'A') % 26 + 'A');
            } else {
                ciphertext[i] = (char) ((ciphertext[i] + n - 'a') % 26 + 'a');
            }

        }

        str = String.valueOf(ciphertext);
        return str;
    }

    public static void main(String[] args) {

        System.out.println(caesar_encrypt("abc", 1));

        System.out.println(caesar_encrypt("abc", 2));

        System.out.println(caesar_encrypt("ABC", 1));

        System.out.println(caesar_encrypt("aaa", 7));

        System.out.println(caesar_encrypt("xyz", 1));

    }
}
