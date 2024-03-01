package TransferStatement.Continue_statement;

public class Ques20_1 {
    public static void main(String[] args){

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(j==2)
                    continue;

                System.out.println(i+" "+j);
            }
        }

    }
}
