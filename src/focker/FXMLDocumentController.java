/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package focker;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
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
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javax.imageio.ImageIO;

/**
 *
 * @author Menake
 */
public class FXMLDocumentController implements Initializable {
    
    public static String[]deal1 = new String[40];
    public static int sw = 1;
    public static int q;
    public static boolean rewrite = true;
    
    @FXML
    private ImageView ImageA;
    @FXML
    private ImageView ImageB;
    @FXML
    private ImageView ImageC;
    @FXML
    private ImageView ImageD;
    @FXML
    private ImageView ImageE;
    @FXML
    private ImageView ImageA1;
    @FXML
    private ImageView ImageB1;
    @FXML
    private ImageView ImageC1;
    @FXML
    private ImageView ImageD1;
    @FXML
    private ImageView ImageE1;
    //@FXML private Label fileSelected;
    @FXML
    private Button raise;
    @FXML
    private Button call;
    @FXML
    private StackPane gameboard;
    
    @FXML
    public  void handleButtonAction(ActionEvent event) throws IOException {
        System.out.println("RAISE");
        Cards1 crd = new Cards1();
        crd.CardSelect();
        
    }
    
    @FXML
    public void ButtonCalle_Click (ActionEvent event) throws FileNotFoundException
    {
        Cards1 crd = new Cards1();
        crd.Dealer();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    private final class Cards1 extends FXMLDocumentController{

        
        private BufferedImage cardImage;
        private String faceName,suit;
        private int faceValue;
        
        public boolean isFirstRoundCompleted = false;
        public String temp[] = {"2.png","3.png","4.png","5.png","6.png","7.png","8.png","9.png","10.png","11.png","12.png","14.png","15.png","16.png","17.png","18.png","19.png","20.png","21.png","22.png","23.png","24.png","25.png","26.png","27.png","28.png","29.png","30.png","31.png","32.png","33.png","34.png","35.png","36.png","37.png","38.png","39.png","40.png","41.png","42.png","43.png","44.png","45.png","46.png","47.png","48.png","49.png","50.png","51.png","52.png","53.png"};
        //public static final String[]deal1 = new String[40];
        
        public Cards1() throws FileNotFoundException 
        {
            //ImageA = new ImageView(new Image(getClass().getResourceAsStream("/Resources/Images/cards/02.png")));
            //ImageA.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/02.png")));
            
//            TranslateTransition transition = new TranslateTransition(); 
//            transition.setDuration(Duration.millis(50));
//            transition.setNode(ImageA);
//
//            transition.setToY(-200);
//
//            transition.play();
           //CardSelect();
        }
        
        
        public Cards1(BufferedImage card)
        {
            cardImage = card;
        }
        /**
         * Randomly select 12 cards and remove from the array and display it
         */
        public void CardSelect() throws IOException
        {
            int cd=2;
            String cards[] = new String[52];//{"02.png","03.png","04.png","05.png","06.png","07.png","08.png","09.png","10.png","11.png","12.png","14.png","15.png","16.png","17.png","18.png","19.png","20.png","21.png","22.png","23.png","24.png","25.png","26.png","27.png","28.png","29.png","30.png","31.png","32.png","33.png","34.png","35.png","36.png","37.png","38.png","39.png","40.png","41.png","42.png","43.png","44.png","45.png","46.png","47.png","48.png","49.png","50.png","51.png","52.png","53.png"};
            for(int m = 0;m<52;m++)
            {
                
                cards[m] = cd+".png";
                cd++;
                //System.err.println(cards[m]);
            }
            String player1[] = new String[2];
            String player2[] = new String[2];
            String player3[] = new String[2];
            String player4[] = new String[2];
            String player5[] = new String[2];
            
            int j = 0;
            
            int[] card1 = new int[10];
            
            //int[] card2 = new int[6];
            int randomNum1;
            //int randomNum2;

            Random rand = new Random();
            rand.nextInt(52);
            for (int i = 0; i < 10; i++) 
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
                
                //q = 0;
                switch(sw)
                {
                    case 1:player1[0] = cards[position];
                    ImageA.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player1[0])));
                    TranslateTransition transition = new TranslateTransition(); 
                    transition.setDuration(Duration.millis(200));
                    transition.setNode(ImageA);

                    transition.setToY(-50);
                    transition.setToX(-300);

                    transition.play();
                    sw++;break;
                    case 2:player2[0] = cards[position];
                    ImageB.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player2[0])));
                    TranslateTransition transition1 = new TranslateTransition(); 
                    transition1.setDuration(Duration.millis(250));
                    transition1.setNode(ImageB);

                    transition1.setToY(-200);
                    transition1.setToX(-200);
                    

                    transition1.play();
                    sw++;break;
                    case 3:player3[0] = cards[position];
                    ImageC.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player3[0])));
                    TranslateTransition transition2 = new TranslateTransition(); 
                    transition2.setDuration(Duration.millis(300));
                    transition2.setNode(ImageC);

                    transition2.setToY(-225);
                    transition2.setToX(-12.5);

                    transition2.play();
                    sw++;break;
                    case 4:player4[0] = cards[position];
                    ImageD.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player4[0])));
                    TranslateTransition transition4 = new TranslateTransition(); 
                    transition4.setDuration(Duration.millis(350));
                    transition4.setNode(ImageD);

                    transition4.setToY(-200);
                    transition4.setToX(200);

                    transition4.play();
                    sw++;break;
                    case 5:player5[0] = cards[position];
                    ImageE.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player5[0])));
                    TranslateTransition transition5 = new TranslateTransition(); 
                    transition5.setDuration(Duration.millis(400));
                    transition5.setNode(ImageE);

                    transition5.setToY(-50);
                    transition5.setToX(300);

                    transition5.play();
                    sw++;break;
                    case 6:player1[1] = cards[position];
                    ImageA1.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player1[1])));
                    TranslateTransition transition6 = new TranslateTransition(); 
                    transition6.setDuration(Duration.millis(450));
                    transition6.setNode(ImageA1);

                    transition6.setToY(-50);
                    transition6.setToX(-275);

                    transition6.play();
                    sw++;break;
                    case 7:player2[1] = cards[position];
                    ImageB1.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player2[1])));
                    TranslateTransition transition7 = new TranslateTransition(); 
                    transition7.setDuration(Duration.millis(500));
                    transition7.setNode(ImageB1);

                    transition7.setToY(-200);
                    transition7.setToX(-175);

                    transition7.play();
                    sw++;break;
                    case 8:player3[1] = cards[position];
                    ImageC1.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player3[1])));
                    TranslateTransition transition8 = new TranslateTransition(); 
                    transition8.setDuration(Duration.millis(550));
                    transition8.setNode(ImageC1);

                    transition8.setToY(-225);
                    transition8.setToX(12.5);

                    transition8.play();
                    sw++;break;
                    case 9:player4[1] = cards[position];
                    ImageD1.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player4[1])));
                    TranslateTransition transition9 = new TranslateTransition(); 
                    transition9.setDuration(Duration.millis(600));
                    transition9.setNode(ImageD1);

                    transition9.setToY(-200);
                    transition9.setToX(225);

                    transition9.play();
                    sw++;break;
                    case 10:player5[1] = cards[position];
                    ImageE1.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player5[1])));
                    TranslateTransition transition10 = new TranslateTransition(); 
                    transition10.setDuration(Duration.millis(650));
                    transition10.setNode(ImageE1);

                    transition10.setToY(-50);
                    transition10.setToX(325);

                    transition10.play();
                    break;
                }
                System.out.print(cards[position] +"\n");
                
                String Value = cards[position];
                List <String> list = new ArrayList<>(Arrays.asList(temp));
                list.remove(Value);
                temp = list.toArray(new String[0]);
                
               // AnchorPane root = new AnchorPane();
                //Scene scene = new Scene(root);
                
            }
            for(String st:player1)
            {
                System.out.println("player1"+st);
            }
            
            for(String ss:player2)
            {
                System.out.println("player2"+ss);
            }
            
            
//            for(String se : cards)
//            {
//                Cards1 card = new Cards1(ImageIO.read(new File("res/Images/cards/"+se)));
//                System.out.println(card);
//            }
            
            
//            System.arraycopy(temp, 0, deal1, 0, temp.length); //System.out.print(temp1 + " ");
//            for(String te : deal1)
//            {
//                Cards1 card = new Cards1("two",2,ImageIO.read(new File("focker/Resources/Images/cards/"+te)));
//                
//                System.out.print(card.toString());
//            } 
        }
        
        
        public void Dealer()
        {
            
            System.out.println("Call clicked");
            
            
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
