import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Image;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.util.Date;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

//importing the aaraylist package
import java.util.ArrayList;
public class GymGUI implements ActionListener
{
    private JFrame frame,frame1,frame2,frame3,frame4,frame5,frame6,frame7,frame8,frame9,frame10,
            frame11,frame12,frame13 ,frame14,frame15,frame16,frame17,frame18,frame19;
            
    private JPanel panel,greypanel,greypanel1,panel4,panel5,panel6,panel7,panel8,panel9,
            panel10,panel11,picture,picture1,panel12,panel13,panel14,panel15,panel16;
            
    private ImageIcon image,image1,image3,image2,image4,image5,image6,image7,image8,image9,image10,image11,
            image12,image14,image15,image16,image17,image18,image19,r_image,r_image1,r_image2,r_image3,r_image4,
            r_image5,r_image6,r_image7,r_image8,r_image9,r_image10,r_image11,r_image12,image20,r_image13;
            
    private JLabel imagee1,user,password,imagee,text,text1,id,name,radio,date,location,member,
            phone,email,plan,amount,loyalty,source,reason,text2,text3,id1,name1,radio1,date1,
            location1,member1,phone1,email1,plan3,amount1,loyalty1,source3,trainer,id2,imagee2,
            plan6,imagee3,id3,imagee4,plan7,price3,imagee5,plan8,price4,imagee6,plan9,price5,
            imagee7,type1,price6,imagee8,imagee9,id4,id5,imagee10,imagee11,id6,id7,discount,
            type2,id8,imagee12,date7,type3,imagee13;
            
    private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t16,textf,textf1,textf2,
            textf3,textf5,textf6,textf7,textf8,textf9,textf10,textf11,textf12,textf14,textf15,textf16,
            textf17,textf18,textf19,t14,t15,t17;
            
    private JPasswordField p1;
    
    private JButton lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,b1,b2,b10,b4,b5,b6,b7,lb10,lb11,b9,b8,b11,b12,b13,b14,lb12;
    
    private JMenuBar menubar;
    
    private JMenu type,attendance,regular2,price,status,detail,revert,memberdetails;
    
    private JMenuItem regular,premium,regular1,premium1,regular3,regular4,premium2,premium3,premium4,basic,standard,deluxe,revertItem,detailss;
    
    private JRadioButton male,male1,female,female1;
    
    private ButtonGroup gender,gender1;
    
    private JComboBox<String> plan2,plan5,source2,source5;
    private JComboBox<Integer>trainer2,p2,p3,p4;
    private JComboBox<Date>date2,date6,date3,date8;
    private JComboBox<String> month1,month3,t,month5,month7;
    private JComboBox<Integer> year1,year2,year4,year6;
    
    private JTextArea area;
    
    
    ArrayList<GymMember>Gym=new ArrayList<GymMember>();
    
    
    public GymGUI()
    {
        frame=new JFrame();//to create frame for login page
        frame.setTitle("Zenith Fitness (Login)");//to set title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to close the frame
        frame.setResizable(false);//to make frame not resizeable
        frame.setSize(350,350);//to set the size of the frame from width and height
        frame.setLayout(null);//setting layout to null
        frame.setLocationRelativeTo(null);//Center the frame
        
        
        //set icon for the frame
        image=new ImageIcon("C:\\Users\\Acer\\Desktop\\24046889ShreeyaTandukar\\images\\logo.jpg");
        frame.setIconImage(image.getImage());//change default picture of bluej to given image
        
        //creating panel for adding components in frame
        panel=new JPanel();
        panel.setLayout(null);
        
        //adding background image in panel
        image3=new ImageIcon("C:\\Users\\Acer\\Desktop\\24046889ShreeyaTandukar\\images\\1677380402876.jpg");
        Image imgg1=image3.getImage().getScaledInstance(350, 350, Image.SCALE_SMOOTH);//For fitting image in panel size
        r_image1=new ImageIcon(imgg1);//creating new ImageIcon from the scaled image
        imagee1=new JLabel(r_image1);//creating JLabel to display image
        imagee1.setBounds(0,0,350,350);//setting bounds of image
        panel.setBounds(0,0,350,350);//to cover the panel to frame
        
        //creating and positioning User label
        user=new JLabel("User: ");//creating label for user
        user.setBounds(50,60,80,25);//setting bounds for user
        //creating and positioning user's input field
        t1=new JTextField();//textfield for user input
        t1.setBounds(130,60,130,25);//positioing and size for text field
        
        //creating and positioning password label
        password=new JLabel("Password: ");//creating password label
        password.setBounds(50,95,80,25);//setting position and sizing the label
        
        //creating and positioning the password input field
        p1=new JPasswordField();//creates a password field for putting password
        p1.setBounds(130,95,130,25);
        
        //creating and positioning login button
        
        lb1=new JButton("Login");//crreate a login button
        lb1.setBounds(120,180,100,30);//for setting position and size of the button 
        lb1.setBackground(new Color(176,224,230));//for background color of button
        lb1.setForeground(new Color(0,0,0));//for color of text
        lb1.setOpaque(true);//to display button colors
        
        //adding all components  to the panel
        panel.add(user);
        panel.add(password);
        panel.add(t1);
        panel.add(p1);
        panel.add(lb1);
        panel.add(imagee1);
        
        //adding panel to the frame
        frame.add(panel);
        
        frame.setVisible(true);//MAKE FRAME VISIBLE
        
        //creating frame of main frame
        frame1=new JFrame();
        //set icon for the frame
        image1=new ImageIcon("C:\\Users\\Acer\\Desktop\\24046889ShreeyaTandukar\\images\\logo.jpg");
        frame1.setIconImage(image1.getImage());//change default picture of bluej to given image
        frame1.setTitle("Zenith Fitness");//to set title
        //setting background for the frame
        image2=new ImageIcon("C:\\Users\\Acer\\Desktop\\24046889ShreeyaTandukar\\images\\gymmain.jpg");
        //scale for the image
        Image imgg=image2.getImage().getScaledInstance(1920, 1070, Image.SCALE_SMOOTH);
        r_image=new ImageIcon(imgg);
        imagee=new JLabel(r_image);
        imagee.setBounds(0,0,1920,1070);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to close the frame
        frame1.setResizable(false);//to make frame not resizeable
        
        //creating menu bar
        menubar=new JMenuBar();
        
        //creating top-levels menus
        type=new JMenu("Type");
        attendance=new JMenu("Attendance");
        regular2=new JMenu("Regular");
        price=new JMenu("Price Detail");
        status=new JMenu("Status");
        detail=new JMenu("Detail");
        revert=new JMenu("Revert");
        memberdetails=new JMenu("Member Details");
        
        //creating menu items for each menu
        regular=new JMenuItem("Regular");
        premium=new JMenuItem("Premium");
        
        regular1=new JMenuItem("Regular");
        premium1=new JMenuItem("Premium");
        
        basic=new JMenuItem("Basic");
        standard=new JMenuItem("Standard");
        deluxe=new JMenuItem("Deluxe"); 
        premium2=new JMenuItem("Premium");
        
        
        regular3=new JMenuItem("Regular");
        premium3=new JMenuItem("Premium");
        
        regular4=new JMenuItem("Regular");
        premium4=new JMenuItem("Premium");
        
        revertItem=new JMenuItem("Revert Form");
        detailss=new JMenuItem("Details");
        
        //adding top-level menus to menu bar
        menubar.add(type);
        menubar.add(attendance);
        menubar.add(price);
        menubar.add(status);
        menubar.add(detail);
        menubar.add(revert);
        menubar.add(memberdetails);
        
        //adding menu items to their respective menus
        type.add(regular);
        type.add(premium);
        
        attendance.add(regular1);
        attendance.add(premium1);
        
        price.add(regular2);
        price.add(premium2);
        //sub-item under"regular" in price detial menu
        regular2.add(basic);
        regular2.add(standard);
        regular2.add(deluxe);
        
        status.add(regular3);
        status.add(premium3);
        
        detail.add(regular4);
        detail.add(premium4);
        
        revert.add(revertItem);
        memberdetails.add(detailss);
        
        frame1.setJMenuBar(menubar);
        
        //adding background image label to frame
        frame1.add(imagee);
        
    
        frame1.setSize(1920,1080);//to set the size of the frame from width and height
        
        //creating new frame for regular member for resgistration
        frame2=new JFrame();
        frame2.setTitle("Zenith Fitness(Regular)");//to set title
        frame2.setResizable(false);//to make frame not resizeable
        frame2.setSize(650,1000);//to set the size of the frame from width and height
        frame2.setLayout(null);
        frame2.setBounds(450,60,680,800);
        
        //creating a grey panel with all components
        greypanel=new JPanel();
        greypanel.setLayout(null);
        greypanel.setBackground(new Color(211,211,211));
        greypanel.setBounds(19,19,630,730);//to cover the panel to frame
        
        //putting title
        text=new JLabel("Zenith Fitness");
        text.setBounds(200,40,300,30);
        text.setForeground(new Color(0,0,128));
        text.setFont(new Font("Arial",Font.BOLD,30));
        
        //setting heading
        text1=new JLabel("Member Details");
        text1.setBounds(50,95,200,30);
        text1.setFont(new Font("Arial",Font.BOLD,20));
        
        //panel for image
        picture=new JPanel();
        picture.setLayout(null);
        picture.setBounds(410,120,160,180);
        
        //member id
        id=new JLabel("ID: ");
        id.setBounds(35,145,100,30);
        id.setFont(new Font("Arial", Font.BOLD,15));
        
        textf=new JTextField();
        textf.setBounds(100,145,100,30);
        textf.setBackground(new Color(169,169,169));
    
        //member name
        name=new JLabel("Name: ");
        name.setBounds(30,195,100,25);
        name.setFont(new Font("Arial", Font.BOLD,15));
        
        textf1=new JTextField();
        textf1.setBounds(100,190,130,30);
        textf1.setBackground(new Color(169,169,169));
        
        //gender label and radio buttons
        radio=new JLabel("Gender: ");
        radio.setBounds(30,235,100,30);
        radio.setFont(new Font("Arial", Font.BOLD,15));
        
        
        male=new JRadioButton("Male");
        female=new JRadioButton("Female");
        //group for only one selection
        gender=new ButtonGroup();
        
        male.setBounds(105,235,100,30);
        male.setBackground(new Color(169,169,169));
        
        female.setBounds(205,235,100,30);
        female.setBackground(new Color(169,169,169));
        
        //date of birth selection
        date=new JLabel("DOB: ");
        date.setBounds(30,285,100,30);
        date.setFont(new Font("Arial", Font.BOLD,15));
        
        //dates
        String[] datevalues3={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
        date8=new JComboBox(datevalues3);
        date8.setBounds(242,285,50,30);
        date8.setBackground(new Color(169,169,169));
        
        //months
        String[] month6={"Jan","Feb","March","April","May","June","July","Aug","Sept","Oct","Nov","Dec"};
        month7=new JComboBox(month6);
        month7.setBounds(175,285,60,30);
        month7.setBackground(new Color(169,169,169));
        
        //years7
        String[] year5={"2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025","2026"};
        year6=new JComboBox(year5);
        year6.setBounds(105,285,60,30);
        year6.setBackground(new Color(169,169,169));
        
        //for location
        location=new JLabel("Location: ");
        location.setBounds(30,335,100,30);
        location.setFont(new Font("Arial", Font.BOLD,15));
        
        textf3=new JTextField();
        textf3.setBounds(105,335,120,30);
        textf3.setBackground(new Color(169,169,169));
        
        //for membership start date
        member=new JLabel("Membership Start Date: ");
        member.setBounds(280,335,400,30);
        member.setFont(new Font("Arial", Font.BOLD,15));
        
        //start date(day,month,year)
        String[] datevalues ={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
        date2=new JComboBox(datevalues);
        date2.setBounds(580,335,45,30);
        date2.setBackground(new Color(169,169,169));
        
        String[] month={"Jan","Feb","March","April","May","June","July","Aug","Sept","Oct","Nov","Dec"};
        month1=new JComboBox(month);
        month1.setBounds(520,335,55,30);
        month1.setBackground(new Color(169,169,169));
        
        String[] year={"2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025","2026"};
        year1=new JComboBox(year);
        year1.setBounds(458,335,55,30);
        year1.setBackground(new Color(169,169,169));
        
        //for phone
        phone=new JLabel("Phone: ");
        phone.setBounds(30,385,100,30);
        phone.setFont(new Font("Arial", Font.BOLD,15));
        
        textf5=new JTextField();
        textf5.setBounds(107,385,120,30);
        textf5.setBackground(new Color(169,169,169));
        
        //for email
        email=new JLabel("Email: ");
        email.setBounds(280,385,400,30);
        email.setFont(new Font("Arial", Font.BOLD,15));
        
        textf6=new JTextField();
        textf6.setBounds(395,385,188,30);
        textf6.setBackground(new Color(169,169,169));
        
        //for membership plan
        plan=new JLabel("Plan: ");
        plan.setBounds(30,435,100,30);
        plan.setFont(new Font("Arial", Font.BOLD,15));
        
        String[] plan1={"Basic","Standard","Deluxe"};
        plan2=new JComboBox(plan1);
        plan2.setBackground(new Color(169,169,169));
        plan2.setBounds(107,435,120,30);
        
        //for amount
        amount=new JLabel("Amount Paid: ");
        amount.setBounds(280,435,400,30);
        amount.setFont(new Font("Arial", Font.BOLD,15));
        
        textf7=new JTextField();
        textf7.setBounds(395,435,188,30);
        textf7.setBackground(new Color(169,169,169));
        
        //for loyalty points
        loyalty=new JLabel("Loyalty Points: ");
        loyalty.setBounds(30,485,200,30);
        loyalty.setFont(new Font("Arial", Font.BOLD,15));
        
        textf8=new JTextField();
        textf8.setBounds(150,485,80,30);
        textf8.setBackground(new Color(169,169,169));
        
        //for referral source
        source=new JLabel("Referral Source: ");
        source.setBounds(280,485,400,30);
        source.setFont(new Font("Arial", Font.BOLD,15));
        
        
        String[] source1={"Facebook","Instagram","Newspaper","Poster","Other"};
        source2=new JComboBox(source1);
        source2.setBackground(new Color(169,169,169));
        source2.setBounds(415,485,164,30);
        
        //for removal reason
        reason=new JLabel("Removal Reason: ");
        reason.setBounds(110,575,200,30);
        reason.setFont(new Font("Arial", Font.BOLD,15));
        
        area=new JTextArea();
        area.setBounds(250,550,200,90);
        area.setBackground(new Color(169,169,169));
        
        //button for submit
        b1=new JButton("Submit");
        b1.setBounds(190,670,100,30);
        b1.setBackground(new Color(0,210,0));
        
        //button for reset
        b2=new JButton("Reset");
        b2.setBounds(320,670,100,30);
        b2.setBackground(new Color(255,0,0));
        
        
        //add radio buttons to gender group
        gender.add(male);
        gender.add(female);
        
        //add all components to panel
        greypanel.add(radio);
        greypanel.add(male);
        greypanel.add(female);
        frame2.add(greypanel);
        greypanel.add(text);
        greypanel.add(text1);
        greypanel.add(picture);
        greypanel.add(id);
        greypanel.add(textf);
        greypanel.add(name);
        greypanel.add(textf1);
        greypanel.add(date);
        greypanel.add(date8);
        greypanel.add(month7);
        greypanel.add(year6);
        greypanel.add(location);
        greypanel.add(textf3);
        greypanel.add(member);
        greypanel.add(date2);
        greypanel.add(month1);
        greypanel.add(year1);
        greypanel.add(phone);
        greypanel.add(textf5);
        greypanel.add(email);
        greypanel.add(textf6);
        greypanel.add(plan);
        greypanel.add(plan2);
        greypanel.add(amount);
        greypanel.add(textf7);
        greypanel.add(loyalty);
        greypanel.add(textf8);
        greypanel.add(source);
        greypanel.add(source2);
        greypanel.add(reason);
        greypanel.add(area);
        greypanel.add(b1);
        greypanel.add(b2);
        
        
        //creating new frame for premium member registration
        frame3=new JFrame();
        frame3.setTitle("Zenith Fitness(Premium)");//to set title
        frame3.setResizable(false);//to make frame not resizeable
        frame3.setSize(650,1000);//to set the size of the frame from width and height
        frame3.setLayout(null);
        frame3.setBounds(450,60,680,800);//setting position and size 
        
        //creating the panel for form components
        greypanel1=new JPanel();
        greypanel1.setLayout(null);
        greypanel1.setBackground(new Color(211,211,211));
        greypanel1.setBounds(19,19,630,725);//to cover the panel to frame
        //heading
        text2=new JLabel("Zenith Fitness");
        text2.setBounds(200,40,300,30);
        text2.setForeground(new Color(0,0,128));
        text2.setFont(new Font("Arial",Font.BOLD,30));
        
        //section title
        text3=new JLabel("Member Details");
        text3.setBounds(50,95,200,30);
        text3.setFont(new Font("Arial",Font.BOLD,20));
        
        //panel for picture
        picture1=new JPanel();
        picture1.setLayout(null);
        picture1.setBounds(410,120,160,180);
        
        //id label and text field
        id1=new JLabel("ID: ");
        id1.setBounds(35,145,100,30);
        id1.setFont(new Font("Arial", Font.BOLD,15));
        
        textf9=new JTextField();
        textf9.setBounds(100,145,100,30);
        textf9.setBackground(new Color(169,169,169));
    
        //name and textfield
        name1=new JLabel("Name: ");
        name1.setBounds(30,195,100,25);
        name1.setFont(new Font("Arial", Font.BOLD,15));
        
        textf10=new JTextField();
        textf10.setBounds(100,190,130,30);
        textf10.setBackground(new Color(169,169,169));
        
        //gender radio button
        radio1=new JLabel("Gender: ");
        radio1.setBounds(30,235,100,30);
        radio1.setFont(new Font("Arial", Font.BOLD,15));
        
        
        male1=new JRadioButton("Male");
        female1=new JRadioButton("Female");
        
        //group to allow one selection only
        gender1=new ButtonGroup();
        
        male1.setBounds(105,235,100,30);
        male1.setBackground(new Color(169,169,169));
        female1.setBounds(205,235,100,30);
        female1.setBackground(new Color(169,169,169));
        
        //location label and text field
        location1=new JLabel("Location: ");
        location1.setBounds(30,335,100,30);
        location1.setFont(new Font("Arial", Font.BOLD,15));
        
        textf12=new JTextField();
        textf12.setBounds(105,335,120,30);
        textf12.setBackground(new Color(169,169,169));
        
        //for membership start date 
        member1=new JLabel("Membership Start Date: ");
        member1.setBounds(280,335,400,30);
        member1.setFont(new Font("Arial", Font.BOLD,15));
        
        String[] datevalues1 ={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
        date3=new JComboBox(datevalues1);
        date3.setBounds(580,335,45,30);
        date3.setBackground(new Color(169,169,169));
        
        String[] month2={"Jan","Feb","March","April","May","June","July","Aug","Sept","Oct","Nov","Dec"};
        month3=new JComboBox(month2);
        month3.setBounds(520,335,55,30);
        month3.setBackground(new Color(169,169,169));
        
        String[] year1={"2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025","2026"};
        year2=new JComboBox(year1);
        year2.setBounds(458,335,55,30);
        year2.setBackground(new Color(169,169,169));
        
        //phone label and text field
        phone1=new JLabel("Phone: ");
        phone1.setBounds(30,385,100,30);
        phone1.setFont(new Font("Arial", Font.BOLD,15));
        
        textf14=new JTextField();
        textf14.setBounds(107,385,120,30);
        textf14.setBackground(new Color(169,169,169));
        
        
        //email label and textfield
        email1=new JLabel("Email: ");
        email1.setBounds(280,385,400,30);
        email1.setFont(new Font("Arial", Font.BOLD,15));
        
        textf15=new JTextField();
        textf15.setBounds(395,385,188,30);
        textf15.setBackground(new Color(169,169,169));
        
        
        //for date of birth
        date7=new JLabel("DOB: ");
        date7.setBounds(30,285,100,30);
        date7.setFont(new Font("Arial", Font.BOLD,15));
        
        String[] datevalues2 ={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
        date6=new JComboBox(datevalues2);
        date6.setBackground(new Color(169,169,169));
        date6.setBounds(242,285,50,30);
        
        String[] month4={"Jan","Feb","March","April","May","June","July","Aug","Sept","Oct","Nov","Dec"};
        month5=new JComboBox(month4);
        month5.setBounds(175,285,60,30);
        month5.setBackground(new Color(169,169,169));
        
        String[] year3={"2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025","2026"};
        year4=new JComboBox(year3);
        year4.setBounds(105,285,60,30);
        year4.setBackground(new Color(169,169,169));
        
        //amount paid label and textfield
        amount1=new JLabel("Amount Paid: ");
        amount1.setBounds(280,435,400,30);
        amount1.setFont(new Font("Arial", Font.BOLD,15));
        
        textf16=new JTextField();
        textf16.setBounds(395,435,188,30);
        textf16.setBackground(new Color(169,169,169));
        
        //loyalty points label and textfield
        loyalty1=new JLabel("Loyalty Points: ");
        loyalty1.setBounds(30,435,200,30);
        loyalty1.setFont(new Font("Arial", Font.BOLD,15));
        
        textf17=new JTextField();
        textf17.setBounds(150,435,80,30);
        textf17.setBackground(new Color(169,169,169));
        
        //referral source dropdown
        source3=new JLabel("Referral Source: ");
        source3.setBounds(280,485,400,30);
        source3.setFont(new Font("Arial", Font.BOLD,15));
        
        
        String[] source4={"Facebook","Instagram","Newspaper","Poster","Other"};
        source5=new JComboBox(source4);
        source5.setBackground(new Color(169,169,169));
        source5.setBounds(415,485,164,30);
        
        //personal trainer dropdown
        trainer=new JLabel("Personal Trainer: ");
        trainer.setBounds(30,490,200,30);
        trainer.setFont(new Font("Arial", Font.BOLD,15));
        
        String[] trainer1={"Ryan Cole","Chase Valor","Alexander Royce","Zane Phoenix","Max Carter"};
        trainer2=new JComboBox(trainer1);
        trainer2.setBackground(new Color(169,169,169));
        trainer2.setBounds(175,490,100,30);
        
        
        //for submit button
        b10=new JButton("Submit");
        b10.setBounds(190,620,100,30);
        b10.setBackground(new Color(0,210,0));
        
        //for reset button
        b4=new JButton("Reset");
        b4.setBounds(320,620,100,30);
        b4.setBackground(new Color(255,0,0));
        
        //adding all components to the panel
        gender1.add(male1);
        gender1.add(female1);
        greypanel1.add(radio1);
        greypanel1.add(male1);
        greypanel1.add(female1);
        greypanel1.add(text3);
        greypanel1.add(text2);
        greypanel1.add(picture1);
        greypanel1.add(id1);
        greypanel1.add(textf9);
        greypanel1.add(name1);
        greypanel1.add(textf10);
        greypanel1.add(date7);
        greypanel1.add(date6);
        greypanel1.add(month5);
        greypanel1.add(year4);
        greypanel1.add(location1);
        greypanel1.add(textf12);
        greypanel1.add(member1);
        greypanel1.add(date3);
        greypanel1.add(month3);
        greypanel1.add(year2);
        greypanel1.add(phone1);
        greypanel1.add(textf14);
        greypanel1.add(email1);
        greypanel1.add(textf15);
        greypanel1.add(amount1);
        greypanel1.add(textf16);
        greypanel1.add(loyalty1);
        greypanel1.add(textf16);
        greypanel1.add(textf17);
        greypanel1.add(source3);
        greypanel1.add(source5);
        greypanel1.add(trainer);
        greypanel1.add(trainer2);
        greypanel1.add(b10);
        greypanel1.add(b4);
        //adding panel to the frame
        frame3.add(greypanel1);
        
        
        //creating a new frame for regular member attendance
        frame4=new JFrame();//to create frame
        frame4.setTitle("Zenith Fitness (Attendance_regular)");//to set title
        frame4.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//to close the frame
        frame4.setResizable(false);//to make frame not resizeable
        frame4.setSize(350,350);//to set the size of the frame from width and height
        frame4.setLayout(null);
        frame4.setLocationRelativeTo(null);//Center the frame
        //replacing default java icon
        image4=new ImageIcon("C:\\Users\\Acer\\Desktop\\24046889ShreeyaTandukar\\images\\logo.jpg");
        frame4.setIconImage(image4.getImage());//change default picture of bluej to given image
        
        //for new panel
        panel4=new JPanel();
        panel4.setLayout(null);
        //for loading background image and scale it to fit the panel
        image5=new ImageIcon("C:\\Users\\Acer\\Desktop\\24046889ShreeyaTandukar\\images\\1677380402876.jpg");
        Image imgg2=image5.getImage().getScaledInstance(350, 350, Image.SCALE_SMOOTH);//resize image
        //create Imageicon from resized image
        r_image2=new ImageIcon(imgg2);
        //label for holding background image
        imagee2=new JLabel(r_image2);//assigning scaled image to label
        imagee2.setBounds(0,0,350,350);
        panel4.setBounds(0,0,350,350);//to cover the panel to frame
        
        //creating and configure label and textfield for id input
        id2=new JLabel("ID: ");
        id2.setFont(new Font("Arial", Font.BOLD,15));
        id2.setBounds(50,60,80,25);
        
        t2=new JTextField();
        t2.setBackground(new Color(169,169,169));
        t2.setBounds(130,60,130,25);
        
        //creating and configuring label and dropdown for selecting plan
        plan6=new JLabel("Plan: ");
        plan6.setFont(new Font("Arial", Font.BOLD,15));
        plan6.setBounds(50,95,80,25);
        
        String[] p={"Basic","Standard","Deluxe"};//plan option
        p2=new JComboBox(p);//dropdown for plan selection
        p2.setBackground(new Color(169,169,169));
        p2.setBounds(130,95,130,25);
        
        //creating checkin button
        lb2=new JButton("CheckIn");
        lb2.setBounds(90,180,100,30);
        lb2.setBackground(new Color(176,224,230));//for background color of button
        lb2.setForeground(new Color(0,0,0));//for color of text
        lb2.setOpaque(true);//to display button colors
        
        lb12=new JButton("Upgrade");
        lb12.setBounds(200,180,100,30);
        lb12.setBackground(new Color(176,224,230));//for background color of button
        lb12.setForeground(new Color(0,0,0));//for color of text
        lb12.setOpaque(true);//to display button colors
        
        
        
        //add all componets to the panel
        panel4.add(id2);
        panel4.add(plan6);
        panel4.add(t2);
        panel4.add(p2);
        panel4.add(lb2);
        panel4.add(lb12);
        panel4.add(imagee2);
        //add panel to frame
        frame4.add(panel4);
        
        //creating new frame for premium member attendance
        frame5=new JFrame();//to create frame
        frame5.setTitle("Zenith Fitness (Attendance_premium)");//to set title
        frame5.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//to close the frame
        frame5.setResizable(false);//to make frame not resizeable
        frame5.setSize(350,350);//to set the size of the frame from width and height
        frame5.setLayout(null);
        frame5.setLocationRelativeTo(null);//Center the frame
        
        //repalces java default java icon
        image6=new ImageIcon("C:\\Users\\Acer\\Desktop\\24046889ShreeyaTandukar\\images\\logo.jpg");
        frame5.setIconImage(image6.getImage());//change default picture of bluej to given image
        
        //for panel to hold componets and background
        panel5=new JPanel();//creating panel
        panel5.setLayout(null);
        //load and scale image
        image7=new ImageIcon("C:\\Users\\Acer\\Desktop\\24046889ShreeyaTandukar\\images\\1677380402876.jpg");
        Image imgg3=image7.getImage().getScaledInstance(350, 350, Image.SCALE_SMOOTH);//scale teh image
        r_image3=new ImageIcon(imgg3);//wrap saled image 
        //create a label to hold background image
        imagee3=new JLabel(r_image3);
        imagee3.setBounds(0,0,350,350);
        panel5.setBounds(0,0,350,350);//to cover the panel to frame
        
        //creating id and configure it
        id3=new JLabel("ID: ");
        id3.setFont(new Font("Arial", Font.BOLD,15));
        id3.setBounds(50,100,80,25);
        //create and configure  text field fro ID input
        t3=new JTextField();
        t3.setBackground(new Color(169,169,169));
        t3.setBounds(130,100,130,25);
        
        //create and configure checkin button
        lb3=new JButton("CheckIn");//button for checking in
        lb3.setBounds(120,180,100,30);
        lb3.setBackground(new Color(176,224,230));//for background color of button
        lb3.setForeground(new Color(0,0,0));//for color of text
        lb3.setOpaque(true);//to display button colors
        
        //adding componets to panel
        
        panel5.add(id3);
        panel5.add(t3);
        panel5.add(lb3);
        panel5.add(imagee3);
        //adding panel to frame
        frame5.add(panel5);
        
        //creating new frame for displaying price details
        frame6=new JFrame();//to create frame
        frame6.setTitle("Zenith Fitness (Price detail)");//to set title
        frame6.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//to close the frame
        frame6.setResizable(false);//to make frame not resizeable
        frame6.setSize(350,350);//to set the size of the frame from width and height
        frame6.setLayout(null);
        frame6.setLocationRelativeTo(null);//Center the frame
        //changing default bluej logo
        image8=new ImageIcon("C:\\Users\\Acer\\Desktop\\24046889ShreeyaTandukar\\images\\logo.jpg");
        frame6.setIconImage(image8.getImage());//change default picture of bluej to given image
        
        //creating panel that holds all components
        panel6=new JPanel();
        panel6.setLayout(null);
        //for background image
        image9=new ImageIcon("C:\\Users\\Acer\\Desktop\\24046889ShreeyaTandukar\\images\\1677380402876.jpg");
        Image imgg4=image9.getImage().getScaledInstance(350, 350, Image.SCALE_SMOOTH);
        r_image4=new ImageIcon(imgg4);
        imagee4=new JLabel(r_image4);
        imagee4.setBounds(0,0,350,350);
        panel6.setBounds(0,0,350,350);//to cover the panel to frame
        
        //for plan label
        plan7=new JLabel("Plan: ");
        plan7.setFont(new Font("Arial", Font.BOLD,15));
        plan7.setBounds(50,60,100,25);
        
        //textfield to display non-editable plan name
        t4=new JTextField("Basic");
        t4.setBackground(new Color(169,169,169));
        t4.setBounds(130,60,130,25);
        t4.setEditable(false);
        
        //label for price
        price3=new JLabel("Price: ");
        price3.setFont(new Font("Arial", Font.BOLD,15));
        price3.setBounds(50,95,100,25);
        
        //textfield to display price in non-editable textfield
        t5=new JTextField("6500");
        t5.setBackground(new Color(169,169,169));
        t5.setBounds(130,95,130,25);
        t5.setEditable(false);
        
        //button to close the frame
        lb4=new JButton("Ok");
        lb4.setBounds(120,180,100,30);
        lb4.setBackground(new Color(176,224,230));//for background color of button
        lb4.setForeground(new Color(0,0,0));//for color of text
        lb4.setOpaque(true);//to display button colors
        
        //to add all components to the panel
        panel6.add(plan7);
        panel6.add(t4);
        panel6.add(price3);
        panel6.add(t5);
        panel6.add(lb4);
        panel6.add(imagee4);
        
        
        //to add panel to the frame
        frame6.add(panel6);
    
        
        frame7=new JFrame();//to create frame
        frame7.setTitle("Zenith Fitness (Price detail)");//to set title
        frame7.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//to close the frame
        frame7.setResizable(false);//to make frame not resizeable
        frame7.setSize(350,350);//to set the size of the frame from width and height
        frame7.setLayout(null);
        frame7.setLocationRelativeTo(null);//Center the frame
        //set icon for teh frame 
        image10=new ImageIcon("C:\\Users\\Acer\\Desktop\\24046889ShreeyaTandukar\\images\\logo.jpg");
        frame7.setIconImage(image10.getImage());//change default picture of bluej to given image
        
        //create panel 
        panel7=new JPanel();
        panel7.setLayout(null);
        //load background image
        image11=new ImageIcon("C:\\Users\\Acer\\Desktop\\24046889ShreeyaTandukar\\images\\1677380402876.jpg");
        Image imgg5=image11.getImage().getScaledInstance(350, 350, Image.SCALE_SMOOTH);
        r_image5=new ImageIcon(imgg5);
        imagee5=new JLabel(r_image5);
        imagee5.setBounds(0,0,350,350);
        panel7.setBounds(0,0,350,350);//to cover the panel to frame
        
        //label and text field for plan
        plan8=new JLabel("Plan: ");
        plan8.setFont(new Font("Arial", Font.BOLD,15));
        plan8.setBounds(50,60,100,25);
        
        //non editable field for standard plan
        t6=new JTextField("Standard");
        t6.setBackground(new Color(169,169,169));
        t6.setBounds(130,60,130,25);
        t6.setEditable(false);
        
        price4=new JLabel("Price: ");
        price4.setFont(new Font("Arial", Font.BOLD,15));
        price4.setBounds(50,95,100,25);
        
        //non editable field for price
        t7=new JTextField("12500");
        t7.setBackground(new Color(169,169,169));
        t7.setBounds(130,95,130,25);
        t7.setEditable(false);
        
        
        
        //ok button
        lb5=new JButton("Ok");
        lb5.setBounds(120,180,100,30);
        lb5.setBackground(new Color(176,224,230));//for background color of button
        lb5.setForeground(new Color(0,0,0));//for color of text
        lb5.setOpaque(true);//to display button colors
        
        //adding all components to panel
        panel7.add(plan8);
        panel7.add(t6);
        panel7.add(price4);
        panel7.add(t7);
        panel7.add(lb5);
        panel7.add(imagee5);
        
        
        //adding panel to frame
        frame7.add(panel7);
        
        
        frame8=new JFrame();//to create frame
        frame8.setTitle("Zenith Fitness (Price detail)");//to set title
        frame8.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//to close the frame
        frame8.setResizable(false);//to make frame not resizeable
        frame8.setSize(350,350);//to set the size of the frame from width and height
        frame8.setLayout(null);
        frame8.setLocationRelativeTo(null);//Center the frame
        
        //setting icon image for the frame
        ImageIcon image13=new ImageIcon("C:\\Users\\Acer\\Desktop\\24046889ShreeyaTandukar\\images\\logo.jpg");
        frame8.setIconImage(image10.getImage());//change default picture of bluej to given image
        
        //creating panel 
        panel8=new JPanel();
        panel8.setLayout(null);
        //loading background image
        image12=new ImageIcon("C:\\Users\\Acer\\Desktop\\24046889ShreeyaTandukar\\images\\1677380402876.jpg");
        Image imgg6=image12.getImage().getScaledInstance(350, 350, Image.SCALE_SMOOTH);
        r_image6=new ImageIcon(imgg6);
        imagee6=new JLabel(r_image6);
        imagee6.setBounds(0,0,350,350);
        panel8.setBounds(0,0,350,350);//to cover the panel to frame
        
        //label and textfield
        plan9=new JLabel("Plan: ");
        plan9.setFont(new Font("Arial", Font.BOLD,15));
        plan9.setBounds(50,60,100,25);
        
        //non-editable text field
        t8=new JTextField("Deluxe");
        t8.setBackground(new Color(169,169,169));
        t8.setBounds(130,60,130,25);
        t8.setEditable(false);
        //label and textfield for price
        price5=new JLabel("Price: ");
        price5.setFont(new Font("Arial", Font.BOLD,15));
        price5.setBounds(50,95,100,25);
        
        t9=new JTextField("18500");
        t9.setBackground(new Color(169,169,169));
        t9.setBounds(130,95,130,25);
        t9.setEditable(false);
        
        //ok button
        lb6=new JButton("Ok");
        lb6.setBounds(120,180,100,30);
        lb6.setBackground(new Color(176,224,230));//for background color of button
        lb6.setForeground(new Color(0,0,0));//for color of text
        lb6.setOpaque(true);//to display button colors
        
        //adding components in panel
        panel8.add(plan9);
        panel8.add(t8);
        panel8.add(price5);
        panel8.add(t9);
        panel8.add(lb6);
        panel8.add(imagee6);
        
        
        //adding panel to frame
        frame8.add(panel8);
        
        
        frame9=new JFrame();//to create frame
        frame9.setTitle("Zenith Fitness (Price detail)");//to set title
        frame9.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//to close the frame
        frame9.setResizable(false);//to make frame not resizeable
        frame9.setSize(350,350);//to set the size of the frame from width and height
        frame9.setLayout(null);
        frame9.setLocationRelativeTo(null);//Center the frame
        
        //setting icon image of the frame
        ImageIcon image14=new ImageIcon("C:\\Users\\Acer\\Desktop\\24046889ShreeyaTandukar\\images\\logo.jpg");
        frame9.setIconImage(image10.getImage());//change default picture of bluej to given image
        
        //creating panel 
        panel9=new JPanel();
        panel9.setLayout(null);
        //loading the background image
        image15=new ImageIcon("C:\\Users\\Acer\\Desktop\\24046889ShreeyaTandukar\\images\\1677380402876.jpg");
        Image imgg7=image15.getImage().getScaledInstance(350, 350, Image.SCALE_SMOOTH);
        r_image7=new ImageIcon(imgg7);//creating new scaled ImageIcon
        imagee7=new JLabel(r_image7);//Jlabel to hold background image
        imagee7.setBounds(0,0,350,350);
        panel9.setBounds(0,0,350,350);//to cover the panel to frame
        
        //label and field for type
        type1=new JLabel("Type: ");
        type1.setFont(new Font("Arial", Font.BOLD,15));
        type1.setBounds(50,60,100,25);
        
        //uneditable textfield for type
        t10=new JTextField("Premium");
        t10.setBackground(new Color(169,169,169));
        t10.setBounds(130,60,130,25);
        t10.setEditable(false);
        
        //label for price
        price6=new JLabel("Price: ");
        price6.setFont(new Font("Arial", Font.BOLD,15));
        price6.setBounds(50,95,100,25);
        
        //uneditable textfield for price
        t11=new JTextField("50000");
        t11.setBackground(new Color(169,169,169));
        t11.setBounds(130,95,130,25);
        t11.setEditable(false);
        
        //label for discount
        discount=new JLabel("Discount: ");
        discount.setFont(new Font("Arial",Font.BOLD,15));
        discount.setBounds(50,130,100,25);
        
        //uneditable textfield for discount price
        t16=new JTextField("5000");
        t16.setBackground(new Color(169,169,169));
        t16.setBounds(130,130,130,25);
        t16.setEditable(false);
        
        //ok button
        lb7=new JButton("Ok");
        lb7.setBounds(120,180,100,30);
        lb7.setBackground(new Color(176,224,230));//for background color of button
        lb7.setForeground(new Color(0,0,0));//for color of text
        lb7.setOpaque(true);//to display button colors
        
        
    
        //adding all compponets to panel
        panel9.add(type1);
        panel9.add(t10);
        panel9.add(price6);
        panel9.add(t11);
        panel9.add(lb7);
        panel9.add(discount);
        panel9.add(t16);
        panel9.add(imagee7);
        
        
        
        //adding panel to frame
        frame9.add(panel9);
        
        
        frame10=new JFrame();//to create frame
        frame10.setTitle("Zenith Fitness (Status_regular)");//to set title
        frame10.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//to close the frame
        frame10.setResizable(false);//to make frame not resizeable
        frame10.setSize(350,350);//to set the size of the frame from width and height
        frame10.setLayout(null);
        frame10.setLocationRelativeTo(null);//Center the frame
        
        image8=new ImageIcon("C:\\Users\\Acer\\Desktop\\24046889ShreeyaTandukar\\images\\logo.jpg");
        frame10.setIconImage(image8.getImage());//change default picture of bluej to given image
        
        
        panel10=new JPanel();
        panel10.setLayout(null);
        image14=new ImageIcon("C:\\Users\\Acer\\Desktop\\24046889ShreeyaTandukar\\images\\1677380402876.jpg");
        Image imgg8=image9.getImage().getScaledInstance(350, 350, Image.SCALE_SMOOTH);
        r_image8=new ImageIcon(imgg2);
        imagee8=new JLabel(r_image8);
        imagee8.setBounds(0,0,350,350);
        panel10.setBounds(0,0,350,350);//to cover the panel to frame
        
        //label for id
        id4=new JLabel("ID: ");
        id4.setFont(new Font("Arial", Font.BOLD,15));
        id4.setBounds(80,100,80,25);
        
        //textfield for id
        t12=new JTextField();
        t12.setBackground(new Color(169,169,169));
        t12.setBounds(130,100,130,25);
        
        //button to activate the regular member
        b6=new JButton("Activate");
        b6.setBounds(60,180,80,30);
        b6.setBackground(new Color(176,224,230));//for background color of button
        b6.setForeground(new Color(0,0,0));//for color of text
        b6.setOpaque(true);//to display button colors
        
        //button to deactivate the regular member
        b7=new JButton("Deactivate");
        b7.setBounds(180,180,100,30);
        b7.setBackground(new Color(176,224,230));//for background color of button
        b7.setForeground(new Color(0,0,0));//for color of text
        b7.setOpaque(true);//to display button colors
        
        
        //adding components to panel
        panel10.add(id4);
        panel10.add(t12);
        panel10.add(b6);
        panel10.add(b7);
        panel10.add(imagee8);
        
        //adding panel to frame
        frame10.add(panel10);
        
        
        frame11=new JFrame();//to create frame
        frame11.setTitle("Zenith Fitness (Status_premium)");//to set title
        frame11.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//to close the frame
        frame11.setResizable(false);//to make frame not resizeable
        frame11.setSize(350,350);//to set the size of the frame from width and height
        frame11.setLayout(null);
        frame11.setLocationRelativeTo(null);//Center the frame
        
        image16=new ImageIcon("C:\\Users\\Acer\\Desktop\\24046889ShreeyaTandukar\\images\\logo.jpg");
        frame11.setIconImage(image9.getImage());//change default picture of bluej to given image
        
        //creating panel
        panel11=new JPanel();
        panel11.setLayout(null);
        image16=new ImageIcon("C:\\Users\\Acer\\Desktop\\24046889ShreeyaTandukar\\images\\1677380402876.jpg");
        Image imgg9=image16.getImage().getScaledInstance(350, 350, Image.SCALE_SMOOTH);
        r_image9=new ImageIcon(imgg9);
        imagee9=new JLabel(r_image9);
        imagee9.setBounds(0,0,350,350);
        panel11.setBounds(0,0,350,350);//to cover the panel to frame
        
        //creating id for premium member 
        id5=new JLabel("ID: ");
        id5.setFont(new Font("Arial", Font.BOLD,15));
        id5.setBounds(90,100,80,25);
        
        //textfield 
        t13=new JTextField();

        t13.setBackground(new Color(169,169,169));
        t13.setBounds(160,100,130,25);
        
        //button to activate premium member
        lb8=new JButton("Activate");
        lb8.setBounds(60,180,100,30);
        lb8.setBackground(new Color(176,224,230));//for background color of button
        lb8.setForeground(new Color(0,0,0));//for color of text
        lb8.setOpaque(true);//to display button colors
        
        //button to deactivate premium member
        lb9=new JButton("Deactivate");
        lb9.setBounds(180,180,100,30);
        lb9.setBackground(new Color(176,224,230));//for background color of button
        lb9.setForeground(new Color(0,0,0));//for color of text
        lb9.setOpaque(true);//to display button colors
        
        //adding all components to panel
        panel11.add(id5);
        panel11.add(t13);
        panel11.add(lb8);
        panel11.add(lb9);
        panel11.add(imagee9);
        
        //adding panel to frame
        frame11.add(panel11);
        
        frame12=new JFrame();//to create frame for regular details
        frame12.setTitle("Zenith Fitness (Details_regular)");//to set title
        frame12.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//to close the frame
        frame12.setResizable(false);//to make frame not resizeable
        frame12.setSize(350,350);//to set the size of the frame from width and height
        frame12.setLayout(null);
        frame12.setLocationRelativeTo(null);//Center the frame
        
        image17=new ImageIcon("C:\\Users\\Acer\\Desktop\\24046889ShreeyaTandukar\\images\\logo.jpg");
        frame12.setIconImage(image6.getImage());//change default picture of bluej to given image
        
        //creating panel
        panel12=new JPanel();
        panel12.setLayout(null);
        image17=new ImageIcon("C:\\Users\\Acer\\Desktop\\24046889ShreeyaTandukar\\images\\1677380402876.jpg");
        Image imgg10=image17.getImage().getScaledInstance(350, 350, Image.SCALE_SMOOTH);
        r_image10=new ImageIcon(imgg10);
        imagee10=new JLabel(r_image10);
        imagee10.setBounds(0,0,350,350);
        panel12.setBounds(0,0,350,350);//to cover the panel to frame
        
        //creating id label 
        id6=new JLabel("ID: ");
        id6.setFont(new Font("Arial", Font.BOLD,15));
        id6.setBounds(50,100,80,25);
        //creating textfield for id
        t14=new JTextField();
        t14.setBackground(new Color(169,169,169));
        t14.setBounds(130,100,130,25);
        
        //creating button to display detail of member
        lb10=new JButton("Details");
        lb10.setBounds(80,180,100,30);
        lb10.setBackground(new Color(176,224,230));//for background color of button
        lb10.setForeground(new Color(0,0,0));//for color of text
        lb10.setOpaque(true);//to display button colors
        
        b11=new JButton("View Details");
        b11.setBounds(190,180,120,30);
        b11.setBackground(new Color(176,224,230));
        b11.setForeground(new Color(0,0,0));
        b11.setOpaque(true);
        
        //adding components to panel
        panel12.add(id6);
        panel12.add(t14);
        panel12.add(lb10);
        panel12.add(b11);
        panel12.add(imagee10);
        //adding panel to frame
        frame12.add(panel12);
        
        frame13=new JFrame();//to create frame for premium member
        frame13.setTitle("Zenith Fitness (details_premium)");//to set title
        frame13.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//to close the frame
        frame13.setResizable(false);//to make frame not resizeable
        frame13.setSize(350,350);//to set the size of the frame from width and height
        frame13.setLayout(null);
        frame13.setLocationRelativeTo(null);//Center the frame
        
        image18=new ImageIcon("C:\\Users\\Acer\\Desktop\\24046889ShreeyaTandukar\\images\\logo.jpg");
        frame13.setIconImage(image6.getImage());//change default picture of bluej to given image
        
        //creating panel
        panel13=new JPanel();
        panel13.setLayout(null);
        image18=new ImageIcon("C:\\Users\\Acer\\Desktop\\24046889ShreeyaTandukar\\images\\1677380402876.jpg");
        Image imgg11=image18.getImage().getScaledInstance(350, 350, Image.SCALE_SMOOTH);
        r_image11=new ImageIcon(imgg11);
        imagee11=new JLabel(r_image11);
        imagee11.setBounds(0,0,350,350);
        panel13.setBounds(0,0,350,350);//to cover the panel to frame
        
        //creating id label
        id7=new JLabel("ID: ");
        id7.setFont(new Font("Arial", Font.BOLD,15));
        id7.setBounds(50,100,80,25);
        //creating textfield for id
        t15=new JTextField();
        t15.setBackground(new Color(169,169,169));
        t15.setBounds(130,100,130,25);
        
        //creating button for displaying premium member detail
        lb11=new JButton("Details");
        lb11.setBounds(70,210,100,30);
        lb11.setBackground(new Color(176,224,230));//for background color of button
        lb11.setForeground(new Color(0,0,0));//for color of text
        lb11.setOpaque(true);//to display button colors
        
        //creating button for providing discount
        b5=new JButton("Discount");
        b5.setBounds(130,160,100,30);
        b5.setBackground(new Color(255,153,0));
        
        b12=new JButton("View Details");
        b12.setBounds(190,210,120,30);
        b12.setBackground(new Color(176,224,230));
        b12.setForeground(new Color(0,0,0));
        b12.setOpaque(true);
        
        //adding components in panel 
        panel13.add(id7);
        panel13.add(t15);
        panel13.add(lb11);
        panel13.add(b5);
        panel13.add(b12);
        panel13.add(imagee11);
        //adding panel to frame
        frame13.add(panel13);
        
        
        frame14=new JFrame();//to create frame for revert
        frame14.setTitle("Revert");//to set title
        frame14.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//to close the frame
        frame14.setResizable(false);//to make frame not resizeable
        frame14.setSize(350,350);//to set the size of the frame from width and height
        frame14.setLayout(null);
        frame14.setLocationRelativeTo(null);//Center the frame
        
        image19=new ImageIcon("C:\\Users\\Acer\\Desktop\\24046889ShreeyaTandukar\\images\\logo.jpg");
        frame14.setIconImage(image19.getImage());//change default picture of bluej to given image
        
        //creating panel
        panel14=new JPanel();
        panel14.setLayout(null);
        image19=new ImageIcon("C:\\Users\\Acer\\Desktop\\24046889ShreeyaTandukar\\images\\1677380402876.jpg");
        Image imgg12=image19.getImage().getScaledInstance(350, 350, Image.SCALE_SMOOTH);
        r_image12=new ImageIcon(imgg12);
        imagee12=new JLabel(r_image12);
        imagee12.setBounds(0,0,350,350);
        panel14.setBounds(0,0,350,350);//to cover the panel to frame
        
        //id label
        id8=new JLabel("ID: ");
        id8.setFont(new Font("Arial", Font.BOLD,15));
        id8.setBounds(50,60,80,25);
        
        //textfield for id
        t16=new JTextField();
        t16.setBackground(new Color(169,169,169));
        t16.setBounds(130,60,130,25);
        
        //type label
        type2=new JLabel("Type: ");
        type2.setFont(new Font("Arial", Font.BOLD,15));
        type2.setBounds(50,95,80,25);
        
        //for dropdown
        String[] t={"Regular","premium"};
        p3=new JComboBox(t);
        p3.setBackground(new Color(169,169,169));
        p3.setBounds(130,95,130,25);
        
        //button for reverting the information
        b8=new JButton("Revert");
        b8.setBounds(70,180,100,30);
        b8.setBackground(new Color(176,224,230));//for background color of button
        b8.setForeground(new Color(0,0,0));//for color of text
        b8.setOpaque(true);//to display button colors
        
        //button for being exit
        b9=new JButton("Exit");
        b9.setBounds(180,180,100,30);
        b9.setBackground(new Color(255,153,0));
        
        //adding components to panel
        panel14.add(id8);
        panel14.add(type2);
        panel14.add(t16);
        panel14.add(p3);
        panel14.add(b8);
        panel14.add(b9);
        panel14.add(imagee12);
        //adding panel to frame
        frame14.add(panel14);
        
        frame15=new JFrame("Details of all Regular Member ");
        frame15.setResizable(false);//to make frame not resizeable
        frame15.setSize(650,1000);//to set the size of the frame from width and height
        frame15.setLayout(null);
        frame15.setBounds(450,60,680,800);
        
        frame16=new JFrame("Details of all premium Member ");
        frame16.setResizable(false);//to make frame not resizeable
        frame16.setSize(650,1000);//to set the size of the frame from width and height
        frame16.setLayout(null);
        frame16.setBounds(450,60,680,800);
        
        frame17=new JFrame();//to create frame for revert
        frame17.setTitle("Member Details");//to set title
        frame17.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//to close the frame
        frame17.setResizable(false);//to make frame not resizeable
        frame17.setSize(350,350);//to set the size of the frame from width and height
        frame17.setLayout(null);
        frame17.setLocationRelativeTo(null);//Center the frame
        
        image20=new ImageIcon("C:\\Users\\Acer\\Desktop\\24046889ShreeyaTandukar\\images\\logo.jpg");
        frame17.setIconImage(image19.getImage());//change default picture of bluej to given image
        
        //creating panel
        panel15=new JPanel();
        panel15.setLayout(null);
        image20=new ImageIcon("C:\\Users\\Acer\\Desktop\\24046889ShreeyaTandukar\\images\\1677380402876.jpg");
        Image imgg13=image20.getImage().getScaledInstance(350, 350, Image.SCALE_SMOOTH);
        r_image13=new ImageIcon(imgg13);
        imagee13=new JLabel(r_image13);
        imagee13.setBounds(0,0,350,350);
        panel15.setBounds(0,0,350,350);//to cover the panel to frame
        
        
        //type label
        type3=new JLabel("Type: ");
        type3.setFont(new Font("Arial", Font.BOLD,15));
        type3.setBounds(50,85,80,25);
        
        //for dropdown
        String[] t1={"Regular","Premium"};
        p4=new JComboBox(t1);
        p4.setBackground(new Color(169,169,169));
        p4.setBounds(130,85,130,25);
        
        //button for reverting the information
        b13=new JButton("Write In File");
        b13.setBounds(70,160,120,30);
        b13.setBackground(new Color(176,224,230));//for background color of button
        b13.setForeground(new Color(0,0,0));//for color of text
        b13.setOpaque(true);//to display button colors
        
        //button for being exit
        b14=new JButton("Read File");
        b14.setBounds(200,160,120,30);
        b14.setBackground(new Color(255,153,0));
    
        //adding components to panel
        
        panel15.add(type3);
        panel15.add(p4);
        panel15.add(b13);
        panel15.add(b14);
        panel15.add(imagee13);
        //adding panel to frame
        frame17.add(panel15);
        /*
        frame18=new JFrame("Details of all Regular Member ");
        frame18.setResizable(false);//to make frame not resizeable
        frame18.setSize(650,1000);//to set the size of the frame from width and height
        frame18.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame18.setLayout(null);
        frame18.setBounds(450,60,680,800);
        
        frame19=new JFrame("Details of all Premium Member ");
        frame19.setResizable(false);//to make frame not resizeable
        frame19.setSize(650,1000);//to set the size of the frame from width and height
        frame19.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame19.setLayout(null);
        frame19.setBounds(450,60,680,800);
        */

        
        
        //registering ActionListener to components
        lb1.addActionListener(this);
        lb2.addActionListener(this);
        lb3.addActionListener(this);
        lb4.addActionListener(this);
        lb5.addActionListener(this);
        lb6.addActionListener(this);
        lb7.addActionListener(this);
        lb8.addActionListener(this);
        lb9.addActionListener(this);
        lb10.addActionListener(this);
        lb11.addActionListener(this);
        lb12.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b10.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        regular.addActionListener(this);
        premium.addActionListener(this);
        regular1.addActionListener(this);
        premium1.addActionListener(this);
        basic.addActionListener(this);
        standard.addActionListener(this);
        deluxe.addActionListener(this);
        premium2.addActionListener(this);
        regular3.addActionListener(this);
        premium3.addActionListener(this);
        regular4.addActionListener(this);
        premium4.addActionListener(this);
        revertItem.addActionListener(this);
        detailss.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent a)
    {
        //checking if the source of action is login button
        if(a.getSource()==lb1)
        {
            //getting username from the text field
           String username=t1.getText();
           //getting password from the password field as a string
           String password=new String(p1.getPassword());
           //checking if entered username and password are correct
           if(username.equals("Admin") && password.equals("12345"))
           {
               //sgowing success message
               JOptionPane.showMessageDialog(frame,"Login Successful!","Success",JOptionPane.INFORMATION_MESSAGE);
               //hide the login frame
               frame.setVisible(false);
               //show frame1
               frame1.setVisible(true);
           }
           else
           {
               //showing error message
               JOptionPane.showMessageDialog(frame,"Invalid Username or Password!","Error",JOptionPane.ERROR_MESSAGE);
               //clear the username and password
               t1.setText("");
               p1.setText("");
           }
        }
        //check if the "regular" menu button is clicked
        if(a.getSource()==regular)
        {
            JOptionPane.showMessageDialog(frame1,"Regular membership form has been selected","Menu Action",JOptionPane.INFORMATION_MESSAGE);
            frame1.setVisible(true);
            frame2.setVisible(true);//showing regular membership registratin form
        }
        //checking if premium menu button is clicked
        else if(a.getSource()==premium)
        {
            JOptionPane.showMessageDialog(frame1,"Premium membership form has been selected","Menu Action",JOptionPane.INFORMATION_MESSAGE);
            frame1.setVisible(true);
            frame3.setVisible(true);//showing premium membership registration frame
        }
        
        else if(a.getSource()==regular1)
        {
           JOptionPane.showMessageDialog(frame1,"CheckIn for regular member","Menu Action",JOptionPane.INFORMATION_MESSAGE);
            frame1.setVisible(true);
            frame4.setVisible(true); //showing regular member check in frame
        }
        else if(a.getSource()==premium1)
        {
            JOptionPane.showMessageDialog(frame1,"CheckIn for premium member","Menu Action",JOptionPane.INFORMATION_MESSAGE);
            frame1.setVisible(true);
            frame5.setVisible(true);//showing premium member check in frame 
        }
        else if(a.getSource()==basic)
        {
            JOptionPane.showMessageDialog(frame1,"Basic plan price detail has been shared","Menu Action",JOptionPane.INFORMATION_MESSAGE);
            frame1.setVisible(true);
            frame6.setVisible(true);//showing basic plan price
        }
        else if(a.getSource()==standard)
        {
           JOptionPane.showMessageDialog(frame1,"Standard plan price detail has been shared","Menu Action",JOptionPane.INFORMATION_MESSAGE);
            frame1.setVisible(true);
            frame7.setVisible(true);//showing standard plan price 
        }
        else if(a.getSource()==deluxe)
        {
            JOptionPane.showMessageDialog(frame1,"Deluxe plan price detail has been shared","Menu Action",JOptionPane.INFORMATION_MESSAGE);
            frame1.setVisible(true);
            frame8.setVisible(true); //showing deluxe plan price
        }
        else if(a.getSource()==premium2)
        {
            JOptionPane.showMessageDialog(frame1,"Premium plan price detail has been shared","Menu Action",JOptionPane.INFORMATION_MESSAGE);
            frame1.setVisible(true);
            frame9.setVisible(true); //showing standard plan price
        }
        else if(a.getSource()==regular3)
        {
            JOptionPane.showMessageDialog(frame1,"Regular plan Status","Menu Action",JOptionPane.INFORMATION_MESSAGE);
            frame1.setVisible(true);
            frame10.setVisible(true);//showing basic plan status
        }
        else if(a.getSource()==premium3)
        {
            JOptionPane.showMessageDialog(frame1,"Preimum plan Status","Menu Action",JOptionPane.INFORMATION_MESSAGE);
            frame1.setVisible(true);
            frame11.setVisible(true);//showing premium plan status
        }
        else if(a.getSource()==regular4)
        {
            JOptionPane.showMessageDialog(frame1," regular member details","Menu Action",JOptionPane.INFORMATION_MESSAGE);
            frame1.setVisible(true);
            frame12.setVisible(true);//showing regular member detail
        }
        else if(a.getSource()==premium4)
        {
            JOptionPane.showMessageDialog(frame1,"Preimum member details","Menu Action",JOptionPane.INFORMATION_MESSAGE);
            frame1.setVisible(true);
            frame13.setVisible(true);//showing premium member detail
        }
        else if(a.getSource()==revertItem)
        {
            JOptionPane.showMessageDialog(frame1,"Revert member details","Menu Action",JOptionPane.INFORMATION_MESSAGE);
            frame1.setVisible(true);
            frame14.setVisible(true);//reverting the detail
        }
        else if(a.getSource()==detailss)
        {
            JOptionPane.showMessageDialog(frame1," member details","Menu Action",JOptionPane.INFORMATION_MESSAGE);
            frame1.setVisible(true);
            frame17.setVisible(true);
            
        }
        /*else if(a.getSource()==b14)
        {
            JOptionPane.showMessageDialog(frame1," member details","Menu Action",JOptionPane.INFORMATION_MESSAGE);
            frame1.setVisible(true);
            frame18.setVisible(true);
        }
        else if(a.getSource()==b14)
        {
            JOptionPane.showMessageDialog(frame1," member details","Menu Action",JOptionPane.INFORMATION_MESSAGE);
            frame1.setVisible(true);
            frame19.setVisible(true);
        }*/


       
        //for submit button 
        if(a.getSource()==b1)
        {
            //retrieving all user input from the form
            try{
            int id=Integer.parseInt(textf.getText());//id input
            String name=textf1.getText();//name input
            String gender=male.isSelected()? "Male":"Female";//selecting gender using radion button
            //retrieving DOB components
            String datevalues3=(String) date8.getSelectedItem();
            String month6=(String) month7.getSelectedItem();
            String year5=(String) year6.getSelectedItem();
            //location input
            String location=textf3.getText();
            String phone=textf5.getText();//phone input
            String email=textf6.getText();//email input
            String plan=(String) plan2.getSelectedItem();//selected membership plan
            String amountPaid=textf7.getText();//amount paid input
            String loyaltyPoints=textf8.getText();//loyalty point
            String referralSource=(String) source2.getSelectedItem();//referral source selection
            //membership start date componets
            String datevalues=(String) date2.getSelectedItem();
            String month=(String) month1.getSelectedItem();
            String year=(String) year1.getSelectedItem();
            //combine selected date fieldds into single strings
            String membershipStartDate=datevalues + " "+month + " " + year;
            String DOB=datevalues3+" "+ month6+ " "+year5;
            String removalReason=area.getText();// reason for removal
            
            //checking if id is empty
            if(textf.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"please enter your ID");
                return;
            }
            int id4=Integer.parseInt(textf.getText());
            //checking if the id is already exists in gym list
            for(GymMember m: Gym)
            {
                if(m.getId() == id4)
                {
                    JOptionPane.showMessageDialog(frame2,"This ID already exists.","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            
            //checking if name is entered
            if(textf1.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"please enter your Name");
                return;
            }
            
            //ensuring one gender option is selected
            if(!male.isSelected() && !female.isSelected())
            {
                JOptionPane.showMessageDialog(null,"please enter your Gender");
                return;
            }
            
            //checking if dob is selected 
            if(datevalues3==null || month6== null || year5== null)
            {
                JOptionPane.showMessageDialog(null,"please enter your date of birth");
                return;
            }
            
            //checking if location is empty
            if(textf3.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"please enter your location");
                return;
            }
            
            //checking if phone num is empty
            if(textf5.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"please enter your phone");
                return;
            }
            //checking if email is empty
            if(textf6.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"please enter your email");
                return;
            }
            
            //checking if plan is selected 
            if(plan.isEmpty())
            {
                JOptionPane.showMessageDialog(null,"please enter your plan");
                return;
            }
            //checking if paid amount is empty
            if(textf7.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"please enter your Amount Paid");
                return;
            }
            
            //checking referral source
            if(referralSource.isEmpty())
            {
                JOptionPane.showMessageDialog(null,"please enter your referral source");
                return;
            }
            
            //checking membership start date
            if(datevalues==null||month==null||year==null)
            {
                JOptionPane.showMessageDialog(null,"please enter your date of Membership Start date");
                return;
            }
            
            
            
            //creating new regular member object with collected data
            RegularMember member=new RegularMember(id,name,location,phone,email,gender,DOB,membershipStartDate,referralSource);
            
            //Adding new member to the gym list
            Gym.add(member);
            //show success message
            JOptionPane.showMessageDialog(null,"Member added successfully!");
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(frame2,"Invalid ID","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        //for reset button
        if(a.getSource() == b2)
            {
                //clearing all field
                textf.setText("");
                textf1.setText("");
                //reseting DOB combo boxes
                date8.setSelectedIndex(0);
                month7.setSelectedIndex(0);
                year6.setSelectedIndex(0);
                textf3.setText("");
                textf5.setText("");
                textf6.setText("");
                textf7.setText("");
                textf8.setText("");                
                area.setText("");
                //reset gender radio buttons
                male.setSelected(false);
                female.setSelected(false);
                //resetting membership plan and membership start date combo boxes 
                plan2.setSelectedIndex(0);
                source2.setSelectedIndex(0);
                date2.setSelectedIndex(0);
                month1.setSelectedIndex(0);
                year1.setSelectedIndex(0);
            }
            //close regular membership form when button is closed
        if(a.getSource()==b1)
        {
            frame2.dispose();//close the regular member registration frame
            //resetting all input fields for next registration
            textf.setText("");
            textf1.setText("");
            date8.setSelectedIndex(0);
            month7.setSelectedIndex(0);
            year6.setSelectedIndex(0);
            textf3.setText("");
            textf5.setText("");
            textf6.setText("");
            textf7.setText("");
            textf8.setText("");                
            area.setText("");
            gender.clearSelection();
            plan2.setSelectedIndex(0);
            source2.setSelectedIndex(0);
            date2.setSelectedIndex(0);
            month1.setSelectedIndex(0);
            year1.setSelectedIndex(0);
        }
        //checking activate and deactivate button
        if(a.getSource()==b6||a.getSource()==b7)
            {
                try{
                    //to read the entered ID from teh text fireld
                    int id5=Integer.parseInt(t12.getText());
                    boolean f=false;//to check if member is found
                    //loop for list of gym members
                    for(GymMember e:Gym)
                    {
                        //checking if member is regular and id matches
                        if(e instanceof RegularMember && e.getId()==id5)
                        {
                            RegularMember rm=(RegularMember) e; //converting reference of superclass back down to a subclass type
                            if(a.getSource()==b6)
                            {
                                //activate membership
                                rm.activeMembership();
                                JOptionPane.showMessageDialog(frame10,"Member ID"+id5+"activated");
                            }
                            else if(a.getSource() == b7)
                            {
                                //deactivate membership
                                rm.deactivateMembership();
                                JOptionPane.showMessageDialog(frame10,"Member ID"+id5+"deactivated");
                            }
                            f=true;//member found and processed
                            break;//exiting loop after finding the member
                        }
                    }
                    //if no matching found show error
                    if(!f)
                    {
                      JOptionPane.showMessageDialog(frame10,"ID not found","ERROR",JOptionPane.ERROR_MESSAGE);  
                    }
                }
                catch(NumberFormatException s)
                {
                    //checking if id is valid or not
                    JOptionPane.showMessageDialog(null,"Enter valid ID");
                }
            }
            //close regular membership activation frame when button is closed
        if(a.getSource()==b6)
        {
            frame10.dispose();//close the regular member activation frame
            //resetting all input fields for next registration
            textf.setText("");
            textf1.setText("");
            date8.setSelectedIndex(0);
            month7.setSelectedIndex(0);
            year6.setSelectedIndex(0);
            textf3.setText("");
            textf5.setText("");
            textf6.setText("");
            textf7.setText("");
            textf8.setText("");                
            area.setText("");
            male.setSelected(false);
            female.setSelected(false);
            plan2.setSelectedIndex(0);
            source2.setSelectedIndex(0);
            date2.setSelectedIndex(0);
            month1.setSelectedIndex(0);
            year1.setSelectedIndex(0);
        }
        //for checkin button
        if(a.getSource()==lb2)
        {
            try{
                int id6=Integer.parseInt(t2.getText());//to read entered ID fromm the text field
                String s1=(String) p2.getSelectedItem();//get selected value from dropdown
                boolean k=false;//tracking if a matching id is found
                //loop for list of gym members
                for(GymMember m:Gym)
                {
                    if(m.getId()==id6)//checking if the id matches
                    {
                        k=true;//setting true when id is matched
                        if(m.getActiveStatus())//checking if member's membership is activated
                        {
                              m.markAttendance();//marking attendance for member
                              //showing message
                              JOptionPane.showMessageDialog(null,"CheckIn sucessfully done for ID: "+id6+" Attendance: "+m.getAttendance()+" loyalty points: "+m.getLoyaltyPoints());
                              
                        }
                        else// member is not active
                        {
                            //showing message
                            JOptionPane.showMessageDialog(null,"Member is not activate,activate first","Error",JOptionPane.ERROR_MESSAGE);
                            
                        }
                        break;//exiting the loop once member is matched
                    }
                }
                if(!k)//no id was found
                {
                    JOptionPane.showMessageDialog(null,"ID not found","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(NumberFormatException o)// checking if id is not valid
            {
                JOptionPane.showMessageDialog(null,"Invalid id !","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        //for checkin
        if(a.getSource()==lb12)
        {
            //close frame 4
            frame4.dispose();
            
            //reset all input field
            textf.setText("");
            textf1.setText("");
            date8.setSelectedIndex(0);
            month7.setSelectedIndex(0);
            year6.setSelectedIndex(0);
            textf3.setText("");
            textf5.setText("");
            textf6.setText("");
            textf7.setText("");
            textf8.setText("");                
            area.setText("");
            male.setSelected(false);
            female.setSelected(false);
            plan2.setSelectedIndex(0);
            source2.setSelectedIndex(0);
            date2.setSelectedIndex(0);
            month1.setSelectedIndex(0);
            year1.setSelectedIndex(0);
        }
        //button in frame10
        if(a.getSource()==b7)
        {
            frame10.dispose();//closing frame10
            //reset all form field
            textf.setText("");
            textf1.setText("");
            date8.setSelectedIndex(0);
            month7.setSelectedIndex(0);
            year6.setSelectedIndex(0);
            textf3.setText("");
            textf5.setText("");
            textf6.setText("");
            textf7.setText("");
            textf8.setText("");                
            area.setText("");
            male.setSelected(false);
            female.setSelected(false);
            plan2.setSelectedIndex(0);
            source2.setSelectedIndex(0);
            date2.setSelectedIndex(0);
            month1.setSelectedIndex(0);
            year1.setSelectedIndex(0);
        }
        //button to veiw regular member detail
        if(a.getSource()==lb10)
        {
            try
            {
                int id6=Integer.parseInt(t14.getText());//reading input text to get id
                boolean u=false; //to check if member is found
                //iteration through the gym member list
                for(GymMember m1:Gym)
                {
                    if(m1.getId()==id6&&m1 instanceof RegularMember)
                    {
                        u=true;
                        //showing member detail in message dialog
                        JOptionPane.showMessageDialog(null,
                                "Member Type: Regular\n" +
                                "ID: "+m1.getId()+"\n"+
                                "Name: "+m1.getName()+"\n"+
                                "Location: "+m1.getLocation()+"\n"+
                                "Phone: "+m1.getPhone()+"\n"+
                                "Email: "+m1.getEmail()+"\n"+
                                "Gender: "+m1.getGender()+"\n"+
                                "DOB: "+m1.getDOB()+"\n"+
                                "Membership Start Date: "+m1.getMembershipStartDate()+"\n"+
                                "Attendance: "+m1.getAttendance()+"\n"+
                                "Loyalty Points: "+m1.getLoyaltyPoints()+"\n"+
                                "Active Status: "+(m1.getActiveStatus()? "Active":"Deactivate"),
                                "Regular Members Details", JOptionPane.INFORMATION_MESSAGE);
                                break;// exit the loop once found
                                
                    }
                }
                //if no matching was found
                if(!u)
                {
                    JOptionPane.showMessageDialog(null,"Member ID not found","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(NumberFormatException u1)//checking id validation
            {
                JOptionPane.showMessageDialog(null,"Please enter valid ID","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            frame12.dispose();//close the member details frame
            t14.setText("");//reset teh input field
        }
        // for view all details
        if(a.getSource()==b11)
        {
            String details=""; // for storing regular member details
            boolean d=false; // for finding if regular member is found
            //looping through Gym meber list
            for(GymMember m1: Gym)
            {
                // casting to regular member for accessing regular method methods
                if(m1 instanceof RegularMember)
                {
                    RegularMember m2 =(RegularMember) m1;
                    String plan=m2.getPlan();
                    double price=m2.getPrice();
                    d=true;// telling that regular member information is found
                    //for displaying the information
                    String memberDetails=
                        "Member Type: Regular\n"+
                        "ID: "+m2.getId()+"\n" +
                        "Name: "+m2.getName()+"\n"+
                        "Location: "+m2.getLocation()+"\n"+
                        "Phone: "+m2.getPhone()+"\n"+
                        "Email: "+m2.getEmail()+"\n"+
                        "Gender: "+m2.getGender()+"\n"+
                        "DOB: "+m2.getDOB()+"\n"+
                        "Membership Start Date: "+m2.getMembershipStartDate()+ "\n"+
                        "Plan: "+m2.getPlan()+"\n"+
                        "Amount Paid: Rs. "+m2.getPrice()+"\n"+
                        "Attendance: "+m2.getAttendance()+"\n"+
                        "Loyalty Points: "+m2.getLoyaltyPoints()+ "\n"+
                        "Active Status: "+(m2.getActiveStatus()? "Active":"Deactivated")+"\n"+
                        "-------------------------------------------------------------------------------\n";
                        details=details+memberDetails;//appending all details 
                    
                }

            }
            //if regular member was found then show frames
            if(d)
            {
                frame1.setVisible(true);
                frame15.setVisible(true);
                frame12.setVisible(false);
                //creating text area for displaying details
                JTextArea area=new JTextArea(details);
                area.setEditable(false);
                //adding scroll for text area
                JScrollPane scroll=new JScrollPane(area);
                scroll.setBounds(30,25,600,700);
                scroll.setBackground(new Color(173,216,230));
                //setting size to the text area
                area.setPreferredSize(new Dimension(400,300));
                frame15.add(scroll);
                
                
            }
            else
            {
                JOptionPane.showMessageDialog(null,"No regular member found!","Information",JOptionPane.INFORMATION_MESSAGE);
            }
            
            
        }
        
        //closing price details
        if(a.getSource()==lb4)
        {
            frame6.dispose();
        }
        if(a.getSource()==lb5)
        {
            frame7.dispose();
        }
        if(a.getSource()==lb6)
        {
            frame8.dispose();
        }
        if(a.getSource()==lb7)
        {
            frame9.dispose();
        }
        //premium member submit button
        if(a.getSource() == b10)
        {
            //fetching all input values
            try
            {
            int id=Integer.parseInt(textf9.getText());
            String name=textf10.getText();
            String gender=male1.isSelected()? "Male":"Female";
            String datevalues2=(String) date6.getSelectedItem();
            String month4=(String) month5.getSelectedItem();
            String year3=(String) year4.getSelectedItem();
            String location=textf12.getText();
            String phone=textf14.getText();
            String email=textf15.getText();
            String amountPaid=textf16.getText();
            String loyaltyPoints=textf17.getText();
            String referralSource=(String) source5.getSelectedItem();
            String datevalues1=(String) date3.getSelectedItem();
            String month=(String) month3.getSelectedItem();
            String year=(String) year2.getSelectedItem();
            String membershipStartDate=datevalues1 + " "+month + " " + year;
            String personalTrainer=(String) trainer2.getSelectedItem();
            String DOB=datevalues2+" "+month4+" "+year3;
            //input validation
            if(textf9.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"please enter your ID");
                return;
            }
            
            //check if the entered id already exits
            int id4=Integer.parseInt(textf9.getText());
            for(GymMember m: Gym)
            {
                if(m.getId() == id4)
                {
                    JOptionPane.showMessageDialog(frame2,"This ID already exists.","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            
            if(textf10.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"please enter your Name");
                return;
            }
            if(!male1.isSelected() && !female1.isSelected())
            {
                JOptionPane.showMessageDialog(null,"please enter your Gender");
                return;
            }
            if(datevalues2 == null || month4== null || year3== null)
            {
                JOptionPane.showMessageDialog(null,"please enter your date of birth");
                return;
            }
            if(textf12.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"please enter your location");
                return;
            }
            if(textf14.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"please enter your phone");
                return;
            }
            if(textf15.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"please enter your email");
                return;
            }
            if(textf16.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"please enter your Amount Paid");
                return;
            }
            if(referralSource.isEmpty())
            {
                JOptionPane.showMessageDialog(null,"please enter your referral source");
                return;
            }
            if(datevalues1==null||month==null||year==null)
            {
                JOptionPane.showMessageDialog(null,"please enter your date of Membership Start date");
                return;
            }
            
            
            
            //creating a new premium member object and adding it to thte gym list
            PremiumMember member1=new PremiumMember(id,name,location,phone,email,gender,DOB,membershipStartDate,personalTrainer);
            
            Gym.add(member1);
            JOptionPane.showMessageDialog(null,"Member added successfully!");
            }
            catch(NumberFormatException e1)
            {
                JOptionPane.showMessageDialog(frame3,"Invalid ID","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            //resetting the for mand disposing the registration frame
            frame3.dispose();
            textf9.setText("");
            textf10.setText("");
            date6.setSelectedIndex(0);
            month5.setSelectedIndex(0);
            year4.setSelectedIndex(0);
            textf12.setText("");
            textf14.setText("");
            textf15.setText("");
            textf16.setText("");
            textf17.setText("");               
            gender1.clearSelection();
            source2.setSelectedIndex(0);
            date3.setSelectedIndex(0);
            month3.setSelectedIndex(0);
            year2.setSelectedIndex(0);
        }
        
        //button for reset
        if(a.getSource()==b4)
        {
                textf9.setText("");
                textf10.setText("");
                date6.setSelectedIndex(0);
                month5.setSelectedIndex(0);
                year4.setSelectedIndex(0);
                textf12.setText("");
                textf14.setText("");
                textf15.setText("");
                textf16.setText("");
                textf17.setText("");               
                male1.setSelected(false);
                female1.setSelected(false);
                source2.setSelectedIndex(0);
                date3.setSelectedIndex(0);
                month3.setSelectedIndex(0);
                year2.setSelectedIndex(0);
        }
        //for activation or deactivation button
        if(a.getSource()==lb8||a.getSource()==lb9)
            {
                try{
                    int idp=Integer.parseInt(t13.getText());
                    boolean f1=false;
                    for(GymMember e1:Gym)
                    {
                        //checking if t he member is premium member and id matches
                        if(e1 instanceof PremiumMember && e1.getId()==idp)
                        {
                            PremiumMember pm=(PremiumMember) e1;
                            if(a.getSource()==lb8)
                            {
                                pm.activeMembership();
                                JOptionPane.showMessageDialog(frame11,"Member ID"+idp+"activated");
                            }
                            else if(a.getSource() == lb9)
                            {
                                pm.deactivateMembership();
                                JOptionPane.showMessageDialog(frame11,"Member ID"+idp+"deactivated");
                            }
                            f1=true;
                            break;
                        }
                    }
                    if(!f1)
                    {
                      JOptionPane.showMessageDialog(frame11,"ID not found","ERROR",JOptionPane.ERROR_MESSAGE);  
                    }
                }
                catch(NumberFormatException s1)
                {
                    JOptionPane.showMessageDialog(null,"Enter valid ID");
                }
            }
            
        if(a.getSource()==lb8)
            {
                frame11.dispose();//disposing the frame
                //resetting all the value
                textf9.setText("");
                textf10.setText("");
                date6.setSelectedIndex(0);
                month5.setSelectedIndex(0);
                year4.setSelectedIndex(0);
                textf12.setText("");
                textf14.setText("");
                textf15.setText("");
                textf16.setText("");
                textf17.setText("");               
                male1.setSelected(false);
                female1.setSelected(false);
                source2.setSelectedIndex(0);
                date3.setSelectedIndex(0);
                month3.setSelectedIndex(0);
                year2.setSelectedIndex(0);
            }
            
        if(a.getSource()==lb9)
            {
                frame11.dispose();//disposing the frame
                //reseting the value
                textf9.setText("");
                textf10.setText("");
                date6.setSelectedIndex(0);
                month5.setSelectedIndex(0);
                year4.setSelectedIndex(0);
                textf12.setText("");
                textf14.setText("");
                textf15.setText("");
                textf16.setText("");
                textf17.setText("");               
                male1.setSelected(false);
                female1.setSelected(false);
                source2.setSelectedIndex(0);
                date3.setSelectedIndex(0);
                month3.setSelectedIndex(0);
                year2.setSelectedIndex(0);
            }
           //checkin button 
        if(a.getSource()==lb3)
        {
            try{
                int id3=Integer.parseInt(t3.getText());
                boolean k5=false;
                //iteration for gymmeber objects to find a matching membe by id
                for(GymMember m5:Gym)
                {
                    //checking if the member id matches
                    if(m5.getId()==id3)
                    {
                        k5=true;
                        //checking if member is active,mark their attendance
                        if(m5.getActiveStatus())
                        {
                              m5.markAttendance();
                              JOptionPane.showMessageDialog(null,"CheckIn sucessfully done for ID: "+id3+" Attendance: "+m5.getAttendance()+" loyalty points: "+m5.getLoyaltyPoints());
                              
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Member is not activate,activate first","Error",JOptionPane.ERROR_MESSAGE);
                            
                        }
                        break;//exit the loop once the member is not found
                    }
                }
                //if no matching found display error message
                if(!k5)
                {
                    JOptionPane.showMessageDialog(null,"ID not found","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(NumberFormatException o5)
            {
                JOptionPane.showMessageDialog(null,"Invalid id !","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        if(a.getSource()==lb3)
            {
                frame5.dispose();//disposing teh frame
                //reseting the value
                textf9.setText("");
                textf10.setText("");
                date6.setSelectedIndex(0);
                month5.setSelectedIndex(0);
                year4.setSelectedIndex(0);;
                textf12.setText("");
                textf14.setText("");
                textf15.setText("");
                textf16.setText("");
                textf17.setText("");               
                male1.setSelected(false);
                female1.setSelected(false);
                source2.setSelectedIndex(0);
                date3.setSelectedIndex(0);
                month3.setSelectedIndex(0);
                year2.setSelectedIndex(0);
            }
            //button for premium member detail
        if(a.getSource()==lb11)
        {
            try
            {
                int id7=Integer.parseInt(t15.getText());
                boolean u5=false;
                for(GymMember m6:Gym)
                {
                    if(m6.getId()==id7&&m6 instanceof PremiumMember)
                    {
                        u5=true;
                        //displaying the detail of premium member in a dialog box
                        JOptionPane.showMessageDialog(null,
                                "Member Type: Premium\n" +
                                "ID: "+m6.getId()+"\n"+
                                "Name: "+m6.getName()+"\n"+
                                "Location: "+m6.getLocation()+"\n"+
                                "Phone: "+m6.getPhone()+"\n"+
                                "Email: "+m6.getEmail()+"\n"+
                                "Gender: "+m6.getGender()+"\n"+
                                "DOB: "+m6.getDOB()+"\n"+
                                "Membership Start Date: "+m6.getMembershipStartDate()+"\n"+
                                "Attendance: "+m6.getAttendance()+"\n"+
                                "Loyalty Points: "+m6.getLoyaltyPoints()+"\n"+
                                "Active Status: "+(m6.getActiveStatus()? "Active":"Deactivate")+"\n",
                                "Premium Members Details", JOptionPane.INFORMATION_MESSAGE);
                                break;
                                
                    }
                }
                if(!u5)
                {
                    JOptionPane.showMessageDialog(null,"Member ID not found","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(NumberFormatException u6)
            {
                JOptionPane.showMessageDialog(null,"Please enter valid ID","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            frame13.dispose();
            t15.setText("");
        }
        
        if(a.getSource()==b12)
        {
            String details1="";// to store premium member details
            boolean d1=false;// to check if premium member is found
            //looping through gym member list
            for(GymMember m3: Gym)
            {   //checking if the current member is instance of premium member
                if(m3 instanceof PremiumMember)
                {
                    //casting premium member to access methods of it
                    PremiumMember m4 =(PremiumMember) m3;
                    double price1=m4.getPaidAmount();//getting amount paid
                    d1=true;
                    //for displaying the member details
                    String memberDetails1=
                        "Member Type: Premium\n"+
                        "ID: "+m4.getId()+"\n" +
                        "Name: "+m4.getName()+"\n"+
                        "Location: "+m4.getLocation()+"\n"+
                        "Phone: "+m4.getPhone()+"\n"+
                        "Email: "+m4.getEmail()+"\n"+
                        "Gender: "+m4.getGender()+"\n"+
                        "DOB: "+m4.getDOB()+"\n"+
                        "Membership Start Date: "+m4.getMembershipStartDate()+ "\n"+
                        "Amount Paid: Rs. "+m4.getPaidAmount()+"\n"+
                        "Attendance: "+m4.getAttendance()+"\n"+
                        "Loyalty Points: "+m4.getLoyaltyPoints()+ "\n"+
                        "Active Status: "+(m4.getActiveStatus()? "Active":"Deactivated")+"\n"+
                        "-------------------------------------------------------------------------------\n";
                        details1=details1+memberDetails1;//appending all details
                    
                }

            }
            //if member found then showing frames
            if(d1)
            {
                frame1.setVisible(true);
                frame16.setVisible(true);
                frame13.setVisible(false);
                //creating text area for displaying member details
                JTextArea area1=new JTextArea(details1);
                area.setEditable(false);
                //adding scroll to text area
                JScrollPane scroll1=new JScrollPane(area1);
                scroll1.setBounds(30,20,600,700);
                scroll1.setBackground(new Color(173,216,230));
                area1.setPreferredSize(new Dimension(400,300));
                frame16.add(scroll1);
                
                
            }
            else
            {
                JOptionPane.showMessageDialog(null,"No premium member found!","Information",JOptionPane.INFORMATION_MESSAGE);
            }
            
            
        }
        
        //button for discount
        if(a.getSource()==b5)
        {
            try
            {
                int id8=Integer.parseInt(t15.getText());
                String inputAmount=JOptionPane.showInputDialog(frame13,"Enter paid amount: ");
                double paidAmount=Double.parseDouble(inputAmount);
                boolean found=false;
                for(GymMember r:Gym)
                {
                    if(r.getId()==id8 && r instanceof PremiumMember)
                    {
                        found=true;
                        PremiumMember pm1=(PremiumMember) r;
                        //getting teh paid amont and pay due amount for premium member
                        String payment=pm1.payDueAmount(paidAmount);
                        //calculating and applying discount for full payment
                        pm1.calculateDiscount();
                        double d=pm1.getDiscountAmount();
                        //show a message
                        if(pm1.getIsFullPayment())
                        {
                            JOptionPane.showMessageDialog(frame13,payment +" Discount Applied: Rs"+d,"Payment and Discount Information",JOptionPane.INFORMATION_MESSAGE);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(frame13,payment +" No Discount given,full payment not done.","Payment and Discount Info",JOptionPane.WARNING_MESSAGE);
                        }
                        break;
                    }
                }
                if(!found)
                {
                    JOptionPane.showMessageDialog(frame13,"Member not found or is not in premium","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(frame13,"Please enter a valid ID","ERROR",JOptionPane.ERROR_MESSAGE);
                }
        }
        
        //for revert button
        if(a.getSource()==b8)
        {
            try
            {
                int id9=Integer.parseInt(t16.getText());
                String selectedtype=(String) p3.getSelectedItem();
                boolean found1=false;
                for(GymMember k8:Gym)
                {
                   if(k8.getId()==id9)
                   {
                       found1=true;
                       //for handling regular and premium member removal based on selection
                       if(selectedtype.equalsIgnoreCase("Regular") && k8 instanceof RegularMember)
                       {
                           RegularMember rm=(RegularMember) k8;
                           //prompt for reason and revert the regular member
                           String reason=JOptionPane.showInputDialog(frame14,"Enter your removal reason");
                           String revertReason=rm.revertRegularMember(reason);
                           JOptionPane.showMessageDialog(frame14,"Regular member reverted.\nReason: "+revertReason,"Success",JOptionPane.INFORMATION_MESSAGE);
                           //Gym.remove(k8);
                       }
                       else if(selectedtype.equalsIgnoreCase("Premium") && k8 instanceof PremiumMember)
                       {
                           PremiumMember pm=(PremiumMember) k8;
                           //revert premium member
                           pm.revertPremiumMember();
                           JOptionPane.showMessageDialog(frame14,"Premium member reverted","Success",JOptionPane.INFORMATION_MESSAGE);
                           //Gym.remove(k8);
                       }
                       else
                       {
                           JOptionPane.showMessageDialog(frame14,"No match with type","ERROR",JOptionPane.WARNING_MESSAGE);
                       }
                       break;
                   }
                }
                if(!found1)
                {
                    JOptionPane.showMessageDialog(frame14,"Member not found","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(NumberFormatException s8)
            {
                JOptionPane.showMessageDialog(frame14,"Please enter valid id","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        if(a.getSource()==b9)
        {
            //hiding frame 14 and frame1
            frame14.setVisible(false);
            frame1.setVisible(false);
        }
        
        
        if(a.getSource()==b13)
        {
            //writing in file
            try(FileWriter writes=new FileWriter("MemberDetails.txt"))
        {
        String selectedType=(String) p4.getSelectedItem();//selecting member to get information
        //writing header on the basis of member type
        if(selectedType.equalsIgnoreCase("Regular"))
        {
            writes.write(String.format("%-5s %-15s %-15s %-15s %-25s  %-20s %-10s %-10s %10s %-15s %-10s\n",
                                            "ID","Name","Location","Phone","Email","Membership Start Date","Plan","Price","Attendance","Loyalty Points","Active Status"));
        }
        else if(selectedType.equalsIgnoreCase("Premium"))
        {
            writes.write(String.format("%-5s %-15s %-15s %-15s %-25s %-20s %-10s %-10s %-15s %-10s %-15s %-15s %-15s\n",
                                        "ID","Name","Location","Phone","Email","Membership Start Date","Paid Amount","Attendance","Loyalty Points","Active Status","Full Payment","Discount","Trainer"));
        } 
        //looping through Gym list and writing matched member type details
        for(GymMember y1:Gym)
        {
                // checking if selected type is regular and is an instance of regularmember
                if( selectedType.equalsIgnoreCase("Regular") && y1 instanceof RegularMember)
                {
                
                    RegularMember member2=(RegularMember) y1;
                    //writing details in proper format in file
                    writes.write(String.format("%-5d %-15s %-15s %-15s %-25s %-20s   %-10s %-10.2f %-10d %-15.2f %-10s\n",
                                                member2.getId(),
                                                member2.getName(),
                                                member2.getLocation(),
                                                member2.getPhone(),
                                                member2.getEmail(),
                                                member2.getMembershipStartDate(),
                                                member2.getPlan(),
                                                member2.getPrice(),
                                                member2.getAttendance(),
                                                member2.getLoyaltyPoints(),
                                                (member2.getActiveStatus()? "Activate" : "Deactivate")
                                                ));
                     
                
                }
                //checking if selected type is premium and is an instance of premiummember
                else if(selectedType.equalsIgnoreCase("Premium") && y1 instanceof PremiumMember)
                {
                    PremiumMember member3=(PremiumMember) y1;
                    //writing details in proper format in file

                    writes.write(String.format("%-5d %-15s %-15s %-15s %-25s %-20s  %-10.2f %-10d %-15.2f %-10s %-15b %-15.0f %-15s\n",
                                                member3.getId(),
                                                member3.getName(),
                                                member3.getLocation(),
                                                member3.getPhone(),
                                                member3.getEmail(),
                                                member3.getMembershipStartDate(),
                                                member3.getPaidAmount(),
                                                member3.getAttendance(),
                                                member3.getLoyaltyPoints(),
                                                (member3.getActiveStatus()? "Activate" : "Deactivate"),
                                                member3.getIsFullPayment(),
                                                member3.getDiscountAmount(),
                                                member3.getPersonalTrainer()
                                                ));
                     

                }
                
        }       
        JOptionPane.showMessageDialog(frame17,"Member Details saved sucessfully.","member details",JOptionPane.INFORMATION_MESSAGE);

        }
        catch(IOException f)
        {
            JOptionPane.showMessageDialog(null,"Error in writing in file"+ f.getMessage());            
        }
        }
        
        
       if (a.getSource() == b14)
        {
            String selectedType = (String) p4.getSelectedItem(); //getting selected type
            try (FileReader reader1 = new FileReader("MemberDetails.txt")) 
            {
                //holding the file content
                StringBuilder cont = new StringBuilder();
                int character;
                //reaing the file content character by character
                while ((character = reader1.read()) != -1) 
                {
                    //appending each character read from file to the StringBuilder
                    cont.append((char) character);
                }
                //checking if file is file
                if (cont.length() == 0) 
                {
                    JOptionPane.showMessageDialog(null, "No Members to Display!");
                    return;
                }
                //spliting the complete content into lines
                String[] lines1 = cont.toString().split("\n");
                //checking if there are any member details in the file
                if (lines1.length <= 1)
                {
                    JOptionPane.showMessageDialog(null, "No Members to Display!");
                    return;
                }
                //initializing the display text with this heading
                String displaysText = selectedType.toUpperCase() + " MEMBER DETAILS\n--------------------\n";

                // Skipping header and parsing file line by line
                for (int i = 1; i < lines1.length; i++) 
                {
                    //getting the current line from array
                    String line = lines1[i];
                    //skipping the line if it is empty
                    if (line.isEmpty()) continue;
                    //spliting the current lines to extract files
                    String[] index = line.split("\\s+");
                    //if selected type is regular then display details of regular member
                    if (selectedType.equalsIgnoreCase("Regular"))
                    {
                        if (index.length < 13) continue;//skipping if fields are missing
                        
                        String id = index[0];
                        String name = index[1];
                        String location = index[2];
                        String phone = index[3];
                        String email = index[4];
                        String membershipStartDate=index[5]+index[6]+index[7];
                        String plan=index[8];
                        String price=index[9];
                        String attendance=index[10];
                        String points= index[11];
                        String status = index[12].equalsIgnoreCase("Activate") ? "true" : "false";

                        // for displaying the details of member
                        displaysText += "ID: " + id + "\n";
                        displaysText += "NAME: " + name + "\n";
                        displaysText += "LOCATION: " + location + "\n";
                        displaysText += "PHONE: " + phone + "\n";
                        displaysText += "EMAIL: " + email + "\n";
                        displaysText += "START DATE: " + membershipStartDate + "\n";
                        displaysText += "PLAN: "+ plan + "\n";
                        displaysText += "PRICE: 6500.0\n";
                        displaysText += "Attendance: "+attendance+"\n";
                        displaysText += "Loyalty Points: "+ points + "\n";
                    
                        displaysText += "ACTIVE STATUS: " + status + "\n";
                        displaysText += "--------------------\n";

                    } 
                //if selected type is regular then display details of regular member
                else if (selectedType.equalsIgnoreCase("Premium"))
                {
                    if (index.length < 15) continue;//skipping the missing fields
    
                        String id = index[0];
                        String name = index[1];
                        String location = index[2];
                        String phone = index[3];
                        String email = index[4];
                        String membershipStartDate = index[5]+index[6]+index[7];
                        String paidAmount = index[8];
                        String attendance = index[9];
                        String loyaltyPoints = index[10];
                        String status = index[11];
                        String fullPayment = index[12];
                        String discount = index[13];
                        String trainer = index[14];
                        //for displaying details of premium member
                        displaysText += "ID: " + id + "\n";
                        displaysText += "NAME: " + name + "\n";
                        displaysText += "LOCATION: " + location + "\n";
                        displaysText += "PHONE: " + phone + "\n";
                        displaysText += "EMAIL: " + email + "\n";
                        displaysText += "START DATE: " + membershipStartDate + "\n";
                        displaysText += "PAID AMOUNT: " + paidAmount + "\n";
                        displaysText += "ATTENDANCE: " + attendance + "\n";
                        displaysText += "LOYALTY POINTS: " + loyaltyPoints + "\n";
                        displaysText += "STATUS: " + status + "\n";
                        displaysText += "FULL PAYMENT: " + fullPayment + "\n";
                        displaysText += "DISCOUNT: " + discount + "\n";
                        displaysText += "TRAINER: " + trainer + "\n";
                        displaysText += "--------------------\n";
                }
            }
        //displaying the details of member in format form in text area
        JTextArea area = new JTextArea(displaysText);
        area.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(area);
        JOptionPane.showMessageDialog(null, scrollPane, selectedType + " Member Details", JOptionPane.INFORMATION_MESSAGE);

    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error reading from file: " + e.getMessage());
    }
    }




    if(a.getSource()==lb12)
    {
            try
            {
                //convert the ID from text field to integer
                int id= Integer.parseInt(t2.getText());
                GymMember forupgrade=null;// initializing variable to hold the member to be upgraded
                //searching for gymember with entered ID
                for(GymMember r0: Gym)
                {
                    if(r0.getId()==id)
                    {
                        forupgrade=r0;
                        break;// stopping to search if found
                    }
                }
                //if member is found
                if(forupgrade !=null)
                {
                    //check if the member is regular member
                    if(forupgrade instanceof RegularMember)
                    {
                        RegularMember regular0=(RegularMember) forupgrade;
                        //trying to upgrade member plan
                        String result= regular0.upgradePlan(regular0.getPlan());
                        //if member is eligible then upgrade
                        if(regular0.getIsEligibleForUpgrade())
                        {
                            p2.setSelectedItem(regular0.getPlan());//updating the plan in combo box
                            JOptionPane.showMessageDialog(frame4,"Member got upgraded"+ regular0.getPlan());
                        }
                        //if already at highest then not allowing
                        else if(!result.equals(regular0.getPlan()))
                        {
                            JOptionPane.showMessageDialog(frame4,"Upgration already reached at highest plan");
                            
                        }
                        //if attendance is not fulfilled
                        else
                        {
                            JOptionPane.showMessageDialog(frame4,"Attendance Limit is not fullfilled","Upgrade",JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                //if member with entered ID is not found
                else
                {
                    JOptionPane.showMessageDialog(frame4,"Member not found","ERROR",JOptionPane.ERROR_MESSAGE);
                    
                }
            }
            //entered id is not valid
            catch(NumberFormatException w)
            {
                JOptionPane.showMessageDialog(frame4,"Invalid ID","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            
        }
                   

        
    } 
    //main method
    public static void main(String[] args)
    {
        //creating an instance of GymGUI for starting the gym management GUI application
        new GymGUI();
        
    }
}
