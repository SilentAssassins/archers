/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package focker;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

/**
 *
 * @author Menake
 */
public class FXMLDocumentController implements Initializable {
    
    public static String[]deal1 = new String[40];
    
    @FXML
    private ImageView ImageA;
    private Button raise;
    private Button call;
    
    public  void handleButtonAction(ActionEvent event) throws IOException {
        System.out.println("RAISE");
        Cards1 crd = new Cards1();
        crd.CardSelect();
        
    }
    
    public void ButtonCalle_Click (ActionEvent event)
    {
        Cards1 crd = new Cards1();
        crd.Dealer();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    private final class Cards1 extends FXMLDocumentController{

        public boolean isFirstRoundCompleted = false;
        public String temp[] = {"2","3","4","5","6","7","8","9","10","11","12","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54"};
        //public static final String[]deal1 = new String[40];
        
        public Cards1() 
        {
            
           TranslateTransition transition = new TranslateTransition(); 
           transition.setDuration(Duration.millis(50));
           transition.setNode(ImageA);

           transition.setToY(-200);

           transition.play();
           //CardSelect();
        }
        
        /**
         * Randomly select 12 cards and remove from the array and display it
         */
        public void CardSelect()
        {
            String cards[] = {"2","3","4","5","6","7","8","9","10","11","12","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54"};
            
            
            int j = 0;
            
            int[] card1 = new int[12];
            //int[] card2 = new int[6];
            int randomNum1;
            //int randomNum2;

            Random rand = new Random();
            rand.nextInt(52);
            for (int i = 0; i < 12; i++) 
            {
                randomNum1 = rand.nextInt(52); // Random number created here.
                for (int x = 0; x < i; x++) 
                {
                    if (card1[x] == randomNum1) // Here, code checks if same random number generated before.
                    {
                        randomNum1 = rand.nextInt(52);// If random number is same, another number generated.
                        x = -1; // restart the loop
                    }

                }
                card1[i] = randomNum1;
            }
            for (int i = 0; i < card1.length; i++)
            {
                System.out.print(card1[i] + " ");
                int position = card1[i];
                System.out.print(cards[position] +"\n");
                
                //***********************temp = ArrayUtils.remove(temp,position);
                
                String Value = cards[position];
                List <String> list = new ArrayList<>(Arrays.asList(temp));
                list.remove(Value);
                temp = list.toArray(new String[0]);
                
                //deal1[i]=temp[i];
                
                //System.out.print( "->"+position+"<-");
                //isFirstRoundCompleted = true;
                //System.out.println("------");
            }
            
            for (int l = 0; l < temp.length; l++) {
                //System.out.print(temp1 + " ");
                deal1[l]=temp[l];
            }
            for(String te : deal1)
            {
                System.out.print(te+" ");
            }

        }
        
        public void Dealer()
        {
            
            System.out.println("Call clicked");
            
//            String deal1[] = new String[40];
            //deal1 = temp;
            
            int[] deal = new int[5];
            //int[] card2 = new int[6];
            int randomNum1;
            //int randomNum2;

            Random rand = new Random();
            rand.nextInt(40);
            for (int i = 0; i < 5; i++) 
            {
                randomNum1 = rand.nextInt(40); // Random number created here.
                for (int x = 0; x < i; x++) 
                {
                    if (deal[x] == randomNum1) // Here, code checks if same random number generated before.
                    {
                        randomNum1 = rand.nextInt(40);// If random number is same, another number generated.
                        x = -1; // restart the loop
                    }

                }
                deal[i] = randomNum1;
            }
            for (int i = 0; i < deal.length; i++)
            {
                System.out.print(deal[i] + " ");
                int position = deal[i];
                System.out.print(deal1[position] +"\n");
                
                //***********************temp = ArrayUtils.remove(temp,position);
//                
                String Value = deal1[position];
                List <String> list = new ArrayList<>(Arrays.asList(deal1));
                list.remove(Value);
                deal1 = list.toArray(new String[0]);
                
                //System.out.print( "->"+position+"<-");
                //isFirstRoundCompleted = true;
                //System.out.println("------");
            }
            System.out.println("deal1 results");
            for (String deal2 : deal1) {
                
                
                System.out.print(deal2 + " ");
            }
            
        }
    }
    
}
