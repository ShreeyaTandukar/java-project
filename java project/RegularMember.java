

//CREATING CLASS AND EXTENDING (INHERITS VARIABLES AND METHODS) FROM SUPER CLASS
public class RegularMember extends GymMember
{
    
    
    //INSTANCE VARIABLE WITH PRIVATE ACCESS MODIFIER
    private final int attendanceLimit=30;//using final keyword for constant value
    private boolean isEligibleForUpgrade;
    private String removalReason;
    private String referralSource;
    private String plan;
    private double price;
    
    
    //CONSTRUCTING CONSTRCTOR WITH PARAMATER
    public RegularMember(int id, String name,String location,String phone, String email,String gender,String DOB,String membershipStartDate,String referralSource)
    {
        
        
        //CALLING SUPER CLASS(GymMember) method with parameter
        super( id,name,location,phone,email,gender,DOB,membershipStartDate);
        
        
        //CALLING INSTANCE VARIABLES
        this.isEligibleForUpgrade=false;
        this.price=6500;
        this.removalReason="";
        this.referralSource=referralSource;
        this.plan="Basic";
    }
    
    
    //ACCESSOR METHOD
    public int getAttendance()
    {
        return this.attendance;
    }
    public boolean getIsEligibleForUpgrade()
    {
        return this.isEligibleForUpgrade;
    }
    public String getRemovalReason()
    {
        return this.removalReason;
    }
    public String getReferralSource()
    {
        return this.referralSource;
    }
    public String getPlan()
    {
        return this.plan;
    }
    public double getPrice()
    {
        return this.price;
    }
    
    
    //OVERRIDING ABSTRACT METHOD TO MODIFY THE METHOD FROM SUPER CLASS
    @Override
    public void markAttendance()
    {
         if(activeStatus==true)
         {
             this.attendance++;
             this.loyaltyPoints +=5;
         }
         else
        {
            System.out.println("The Membership Is Not Active");
        }
    }
    
    
    //CREATING METHOD WITH DOUBLE RETURN TYPE AND STRING PLAN WITH PARAMETER
    public double getPlanPrice(String plan)
    {
        
        
        //USING SWITCH CASE
        switch(plan)
        {
            case "Basic":
                this.plan="Basic";
                this.price=6500;
                break;
            case "Standard":
                    this.plan="Standard";
                    this.price=12500;
                    break;
            case "Deluxe":
                 this.plan="Deluxe";
                 this.price=18500;
                 break;
            default:
            System.out.println("This plan is not valid");
            return -1;  //RETURNING -1 WHEN PLAN IS NOT VALID    
        }
        return this.price;
    }
    public String upgradePlan(String plan)
    {
        if(this.attendance >= attendanceLimit)
        {
            this.isEligibleForUpgrade=true;
            System.out.println("The member is eliglible for upgrade.So, plan and price is upgraded");
            if(this.plan.equals("Basic"))
            {
                this.plan="Standard";
                this.price=12500;
                System.out.println("Plan is upgraded to standard");
            }
            else if(this.plan.equals("Standard"))
            {
                this.plan="Deluxe";
                this.price=18500;
                System.out.println("plan is upgraded to deluxe");
            }
            else if(this.plan.equals("Deluxe"))
            {
                System.out.println("Your plan is already deluxe");
            }
        }
        else
        {
            System.out.println("The member is not eliglible for upgrade");
            this.isEligibleForUpgrade= false;
        }
        return this.plan;
    }
    
    
    //CREATING METHOD NAMED revertRegularMember FOR SETTING VALUE INTO DEFAULT
    public String revertRegularMember(String removalReason)
    {
        super.resetMember();
        this.isEligibleForUpgrade=false;
        this.plan="Basic";
        this.price=6500;
        this.removalReason=removalReason;
        this.referralSource="";
        return removalReason;
    }
    
    
    //overriding the method from super class
    @Override
    public void display()
    {
        
        
        //calling method from super class
        super.display();
        System.out.println("Plan: "+plan);
        System.out.println("Price: "+price);
        
        
        //using if condition
        if(!removalReason.isEmpty())
        {
            System.out.println("Mentioned reason: "+removalReason);
        }
    }
}
