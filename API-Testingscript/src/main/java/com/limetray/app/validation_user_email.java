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

public class validation_user_email extends send_email_api_output {
	
	@SuppressWarnings("unchecked")
	public static void validations_user_email() throws IOException
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
	        add.put("user_number", "8888745212");
	        add.put("cloud_site_id", "230");
	        add.put("user_source", "5");
	        add.put("user_email", "fbghj");
	        
	       
	        OutputStreamWriter writer = new OutputStreamWriter(myURLConnection.getOutputStream());
	        writer.write(add.toString());
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
      //          System.out.println(jsonText);
             ObjectMapper mapper = new ObjectMapper();
                 JsonNode rootNode = mapper.readTree(jsonText);
                 
                 Iterator<JsonNode> it = rootNode.path("message").path("user_email").getElements();
                 
                 while(it.hasNext()){
                 	String user_email_input = it.next().asText();
                 	// System.out.println("\n");
                 	//System.out.println("/**********************************************/");
                    System.out.println("\n");
                 //   System.out.println("==============================================================================");
                    
                    System.out.println(" Test Case 3 : User Email validation check on API"+"\n");
                 	sb_email_text.append("Test Case 3 : User Email validation check on API");
                 	sb_email_text.append(System.lineSeparator());
                    
                 	 sb_email_text.append("=================================================================================================").append(System.lineSeparator());
                     
                 	//System.out.println("\n");
                 	 System.out.println("==============================================================================");
                 	sb_email_text.append(System.lineSeparator());
              
                 	 System.out.println("3.1" + "\n");
                 //	sb_email_text.append(System.lineSeparator());
                    
                 	 sb_email_text.append("3.1");
                   sb_email_text.append(System.lineSeparator());
                   
                 	 System.out.println("****************  Validation check user email format must be correct  ****************"+"\n");
                   sb_email_text.append("****************  Validation check user email format must be correct  ****************").append(System.lineSeparator());
                   sb_email_text.append(System.lineSeparator());
                   
                 	 System.out.println("User email hit by script: fbghj");
                   sb_email_text.append("User email hit by script: fbghj");
                   sb_email_text.append(System.lineSeparator());
                    System.out.println("Response from API :" +" "+user_email_input);
                   sb_email_text.append("Response from API :" +" "+user_email_input);
                   sb_email_text.append(System.lineSeparator());
                   sb_email_text.append(System.lineSeparator());
                    	  
                   sb_email_text.append("=================================================================================================").append(System.lineSeparator());
                                 
                   //  System.out.println(a)	;
                 }
                    
           // System.out.println(jsonText);
            
        }catch(Exception ex){System.out.println(ex);
  	  System.out.println("come in exception");
	  
  	  send_email_api_output.exception_method(ex);
        }
	}
	

}
