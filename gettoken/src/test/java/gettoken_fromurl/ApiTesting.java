//package gettoken_fromurl;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.security.KeyManagementException;
//import java.security.KeyStore;
//import java.security.KeyStoreException;
//import java.security.NoSuchAlgorithmException;
//import java.security.UnrecoverableKeyException;
//
//import static io.restassured.RestAssured.given;
//import org.testng.annotations.Test;
//
//import io.restassured.RestAssured;
//import io.restassured.config.SSLConfig;
//import io.restassured.response.Response;
//import io.restassured.response.ResponseBody;
//import io.restassured.specification.RequestSpecification;
//
//
//public class ApiTesting {
//	
//	
//	@Test(priority=2)
//	public static void apiTesting() throws InterruptedException, IOException, KeyManagementException, UnrecoverableKeyException, NoSuchAlgorithmException, KeyStoreException {
//
//		String password="jet@4321";		
//		KeyStore keyStore = null;
//		SSLConfig config = null;
//		 String inline="";
//		try {
//		        keyStore = KeyStore.getInstance("PKCS12");
//		        keyStore.load(
//		                new FileInputStream("certs/client_cert_and_private.pfx"),
//		                password.toCharArray());
//
//		    } catch (Exception ex) {
//		        System.out.println("Error while loading keystore >>>>>>>>>");
//		        ex.printStackTrace();
//		    }
//
//		    if (keyStore != null) {
//
//		        
//				
//				org.apache.http.conn.ssl.SSLSocketFactory clientAuthFactory = new org.apache.http.conn.ssl.SSLSocketFactory(keyStore, password);
//
//		        // set the config in rest assured
//		        config = new SSLConfig().with().sslSocketFactory(clientAuthFactory).and().allowAllHostnames();
//
//		RestAssured.config = RestAssured.config().sslConfig(config);
//		Response response=given()
//		.contentType("application/json")
//		.header("password","RYU@vf6LtYNi3Mp")
//		.header("roleId","CONSUMER_DE")
//		.header("messageid","e2d7d6fd-0820-4f5a-a66b-facbc639d606")
//		.header("partnerid","04.AAJ.FL*.650.524")
//		.header("userid","DSH")
//		.header("Host","impl.hub.cms.gov")
//		.header("Connection","Keep-Alive")
//		.header("User-Agent","Layer7-SecureSpan-Gateway/v9.4.00-b8872")
//		.get("https://impl.hub.cms.gov/ses/v1/applications/14787199");
//		
//		  ResponseBody body= response.getBody();
//		  inline=body.asPrettyString();
//		 System.out.println("Response body is: "+body.asPrettyString());
//	}
//		    
////		    JSONObject obj=new JSONObject(inline);
////		    String jResponse=obj.getJSONObject("result").getJSONObject("attestations").getJSONObject("application").getString("comments");
////		    System.out.println("comments = "+jResponse);
//	
//	}
//	
//	@SuppressWarnings("deprecation")
//	@Test(priority=1)
//	public void apiPostTest() throws KeyManagementException, UnrecoverableKeyException, NoSuchAlgorithmException, KeyStoreException {
//		String password="jet@4321";		
//		KeyStore keyStore = null;
//		SSLConfig config = null;
//		 
//		 
//		try {
//		        keyStore = KeyStore.getInstance("PKCS12");
//		        keyStore.load(
//		                new FileInputStream("certs/client_cert_and_private.pfx"),
//		                password.toCharArray());
//
//		    } catch (Exception ex) {
//		        System.out.println("Error while loading keystore >>>>>>>>>");
//		        ex.printStackTrace();
//		    }
//
//		    if (keyStore != null) {
//
//		        
//				
//				org.apache.http.conn.ssl.SSLSocketFactory clientAuthFactory = new org.apache.http.conn.ssl.SSLSocketFactory(keyStore, password);
//
//		        // set the config in rest assured
//		        config = new SSLConfig().with().sslSocketFactory(clientAuthFactory).and().allowAllHostnames();
//
//		RestAssured.config = RestAssured.config().sslConfig(config);
//			given()
//		.header("Content-Type","application/json")
//		.header("password","RYU@vf6LtYNi3Mp")
//		.header("roleId","CONSUMER_DE")
//		.header("messageid","e2d7d6fd-0820-4f5a-a66b-facbc639d606")
//		.header("partnerid","04.AAJ.FL*.650.524")
//		.header("userid","DSH")
//		.header("Host","impl.hub.cms.gov")
//		.header("Connection","Keep-Alive")
//		.header("User-Agent","Layer7-SecureSpan-Gateway/v9.4.00-b8872")
//		.param("comments", "My Comments")
//		.post("https://impl.hub.cms.gov/ses/v1/applications/14787199")
//		.then()
//		.log()
//		.all();
//		
//		
//		
//		
//		 
//		
//		    
//	}
//	}
//}
