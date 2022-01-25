package JavaAssignments;
import java.util.*;
import java.text.*;

public class Assignment4 {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input size: ");
        int testcases=sc.nextInt();
        while(testcases-- > 0)
        {
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yyyy");
            System.out.println("Enter start date: ");
            Date registrationDate=simpleDateFormat.parse(sc.next());
            System.out.println("Enter end date: ");
            Date kycDate=simpleDateFormat.parse(sc.next());
            displayValidRange(registrationDate,kycDate);
        }
    }

    static void displayValidRange(Date registrationDate,Date kycDate)
    {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yyyy");
        if(registrationDate.after(kycDate))
        {
            System.out.println("INVALID DATES");
            return;
        }

        Calendar calendar=Calendar.getInstance();
        calendar.setTime(kycDate);
        int kycYear= calendar.getWeekYear();
        calendar.setTime(registrationDate);
        int temp=calendar.getWeekYear();
        calendar.add(calendar.YEAR,kycYear-temp);
        calendar.add(calendar.DATE,-30);
        String startDate=simpleDateFormat.format(calendar.getTime());
        calendar.add(calendar.DATE,60);
        String endDate;
        if(calendar.getTime().after(kycDate))
        {
            endDate=simpleDateFormat.format(kycDate);
        }
        else
            endDate=simpleDateFormat.format(calendar.getTime());

        System.out.println("Valid dates to fill kyc "+ startDate+" "+endDate);
    }
}
