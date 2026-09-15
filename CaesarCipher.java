import java.util.Scanner;

public class CaesarCipher {

    // Encrypt method
    static String encrypt(String label, int shift) {
        StringBuilder result = new StringBuilder();

        for (char c : label.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append((char) ((c - 'A' + shift) % 26 + 'A'));
            } 
            else if (Character.isLowerCase(c)) {
                result.append((char) ((c - 'a' + shift) % 26 + 'a'));
            } 
            else {
                result.append(c);
            }
        }
        return result.toString();
    }

    // Decrypt method
    static String decrypt(String encrypted, int shift) {
        return encrypt(encrypted, 26 - shift);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter shipping label: ");
        String label = sc.nextLine();

        System.out.print("Enter shift value (1-25): ");
        int shift = sc.nextInt();

        if (shift < 1 || shift > 25) {
            System.out.println("Invalid shift value!");
            return;
        }

        String encrypted = encrypt(label, shift);
        String decrypted = decrypt(encrypted, shift);

        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}
