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
    public static int[] card1 = new int[10];
    public static int sw = 1;
    public static int q;
    public static boolean rewrite = true;
    
    public static String player1[] = new String[2];
    public static String player2[] = new String[2];
    public static String player3[] = new String[2];
    public static String player4[] = new String[2];
    public static String player5[] = new String[2];
    
    @FXML
    private ImageView Image1;
    @FXML
    private ImageView Image2;
    @FXML
    private ImageView Image3;
    @FXML
    private ImageView Image4;
    @FXML
    private ImageView Image5;
    @FXML
    private ImageView Image6;
    @FXML
    private ImageView Image7;
    @FXML
    private ImageView Image8;
    @FXML
    private ImageView Image9;
    @FXML
    private ImageView Image10;
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
    public void FdownCards(ActionEvent event) throws FileNotFoundException
    {
        Cards1 crd1 = new Cards1();
        crd1.FdownCards(5);
    }
    
    public void ButtonDeler_Click (ActionEvent event) throws FileNotFoundException
    {
        Cards1 crd = new Cards1();
        crd.Dealer();
    }
    
    public void BeginButton(ActionEvent event) throws FileNotFoundException
    {
        Cards1 big = new Cards1();
        big.Begin();
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
            
            
            int j = 0;
            
            
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
                    Image1.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player1[0])));
//                    TranslateTransition transition = new TranslateTransition(); 
//                    transition.setDuration(Duration.millis(200));
//                    transition.setNode(Image1);
//
//                    transition.setToY(5);
//                    transition.setToX(-275);
//
//                    transition.play();
                    sw++;break;
                    case 2:player2[0] = cards[position];
                    Image2.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player2[0])));
//                    TranslateTransition transition1 = new TranslateTransition(); 
//                    transition1.setDuration(Duration.millis(250));
//                    transition1.setNode(Image2);
//
//                    transition1.setToY(-200);
//                    transition1.setToX(-290);
//                    
//
//                    transition1.play();
                    sw++;break;
                    case 3:player3[0] = cards[position];
                    Image3.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player3[0])));
//                    TranslateTransition transition2 = new TranslateTransition(); 
//                    transition2.setDuration(Duration.millis(300));
//                    transition2.setNode(Image3);
//
//                    transition2.setToY(-245);
//                    transition2.setToX(-17.5);
//
//                    transition2.play();
                    sw++;break;
                    case 4:player4[0] = cards[position];
                    Image4.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player4[0])));
//                    TranslateTransition transition4 = new TranslateTransition(); 
//                    transition4.setDuration(Duration.millis(350));
//                    transition4.setNode(Image4);
//
//                    transition4.setToY(-200);
//                    transition4.setToX(255);
//
//                    transition4.play();
                    sw++;break;
                    case 5:player5[0] = cards[position];
                    Image5.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player5[0])));
//                    TranslateTransition transition5 = new TranslateTransition(); 
//                    transition5.setDuration(Duration.millis(400));
//                    transition5.setNode(Image5);
//
//                    transition5.setToY(-5);
//                    transition5.setToX(300);
//
//                    transition5.play();
                    sw++;break;
                    case 6:player1[1] = cards[position];
                    Image6.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player1[1])));
//                    TranslateTransition transition6 = new TranslateTransition(); 
//                    transition6.setDuration(Duration.millis(600));
//                    transition6.setNode(Image6);
//
//                    transition6.setToY(-30);
//                    transition6.setToX(-295);
//
//                    transition6.play();
                    sw++;break;
                    case 7:player2[1] = cards[position];
                    Image7.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player2[1])));
//                    TranslateTransition transition7 = new TranslateTransition(); 
//                    transition7.setDuration(Duration.millis(650));
//                    transition7.setNode(Image7);
//
//                    transition7.setToY(-220);
//                    transition7.setToX(-255);
//
//                    transition7.play();
                    sw++;break;
                    case 8:player3[1] = cards[position];
                    Image8.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player3[1])));
//                    TranslateTransition transition8 = new TranslateTransition(); 
//                    transition8.setDuration(Duration.millis(700));
//                    transition8.setNode(Image8);
//
//                    transition8.setToY(-245);
//                    transition8.setToX(17.5);
//
//                    transition8.play();
                    sw++;break;
                    case 9:player4[1] = cards[position];
                    Image9.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player4[1])));
//                    TranslateTransition transition9 = new TranslateTransition(); 
//                    transition9.setDuration(Duration.millis(750));
//                    transition9.setNode(Image9);
//
//                    transition9.setToY(-190);
//                    transition9.setToX(290);
//
//                    transition9.play();
                    sw++;break;
                    case 10:player5[1] = cards[position];
                    Image10.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player5[1])));
//                    TranslateTransition transition10 = new TranslateTransition(); 
//                    transition10.setDuration(Duration.millis(800));
//                    transition10.setNode(Image10);
//
//                    transition10.setToY(20);
//                    transition10.setToX(270);
//
//                    transition10.play();
                    sw = 1;
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
        }
        
        public void Begin()
        {
            for(int p = 1;p<=10;p++)
            {
                Image1.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                TranslateTransition transition = new TranslateTransition(); 
                    transition.setDuration(Duration.millis(200));
                    transition.setNode(Image1);

                    transition.setToY(5);
                    transition.setToX(-275);

                    transition.play();
                Image2.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                TranslateTransition transition1 = new TranslateTransition(); 
                    transition1.setDuration(Duration.millis(250));
                    transition1.setNode(Image2);

                    transition1.setToY(-200);
                    transition1.setToX(-290);
                    

                    transition1.play();
                Image3.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                TranslateTransition transition2 = new TranslateTransition(); 
                    transition2.setDuration(Duration.millis(300));
                    transition2.setNode(Image3);

                    transition2.setToY(-245);
                    transition2.setToX(-17.5);

                    transition2.play();
                Image4.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                TranslateTransition transition4 = new TranslateTransition(); 
                    transition4.setDuration(Duration.millis(350));
                    transition4.setNode(Image4);

                    transition4.setToY(-200);
                    transition4.setToX(255);

                    transition4.play();
                Image5.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                TranslateTransition transition5 = new TranslateTransition(); 
                    transition5.setDuration(Duration.millis(400));
                    transition5.setNode(Image5);

                    transition5.setToY(-5);
                    transition5.setToX(300);

                    transition5.play();
                Image6.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                TranslateTransition transition6 = new TranslateTransition(); 
                    transition6.setDuration(Duration.millis(600));
                    transition6.setNode(Image6);

                    transition6.setToY(-30);
                    transition6.setToX(-295);

                    transition6.play();
                Image7.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                TranslateTransition transition7 = new TranslateTransition(); 
                    transition7.setDuration(Duration.millis(650));
                    transition7.setNode(Image7);

                    transition7.setToY(-220);
                    transition7.setToX(-255);

                    transition7.play();
                Image8.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                TranslateTransition transition8 = new TranslateTransition(); 
                    transition8.setDuration(Duration.millis(700));
                    transition8.setNode(Image8);

                    transition8.setToY(-245);
                    transition8.setToX(17.5);

                    transition8.play();
                Image9.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                TranslateTransition transition9 = new TranslateTransition(); 
                    transition9.setDuration(Duration.millis(750));
                    transition9.setNode(Image9);

                    transition9.setToY(-190);
                    transition9.setToX(290);

                    transition9.play();
                Image10.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                TranslateTransition transition10 = new TranslateTransition(); 
                    transition10.setDuration(Duration.millis(800));
                    transition10.setNode(Image10);

                    transition10.setToY(20);
                    transition10.setToX(270);

                    transition10.play();
            }
        }
        
        public void FdownCards(int player)
        {
            int plyerNo = player;
            for (int i = 0; i < card1.length; i++)
            {
                int position = card1[i];

                switch(plyerNo)
                {
                    case 1:Image1.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player1[0])));
                    Image2.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image3.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image4.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image5.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image6.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player1[1])));
                    Image7.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image8.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image9.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image10.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    break;
                    case 2:Image2.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player2[0])));
                    Image1.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image3.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image4.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image5.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image6.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image7.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player2[1])));
                    Image8.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image9.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image10.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    break;
                    case 3:Image3.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player3[0])));
                    Image1.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image2.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image4.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image5.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image6.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image7.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image8.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player3[1])));
                    Image9.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image10.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    break;
                    case 4:Image4.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player4[0])));
                    Image1.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image2.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image3.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image5.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image6.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image7.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image8.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image9.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player4[1])));
                    Image10.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    break;
                    case 5:Image5.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player5[0])));
                    Image1.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image2.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image3.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image4.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image6.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image7.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image8.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image9.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    Image10.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player5[1])));
                    break;
                }
            }
            
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
