

//CREATING CLASS AND EXTENDING (INHERITS VARIABLES AND METHODS) FROM SUPER CLASS
public class PremiumMember extends GymMember
{
    
    
    //INSTANCE VARIABLE WITH PRIVATE ACCESS MODIFIER
    private final double premiumCharge=50000;  //using final keyword for constant value
    private String personalTrainer;
    private boolean isFullPayment;
    private double paidAmount;
    private double discountAmount;
    
    
    //CONSTRUCTING CONSTRCTOR WITH PARAMATER
    public PremiumMember(int id,String name,String location,String phone,String email,String gender,String DOB,String membershipStartDate,String personalTrainer)
    {
        super(id,name,location,phone,email,gender,DOB,membershipStartDate);
        this.personalTrainer=personalTrainer;
        this.isFullPayment=false;
        this.paidAmount=paidAmount;
        this.discountAmount=0;
    }
    
    
    //ACCESSOR METHOD
    public double getPremiumCharge()
    {
        return this.premiumCharge;
    }
    public String getPersonalTrainer()
    {
        return this.personalTrainer;
    }
    public boolean getIsFullPayment()
    {
        return this.isFullPayment;
    }
    public double getPaidAmount()
    {
        return this.paidAmount;
    }
    public double getDiscountAmount()
    {
        return this.discountAmount;
    }
    
    
    
    //CREATING METHOD WITH STRING RETURN TYPE AND paidAmount,remainingAmount WITH PARAMETER
    public String payDueAmount( double paidAmount)
    {
        this.paidAmount=paidAmount; // for saving the paid amount
        if(this.paidAmount==this.premiumCharge)
        {
            this.isFullPayment=true;
            calculateDiscount();
            this.paidAmount=paidAmount-discountAmount;
            System.out.println("Payment sucessfully completed");
        }
        else if(this.paidAmount > this.premiumCharge)
        {
           System.out.println("The amount is more than charge"); 
        }
        else if(this.paidAmount< this.premiumCharge)
        {
            this.isFullPayment=false; //not full payment
            System.out.println("Payment is remainning");
        }
        else
        {
            System.out.println("Payment not done");
        }
        double remainingAmount=premiumCharge - paidAmount;  //for calculating remaining amount if amount is not paid fully
        return "Payment done sucessfully. Remaining amount: "+remainingAmount;
    }
    
    
    //creating method for calculating discount amount 
    public void calculateDiscount()
    {
        if(this.paidAmount>= this.premiumCharge)
        {
            this.discountAmount=0.1 * premiumCharge;
            this.isFullPayment=true;
        }
        else
        {
            this.discountAmount=0;
            this.isFullPayment=false;
            System.out.println("Discount is not given");
        }

    }
    
    
    //CREATING METHOD NAMED revertPremiumMember FOR SETTING VALUE INTO DEFAULT
    public void revertPremiumMember()
    {
        super.resetMember();
        this.personalTrainer="";
        this.isFullPayment=false;
        this.paidAmount=0;
        this.discountAmount=0;
    }
    
    
    //OVERRIDING ABSTRACT METHOD TO MODIFY THE METHOD FROM SUPER CLASS
    @Override
    public void markAttendance()
    {
        if(activeStatus=true)
        {
            this.attendance +=1;
            this.loyaltyPoints +=10;
        }
        else
        {
            System.out.println("The Membership Is Not Active");
        }
    }
    
    
    //overriding the method from super class
    @Override
    public void display()
    {
        
        
        //calling method from super class
        super.display();
        System.out.println("Personal Trainer: "+personalTrainer);
        System.out.println("Paid Amount: "+paidAmount);
        System.out.println("Is Full Payment: "+isFullPayment);
        System.out.println("Discount Amount: "+discountAmount);
    }
}
