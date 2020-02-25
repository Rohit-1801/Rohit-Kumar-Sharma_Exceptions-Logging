package logger.logging_epam;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

import java.util.Scanner;


public class App {

	private static Logger LOGGER = LogManager.getLogger(App.class);
	public static void main(String[] args) {
		
	
								HouseConstructionCost cost = new HouseConstructionCost();
						    	
						        Scanner sc=new Scanner(System.in);
						        String automation = "no";
						        LOGGER.info("Enter Material Standard :");
						        String materialStandard = sc.nextLine();
						        
						        LOGGER.info("Enter Total Area of the house(in sq.feet): ");
						        int totalArea = sc.nextInt();
						        
						        sc.nextLine();
						        if(materialStandard.equals("high standard"))
						        {
						        	 LOGGER.info("Do you want fully automated home????");
						        	 automation = sc.nextLine();
						        }
						          
						        LOGGER.info("Total house construction cost = Rs "+cost.constructionCost(materialStandard,totalArea,automation));
						        
						       
						        
						        SimpleandCompound interest = new SimpleandCompound();
						        
						        LOGGER.info("Enter principle amount,rate,time & no of times the interest is compounded per unit time(in CI only) : ");
						        
						        int principle = sc.nextInt();
						        double rate = sc.nextDouble();
						        int time = sc.nextInt();
						        int n = sc.nextInt();
						        
						        LOGGER.info("simple interest is : " +interest.calculateSimpleInterest(principle, rate, time));
						        LOGGER.info("compound interest is : " +interest.calculateCompoundInterest(principle, rate, time,n));
						        
						        sc.close(); 
						    }
						}