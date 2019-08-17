package org.phone;

public class PhoneInfo {

	public void PhoneName() 
	{
	System.out.println("Model :- Redme Note 5 Pro");	
	}
	
	public void PhoneMiuiNum() 
	{
	System.out.println("User interface : MIUI 10.3.1.0 Stable");	
	}
    public void Camera()
    {
	System.out.println("Camera : Front -12 Mp ... Rear -8 Mp");
    }
	public void Storage()
	{
	System.out.println("Storage:- 64GB");
	}
	public void OsName()
	{
	System.out.println("Android Version :- Android Pie");
	}
	

	public static void main(String[] args) 
	{
	PhoneInfo xiomi=new PhoneInfo();
	xiomi.PhoneName();
	xiomi.PhoneMiuiNum();
	xiomi.Camera();
	xiomi.Storage();
	xiomi.OsName();
	}

}
