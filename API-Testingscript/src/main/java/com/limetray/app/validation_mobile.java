package com.limetray.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class validation_mobile extends send_email_api_output  {
 	
	
	
	
	@SuppressWarnings("unchecked")
	public static void validation_mobile_number_ten_digit() throws IOException
	{
	
		try 
		{
		
		name = new Object(){}.getClass().getEnclosingMethod().getName();
		String public_key = "crm";
	        String private_key = "6OXsajdlsFnFZjeyRb9k";
	        URL url = new URL("http://test.crm.limetray.in/crm/public/user/create");
	        URL url1 = new URL("http://test.crm.limetray.in/crm/public/user/fetch/540090");
	        
	        HttpURLConnection myURLConnection = (HttpURLConnection)url.openConnection();
	        myURLConnection.setDoOutput(true);
	        myURLConnection.setRequestMethod("POST");
	        myURLConnection.setRequestProperty("Content-Type", "application/json");        
	        myURLConnection.setRequestProperty("Header", "");
	        JSONObject add = new JSONObject();
	        
	       /* Mobile Digit validation check */
	        add.put("first_name",56546);
	        add.put("user_number", "756123014555");
	        add.put("cloud_site_id", "230");
	        add.put("user_source", "7");
	        
	        JSONObject first_digit = new JSONObject();
	        
	        /*  First Digit Mobile number check  */
	        
	        first_digit.put("first_name",56546);
	        first_digit.put("user_number", "7894561230");
	        first_digit.put("cloud_site_id", "230");
	        first_digit.put("user_source", "7");
//	        
	        OutputStreamWriter writer = new OutputStreamWriter(myURLConnection.getOutputStream());
	        writer.write(add.toString());
	        writer.flush();
	        String line = null;
	        
	    
	    	
	        
	        InputStream getContent = null;
	        if(myURLConnection.getResponseCode() == 400){
	        	System.out.println(myURLConnection.getResponseCode());
	        	System.out.println("here the status 400");
	        	getContent = myURLConnection.getErrorStream();
	            
	            //getContent = myURLConnection.getInputStream();
	        }else{
	            System.out.println("I'm here status other than 400");
	           response_code = myURLConnection.getResponseCode();
	 	       
	            System.out.println(myURLConnection.getResponseCode());
		          
	        	getContent = myURLConnection.getInputStream();
	            
	        }
		
            
            BufferedReader br = new BufferedReader(new InputStreamReader(getContent));
            
            StringBuilder sb = new StringBuilder();
        
            int charNumber;
            while((charNumber = br.read()) != -1){
                sb.append((char) charNumber);
            }
             // JSONArray lang= (JSONArray) JSONObject.get();
                 String jsonText = sb.toString();
      //          System.out.println(jsonText);
             ObjectMapper mapper = new ObjectMapper();
                 JsonNode rootNode = mapper.readTree(jsonText);
                 
                 Iterator<JsonNode> it = rootNode.path("message").path("user_number").getElements();
                 
                 while(it.hasNext()){
                 	String a = it.next().asText();
                // 	System.out.println("*******************************************************************************");
                   System.out.println("\n");
                   sb_email_text.append(System.lineSeparator());
                   System.out.println("=================================================================================================");
                   sb_email_text.append("=================================================================================================");
                   System.out.println("\n");
                   sb_email_text.append(System.lineSeparator());
                                     
                   System.out.println(" Test Case 1 : Mobile Number Validation on API"+"\n");
                   sb_email_text.append("Test Case 1 : Mobile Number Validation on API"+"\n");
                 	//System.out.println("\n");
                   System.out.println("=================================================================================================");
                   sb_email_text.append("=================================================================================================");
                   sb_email_text.append(System.lineSeparator());
                          
                   System.out.println("1.1" + "\n");
                   sb_email_text.append(System.lineSeparator());
                   
                   sb_email_text.append("1.1").append(System.lineSeparator());
                   System.out.println("****************  Validation check on mobile number digit  ****************"+"\n");
                   sb_email_text.append("****************  Validation check on mobile number digit  ****************").append(System.lineSeparator());
                   sb_email_text.append(System.lineSeparator());
                   
                   System.out.println("Mobile number hit by script : 756123014555");
                   sb_email_text.append("Mobile number hit by script : 756123014555");
                   sb_email_text.append(System.lineSeparator());
                   
                   System.out.println("Response from API :" +" "+a);
                   sb_email_text.append("Response from API :"+" "+a);
                   sb_email_text.append(System.lineSeparator());
                   
                  // System.out.println("==============================================================================");
                                 
                   //  System.out.println(a);
                 }
                    
           // System.out.println(jsonText);
            
        }
	      catch (Exception ex){ 
	    	  System.out.println(ex);
	    	  System.out.println("come in exception");
	    	  
	    	  send_email_api_output.exception_method(ex); 
	      
	      
	      }  
		
		
	
	}
	
	@SuppressWarnings("unchecked")
	public static void validation_mobile_first_digit() throws IOException, ParseException
	{
		
     try 
     {
    	
		name = new Object(){}.getClass().getEnclosingMethod().getName();

		String public_key = "crm";
	        String private_key = "6OXsajdlsFnFZjeyRb9k";
	        URL url = new URL("http://test.crm.limetray.in/crm/public/user/create");
	        URL url1 = new URL("http://test.crm.limetray.in/crm/public/user/fetch/540090");
	        
	        HttpURLConnection myURLConnection = (HttpURLConnection)url.openConnection();
	        myURLConnection.setDoOutput(true);
	        myURLConnection.setRequestMethod("POST");
	        myURLConnection.setRequestProperty("Content-Type", "application/json");        
	        myURLConnection.setRequestProperty("Header", "");
	        
	      
	        
	        JSONObject first_digit = new JSONObject();
	        
	        /*  First Digit Mobile number check  */
	        
	        first_digit.put("first_name",56546);
	        first_digit.put("user_number", "4563210589");
	        first_digit.put("cloud_site_id", "230");
	        first_digit.put("user_source", "7");
//	        
	        OutputStreamWriter writer = new OutputStreamWriter(myURLConnection.getOutputStream());
	        writer.write(first_digit.toString());
	        writer.flush();
	        String line = null;
	        
	       
	        
	        InputStream getContent = null;
	        if(myURLConnection.getResponseCode() == 200){
	            getContent = myURLConnection.getInputStream();
	        }else{
	            getContent = myURLConnection.getErrorStream();
	        }
		
         
         BufferedReader br = new BufferedReader(new InputStreamReader(getContent));
         
         StringBuilder sb = new StringBuilder();
     
         int charNumber;
         while((charNumber = br.read()) != -1){
             sb.append((char) charNumber);
         }
          // JSONArray lang= (JSONArray) JSONObject.get();
              String jsonText = sb.toString();
             JSONParser jsonParser = new JSONParser();
          JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonText);
           String message = (String)jsonObject.get("message");
          // System.out.println(message);
       
          // System.out.println("============================================");
           System.out.println("\n");
           sb_email_text.append(System.lineSeparator());
        	System.out.println("1.2" + "\n");
        	sb_email_text.append("1.2");
        	sb_email_text.append(System.lineSeparator());
            
          System.out.println("****************  Validation check on first mobile number digit  **************** "+"\n");
         sb_email_text.append("****************  Validation check on first mobile number digit  ****************").append(System.lineSeparator());
       	 sb_email_text.append(System.lineSeparator());
         
          System.out.println("Mobile number hit by script : 4563210589");
        sb_email_text.append("Mobile number hit by script : 4563210589");
        sb_email_text.append(System.lineSeparator());
        System.out.println("Response from API :" +" "+message);
         sb_email_text.append("Response from API :" +" "+message);
         sb_email_text.append(System.lineSeparator());
         
        // System.out.println("==============================================================================");
               // System.out.println("Response from API :" +" "+message);
         
     }catch(Exception ex){System.out.println(ex);
	  System.out.println("come in exception");
	  
	  send_email_api_output.exception_method(ex); 
 }
    		  
    		 
    		
     
                                }
		
		

	
	@SuppressWarnings("unchecked")
	public static void validation_mobile_number_blank_check() throws IOException
	{
	 
		try 
		
		{
			
			name = new Object(){}.getClass().getEnclosingMethod().getName();
			
		 String public_key = "crm";
	        String private_key = "6OXsajdlsFnFZjeyRb9k";
	        URL url = new URL("http://test.crm.limetray.in/crm/public/user/create");
	        URL url1 = new URL("http://test.crm.limetray.in/crm/public/user/fetch/540090");
				
	        HttpURLConnection myURLConnection = (HttpURLConnection)url.openConnection();
	        myURLConnection.setDoOutput(true);
	        myURLConnection.setRequestMethod("POST");
	        myURLConnection.setRequestProperty("Content-Type", "application/json");        
	        myURLConnection.setRequestProperty("Header", "");
	        JSONObject add = new JSONObject();
	        
	       /* Mobile Digit validation check */
	        add.put("first_name",56546);
	        add.put("user_number", "");
	        add.put("cloud_site_id", "230");
	        add.put("user_source", "7");
	        
	            
	        OutputStreamWriter writer = new OutputStreamWriter(myURLConnection.getOutputStream());
	        writer.write(add.toString());
	        writer.flush();  
	        
	        InputStream getContent = null;
	        if(myURLConnection.getResponseCode() == 200){
	            getContent = myURLConnection.getInputStream();
	        }else{
	            getContent = myURLConnection.getErrorStream();
	        }
		
            BufferedReader br = new BufferedReader(new InputStreamReader(getContent));
            
            StringBuilder sb = new StringBuilder();
        
            int charNumber;
            while((charNumber = br.read()) != -1){
                sb.append((char) charNumber);
            }
             // JSONArray lang= (JSONArray) JSONObject.get();
                 String jsonText = sb.toString();
      //      System.out.println(jsonText);
             ObjectMapper mapper = new ObjectMapper();
                 JsonNode rootNode = mapper.readTree(jsonText);
                 
                 Iterator<JsonNode> it = rootNode.path("message").path("user_number").getElements();
                 
                 while(it.hasNext()){
                 	String blank_mobile_number_message = it.next().asText();
                 	System.out.println("\n");
                 	sb_email_text.append(System.lineSeparator());
                   	System.out.println("1.3" + "\n");
                     sb_email_text.append("1.3");
                      sb_email_text.append(System.lineSeparator());
                                           
                   System.out.println("**************** Validation check on blank mobile number input  ****************"+"\n");
                   sb_email_text.append("**************** Validation check  on blank mobile number input  ****************").append(System.lineSeparator());
                   sb_email_text.append(System.lineSeparator());
                   
                   System.out.println("Mobile number hit by script : \"\"");
                   sb_email_text.append("Mobile number hit by script : \"\"");
                   sb_email_text.append(System.lineSeparator());
                     
                   System.out.println("Response from API :" +" "+blank_mobile_number_message);
                   sb_email_text.append("Response from API :" +" "+blank_mobile_number_message);
                   sb_email_text.append(System.lineSeparator());
                   
          //         System.out.println("==============================================================================");
                                 
                   //  System.out.println(a);
                 }
                    
           // System.out.println(jsonText);
            
        }catch(Exception ex){System.out.println(ex);
  	  System.out.println("come in exception");
	  
  	  send_email_api_output.exception_method(ex); 
    }
		
		
	
	}

	@SuppressWarnings("unchecked")
	public static void validation_mobile_number_integer() throws IOException
	{
	
		try 
		{
			
			name = new Object(){}.getClass().getEnclosingMethod().getName();
			
		 String public_key = "crm";
	        String private_key = "6OXsajdlsFnFZjeyRb9k";
	        URL url = new URL("http://test.crm.limetray.in/crm/public/user/create");
	        URL url1 = new URL("http://test.crm.limetray.in/crm/public/user/fetch/540090");
	        
	        HttpURLConnection myURLConnection = (HttpURLConnection)url.openConnection();
	        myURLConnection.setDoOutput(true);
	        myURLConnection.setRequestMethod("POST");
	        myURLConnection.setRequestProperty("Content-Type", "application/json");        
	        myURLConnection.setRequestProperty("Header", "");
	        JSONObject add = new JSONObject();
	        
	       /* Mobile Digit validation check */
	        add.put("first_name",56546);
	        add.put("user_number", "qazwsx");
	        add.put("cloud_site_id", "230");
	        add.put("user_source", "7");
	        
	            
	        OutputStreamWriter writer = new OutputStreamWriter(myURLConnection.getOutputStream());
	        writer.write(add.toString());
	        writer.flush();  
	        
	        InputStream getContent = null;
	        if(myURLConnection.getResponseCode() == 200){
	            getContent = myURLConnection.getInputStream();
	        }else{
	            getContent = myURLConnection.getErrorStream();
	        }
	
            BufferedReader br = new BufferedReader(new InputStreamReader(getContent));
            
            StringBuilder sb = new StringBuilder();
        
            int charNumber;
            while((charNumber = br.read()) != -1){
                sb.append((char) charNumber);
            }
             // JSONArray lang= (JSONArray) JSONObject.get();
                 String jsonText = sb.toString();
      //      System.out.println(jsonText);
             ObjectMapper mapper = new ObjectMapper();
             
             
                 JsonNode rootNode = mapper.readTree(jsonText);
                 
                 Iterator<JsonNode> it = rootNode.path("message").path("user_number").getElements();
                 
                 
                 	String stringmobilenumber = it.next().asText();
                 	System.out.println("\n");
                 	sb_email_text.append(System.lineSeparator());
                    
                     System.out.println("1.4" + "\n");
                    sb_email_text.append("1.4");
                    sb_email_text.append(System.lineSeparator());
                                            	
                   System.out.println("****************  Validation check on string input  ****************"+"\n");
                   sb_email_text.append("****************  Validation check on string input  ****************").append(System.lineSeparator());
                   sb_email_text.append(System.lineSeparator());
                   System.out.println("Mobile number hit by script : qazwsx");
                   sb_email_text.append("Mobile number hit by script : qazwsx");
                   sb_email_text.append(System.lineSeparator());
                   System.out.println("Response from API :" +" "+stringmobilenumber);
                   sb_email_text.append("Response from API :" +" "+stringmobilenumber);
                   sb_email_text.append(System.lineSeparator());
                   System.out.println("==============================================================================");
                   sb_email_text.append(System.lineSeparator());
                   
                   sb_email_text.append("=================================================================================================");
                   sb_email_text.append(System.lineSeparator());
                   
                                  
                   //  System.out.println(a);
                 
                    
           // System.out.println(jsonText);
            
        }catch(Exception ex){System.out.println(ex);
  	  System.out.println("come in exception");
	  
  	  send_email_api_output.exception_method(ex); 
    }
		
			
	
	}

	
	
}
