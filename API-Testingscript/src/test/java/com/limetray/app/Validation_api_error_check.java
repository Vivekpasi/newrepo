package com.limetray.app;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Validation_api_error_check {
  @SuppressWarnings("static-access")
  
 // TEST CASE 1 : Mobile validation

  @Test
  public void Mobile_validation_check (){
  
	  try
	  {
		  
	  
      validation_mobile validation_mobile_object = new validation_mobile();
      validation_mobile_object.validation_mobile_number_ten_digit();
       validation_mobile_object.validation_mobile_first_digit();
  	  validation_mobile_object.validation_mobile_number_blank_check();
  	  validation_mobile_object.validation_mobile_number_integer();
	  }catch(Exception e){}
	  
  }


   @SuppressWarnings("static-access")
@Test(priority=1)

// TEST CASE 2 : User source validation

       public void user_source_validation_check()
      {

	   try 
	   {
		   
	   
      validation_user_source validation_source_object = new validation_user_source();
       validation_source_object.validation_user_source_integer_only();
       validation_source_object.validation_user_source_boundary_values();
	   
	   }catch(Exception ex) {}
	     
      
      }
   
   @SuppressWarnings("static-access")
   
// TEST CASE 3 : User Email validation

   @Test(priority=2)
      public void user_email_validation()
    {
	   try
	   {
		   
		   validation_user_email user_email_object = new validation_user_email();
		   user_email_object.validations_user_email();
		   
	   }catch(Exception ex){}
	   
	   
   }
  
    @SuppressWarnings("static-access")
 // TEST CASE 4 : Cloud_site ID validation

    
    @Test(priority=3)
	public void user_cloud_site_validation()
    {
    	
    	try
    	{
    		
    		validation_cloud_site_id cloud_site_object = new validation_cloud_site_id();
    		cloud_site_object.validation_cloud_site_id_blank();
    		cloud_site_object.validation_cloud_site_id_integer_only();
    		
    	}catch(Exception ex){}
    	
    	
    }
   
   
    @SuppressWarnings("static-access")
    
 // TEST CASE 5 : Mobile Email Combination

	@Test(priority=4)
	public void combination_mobile_email_validation()
    {
    	
    	try
    	{
    		
    		validation_mobile_email mobile_email_object = new validation_mobile_email();
    		mobile_email_object.combination_validation_mobilenumber_email_blank();
    		mobile_email_object.combination_validation_wrongmobile_email();
    		
    	}catch(Exception ex){}
    	
    	
    }
   
    
    
    @SuppressWarnings("static-access")
    
 // TEST CASE 6 : Mobile cloud site id combination

	@Test(priority=5)
	public void combination_mobile_cloud_site_validation()
    {
    	
    	try
    	{
    		
    		validation_mobile_cloud_site_id mobile_cloud_site_id_object = new validation_mobile_cloud_site_id();
    		mobile_cloud_site_id_object.combination_validation_mobilenumber_cloud_site_blank();
    		mobile_cloud_site_id_object.combination_validation_mobilenumber_string_cloud_site();
    		
    	}catch(Exception ex){}
    	
    	
    }
    
    
    @SuppressWarnings("static-access")
    
 // TEST CASE 7 : Mobile first name combination

	@Test(priority=6)
	public void combination_mobile_firstname_validation()
    {
    	
    	try
    	{
    		
    		validation_firstname_mobile firstname_mobile_object = new validation_firstname_mobile();
    				firstname_mobile_object.combination_validation_mobilenumber_first_name_blank();
    				firstname_mobile_object.combination_validation_mobile_number_blank_first_name_check();
    			    
    	}catch(Exception ex){}
    	
    	
    }
   
    @Test(priority=7)
    
    public void send_email_script_output()
    {
    	
    	try
    	{
    send_email_api_output.auto_email();
    	}catch(Exception ex){}
    	
    }
    
    
    }
   
    




