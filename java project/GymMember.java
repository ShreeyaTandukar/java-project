

//CREATING ABSTRACT CLASS
public abstract class  GymMember
{   
    
    //INSTANCE VARIABLE DECLARATION WITH PROTECTED ACCESS MODIFIER
    protected int id;
    protected String name;
    protected String location;
    protected String phone;
    protected String email;
    protected String gender;
    protected String DOB;
    protected String membershipStartDate;
    protected int attendance;
    protected double loyaltyPoints;
    protected boolean activeStatus;
    
    
    
    //CONSTRUCTION OF CONTRUCTOR WITH PARAMETER
    public GymMember(int id, String name,String location,String phone,String email,String gender,String DOB,String membershipStartDate)
    {
        
        
        //CALLING INSTANCE VARIABLES
        this.id=id;
        this.name=name;
        this.location=location;
        this.phone=phone;
        this.email=email;
        this.gender=gender;
        this.DOB=DOB;
        this.membershipStartDate=membershipStartDate;
        this.attendance=0;
        this.loyaltyPoints=0;
        this.activeStatus=false;
    }
    
    
    //ACCESSOR METHOD
    public int getId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public String getLocation()
    {
        return this.location;
    }
    public String getPhone()
    {
        return this.phone;
    }
    public String getEmail()
    {
        return this.email;
    }
    public String getGender()
    {
        return this.gender;
    }
    public String getDOB()
    {
        return this.DOB;
    }
    public String getMembershipStartDate()
    {
        return this.membershipStartDate;
    }
    public int getAttendance()
    {
        return this.attendance;
    }
    public double getLoyaltyPoints()
    {
        return this.loyaltyPoints;
    }
    public boolean getActiveStatus()
    {
        return this.activeStatus;
    }
    
    
    //ABSTRACT METHOD
    public abstract void markAttendance();
    
    
    //CREATING METHOD NAMED activeMembership
    public void activeMembership()
    {
        this.activeStatus=true;
    }
    
    
    //CREATING METHOD NAMED deactivateMembership
    public void deactivateMembership()
    {
        if(this.activeStatus==true)
        {
            this.activeStatus=false;
            System.out.println("it has been deactivated");
        }
        else
        {
            System.out.println("it is not active");
        }
    }
    
    
    //CREATING METHOD NAMED resetMember FOR SETTING VALUE INTO DEFAULT 
    public void resetMember()
    {
        
        
        //CALLING INSTANCE VARIABLES
        this.activeStatus=false;
        this.attendance=0;
        this.loyaltyPoints=0;
    }
    
    
    //METHOD FOR DISPLAYING THE VALUES
    public void display()
    {
        System.out.println("ID: "+ id);
        System.out.println("Name: "+ name);
        System.out.println("location: "+ location);
        System.out.println("Phone: "+ phone);
        System.out.println("Email: "+ email);
        System.out.println("Gender: "+ gender);
        System.out.println("DOB: "+ DOB);
        System.out.println("Membership Start Date: "+ membershipStartDate);
        System.out.println("Attendance: "+ attendance);
        System.out.println("Loyalty Points: "+ loyaltyPoints);
        System.out.println("Active Status: "+ activeStatus);
        
    }
}
