package mobilePhone;

//import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    	
        // Instantiate a brand new MobilePhone object and pass it the 4 parameters for your phone
    	//(Brand, Model, Phone Number, and Storage Capacity)
    	
    	MobilePhone mobilePhone = new MobilePhone("Iphone", "14 Pro Max",123456,"256GB");
        
    	
        // Call the makeCall() method using your phone object - remember to pass it
    	//a phone number as input!
    	mobilePhone.makeCall(916123456);
        
        // Call the installApp() method using your phone object - remember to pass it an
    	//app name as input!
        mobilePhone.installApp("Tik Toc");
        
        // Display your phones information using the displayInfo() method!
        mobilePhone.displayInfo();
        //************************************************************************************
        
        
        // Just for practice
        // Using ArrayList to print the objects
       /* ArrayList<MobilePhone> mp = new ArrayList<MobilePhone>();
        MobilePhone mobilePhone1 = new MobilePhone("Iphone", "14 Pro Max",123456,"256GB");
        MobilePhone mobilePhone2 = new MobilePhone("Iphone", "14 Pro Max",123456,"256GB");
        MobilePhone mobilePhone3 = new MobilePhone("Iphone", "14 Pro Max",123456,"256GB");
        
        mp.add(mobilePhone1);
        mp.add(mobilePhone2);
        mp.add(mobilePhone3);
        
        for(MobilePhone m : mp) {
        	System.out.println("---------------------");
        	System.out.println("Brand:"+m.brand+"\nModel:"+m.model+
        			"\nPhone Number:"+m.phoNumber+"\nStorage Capaciyt:"+m.storageCapacity);
        }*/
        
    }
}