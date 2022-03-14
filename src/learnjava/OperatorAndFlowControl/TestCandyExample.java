package learnjava.OperatorAndFlowControl;

public class TestCandyExample {

    public static void main(String[] args) {
        int [] ad=new int[5];
        ad[0]=12;
        ad[1]=92;
        ad[2]=29;
        ad[3]=35;
        ad[4]=2;

        int LengthOfCanddy=ad.length;
        for (int i=0;i<LengthOfCanddy-1;i++)
        {
            for (int j =0;j<LengthOfCanddy-i-1;j++)
            {
                if (ad[j]>ad[j+1])
                {
                    int tem=ad[j];
                    ad[j]=ad[i+1];
                    ad[j+1]=tem;
                }

            }
            System.out.println(ad[i]);
        }

    }
}
