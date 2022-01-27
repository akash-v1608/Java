package JavaAssignments.Assignment8;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.*;
public class Form  {
    public void fillForm(String userName,String passWord,String dob) throws NameException, EmptyFieldException, DobException, ParseException {

            Pattern pattern=Pattern.compile("[A-Za-z0-9]+");
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yyyy");
            Date dateOfBirth=simpleDateFormat.parse(dob);
            Date limit=simpleDateFormat.parse("01-01-2000");
            Matcher matcher= pattern.matcher(userName);
                if(!matcher.matches())
                throw new NameException("invalid name");
                else if(passWord.isEmpty())
                    throw new EmptyFieldException("Entered text is empty!");
                else if(dateOfBirth.after(limit))
                    throw new DobException("Your age is not eligible");
        }

}
