import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Encoder-Decoder game!");
        System.out.println("1.Encode a String");
        System.out.println("2.Decode a String");
        System.out.println("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter a String: ");
        String str = scanner.nextLine();
        if (choice == 1) {
            String encodedString = encode(str, 0);
            System.out.print("EncodedString: " + encodedString);
        } else if(choice == 2){
            String decodedString = decode(str, 0);
            System.out.print("DecodedString: " + decodedString);
        }
        else{
            System.out.println("Invalid Choice");
        }
        scanner.close();
    }
    public static String encode(String str, int index){
        //base case
        if (index==str.length()){
            return "";
        }
        char ch = str.charAt(index);
        char encoder = atbash(ch);
        //recursive case
        return encoder + encode(str,index+1);
    }
    public static String decode(String str, int index){
        //base case
        if (index==str.length()){
            return "";
        }
        char ch = str.charAt(index);
        char decoder = atbash(ch);
        //recursive case
        return decoder + decode(str,index+1);
    }
    public static char atbash(char ch){
        if(ch >= 'a' && ch <= 'z'){
            return (char) ('z'-(ch-'a'));//formula based on ascii table//It'll be in int so needs to be converted to char
        }else if(ch >= 'A' && ch <= 'Z'){
            return (char) ('Z'-(ch-'A'));//formula based on ascii table
        }
        else {
            return ch;
        }
    }
}

