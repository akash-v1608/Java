package JavaAssignments.Assigment6;

class Assignment6
{
    public static void main(String[] args)
    {
        int count=0,number=11;
        while(count<100)
        {
            int len=String.valueOf(number).length();
            if(len%2!=0) {
                number++;
                continue;
            }
                int[] dp=new int[10];
                int numbercopy=number;
                while(numbercopy>0)
                {
                    int rem=(numbercopy)%10;
                    dp[rem]++;
                    numbercopy=numbercopy/10;

                }
                /*
                    if the number is 6 digit then x will be 3 digit and y will be 3 digit
                    so factors are of size three, so it is ideal to check only 3 digit numbers.
                    3 digit numbers begin with 100  to  999
                */
                int start=(int)Math.pow(10,(len/2)-1);
                int end=(int)Math.pow(10,len/2);
                for(int first=start;first<end;first++)
                {
                     int second;
                     if(number%first==0)
                     {
                         second=number/first;
                     }
                     else
                         continue;
                     if(first%10==0 && second%10==0)
                         continue;
                     String result=String.valueOf(first)+String.valueOf(second);
                     int[] dpt=new int[10];
                     for(Character ch:result.toCharArray())
                     {
                         int x=Character.getNumericValue(ch);
                         dpt[x]++;
                     }
                     int index=0;
                     for(;index<10;index++)
                     {
                         if(dpt[index]!=dp[index])
                             break;
                     }
                     if(index==10)
                     {
                         count++;
                         System.out.println("Vampire Number "+count+" is " + number +" Factors: "+first+" "+second);
                         break;
                     }
                }
                number++;
        }
    }
}