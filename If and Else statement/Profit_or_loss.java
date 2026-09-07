import java.util.Scanner;

public class Profit_or_loss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Cost price: ");
        float cp = input.nextInt();
        System.out.print("Enter Selling price: ");
        float sp = input.nextInt();
        float result = sp - cp;
        if(result>0){
            System.out.print("you made profit of: "+(result*100)/cp+"%");
        }else if(result <0){
            System.out.print("You made loss of: "+(result*100)/cp+"%");
        }else{
            System.out.print("you made No profit, No loss ");
        }
    }
}

