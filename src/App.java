
import java.io.*;
public class App {
    public static void main(String[] args) throws Exception {
        //help my to see resolt on the console
        System.out.println();
        System.out.println();
        System.out.println();

        Flag flag = FlagFactory.flagFactory("Israel");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int height=30,width=30;
        boolean again=false;
        do{
            try{
                System.out.println("Please enter height:");
                height =Integer.parseInt( reader.readLine());
                System.out.println("Please enter width:");
                width =Integer.parseInt( reader.readLine());
                again=false;
            }catch(NumberFormatException e){
                System.out.println("only numbers!");
                again=true;
            }

        }while(again);
        
        char [][] myFlag=flag.getFlag(height, width);
        
        //help my to see resolt on the console
        System.out.println();
        System.out.println();
        System.out.println();
            for (char[] cs2 : myFlag) {
                System.out.println(cs2);
            }
 
    }
}
