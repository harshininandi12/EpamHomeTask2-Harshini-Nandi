package Epam.HomeTask2;

import java.util.Scanner;
import java.util.*;

public class Gifts {

	public static void main(String[] args) {
		int quantity = 0, total_candies = 0;
        char n1;
        Sweets collect;
        Boolean n = true;
        float price,totalbox_wt = 0, total_weight = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Fill the New Year Gift Box!!");
        Map< String, Float> hm =  new HashMap< String, Float>();
        while(n) {
        	System.out.println("AVAILABLE Candies");
        	System.out.println("1. White Chocolate");
        	System.out.println("2. Bitter Sweet Chocolate");
        	System.out.println("3. Semi Sweet Chocolate");
        	System.out.println("4. Guittard");
        	System.out.println("5. Menakao");
        	System.out.println("6. MilkyBar");
        	System.out.println("7. Kalakand");
        	System.out.println("Choose an option 1-7");
        	try {
        	
        		switch(sc.next().charAt(0))
        		{
        		case '1':
        			System.out.println("please enter the quantity");
        			quantity = sc.nextInt();
        			
        			System.out.println("Enter price");
        			price = sc.nextFloat();
        			collect = new WhiteChocolate(quantity, price);
        			total_weight = collect.calculatePrice(price, quantity);
        			totalbox_wt = totalbox_wt + total_weight;
        			
        			hm.put("Dark Chocolate", totalbox_wt);
        			System.out.println("Do you want any other item (y/n)");
        			n1 = sc.next().charAt(0);
        			if(n1 == 'y'|| n1 == 'Y') { 
        	    	  n = true;
        	          break;
        	        }
        			else
        		    	{
        				n = false;
        				System.out.println("Total price of gift box is:" +totalbox_wt+ "grams");
        				
        				break;
        		    	}
        		case '2':
        			System.out.println("please enter the quantity");
        			quantity = sc.nextInt();
        			
        			System.out.println("Enter price");
        			price = sc.nextFloat();
        			collect = new BitterSweetChocolate(quantity, price);
        			total_weight = collect.calculatePrice(price, quantity);
        			totalbox_wt = totalbox_wt + total_weight;
        			
        			hm.put("Bitter Sweet Chocolate", totalbox_wt);
        			System.out.println("Do you want any other item (y/n)");
        			n1 = sc.next().charAt(0);
        			if(n1 == 'y'|| n1 == 'Y') { 
        	    	  n = true;
        	          break;
        	        }
        			else {
        				n = false;
        				System.out.println("Total price of gift box is:" +totalbox_wt+ "grams");
        				
        				break;
        	        }
        		case '3':
        			System.out.println("please enter the quantity");
        			quantity = sc.nextInt();
        			
        			System.out.println("Enter price");
        			price = sc.nextFloat();
        			collect = new SemiSweetChocolate(quantity, price);
        			total_weight = collect.calculatePrice(price, quantity);
        			totalbox_wt = totalbox_wt + total_weight;
        			
        			hm.put("Bitter Sweet Chocolate", totalbox_wt);
        			System.out.println("Do you want any other item (y/n)");
        			n1 = sc.next().charAt(0);
        			if(n1 == 'y'|| n1 == 'Y') { 
        	    	  n = true;
        	          break;
        	        }
        			else {
        				n = false;
        				System.out.println("Total price of gift box is:" +totalbox_wt+ "grams");
        				
        				break;
        			}
        		case '4':
        			System.out.println("please enter the quantity");
        			quantity = sc.nextInt();
        			
        			System.out.println("Enter price");
        			price = sc.nextFloat();
        			collect = new Guittard(quantity, price);
        			total_weight = collect.calculatePrice(price, quantity);
        			totalbox_wt = totalbox_wt + total_weight;
        			
        			hm.put("Bitter Sweet Chocolate", totalbox_wt);
        			System.out.println("Do you want any other item (y/n)");
        			n1 = sc.next().charAt(0);
        			if(n1 == 'y'|| n1 == 'Y') { 
        	    	  n = true;
        	          break;
        	        }
        			else { 
        				n = false;
        				System.out.println("Total price of gift box is:" +totalbox_wt+ "grams");
        				
        				break;
        			}
        	   case '5':
        		   System.out.println("please enter the quantity");
       			quantity = sc.nextInt();
       			
       			System.out.println("Enter price");
       			price = sc.nextFloat();
       			collect = new Menakao(quantity, price);
       			total_weight = collect.calculatePrice(price, quantity);
       			totalbox_wt = totalbox_wt + total_weight;
       			
       			hm.put("Bitter Sweet Chocolate", totalbox_wt);
       			System.out.println("Do you want any other item (y/n)");
       			n1 = sc.next().charAt(0);
       			if(n1 == 'y'|| n1 == 'Y') { 
       	    	  n = true;
       	          break;
       	        }
        		   else {
        			   n = false;
       				System.out.println("Total price of gift box is:" +totalbox_wt+ "grams");
       				
       				break;
        		   }
        	   case '6':
        		   System.out.println("please enter the quantity");
       			quantity = sc.nextInt();
       			
       			System.out.println("Enter price");
       			price = sc.nextFloat();
       			collect = new MilkyBar(quantity, price);
       			total_weight = collect.calculatePrice(price, quantity);
       			totalbox_wt = totalbox_wt + total_weight;
       			
       			hm.put("Bitter Sweet Chocolate", totalbox_wt);
       			System.out.println("Do you want any other item (y/n)");
       			n1 = sc.next().charAt(0);
       			if(n1 == 'y'|| n1 == 'Y') { 
       	    	  n = true;
       	          break;
       	        }
        		   else {
        			   n = false;
       				System.out.println("Total price of gift box is:" +totalbox_wt+ "grams");
       				
       				break;
        		   	}
        	   case '7':
        		   System.out.println("please enter the quantity");
       			quantity = sc.nextInt();
       			
       			System.out.println("Enter price");
       			price = sc.nextFloat();
       			collect = new Kalakand(quantity, price);
       			total_weight = collect.calculatePrice(price, quantity);
       			totalbox_wt = totalbox_wt + total_weight;
       			
       			hm.put("Bitter Sweet Chocolate", totalbox_wt);
       			System.out.println("Do you want any other item (y/n)");
       			n1 = sc.next().charAt(0);
       			if(n1 == 'y'|| n1 == 'Y') { 
       	    	  n = true;
       	          break;
       	        }
        		   else {
        			   n = false;
       				System.out.println("Total price of gift box is:" +totalbox_wt+ "grams");
       				
       				break;
        		   	}
        }}
        catch(Exception e)
        {
        	System.out.println("please select from 1-6 options");
            
        
        
    }}
        System.out.println("The following Chocolates and Sweets are present in the Gift Box!!");
        Set< Map.Entry< String, Float> > st = hm.entrySet(); 
        for (Map.Entry< String, Float> me: st) 
        { 
            System.out.print("Name of Sweet: " +me.getKey()+", "); 
            System.out.println(" Price: " +me.getValue()); 
        }
        sc.close();
	}
}
