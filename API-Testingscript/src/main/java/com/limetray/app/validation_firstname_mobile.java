package com.limetray.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import  com.sun.org.apache.xml.internal.utils.SAXSourceLocator;
import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException

public class validation_firstname_mobile extends send_email_api_output {
	
	@SuppressWarnings("unchecked")
	public static void combination_validation_mobilenumber_first_name_blank() throws IOException
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
	        add.put("first_name","");
	        add.put("user_number", "");
	        add.put("cloud_site_id", "");
	        add.put("user_source", "7");
	        add.put("user_email", "");
	        
	            
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
              Iterator<JsonNode> it1 = rootNode.path("message").path("first_name").getElements();
              
              
              while(it.hasNext()){
              	String blank_mobile_number_insert = it.next().asText();
              	System.out.println("\n");
              	System.out.println("Test Case 7 : Combination validation check on API (Mobile no. & first name)"+"\n");
              	sb_email_text.append("Test Case 7 : Combination validation check on API (Mobile no. & first name)");
              	sb_email_text.append(System.lineSeparator());

              	System.out.println("==============================================================================");
              
              	 sb_email_text.append("=================================================================================================").append(System.lineSeparator());
                 sb_email_text.append(System.lineSeparator());

              	System.out.println("7.1" + "\n");
              	sb_email_text.append("7.1");
              	sb_email_text.append(System.lineSeparator());

              	System.out.println("****************  Validation check on blank mobile number input & blank  ****************"+"\n");
              	sb_email_text.append("****************  Validation check on blank mobile number input & blank  ****************").append(System.lineSeparator());
              	sb_email_text.append(System.lineSeparator());

              	System.out.println("Mobile number hit by script : \"\"");
              	sb_email_text.append("Mobile number hit by script : \"\"");
              	sb_email_text.append(System.lineSeparator());

              	System.out.println("Response from API :" +" "+blank_mobile_number_insert);
              	sb_email_text.append("Response from API :" +" "+blank_mobile_number_insert);
              	sb_email_text.append(System.lineSeparator());

               }
              
              while(it1.hasNext()){
            	  String blank_firstname_insert_combination_mobile_first_name = it1.next().asText();
            	  
                  
            	  System.out.println("First name hit by script : \"\"");
            	  sb_email_text.append("First name hit by script : \"\"");
            	  sb_email_text.append(System.lineSeparator());

            	  System.out.println("Response from API :" +" "+blank_firstname_insert_combination_mobile_first_name);
            	  sb_email_text.append("Response from API :" +" "+blank_firstname_insert_combination_mobile_first_name);
            	  sb_email_text.append(System.lineSeparator());

            	  // System.out.println("==============================================================================");
                
                 }   
         
     }catch(Exception ex){System.out.println(ex);
	  System.out.println("come in exception");
	  
  	  send_email_api_output.exception_method(ex); 
     }
	}
	

	@SuppressWarnings("unchecked")
	public static void combination_validation_mobile_number_blank_first_name_check() throws IOException
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
	        add.put("first_name"," _fg_sd ");
	        add.put("user_number", "");
	        add.put("cloud_site_id", "");
	        add.put("user_source", "7");
	        add.put("user_email", "");
	        
	            
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
              Iterator<JsonNode> it1 = rootNode.path("message").path("first_name").getElements();
              
              
              while(it.hasNext()){
              	String blank_mobile_number_insert = it.next().asText();
              	
              	System.out.println("\n");
                
            	sb_email_text.append(System.lineSeparator());
                 
              	System.out.println("7.2" + "\n");
              	sb_email_text.append("7.2");            
              	sb_email_text.append(System.lineSeparator());
                System.out.println("**************** Validation check on blank mobile number input & blank  ****************"+"\n");
                sb_email_text.append("**************** Validation check on blank mobile number input & blank  ****************").append(System.lineSeparator());     
                sb_email_text.append(System.lineSeparator());
                System.out.println("Mobile number hit by script : \"\"");
                sb_email_text.append("Mobile number hit by script : \"\"");    
                sb_email_text.append(System.lineSeparator());
                System.out.println("Response from API :" +" "+blank_mobile_number_insert);
                sb_email_text.append("Response from API :" +" "+blank_mobile_number_insert);     
                sb_email_text.append(System.lineSeparator());
               
               }
              
              while(it1.hasNext()){
            	  String blank_firstname_insert_check_validation = it1.next().asText();
                  
            	  System.out.println("First name hit by script : _fg_sd");
            	  sb_email_text.append("First name hit by script : _fg_sd");    
            	  sb_email_text.append(System.lineSeparator());
                  System.out.println("Response from API :" +" "+blank_firstname_insert_check_validation);
                  sb_email_text.append("Response from API :" +" "+blank_firstname_insert_check_validation);     
                  sb_email_text.append(System.lineSeparator());
                  System.out.println("==============================================================================");
                  sb_email_text.append(System.lineSeparator());
                  sb_email_text.append(System.lineSeparator());
                   	  
                  sb_email_text.append("=================================================================================================").append(System.lineSeparator());
                           
                 }   
         
     }catch(Exception ex){System.out.println(ex);
	  System.out.println("come in exception");
	  
  	  send_email_api_output.exception_method(ex); 
     }
	}
	
}
