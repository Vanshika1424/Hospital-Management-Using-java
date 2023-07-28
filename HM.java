import java.util.*;
class signUp
{
    String fname,lname,id,pass,gender;
    int Age,Dob;
    long Contact;

    public void BasicDetails()
        {
        Scanner in = new Scanner(System.in);
        System.out.println("-----------------Basic Details----------------------");
        System.out.print("FirstName: ");
        fname = in.nextLine();
        System.out.print("lastName: ");
        lname = in.nextLine();
        System.out.print("loginId: ");
        id = in.nextLine();
        System.out.print("Password: ");
        pass = in.nextLine();
        System.out.print("Gender: ");
        gender = in.nextLine();
        System.out.print("Age: ");
        Age = in.nextInt();
        System.out.print("Contact Number : ");
        Contact=in.nextLong();
        System.out.print("DateOfBirth(DD/MM/YYYY): ");
        Dob=in.nextInt();
        }
        public void doc_Pat_Display()
        {
        System.out.println("-----------------Patient's Detail----------------------");
        System.out.println("First Name: \t    Last Name: ");
        System.out.println(fname +"\t\t    "+lname);
        System.out.println("---------------------------------------------------");
        System.out.println("Login ID: \t    PASSWORD: ");
        System.out.println(id+"\t\t    "+pass);

        }
}
class loginModule 
{
    public String userName;
    public String Password;
    public void LM()
    {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("-------------Login Module--------------");
            System.out.println("UserName: ");
            userName=in.nextLine();
            System.out.println("Password: ");
            Password=in.nextLine();

        }
    }
}

class newPatientDetails extends signUp
{
    String ms,c,issue;
    public void details()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Material Status: ");
        ms=in.nextLine();
        System.out.println("City: ");
        c=in.nextLine();
        System.out.println("Issue: ");
        issue=in.nextLine(); 

    }
    public void displayMore()
    {
        // System.out.println("Material Status: \tCity: \t\tIssue: ");
        // System.out.println("\t\t"+ms+"\t\t"+c+"\t\t"+issue);
    }
}

class newDoctorDetails extends signUp
{

    public void Details()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("joining Date: ");
        int DOJ = in.nextInt();
        System.out.print("Qualifications: ");
        String qualification = in.next();
        System.out.print("Specialization: ");
        String Specialization = in.next();
    }

}



public class HM
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        loginModule lm=new loginModule();
        signUp sp=new signUp();
        newDoctorDetails ndd=new newDoctorDetails();
        newPatientDetails npd=new newPatientDetails();
        String user,show,show1,choices;
        System.out.println("Enter P for Patient and D for Doctor");
        char type=in.next().charAt(0);
        if(type=='P'||type=='p')
        {
            System.out.println("Enter New for new user and Old for old user");
            user=in.next();
            if(user.equalsIgnoreCase("New"))
            {
                npd.BasicDetails();
                npd.details();
                // npd.doc_Pat_Display();
                System.out.println("Book an Appointment");
                choices=in.next();

                // if(choices.equals(""))

            }
            if(user.equalsIgnoreCase("Old"))
            {
                lm.LM();
                //appointments

            }
        }
        if(type=='D'||type=='d')
        {
            System.out.println("Enter New for new user and Old for old user");
            user=in.next();
            if(user.equalsIgnoreCase("New"))
            {
                ndd.BasicDetails();
                ndd.Details();
                System.out.print("want to check patient's details : ");
                show=in.next();
                if(show.equalsIgnoreCase("YES"))
                {
                    npd.doc_Pat_Display();
                }
                // npd.displayMore();
            }
            if(user.equalsIgnoreCase("Old"))
            {
                lm.LM();
                System.out.println("want to check patient's details : ");
                show1=in.nextLine();//not accepting input it is directly jumping to last print statement
                if(show1.equalsIgnoreCase("YES"))
                {
                npd.doc_Pat_Display();
                }
                System.out.println("I don't have System to store the previous data");
                // npd.displayMore();
            }
        }
    }
}





