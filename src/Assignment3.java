import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.Arrays;
public class Assignment3 {
    public static void main(String[] args) throws  IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter host");
        String ipAddress=sc.next();
       // System.out.println(ipAddress);
        System.out.println("Enter count");
        int count=sc.nextInt();
        sendPing(ipAddress,count);
    }
    public static void sendPing(String ipAddress,int count) throws IOException {
        long[] timeTaken= new long[count];
        while (count-- > 0) {
            long startTime = System.nanoTime();
            InetAddress ip= InetAddress.getByName(ipAddress);
            if (ip.isReachable(5000)) {
                long endTime = System.nanoTime();
                timeTaken[count] = endTime - startTime;
            } else {
                System.out.println("Host is unreachable");
                return;
            }
        }
        System.out.println("Host is reachable");
        int len=timeTaken.length;
        Arrays.sort(timeTaken);
        if (len% 2 == 0)
            System.out.println(timeTaken[len / 2]);
        else {
           long first=timeTaken[len/2];
            long second=timeTaken[len/2-1];
            System.out.println((first+second)/2);
        }
    }

}