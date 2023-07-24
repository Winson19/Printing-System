/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printingsystem;
import java.util.*;

/**
 *
 * @author pc
 */
public class PrintingSystem {
    
    public static void main(String[] args) {
    /**
     * @param args the command line arguments
     */
//        List<Object> Printing = new ArrayList <Object>();
        Charge charge = new Charge();
        Scanner scanner=new Scanner(System.in);
        Printing p=new Printing();
        Order order;
        
        System.out.println("Welcome To ABC Printing Shop");
        do
        {
        	order=new Order();
            System.out.println("Please select the printing service");
            System.out.println("1.)Document");
            System.out.println("2.)Photo");
            order.setType(scanner.nextInt());
        
            if(order.getType()==1)
            {
                System.out.printf("------------------------------------------\n");
                System.out.printf("|%-15s|%-30s|%-30s|","Price Rate","Black & White","Colour");
                System.out.println();
                System.out.printf("|%-15s|%-30s|%-30s|","1.)","Quantity < 5    : RM0.50/piece","Quantity < 5    : RM1.00/piece");
                System.out.println();
                System.out.printf("|%-15s|%-30s|%-30s|","2.)","Quantity 5 - 10 : RM0.40/piece","Quantity 5 - 10 : RM0.90/piece");
                System.out.println("");
                System.out.printf("|%-15s|%-30s|%-30s|","3.)","Quantity 11 - 20: RM0.30/piece","Quantity 11 - 20: RM0.80/piece");
                System.out.println("");
                System.out.printf("|%-15s|%-30s|%-30s|","4.)","Quantity 21 - 50: RM0.20/piece","Quantity 21 - 50: RM0.70/piece");
                System.out.println("");

                System.out.println("Please select document printing option");
                System.out.println("1.)Black & White");
                System.out.println("2.)Colour");
                order.setOption(scanner.nextInt());
                System.out.println("Please enter the quantity");

                order.setQty(scanner.nextInt());
            }
            else if(order.getType()==2)
            {
                System.out.printf("------------------------------------------\n");
                System.out.printf("|%-15s|%-30s|%-30s|","Price Rate","Normal (4R)","Passport");
                System.out.println();
                System.out.printf("|%-15s|%-30s|%-30s|","1.)","Quantity < 5    : RM1.00/piece","Quantity < 5    : RM1.20/piece");
                System.out.println();
                System.out.printf("|%-15s|%-30s|%-30s|","2.)","Quantity 5 - 10 : RM0.90/piece","Quantity 5 - 10 : RM0.95/piece");
                System.out.println("");
                System.out.printf("|%-15s|%-30s|%-30s|","3.)","Quantity 11 - 20: RM0.75/piece","Quantity 11 - 20: RM0.85/piece");
                System.out.println("");
                System.out.printf("|%-15s|%-30s|%-30s|","4.)","Quantity 21 - 50: RM0.50/piece","Quantity 21 - 50: RM0.75/piece");
                System.out.println("");
                
                System.out.println("Please select photo printing option");
                System.out.println("1.)Normal(4R)");
                System.out.println("2.)Passport");
                order.setOption(scanner.nextInt());
                System.out.println("Please enter the quantity");
                order.setQty(scanner.nextInt());
                
                System.out.println("Additional Option (RM/piece)");
                System.out.println("1.)High quality paper (0.10/piece)");
                System.out.println("2.)Design effect (0.15/piece)");
                System.out.println("3.)No");
                order.setAddOption(scanner.nextInt());
                
                if(order.getAddOption()!=3)
                {
                    System.out.println("Do you need another additional option?");
                    System.out.println("1.) Yes");
                    System.out.println("2.) No");
                    order.setAddContinueOption(scanner.nextInt());
                }
            }
            charge.setType(order.getType(),order.getOption(),order.getAddOption(),order.getAddContinueOption());
            charge.setQty(order.getQty());
            charge.setCharge();
            charge.setTotal();
            charge.setTotalSum();
            charge.setTotalQty();

            p.ipp.diffType(charge.getType());
            p.ipp.setTotalSum(charge.getTotalSum());
            p.ipp.setTotalQty(charge.getTotalQty());
            
            System.out.println("Do you have another printing request?");
            System.out.println("1.)Yes");
            System.out.println("2.)No");
            order.setContinueOption(scanner.nextInt());
            
        }while(order.getContinueOption()==1);
        
        scanner.close();
        
        p.ipp.setSumTotal();
        p.ipp.setSumQty();
        
        System.out.println();
        p.ipp.queueRequest();
        
    }
}

