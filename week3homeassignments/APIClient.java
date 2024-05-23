package week3.week3homeassignments;

public class APIClient {

	public void sendRequest(String endpoint) {
		System.out.println(endpoint);
	}
	public void sendRequest(String endpoint,String requestBody,Boolean requestStatus) {
		System.out.println(endpoint  + requestBody  + requestStatus);
	}
	
	public  static void main(String[] args) {
		APIClient apc=new APIClient();
		apc.sendRequest("Response");
		apc.sendRequest("Request" , "POST" ,true);
	}
}


/*
 * Assignment Details:
 * 
 * Create a Java class named APIClient and create two methods with the same name
 * passing different input arguments.
 * 
 * Requirements:
 * 
 * - Inside the APIClient class, define the c method with multiple
 * overloaded versions.
 * 
 * - One version should accept one input argument: a String for the endpoint.
 * 
 * - Another version of the sendRequest method should accept three input
 * arguments: a String for the endpoint, a String for the requestBody, and a
 * boolean parameter requestStatus to verify whether the request is successful.
 * 
 * - Create a main method to demonstrate the usage of the overloaded sendRequest
 * method.
 * 
 * - Inside the main method, create an object of the APIClient class.
 * 
 * - Call both versions of the sendRequest method on the APIClient object with
 * different sets of input arguments to showcase method overloading.
 * 
 * 
 * Hints to Solve: - Include print statements inside each methods and pass input
 * values - Initialize objects using the new keyword and test the functionality
 * by calling methods.
 */