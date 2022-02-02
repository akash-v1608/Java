package JavaAssignments.Assignment8;

public class Main {
    public static void main(String[] agrs)
    {
        try
        {
            Form form=new Form();
            form.fillForm("akash","akash","16-08-2000");
            System.out.println("form submitted succesfully");
        }
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
        finally {
            System.out.println("Inside Finally");
        }


    }
}
