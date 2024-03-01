package TransferStatement.Continue_statement;

public class Ques20 {
    public static void main(String[] args){
        System.out.println("before Loop");
        for(int i=0;i<10;i++)
        {
            if(i == 5)
            {
                System.out.println("Inside Loop, before continue");
                continue;
//                System.out.println("Inside Loop, After continue"); //there has a compilation error, unreachable statement.//
            }
        }
        System.out.println("After loop");
    }
}
