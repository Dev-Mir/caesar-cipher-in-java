import java.util.Scanner;

public class CaesarCipher{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        System.out.println("1. Encryption");
        System.out.println("2. Decryption\n");
        int ans = scanner.nextInt();
        String text = "";

        if(ans == 1){

            System.out.println("Enter you text");
            text = scanner.next();
            
            System.out.println("Enter number(key) of right shift ");
            int no_of_shift = scanner.nextInt();

            char [] ch = text.toCharArray();

            for(char c : ch){

                int asci = c;
                asci += no_of_shift;
                char p = (char) asci;
                System.out.print(p+"");
            }    }

        if(ans == 2){

            System.out.println("Enter encrypted text");
            text = scanner.next();
           
            for(int key=1; key<26; key++){

                String str = "";

                text = text.toLowerCase();
                    for(int i=0; i<text.length(); i++){
                        char c =  text.charAt(i);
                        if("abcdefghijklmnopqrstuvwxyz".contains(""+c)){
                            int n = c-'a';
                            n = (n + key)%26;
                            n = n + 'a';
                            c = (char)n;
                        }
                        str += c;
                    }
                    System.out.println(str);
            }}}}