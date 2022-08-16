package demo1;

import file.AddressBody;

import io.restassured.path.json.JsonPath;

public class ComplexJason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JsonPath js1=new JsonPath(AddressBody.DummyResponse());
		
		//Print No of courses returned by API
		
		int count=js1.getInt("courses.size()");
		System.out.println("No of courses are : "+count);
		
		//Print Purchase Amount
		
		int purchaseAmt=js1.getInt("dashboard.purchaseAmount");
		System.out.println("Purchase Amount : "+purchaseAmt);
		
		//Print Title of the first course
		
		String title1=js1.getString("courses.title[0]");
		System.out.println("Title of the first course : "+title1);
		
		//Print All course titles and their respective Prices
		
		for(int i=0;i<count;i++)
		{
			System.out.println("Title of the "+i+" course is : "+js1.getString("courses.title["+i+"]"));
			//String title2=js1.getString("courses.title["+i+"]");
			//System.out.println(title2);
			System.out.println("and Pric is : "+js1.getInt("courses.price["+i+"]"));
		}
		
		//Print no of copies sold by RPA Course
		
		for (int l=0;l<count;l++)
		{
			if(js1.getString("courses.title["+l+"]").equalsIgnoreCase("RPA"))
			{
				int rpaCopy=js1.getInt("courses.copies["+l+"]");
				System.out.println("no of copies sold by RPA Course is : "+rpaCopy);
			}
			
		}
		
		
		// Verify if Sum of all Course prices matches with Purchase Amount
		
		int[] arr=new int[count];
		int sum=0;

			for(int k=0;k<count;k++) 
			{
				int price=js1.getInt("courses.price["+k+"]");
				int copies=js1.getInt("courses.copies["+k+"]");
				int mult =price*copies;
				arr[k]=mult;
			}
			
			for(int j=0;j<arr.length;j++)
			{
				sum=sum+arr[j];
				
			}	
			
			if(purchaseAmt==sum)
			{
				System.out.println("Sum of all Course prices matches with Purchase Amount");
			}
			else
				System.out.println("Fail");


	}

}
