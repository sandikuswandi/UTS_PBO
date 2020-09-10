
package sandik_uts;

public class SandiK_UTS {

       public static void main(String[] args) {
        String chara = "ABCDEFGHIJKLMNOPQRSTUVWXYZ-# ";
        char[] word = {
            chara.charAt(18),chara.charAt(0),chara.charAt(13),chara.charAt(3),chara.charAt(8),chara.charAt(28),
            chara.charAt(10),chara.charAt(20),chara.charAt(18),chara.charAt(22),chara.charAt(0),chara.charAt(13),chara.charAt(3),chara.charAt(8) 
        };
    
        for (int i = 0; i < word.length; i++) {
            System.out.print(word[i]);
          
        }
        System.out.println();
    }
   
}
