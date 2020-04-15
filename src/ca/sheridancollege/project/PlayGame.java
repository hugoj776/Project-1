/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 * Modified by: Jonathan Hugo
 *              Gavin Da Silva
 *              Ishita Ishita
 *              Sheril Garg
 * date: feb/12th/2020 
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sheri
 */
public class PlayGame extends GroupOfCards

{
    

   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Game gme = new Game("Black Jack");
        System.out.println("Welcome to " + gme.getGameName() + "!");
        System.out.println("Enter your Player id:");
        String pid = sc.next();
        Player player = new Player(pid);
        player.setPlayerID(pid);
        System.out.println(player.getPlayerID());
        //int start = 0;
       double bet =0;
        int start = 2;
        
        System.out.println("The amount given to you is $1000");
        double amount = 1000;
       
         do{
            System.out.println("enter 1 if you want to start the game! or enter 2 to exit the game");
            start = sc.nextInt(); 
            GroupOfCards deck = new GroupOfCards();
            deck.deal();
            
            
               
          if (start == 2 || amount == 0 || amount < 0 )
           {  
              break;
           }
          else if (start == 1)
              {
                   do{
                
                System.out.println("Enter the bet");
                 bet = sc.nextDouble();
                 for(int i = 0; i<1;i++)
                   {
                  
                   if(bet == 0 || amount< bet)
                   {
                       System.out.println("Your amount should be between 0 and" +amount);
                       break;
                   }
                  
                 }
               }while(bet == 0 || bet > amount);
                money m = new money(bet);
                    System.out.println("Dealing cards..." + "\n");
                    System.out.println(deck.toStringCpuHand()); //displays players hand
                    System.out.println("Total = " + deck.cpuaddHand()); //displays players hand in total value
                    System.out.println(deck.toStringPHand()); //displays players hand
                    System.out.println("Total = " + deck.paddHand()); //displays players hand in total value

                   gme.choice(deck.paddHand(), deck.cpuaddHand(), deck, player); // checks if player won based on draw
               }
        else{
            System.out.println("not a valid entry");
        }
          
       
         
           if (deck.paddHand() > 21) 
              {
               amount = amount - bet;   
               System.out.println("Your have "+ amount);
              } 
            else if ((deck.paddHand() > deck.devcpuaddHand()) && deck.paddHand() <= 21 ) 
             { //announce win or loss
               amount =  amount + bet; 
                System.out.println("Your have "+amount);
             } 
            else if ((21 - deck.paddHand() > 21 - deck.devcpuaddHand()) && (21 - deck.devcpuaddHand()) < 0) 
            { //announce win or loss
               amount = amount + bet;     
                System.out.println("Your have "+amount);
            }
            else if ((deck.paddHand() < deck.devcpuaddHand()) && deck.paddHand() <= 21 && deck.devcpuaddHand() <= 21 )
            {
            amount = amount -bet;       
            System.out.println("Your have "+amount);
            }
          
                       if (amount <= 0){
                           
                           System.out.println("You have no more money to bet! Bankrupt!");
                       break;    
                       }
        }while (start >= 1 || start < 1);
       // no matter the entry, the code will loop *unless user CHOOSES to exit by inputting 2
          
    
        }       
        
}

        
        
        


        
            
           
             
    

   

