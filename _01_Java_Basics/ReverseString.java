package _01_Java_Basics;

public class ReverseString { 
        public  void reverse(char[] s) {
                int left = 0;
                int right = s.length - 1;
                while(left < right) {
                    char tmp = s[left];
                    s[left] = s[right];
                    s[right] = tmp;
                    
                left++;
                right--;
            }
        }

        public static void main(String[] args) {
            String s = "Ana are mere";
            ReverseString reverser = new ReverseString(); 
            char[] charArray = s.toCharArray();
            reverser.reverse(charArray); 
            System.out.println(new String(charArray)); 
        }
}