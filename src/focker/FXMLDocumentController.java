/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package focker;

import static java.awt.SystemColor.text;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

/**
 *
 * @author Menake
 */
public class FXMLDocumentController implements Initializable {

    //************************************************Initialize object and variable****************************************//    
    public static String[] deal1 = new String[27];
    public static int[] card1 = new int[52];
    public static int sw = 1;
    public static int q;
    public static boolean rewrite = true;
    public static int player = 2;
    public static int count = 0, c;
    //public static int coinCount = 1000;
    public static int coinResult = 1000;
    public int remainder;

    //First two  cards
    public static String player1[] = new String[2];
    public static String player2[] = new String[2];
    public static String player3[] = new String[2];
    public static String player4[] = new String[2];
    public static String player5[] = new String[2];
    //Another three cards
    public static String player01[] = new String[3];
    public static String player02[] = new String[3];
    public static String player03[] = new String[3];
    public static String player04[] = new String[3];
    public static String player05[] = new String[3];

    @FXML
    private ImageView gameboard;
    @FXML
    private AnchorPane ChangeAnchor;
    @FXML
    private Slider Coins;
    @FXML
    private Label CoinsValue = new Label("0");
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
    @FXML
    private ImageView Image11;
    @FXML
    private ImageView Image12;
    @FXML
    private ImageView Image13;
    @FXML
    private ImageView Image14;
    @FXML
    private ImageView Image15;
    @FXML
    private ImageView Image16;
    @FXML
    private ImageView Image17;
    @FXML
    private ImageView Image18;
    @FXML
    private ImageView Image19;
    @FXML
    private ImageView Image20;
    @FXML
    private ImageView Image21;
    @FXML
    private ImageView Image22;
    @FXML
    private ImageView Image23;
    @FXML
    private ImageView Image24;
    @FXML
    private ImageView Image25;
    @FXML
    private ImageView Image26;
    @FXML
    private ImageView Image27;
    @FXML
    private ImageView Image28;
    @FXML
    private ImageView Image29;
    @FXML
    private ImageView Image30;
    @FXML
    private ImageView Image01;
    @FXML
    private ImageView Image02;
    @FXML
    private ImageView Image03;
    @FXML
    private ImageView Image04;
    @FXML
    private ImageView Image05;
    @FXML
    private Button raise;
    @FXML
    private Button call;
    @FXML
    private Button show;
    @FXML
    private Button bet;
    @FXML
    private Button Play;
    @FXML
    private Label CoinsValue1;
    @FXML
    private Label CoinsValue2;
    @FXML
    private Button raise1;
    @FXML
    private AnchorPane ChangeCoinAnchor;
    @FXML
    private Button Start;
    @FXML
    private Label message;
    @FXML
    private Button yesButton;
    @FXML
    private Button noButton;
    @FXML
    private Button cancelButton;
    @FXML
    private Label qus;

//***********************************************************************************************************//
//***************************************Handle Button events************************************************//
//***********************************************************************************************************//   
    //Every player can show others inital two cards
    @FXML
    public void handleButtonAction(ActionEvent event) throws IOException {
        System.out.println("SHOW");
        Cards1 crd = new Cards1();
        player = 2;
        crd.CardSelect(player);

    }

    //only show current player cards
    @FXML
    public void FdownCards(ActionEvent event) throws FileNotFoundException {
        Cards1 crd1 = new Cards1();
        crd1.FdownCards(player);
    }

    //move remain three card to each player 
    @FXML
    public void Others(ActionEvent event) throws FileNotFoundException {
        OtherCards ocr = new OtherCards();
        ocr.ThreeCards();
    }

    public void ButtonDeler_Click(ActionEvent event) throws FileNotFoundException {
        Cards1 crd = new Cards1();
        crd.Dealer();
    }

    //Move 5 caards on the table by dealer
    @FXML
    public void TCareds(ActionEvent event) throws FileNotFoundException {
        OtherCards or = new OtherCards();
        or.Tcards();
    }

    //move two cards each player
    @FXML
    public void BeginButton(ActionEvent event) throws FileNotFoundException, IOException, InterruptedException {
        Cards1 big = new Cards1();
        big.Begin();
    }

    //player want chang their first initial card
    @FXML
    public void imgClick(MouseEvent event) {
//        Image01.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event1) -> {
        System.out.println("Tile pressed ");
        OtherCards oor = new OtherCards();
        oor.changeCards();
//            event1.consume();
//        });
    }

    //plaayer wants to change their 2nd card
    @FXML
    public void imgClick2(MouseEvent event) {
//        Image01.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event1) -> {
        System.out.println("Tile pressed ");
        OtherCards oor = new OtherCards();
        oor.changeCards2();
//            event1.consume();
//        });
    }

    //plaayer wants to change their 23rd card
    @FXML
    public void imgClick3(MouseEvent event) {
//        Image01.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event1) -> {
        System.out.println("Tile pressed ");
        OtherCards oor = new OtherCards();
        oor.changeCards3();
//            event1.consume();
//        });
    }

    //plaayer wants to change their 4th card
    @FXML
    public void imgClick4(MouseEvent event) {
//        Image01.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event1) -> {
        System.out.println("Tile pressed ");
        OtherCards oor = new OtherCards();
        oor.changeCards4();
//            event1.consume();
//        });
    }

    //plaayer wants to change their 5th card
    @FXML
    public void imgClick5(MouseEvent event) {
//        Image01.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event1) -> {
        System.out.println("Tile pressed ");
        OtherCards oor = new OtherCards();
        oor.changeCards5();
//            event1.consume();
//        });
    }

    @FXML
    private void Cancel(ActionEvent event) {
        ChangeAnchor.setVisible(false);
    }

    //in raise user can change their bet coins
    @FXML
    private void RaiseCoins(ActionEvent event) {
        //ChangeAnchor.setVisible(false);
        OtherCards ocd = new OtherCards();
        ocd.coins();
    }

    //change current card with dealer first card
    @FXML
    public void ChangeCard1(ActionEvent event) {
        if (c < 3) {
            switch (count) {
                case 1:
                    OtherCards ooro = new OtherCards();
                    ooro.change(1);
                    c++;
                    break;
                case 2:
                    OtherCards oo0ro = new OtherCards();
                    oo0ro.change(2);
                    c++;
                    break;
                case 3:
                    OtherCards o0ro = new OtherCards();
                    o0ro.change(3);
                    c++;
                    break;
                case 4:
                    OtherCards l0ro = new OtherCards();
                    l0ro.change(4);
                    c++;
                    break;
                case 5:
                    OtherCards og0ro = new OtherCards();
                    og0ro.change(5);
                    c++;
                    break;
                default:
                    break;
            }
        } else {
            message.setText("            Your all chances are over!!!!");
            qus.setVisible(false);
            yesButton.setVisible(false);
            noButton.setVisible(false);
            cancelButton.setVisible(true);
        }
    }

    /**
     * player can change their bet values(coins)
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //String CoinV = String.valueOf(coinResult);
        //coinResult = 1000;

        //CoinsValue = new Label(CoinV);
        Coins.setMax(coinResult);

        // Listen for Slider value changes
        Coins.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable,
                    Number oldValue, Number newValue) {

                CoinsValue.setText("" + newValue.intValue());
                int v = newValue.intValue();
                coinResult = v;

            }
        });
    }

    @FXML
    private void Raise(ActionEvent event) {
        OtherCards ocrd = new OtherCards();
        ocrd.Raise();
    }

//**************************************************************************************************//
    /**
     * inner class, use for algorithms
     */
    private final class Cards1 extends FXMLDocumentController {

        private BufferedImage cardImage;
        private String faceName, suit;
        private int faceValue;

        public boolean isFirstRoundCompleted = false;
        public String temp[] = {"2.png", "3.png", "4.png", "5.png", "6.png", "7.png", "8.png", "9.png", "10.png", "11.png", "12.png", "14.png", "15.png", "16.png", "17.png", "18.png", "19.png", "20.png", "21.png", "22.png", "23.png", "24.png", "25.png", "26.png", "27.png", "28.png", "29.png", "30.png", "31.png", "32.png", "33.png", "34.png", "35.png", "36.png", "37.png", "38.png", "39.png", "40.png", "41.png", "42.png", "43.png", "44.png", "45.png", "46.png", "47.png", "48.png", "49.png", "50.png", "51.png", "52.png", "53.png"};
        //public static final String[]deal1 = new String[40];

        public Cards1() throws FileNotFoundException {
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

        public Cards1(BufferedImage card) {
            cardImage = card;
        }

        /**
         * Randomly select 10 cards and remove from the array and display it
         */
        public void CardSelect(int player) throws IOException {
            int cd = 2;
            String cards[] = new String[52];//{"02.png","03.png","04.png","05.png","06.png","07.png","08.png","09.png","10.png","11.png","12.png","14.png","15.png","16.png","17.png","18.png","19.png","20.png","21.png","22.png","23.png","24.png","25.png","26.png","27.png","28.png","29.png","30.png","31.png","32.png","33.png","34.png","35.png","36.png","37.png","38.png","39.png","40.png","41.png","42.png","43.png","44.png","45.png","46.png","47.png","48.png","49.png","50.png","51.png","52.png","53.png"};
            for (int m = 0; m < 52; m++) {

                cards[m] = cd + ".png";
                cd++;
                //System.err.println(cards[m]);
            }

            int j = 0;

            //int[] card2 = new int[6];
            int randomNum1;
            //int randomNum2;

            Random rand = new Random();
            rand.nextInt(52);
            for (int i = 0; i < 52; i++) {
                randomNum1 = rand.nextInt(52); // Random number created here.
                for (int x = 0; x < i; x++) {
                    if (card1[x] == randomNum1) // Here, code checks if same random number generated before.
                    {
                        randomNum1 = rand.nextInt(52);// If random number is same, another number generated.
                        x = -1; // restart the loop
                    }

                }
                card1[i] = randomNum1;
            }
            for (int i = 0; i < 10; i++) {
                int position = card1[i];

                //q = 0;
                /**
                 * then ask the player to see those two cards. Randomly select
                 * vena numbers tika cards array eke tiyana string value eken
                 * aran table eke ImageView eke set karanava
                 */
                switch (sw) {
                    case 1:
                        player1[0] = cards[position];
                        Image1.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player1[0])));
                        sw++;
                        break;
                    case 2:
                        player2[0] = cards[position];
                        Image2.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player2[0])));
                        sw++;
                        break;
                    case 3:
                        player3[0] = cards[position];
                        Image3.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player3[0])));
                        sw++;
                        break;
                    case 4:
                        player4[0] = cards[position];
                        Image4.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player4[0])));
                        sw++;
                        break;
                    case 5:
                        player5[0] = cards[position];
                        Image5.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player5[0])));
                        sw++;
                        break;
                    case 6:
                        player1[1] = cards[position];
                        Image6.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player1[1])));
                        sw++;
                        break;
                    case 7:
                        player2[1] = cards[position];
                        Image7.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player2[1])));
                        sw++;
                        break;
                    case 8:
                        player3[1] = cards[position];
                        Image8.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player3[1])));
                        sw++;
                        break;
                    case 9:
                        player4[1] = cards[position];
                        Image9.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player4[1])));
                        sw++;
                        break;
                    case 10:
                        player5[1] = cards[position];
                        Image10.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player5[1])));
                        sw = 1;
                        break;
                }
                //System.out.print(cards[position] +"\n");

//                String Value = cards[position];
//                List <String> list = new ArrayList<>(Arrays.asList(temp));
//                list.remove(Value);
//                temp = list.toArray(new String[0]);
                //AnchorPane root = new AnchorPane();
                //Scene scene = new Scene(root);
            }
            sw = 1;
            for (int cc = 10; cc <= 24; cc++) {

                int posi = card1[cc];
                switch (sw) {
                    case 1:
                        player01[0] = cards[posi];
                        sw++;
                        break;
                    case 2:
                        player02[0] = cards[posi];
                        sw++;
                        break;
                    case 3:
                        player03[0] = cards[posi];
                        sw++;
                        break;
                    case 4:
                        player04[0] = cards[posi];
                        sw++;
                        break;
                    case 5:
                        player05[0] = cards[posi];
                        sw++;
                        break;
                    case 6:
                        player01[1] = cards[posi];
                        sw++;
                        break;
                    case 7:
                        player02[1] = cards[posi];
                        sw++;
                        break;
                    case 8:
                        player03[1] = cards[posi];
                        sw++;
                        break;
                    case 9:
                        player04[1] = cards[posi];
                        sw++;
                        break;
                    case 10:
                        player05[1] = cards[posi];
                        sw++;
                        break;
                    case 11:
                        player01[2] = cards[posi];
                        sw++;
                        break;
                    case 12:
                        player02[2] = cards[posi];
                        sw++;
                        break;
                    case 13:
                        player03[2] = cards[posi];
                        sw++;
                        break;
                    case 14:
                        player04[2] = cards[posi];
                        sw++;
                        break;
                    case 15:
                        player05[2] = cards[posi];
                        sw = 1;
                        break;
                }

            }

            /**
             * get other cards to the array
             */
            int i = 25;
            for (int b = 0; b <= 26; b++) {
                int val = card1[i];
                deal1[b] = cards[val];
                //System.out.println(deal1[b]);
                ++i;

            }
//            for(int g = 0;g<=28;g++)
//            {
//                int value = card1[i+2];
//            }

            //int plyerNo = player;
            for (int m = 0; m < card1.length; m++) {
                int position1 = card1[m];

                switch (player) {
                    case 1:
                        Image01.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player1[0])));
                        Image02.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player1[1])));
                        break;
                    case 2:
                        Image01.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player2[0])));
                        Image02.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player2[1])));
                        break;
                    case 3:
                        Image01.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player3[0])));
                        Image02.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player3[1])));
                        break;
                    case 4:
                        Image01.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player4[0])));
                        Image02.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player4[1])));
                        break;
                    case 5:
                        Image01.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player5[0])));
                        Image02.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player5[1])));
                        break;
                }
            }

        }

        /**
         * first begin with two cards face down to each player.
         */
        public void Begin() throws FileNotFoundException, IOException, InterruptedException {
//            for(int p = 1;p<=10;p++)
//            {
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
            transition4.setToY(-215);
            transition4.setToX(265);
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

            Image01.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
            Image02.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));

//            new java.util.Timer().schedule(
//                    new java.util.TimerTask() {
//                @Override
//                public void run() {
//                    try {
//                        CardSelect(player);
//                    } catch (IOException ex) {
//                        
//                    }
//                }
//            },
//                    5000
//            );
            CardSelect(player);
        }

        /**
         * the two initial cards are the only cards that are visible to all
         * players.
         *
         * @param player player ge position eka object eka through pass karala
         * ee player ge cards tika vitharak display karanava.
         */
        public void FdownCards(int player) {
            int plyerNo = player;
            for (int i = 0; i < card1.length; i++) {
                int position = card1[i];

                switch (plyerNo) {
                    case 1://Image1.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player1[0])));
//                    Image01.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player1[0])));
                        Image2.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image3.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image4.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image5.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
//                    Image6.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player1[1])));
//                    Image02.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player1[1])));
                        Image7.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image8.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image9.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image10.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        break;
                    case 2://Image2.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player2[0])));
//                    Image01.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player2[0])));
                        Image1.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image3.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image4.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image5.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image6.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
//                    Image7.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player2[1])));
//                    Image02.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player2[1])));
                        Image8.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image9.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image10.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        break;
                    case 3://Image3.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player3[0])));
//                    Image01.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player3[0])));
                        Image1.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image2.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image4.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image5.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image6.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image7.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image8.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player3[1])));
                        Image02.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player3[1])));
                        Image9.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image10.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        break;
                    case 4://Image4.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player4[0])));
//                    Image01.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player4[0])));
                        Image1.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image2.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image3.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image5.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image6.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image7.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image8.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
//                    Image9.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player4[1])));
//                    Image02.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player4[1])));
                        Image10.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        break;
                    case 5://Image5.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player5[0])));
//                    Image01.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player5[0])));
                        Image1.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image2.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image3.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image4.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image6.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image7.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image8.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                        Image9.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
//                    Image10.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player5[1])));
//                    Image02.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/"+player5[1])));
                        break;
                }
            }

        }

        public void Dealer() {

            System.out.println("Call clicked");

            int[] deal = new int[5];
            //int[] card2 = new int[6];
            int randomNum1;
            //int randomNum2;

            Random rand = new Random();
            rand.nextInt(40);
            for (int i = 0; i < 5; i++) {
                randomNum1 = rand.nextInt(40); // Random number created here.
                for (int x = 0; x < i; x++) {
                    if (deal[x] == randomNum1) // Here, code checks if same random number generated before.
                    {
                        randomNum1 = rand.nextInt(40);// If random number is same, another number generated.
                        x = -1; // restart the loop
                    }

                }
                deal[i] = randomNum1;
            }
            for (int i = 0; i < deal.length; i++) {
                System.out.print(deal[i] + " ");
                int position = deal[i];
                System.out.print(deal1[position] + "\n");

                //***********************temp = ArrayUtils.remove(temp,position);
                String Value = deal1[position];
                List<String> list = new ArrayList<>(Arrays.asList(deal1));
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

    public class OtherCards extends FXMLDocumentController {

        public void ThreeCards() {

            int plyerNo = player;
//            for (int m = 0; m < card1.length; m++)
//            {
//                int position1 = card1[m];

            switch (plyerNo) {
                case 1:
                    Image11.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player01[0])));
                    TranslateTransition transition11 = new TranslateTransition();
                    transition11.setDuration(Duration.millis(200));
                    transition11.setNode(Image11);
                    transition11.setToY(-3);
                    transition11.setToX(-250);
                    transition11.play();
                    Image12.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition12 = new TranslateTransition();
                    transition12.setDuration(Duration.millis(250));
                    transition12.setNode(Image12);
                    transition12.setToY(-176);
                    transition12.setToX(-280);
                    transition12.play();
                    Image13.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition013 = new TranslateTransition();
                    transition013.setDuration(Duration.millis(300));
                    transition013.setNode(Image13);
                    transition013.setToY(-228);
                    transition013.setToX(-25);
                    transition013.play();
                    Image14.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition014 = new TranslateTransition();
                    transition014.setDuration(Duration.millis(350));
                    transition014.setNode(Image14);
                    transition014.setToY(-209);
                    transition014.setToX(245);
                    transition014.play();
                    Image15.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition015 = new TranslateTransition();
                    transition015.setDuration(Duration.millis(400));
                    transition015.setNode(Image15);
                    transition015.setToY(-25);
                    transition015.setToX(285);
                    transition015.play();
                    Image16.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player01[1])));
                    TranslateTransition transition16 = new TranslateTransition();
                    transition16.setDuration(Duration.millis(450));
                    transition16.setNode(Image16);
                    transition16.setToY(-20);
                    transition16.setToX(-270);
                    transition16.play();
                    Image17.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition017 = new TranslateTransition();
                    transition017.setDuration(Duration.millis(500));
                    transition017.setNode(Image17);
                    transition017.setToY(-200);
                    transition017.setToX(-270);
                    transition017.play();
                    Image18.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition018 = new TranslateTransition();
                    transition018.setDuration(Duration.millis(550));
                    transition018.setNode(Image18);
                    transition018.setToY(-230);
                    transition018.play();
                    Image19.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition019 = new TranslateTransition();
                    transition019.setDuration(Duration.millis(600));
                    transition019.setNode(Image19);
                    transition019.setToY(-190);
                    transition019.setToX(270);
                    transition019.play();
                    Image20.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition020 = new TranslateTransition();
                    transition020.setDuration(Duration.millis(650));
                    transition020.setNode(Image20);
                    transition020.setToY(-3);
                    transition020.setToX(265);
                    transition020.play();
                    Image21.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player01[2])));
                    TranslateTransition transition21 = new TranslateTransition();
                    transition21.setDuration(Duration.millis(700));
                    transition21.setNode(Image21);
                    transition21.setToY(-45);
                    transition21.setToX(-270);
                    transition21.play();
                    Image22.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition022 = new TranslateTransition();
                    transition022.setDuration(Duration.millis(750));
                    transition022.setNode(Image22);
                    transition022.setToY(-205);
                    transition022.setToX(-238);
                    transition022.play();
                    Image23.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition023 = new TranslateTransition();
                    transition023.setDuration(Duration.millis(800));
                    transition023.setNode(Image23);
                    transition023.setToY(-228);
                    transition023.setToX(25);
                    transition023.play();
                    Image24.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition024 = new TranslateTransition();
                    transition024.setDuration(Duration.millis(850));
                    transition024.setNode(Image24);
                    transition024.setToY(-165);
                    transition024.setToX(290);
                    transition024.play();
                    Image25.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition025 = new TranslateTransition();
                    transition025.setDuration(Duration.millis(900));
                    transition025.setNode(Image25);
                    transition025.setToY(20);
                    transition025.setToX(250);
                    transition025.play();

//                    ParallelTransition P1 = new ParallelTransition(transition11,transition12,transition013,transition014,transition015,transition16,transition017,transition018,transition019,transition020,transition21,transition022,transition023,transition024,transition025);
//                    P1.play();
                    Image03.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player01[0])));
                    Image04.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player01[1])));
                    Image05.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player01[2])));
                    break;
                case 2:
                    Image11.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition011 = new TranslateTransition();
                    transition011.setDuration(Duration.millis(200));
                    transition011.setNode(Image11);
                    transition011.setToY(-3);
                    transition011.setToX(-250);
                    transition011.play();
                    Image12.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player02[0])));
                    TranslateTransition transition12a = new TranslateTransition();
                    transition12a.setDuration(Duration.millis(300));
                    transition12a.setNode(Image12);
                    transition12a.setToY(-176);
                    transition12a.setToX(-280);
                    transition12a.play();
                    Image13.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition0013 = new TranslateTransition();
                    transition0013.setDuration(Duration.millis(300));
                    transition0013.setNode(Image13);
                    transition0013.setToY(-228);
                    transition0013.setToX(-25);
                    transition0013.play();
                    Image14.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition0014 = new TranslateTransition();
                    transition0014.setDuration(Duration.millis(350));
                    transition0014.setNode(Image14);
                    transition0014.setToY(-209);
                    transition0014.setToX(245);
                    transition0014.play();
                    Image15.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition0015 = new TranslateTransition();
                    transition0015.setDuration(Duration.millis(400));
                    transition0015.setNode(Image15);
                    transition0015.setToY(-25);
                    transition0015.setToX(285);
                    transition0015.play();
                    Image16.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition016 = new TranslateTransition();
                    transition016.setDuration(Duration.millis(450));
                    transition016.setNode(Image16);
                    transition016.setToY(-20);
                    transition016.setToX(-270);
                    transition016.play();
                    Image17.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player02[1])));
                    TranslateTransition transition17 = new TranslateTransition();
                    transition17.setDuration(Duration.millis(800));
                    transition17.setNode(Image17);
                    transition17.setToY(-200);
                    transition17.setToX(-270);
                    transition17.play();
                    Image18.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition0018 = new TranslateTransition();
                    transition0018.setDuration(Duration.millis(550));
                    transition0018.setNode(Image18);
                    transition0018.setToY(-230);
                    transition0018.play();
                    Image19.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition0019 = new TranslateTransition();
                    transition0019.setDuration(Duration.millis(600));
                    transition0019.setNode(Image19);
                    transition0019.setToY(-190);
                    transition0019.setToX(270);
                    transition0019.play();
                    Image20.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition0020 = new TranslateTransition();
                    transition0020.setDuration(Duration.millis(650));
                    transition0020.setNode(Image20);
                    transition0020.setToY(-3);
                    transition0020.setToX(265);
                    transition0020.play();
                    Image21.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition021 = new TranslateTransition();
                    transition021.setDuration(Duration.millis(700));
                    transition021.setNode(Image21);
                    transition021.setToY(-45);
                    transition021.setToX(-270);
                    transition021.play();
                    Image22.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player02[2])));
                    TranslateTransition transition22 = new TranslateTransition();
                    transition22.setDuration(Duration.millis(1300));
                    transition22.setNode(Image22);
                    transition22.setToY(-205);
                    transition22.setToX(-238);
                    transition22.play();
                    Image23.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition0023 = new TranslateTransition();
                    transition0023.setDuration(Duration.millis(800));
                    transition0023.setNode(Image23);
                    transition0023.setToY(-228);
                    transition0023.setToX(25);
                    transition0023.play();
                    Image24.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition0024 = new TranslateTransition();
                    transition0024.setDuration(Duration.millis(850));
                    transition0024.setNode(Image24);
                    transition0024.setToY(-165);
                    transition0024.setToX(290);
                    transition0024.play();
                    Image25.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition0025 = new TranslateTransition();
                    transition0025.setDuration(Duration.millis(900));
                    transition0025.setNode(Image25);
                    transition0025.setToY(20);
                    transition0025.setToX(250);
                    transition0025.play();

//                    ParallelTransition P2 = new ParallelTransition(transition011,transition12a,transition0013,transition0014,transition0015,transition016,transition17,transition0018,transition0019,transition0020,transition021,transition22,transition0023,transition0024,transition0025);
//                    P2.play();
                    Image03.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player02[0])));
                    Image04.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player02[1])));
                    Image05.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player02[2])));
                    break;
                case 3:
                    Image11.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition0011 = new TranslateTransition();
                    transition0011.setDuration(Duration.millis(200));
                    transition0011.setNode(Image11);
                    transition0011.setToY(-3);
                    transition0011.setToX(-250);
                    transition0011.play();
                    Image12.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition012a = new TranslateTransition();
                    transition012a.setDuration(Duration.millis(300));
                    transition012a.setNode(Image12);
                    transition012a.setToY(-176);
                    transition012a.setToX(-280);
                    transition012a.play();
                    Image13.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player03[0])));
                    TranslateTransition transition13 = new TranslateTransition();
                    transition13.setDuration(Duration.millis(400));
                    transition13.setNode(Image13);
                    transition13.setToY(-228);
                    transition13.setToX(-25);
                    transition13.play();
                    Image14.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition00014 = new TranslateTransition();
                    transition00014.setDuration(Duration.millis(350));
                    transition00014.setNode(Image14);
                    transition00014.setToY(-209);
                    transition00014.setToX(245);
                    transition00014.play();
                    Image15.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition00015 = new TranslateTransition();
                    transition00015.setDuration(Duration.millis(400));
                    transition00015.setNode(Image15);
                    transition00015.setToY(-25);
                    transition00015.setToX(285);
                    transition00015.play();
                    Image16.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition0016 = new TranslateTransition();
                    transition0016.setDuration(Duration.millis(450));
                    transition0016.setNode(Image16);
                    transition0016.setToY(-20);
                    transition0016.setToX(-270);
                    transition0016.play();
                    Image17.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition0017 = new TranslateTransition();
                    transition0017.setDuration(Duration.millis(800));
                    transition0017.setNode(Image17);
                    transition0017.setToY(-200);
                    transition0017.setToX(-270);
                    transition0017.play();
                    Image18.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player03[1])));
                    TranslateTransition transition18 = new TranslateTransition();
                    transition18.setDuration(Duration.millis(900));
                    transition18.setNode(Image18);
                    transition18.setToY(-230);
                    //transition18.setToX(-17.5);
                    transition18.play();
                    Image19.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition00019 = new TranslateTransition();
                    transition00019.setDuration(Duration.millis(600));
                    transition00019.setNode(Image19);
                    transition00019.setToY(-190);
                    transition00019.setToX(270);
                    transition00019.play();
                    Image20.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition00020 = new TranslateTransition();
                    transition00020.setDuration(Duration.millis(650));
                    transition00020.setNode(Image20);
                    transition00020.setToY(-3);
                    transition00020.setToX(265);
                    transition00020.play();
                    Image21.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition0021 = new TranslateTransition();
                    transition0021.setDuration(Duration.millis(700));
                    transition0021.setNode(Image21);
                    transition0021.setToY(-45);
                    transition0021.setToX(-270);
                    transition0021.play();
                    Image22.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition0022 = new TranslateTransition();
                    transition0022.setDuration(Duration.millis(750));
                    transition0022.setNode(Image22);
                    transition0022.setToY(-205);
                    transition0022.setToX(-238);
                    transition0022.play();
                    Image23.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player03[2])));
                    TranslateTransition transition23 = new TranslateTransition();
                    transition23.setDuration(Duration.millis(1400));
                    transition23.setNode(Image23);
                    transition23.setToY(-228);
                    transition23.setToX(25);
                    transition23.play();
                    Image24.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition00024 = new TranslateTransition();
                    transition00024.setDuration(Duration.millis(850));
                    transition00024.setNode(Image24);
                    transition00024.setToY(-165);
                    transition00024.setToX(290);
                    transition00024.play();
                    Image25.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition00025 = new TranslateTransition();
                    transition00025.setDuration(Duration.millis(900));
                    transition00025.setNode(Image25);
                    transition00025.setToY(20);
                    transition00025.setToX(250);
                    transition00025.play();
                    Image03.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player03[0])));
                    Image04.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player03[1])));
                    Image05.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player03[2])));
                    break;
                case 4:
                    Image11.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition00011 = new TranslateTransition();
                    transition00011.setDuration(Duration.millis(200));
                    transition00011.setNode(Image11);
                    transition00011.setToY(-3);
                    transition00011.setToX(-250);
                    transition00011.play();
                    Image12.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition00012 = new TranslateTransition();
                    transition00012.setDuration(Duration.millis(250));
                    transition00012.setNode(Image12);
                    transition00012.setToY(-176);
                    transition00012.setToX(-280);
                    transition00012.play();
                    Image13.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition00013 = new TranslateTransition();
                    transition00013.setDuration(Duration.millis(300));
                    transition00013.setNode(Image13);
                    transition00013.setToY(-228);
                    transition00013.setToX(-25);
                    transition00013.play();
                    Image14.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player04[0])));
                    TranslateTransition transition000014 = new TranslateTransition();
                    transition000014.setDuration(Duration.millis(500));
                    transition000014.setNode(Image14);
                    transition000014.setToY(-209);
                    transition000014.setToX(245);
                    transition000014.play();
                    Image15.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition0000015 = new TranslateTransition();
                    transition0000015.setDuration(Duration.millis(400));
                    transition0000015.setNode(Image15);
                    transition0000015.setToY(-25);
                    transition0000015.setToX(285);
                    transition0000015.play();
                    Image16.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition00016 = new TranslateTransition();
                    transition00016.setDuration(Duration.millis(450));
                    transition00016.setNode(Image16);
                    transition00016.setToY(-20);
                    transition00016.setToX(-270);
                    transition00016.play();
                    Image17.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition00017 = new TranslateTransition();
                    transition00017.setDuration(Duration.millis(500));
                    transition00017.setNode(Image17);
                    transition00017.setToY(-200);
                    transition00017.setToX(-270);
                    transition00017.play();
                    Image18.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition00018 = new TranslateTransition();
                    transition00018.setDuration(Duration.millis(550));
                    transition00018.setNode(Image18);
                    transition00018.setToY(-230);
                    //transition018.setToX(-17.5);
                    transition00018.play();
                    Image19.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player04[1])));
                    TranslateTransition transition000019 = new TranslateTransition();
                    transition000019.setDuration(Duration.millis(1000));
                    transition000019.setNode(Image19);
                    transition000019.setToY(-190);
                    transition000019.setToX(270);
                    transition000019.play();
                    Image20.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition000020 = new TranslateTransition();
                    transition000020.setDuration(Duration.millis(650));
                    transition000020.setNode(Image20);
                    transition000020.setToY(-3);
                    transition000020.setToX(265);
                    transition000020.play();
                    Image21.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition00021 = new TranslateTransition();
                    transition00021.setDuration(Duration.millis(700));
                    transition00021.setNode(Image21);
                    transition00021.setToY(-45);
                    transition00021.setToX(-270);
                    transition00021.play();
                    Image22.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player02[2])));
                    TranslateTransition transition00022 = new TranslateTransition();
                    transition00022.setDuration(Duration.millis(1300));
                    transition00022.setNode(Image22);
                    transition00022.setToY(-205);
                    transition00022.setToX(-238);
                    transition00022.play();
                    Image23.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition00023 = new TranslateTransition();
                    transition00023.setDuration(Duration.millis(800));
                    transition00023.setNode(Image23);
                    transition00023.setToY(-228);
                    transition00023.setToX(25);
                    transition00023.play();
                    Image24.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player04[2])));
                    TranslateTransition transition000024 = new TranslateTransition();
                    transition000024.setDuration(Duration.millis(1500));
                    transition000024.setNode(Image24);
                    transition000024.setToY(-165);
                    transition000024.setToX(290);
                    transition000024.play();
                    Image25.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition000025 = new TranslateTransition();
                    transition000025.setDuration(Duration.millis(900));
                    transition000025.setNode(Image25);
                    transition000025.setToY(20);
                    transition000025.setToX(250);
                    transition000025.play();
                    Image03.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player04[0])));
                    Image04.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player04[1])));
                    Image05.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player04[2])));
                    break;
                case 5:
                    Image11.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition000011 = new TranslateTransition();
                    transition000011.setDuration(Duration.millis(200));
                    transition000011.setNode(Image11);
                    transition000011.setToY(-3);
                    transition000011.setToX(-250);
                    transition000011.play();
                    Image12.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition000012 = new TranslateTransition();
                    transition000012.setDuration(Duration.millis(250));
                    transition000012.setNode(Image12);
                    transition000012.setToY(-176);
                    transition000012.setToX(-280);
                    transition000012.play();
                    Image13.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition000013 = new TranslateTransition();
                    transition000013.setDuration(Duration.millis(300));
                    transition000013.setNode(Image13);
                    transition000013.setToY(-228);
                    transition000013.setToX(-25);
                    transition000013.play();
                    Image14.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player04[0])));
                    TranslateTransition transition0000014 = new TranslateTransition();
                    transition0000014.setDuration(Duration.millis(500));
                    transition0000014.setNode(Image14);
                    transition0000014.setToY(-209);
                    transition0000014.setToX(245);
                    transition0000014.play();
                    Image15.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player05[0])));
                    TranslateTransition transition000015 = new TranslateTransition();
                    transition000015.setDuration(Duration.millis(600));
                    transition000015.setNode(Image15);
                    transition000015.setToY(-25);
                    transition000015.setToX(285);
                    transition000015.play();
                    Image16.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition000016 = new TranslateTransition();
                    transition000016.setDuration(Duration.millis(450));
                    transition000016.setNode(Image16);
                    transition000016.setToY(-20);
                    transition000016.setToX(-270);
                    transition000016.play();
                    Image17.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition000017 = new TranslateTransition();
                    transition000017.setDuration(Duration.millis(500));
                    transition000017.setNode(Image17);
                    transition000017.setToY(-200);
                    transition000017.setToX(-270);
                    transition000017.play();
                    Image18.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition000018 = new TranslateTransition();
                    transition000018.setDuration(Duration.millis(550));
                    transition000018.setNode(Image18);
                    transition000018.setToY(-230);
                    //transition018.setToX(-17.5);
                    transition000018.play();
                    Image19.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player04[1])));
                    TranslateTransition transition0000019 = new TranslateTransition();
                    transition0000019.setDuration(Duration.millis(1000));
                    transition0000019.setNode(Image19);
                    transition0000019.setToY(-190);
                    transition0000019.setToX(270);
                    transition0000019.play();
                    Image20.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player05[1])));
                    TranslateTransition transition0000020 = new TranslateTransition();
                    transition0000020.setDuration(Duration.millis(1100));
                    transition0000020.setNode(Image20);
                    transition0000020.setToY(-3);
                    transition0000020.setToX(265);
                    transition0000020.play();
                    Image21.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition000021 = new TranslateTransition();
                    transition000021.setDuration(Duration.millis(700));
                    transition000021.setNode(Image21);
                    transition000021.setToY(-45);
                    transition000021.setToX(-270);
                    transition000021.play();
                    Image22.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player02[2])));
                    TranslateTransition transition000022 = new TranslateTransition();
                    transition000022.setDuration(Duration.millis(1300));
                    transition000022.setNode(Image22);
                    transition000022.setToY(-205);
                    transition000022.setToX(-238);
                    transition000022.play();
                    Image23.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/BackC.png")));
                    TranslateTransition transition0000023 = new TranslateTransition();
                    transition0000023.setDuration(Duration.millis(800));
                    transition0000023.setNode(Image23);
                    transition0000023.setToY(-228);
                    transition0000023.setToX(25);
                    transition0000023.play();
                    Image24.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player04[2])));
                    TranslateTransition transition0000024 = new TranslateTransition();
                    transition0000024.setDuration(Duration.millis(1500));
                    transition0000024.setNode(Image24);
                    transition0000024.setToY(-165);
                    transition0000024.setToX(290);
                    transition0000024.play();
                    Image25.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player05[2])));
                    TranslateTransition transition0000025 = new TranslateTransition();
                    transition0000025.setDuration(Duration.millis(1600));
                    transition0000025.setNode(Image25);
                    transition0000025.setToY(20);
                    transition0000025.setToX(250);
                    transition0000025.play();
                    Image03.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player05[0])));
                    Image04.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player05[1])));
                    Image05.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + player05[2])));
                    break;
            }
//            }

        }

        public void Tcards() {
            //int plyerNo = player;
//            for (int l=0;l<4;l++)
//            {
            System.out.println("Tcards");
            Image26.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));
            TranslateTransition tran = new TranslateTransition();
            tran.setDuration(Duration.millis(200));
            tran.setNode(Image26);
            tran.setToY(-100);
            tran.setToX(-120);
            tran.play();
            Image27.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[1])));
            TranslateTransition trans = new TranslateTransition();
            trans.setDuration(Duration.millis(200));
            trans.setNode(Image27);
            trans.setToY(-100);
            trans.setToX(-60);
            trans.play();
            Image28.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[2])));
            TranslateTransition tra = new TranslateTransition();
            tra.setDuration(Duration.millis(200));
            tra.setNode(Image28);
            tra.setToY(-100);
            //tra.setToX(-35);
            tra.play();
            Image29.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[3])));
            TranslateTransition tr = new TranslateTransition();
            tr.setDuration(Duration.millis(200));
            tr.setNode(Image29);
            tr.setToY(-100);
            tr.setToX(60);
            tr.play();
            Image30.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[4])));
            TranslateTransition trx = new TranslateTransition();
            trx.setDuration(Duration.millis(200));
            trx.setNode(Image30);
            trx.setToY(-100);
            trx.setToX(125);
            trx.play();
            //gameboard.setImage(new Image(getClass().getResourceAsStream("res/Images/Background/Table.jpg")));
//            }
        }

        public void changeCards() {
            ChangeAnchor.setVisible(true);

            FadeTransition fadein = new FadeTransition(javafx.util.Duration.seconds(1), ChangeAnchor);
            fadein.setFromValue(0);
            fadein.setToValue(3);
            fadein.setCycleCount(1);
            fadein.play();

            count = 1;

        }

        public void changeCards2() {
            ChangeAnchor.setVisible(true);

            FadeTransition fadein = new FadeTransition(javafx.util.Duration.seconds(1), ChangeAnchor);
            fadein.setFromValue(0);
            fadein.setToValue(3);
            fadein.setCycleCount(1);
            fadein.play();

            count = 2;

        }

        public void changeCards3() {
            ChangeAnchor.setVisible(true);

            FadeTransition fadein = new FadeTransition(javafx.util.Duration.seconds(1), ChangeAnchor);
            fadein.setFromValue(0);
            fadein.setToValue(3);
            fadein.setCycleCount(1);
            fadein.play();

            count = 3;

        }

        public void changeCards4() {
            ChangeAnchor.setVisible(true);

            FadeTransition fadein = new FadeTransition(javafx.util.Duration.seconds(1), ChangeAnchor);
            fadein.setFromValue(0);
            fadein.setToValue(3);
            fadein.setCycleCount(1);
            fadein.play();
            count = 4;

        }

        public void changeCards5() {
            ChangeAnchor.setVisible(true);

            FadeTransition fadein = new FadeTransition(javafx.util.Duration.seconds(1), ChangeAnchor);
            fadein.setFromValue(0);
            fadein.setToValue(3);
            fadein.setCycleCount(1);
            fadein.play();
            count = 5;

        }

        public void change(int card) {

//            Timer timer1 = new Timer();
//            
//            timer1.schedule(new TimerTask() {
//                @Override
//                public void run() {
            switch (player) {
                case 1:
                    switch (card) {
                        case 1:
                            TranslateTransition transition1 = new TranslateTransition();
                            transition1.setDuration(Duration.millis(250));
                            transition1.setNode(Image1);
                            transition1.setToY(0);
                            transition1.setToX(0);

                            Image1.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));
                            Image01.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));

                            transition1.setAutoReverse(true);
                            transition1.setCycleCount(2);
                            transition1.play();
                            ChangeAnchor.setVisible(false);

                            String Value = deal1[0];
                            List<String> list = new ArrayList<>(Arrays.asList(deal1));
                            list.remove(Value);
                            deal1 = list.toArray(new String[0]);
                            break;
                        case 2:
                            TranslateTransition transition2 = new TranslateTransition();
                            transition2.setDuration(Duration.millis(250));
                            transition2.setNode(Image6);
                            transition2.setToY(0);
                            transition2.setToX(0);

                            Image6.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));
                            Image02.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));

                            transition2.setAutoReverse(true);
                            transition2.setCycleCount(2);
                            transition2.play();

                            ChangeAnchor.setVisible(false);

                            String Value2 = deal1[0];
                            List<String> list2 = new ArrayList<>(Arrays.asList(deal1));
                            list2.remove(Value2);
                            deal1 = list2.toArray(new String[0]);
                            break;
                        case 3:
                            TranslateTransition transition3 = new TranslateTransition();
                            transition3.setDuration(Duration.millis(250));
                            transition3.setNode(Image11);
                            transition3.setToY(0);
                            transition3.setToX(0);

                            Image11.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));
                            Image03.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));

                            transition3.setAutoReverse(true);
                            transition3.setCycleCount(2);
                            transition3.play();

                            ChangeAnchor.setVisible(false);

                            String Value3 = deal1[0];
                            List<String> list3 = new ArrayList<>(Arrays.asList(deal1));
                            list3.remove(Value3);
                            deal1 = list3.toArray(new String[0]);
                            break;
                        case 4:
                            TranslateTransition transition4 = new TranslateTransition();
                            transition4.setDuration(Duration.millis(250));
                            transition4.setNode(Image16);
                            transition4.setToY(0);
                            transition4.setToX(0);

                            Image16.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));
                            Image04.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));

                            transition4.setAutoReverse(true);
                            transition4.setCycleCount(2);
                            transition4.play();

                            ChangeAnchor.setVisible(false);

                            String Value4 = deal1[0];
                            List<String> list4 = new ArrayList<>(Arrays.asList(deal1));
                            list4.remove(Value4);
                            deal1 = list4.toArray(new String[0]);
                            break;
                        case 5:
                            TranslateTransition transition5 = new TranslateTransition();
                            transition5.setDuration(Duration.millis(250));
                            transition5.setNode(Image21);
                            transition5.setToY(0);
                            transition5.setToX(0);

                            Image21.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));
                            Image05.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));

                            transition5.setAutoReverse(true);
                            transition5.setCycleCount(2);
                            transition5.play();

                            ChangeAnchor.setVisible(false);

                            String Value5 = deal1[0];
                            List<String> list5 = new ArrayList<>(Arrays.asList(deal1));
                            list5.remove(Value5);
                            deal1 = list5.toArray(new String[0]);
                            break;
                    }
                    break;
                case 2:
                    switch (card) {
                        case 1:
                            TranslateTransition transition1 = new TranslateTransition();
                            transition1.setDuration(Duration.millis(250));
                            transition1.setNode(Image2);
                            transition1.setToY(0);
                            transition1.setToX(0);

                            Image2.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));
                            Image01.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));

                            transition1.setAutoReverse(true);
                            transition1.setCycleCount(2);
                            transition1.play();
                            ChangeAnchor.setVisible(false);

                            String Value = deal1[0];
                            List<String> list = new ArrayList<>(Arrays.asList(deal1));
                            list.remove(Value);
                            deal1 = list.toArray(new String[0]);
                            break;
                        case 2:
                            TranslateTransition transition2 = new TranslateTransition();
                            transition2.setDuration(Duration.millis(250));
                            transition2.setNode(Image7);
                            transition2.setToY(0);
                            transition2.setToX(0);

                            Image7.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));
                            Image02.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));

                            transition2.setAutoReverse(true);
                            transition2.setCycleCount(2);
                            transition2.play();

                            ChangeAnchor.setVisible(false);

                            String Value2 = deal1[0];
                            List<String> list2 = new ArrayList<>(Arrays.asList(deal1));
                            list2.remove(Value2);
                            deal1 = list2.toArray(new String[0]);
                            break;
                        case 3:
                            TranslateTransition transition3 = new TranslateTransition();
                            transition3.setDuration(Duration.millis(250));
                            transition3.setNode(Image12);
                            transition3.setToY(0);
                            transition3.setToX(0);

                            Image12.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));
                            Image03.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));

                            transition3.setAutoReverse(true);
                            transition3.setCycleCount(2);
                            transition3.play();

                            ChangeAnchor.setVisible(false);

                            String Value3 = deal1[0];
                            List<String> list3 = new ArrayList<>(Arrays.asList(deal1));
                            list3.remove(Value3);
                            deal1 = list3.toArray(new String[0]);
                            break;
                        case 4:
                            TranslateTransition transition4 = new TranslateTransition();
                            transition4.setDuration(Duration.millis(250));
                            transition4.setNode(Image17);
                            transition4.setToY(0);
                            transition4.setToX(0);

                            Image17.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));
                            Image04.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));

                            transition4.setAutoReverse(true);
                            transition4.setCycleCount(2);
                            transition4.play();

                            ChangeAnchor.setVisible(false);

                            String Value4 = deal1[0];
                            List<String> list4 = new ArrayList<>(Arrays.asList(deal1));
                            list4.remove(Value4);
                            deal1 = list4.toArray(new String[0]);
                            break;
                        case 5:
                            TranslateTransition transition5 = new TranslateTransition();
                            transition5.setDuration(Duration.millis(250));
                            transition5.setNode(Image22);
                            transition5.setToY(0);
                            transition5.setToX(0);

                            Image22.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));
                            Image05.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));

                            transition5.setAutoReverse(true);
                            transition5.setCycleCount(2);
                            transition5.play();

                            ChangeAnchor.setVisible(false);

                            String Value5 = deal1[0];
                            List<String> list5 = new ArrayList<>(Arrays.asList(deal1));
                            list5.remove(Value5);
                            deal1 = list5.toArray(new String[0]);
                            break;
                    }
                    break;
                case 3:
                    switch (card) {
                        case 1:
                            TranslateTransition transition1 = new TranslateTransition();
                            transition1.setDuration(Duration.millis(250));
                            transition1.setNode(Image3);
                            transition1.setToY(0);
                            transition1.setToX(0);

                            Image3.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));
                            Image01.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));

                            transition1.setAutoReverse(true);
                            transition1.setCycleCount(2);
                            transition1.play();
                            ChangeAnchor.setVisible(false);

                            String Value = deal1[0];
                            List<String> list = new ArrayList<>(Arrays.asList(deal1));
                            list.remove(Value);
                            deal1 = list.toArray(new String[0]);
                            break;
                        case 2:
                            TranslateTransition transition2 = new TranslateTransition();
                            transition2.setDuration(Duration.millis(250));
                            transition2.setNode(Image8);
                            transition2.setToY(0);
                            transition2.setToX(0);

                            Image8.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));
                            Image02.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));

                            transition2.setAutoReverse(true);
                            transition2.setCycleCount(2);
                            transition2.play();

                            ChangeAnchor.setVisible(false);

                            String Value2 = deal1[0];
                            List<String> list2 = new ArrayList<>(Arrays.asList(deal1));
                            list2.remove(Value2);
                            deal1 = list2.toArray(new String[0]);
                            break;
                        case 3:
                            TranslateTransition transition3 = new TranslateTransition();
                            transition3.setDuration(Duration.millis(250));
                            transition3.setNode(Image13);
                            transition3.setToY(0);
                            transition3.setToX(0);

                            Image13.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));
                            Image03.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));

                            transition3.setAutoReverse(true);
                            transition3.setCycleCount(2);
                            transition3.play();

                            ChangeAnchor.setVisible(false);

                            String Value3 = deal1[0];
                            List<String> list3 = new ArrayList<>(Arrays.asList(deal1));
                            list3.remove(Value3);
                            deal1 = list3.toArray(new String[0]);
                            break;
                        case 4:
                            TranslateTransition transition4 = new TranslateTransition();
                            transition4.setDuration(Duration.millis(250));
                            transition4.setNode(Image18);
                            transition4.setToY(0);
                            transition4.setToX(0);

                            Image18.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));
                            Image04.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));

                            transition4.setAutoReverse(true);
                            transition4.setCycleCount(2);
                            transition4.play();

                            ChangeAnchor.setVisible(false);

                            String Value4 = deal1[0];
                            List<String> list4 = new ArrayList<>(Arrays.asList(deal1));
                            list4.remove(Value4);
                            deal1 = list4.toArray(new String[0]);
                            break;
                        case 5:
                            TranslateTransition transition5 = new TranslateTransition();
                            transition5.setDuration(Duration.millis(250));
                            transition5.setNode(Image23);
                            transition5.setToY(0);
                            transition5.setToX(0);

                            Image23.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));
                            Image05.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));

                            transition5.setAutoReverse(true);
                            transition5.setCycleCount(2);
                            transition5.play();

                            ChangeAnchor.setVisible(false);

                            String Value5 = deal1[0];
                            List<String> list5 = new ArrayList<>(Arrays.asList(deal1));
                            list5.remove(Value5);
                            deal1 = list5.toArray(new String[0]);
                            break;
                    }
                    break;
                case 4:
                    switch (card) {
                        case 1:
                            TranslateTransition transition1 = new TranslateTransition();
                            transition1.setDuration(Duration.millis(250));
                            transition1.setNode(Image4);
                            transition1.setToY(0);
                            transition1.setToX(0);

                            Image4.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));
                            Image01.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));

                            transition1.setAutoReverse(true);
                            transition1.setCycleCount(2);
                            transition1.play();
                            ChangeAnchor.setVisible(false);

                            String Value = deal1[0];
                            List<String> list = new ArrayList<>(Arrays.asList(deal1));
                            list.remove(Value);
                            deal1 = list.toArray(new String[0]);
                            break;
                        case 2:
                            TranslateTransition transition2 = new TranslateTransition();
                            transition2.setDuration(Duration.millis(250));
                            transition2.setNode(Image9);
                            transition2.setToY(0);
                            transition2.setToX(0);

                            Image9.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));
                            Image02.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));

                            transition2.setAutoReverse(true);
                            transition2.setCycleCount(2);
                            transition2.play();

                            ChangeAnchor.setVisible(false);

                            String Value2 = deal1[0];
                            List<String> list2 = new ArrayList<>(Arrays.asList(deal1));
                            list2.remove(Value2);
                            deal1 = list2.toArray(new String[0]);
                            break;
                        case 3:
                            TranslateTransition transition3 = new TranslateTransition();
                            transition3.setDuration(Duration.millis(250));
                            transition3.setNode(Image14);
                            transition3.setToY(0);
                            transition3.setToX(0);

                            Image14.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));
                            Image03.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));

                            transition3.setAutoReverse(true);
                            transition3.setCycleCount(2);
                            transition3.play();

                            ChangeAnchor.setVisible(false);

                            String Value3 = deal1[0];
                            List<String> list3 = new ArrayList<>(Arrays.asList(deal1));
                            list3.remove(Value3);
                            deal1 = list3.toArray(new String[0]);
                            break;
                        case 4:
                            TranslateTransition transition4 = new TranslateTransition();
                            transition4.setDuration(Duration.millis(250));
                            transition4.setNode(Image19);
                            transition4.setToY(0);
                            transition4.setToX(0);

                            Image19.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));
                            Image04.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));

                            transition4.setAutoReverse(true);
                            transition4.setCycleCount(2);
                            transition4.play();

                            ChangeAnchor.setVisible(false);

                            String Value4 = deal1[0];
                            List<String> list4 = new ArrayList<>(Arrays.asList(deal1));
                            list4.remove(Value4);
                            deal1 = list4.toArray(new String[0]);
                            break;
                        case 5:
                            TranslateTransition transition5 = new TranslateTransition();
                            transition5.setDuration(Duration.millis(250));
                            transition5.setNode(Image24);
                            transition5.setToY(0);
                            transition5.setToX(0);

                            Image24.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));
                            Image05.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));

                            transition5.setAutoReverse(true);
                            transition5.setCycleCount(2);
                            transition5.play();

                            ChangeAnchor.setVisible(false);

                            String Value5 = deal1[0];
                            List<String> list5 = new ArrayList<>(Arrays.asList(deal1));
                            list5.remove(Value5);
                            deal1 = list5.toArray(new String[0]);
                            break;
                    }
                    break;
                case 5:
                    switch (card) {
                        case 1:
                            TranslateTransition transition1 = new TranslateTransition();
                            transition1.setDuration(Duration.millis(250));
                            transition1.setNode(Image5);
                            transition1.setToY(0);
                            transition1.setToX(0);

                            Image5.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));
                            Image01.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));

                            transition1.setAutoReverse(true);
                            transition1.setCycleCount(2);
                            transition1.play();
                            ChangeAnchor.setVisible(false);

                            String Value = deal1[0];
                            List<String> list = new ArrayList<>(Arrays.asList(deal1));
                            list.remove(Value);
                            deal1 = list.toArray(new String[0]);
                            break;
                        case 2:
                            TranslateTransition transition2 = new TranslateTransition();
                            transition2.setDuration(Duration.millis(250));
                            transition2.setNode(Image10);
                            transition2.setToY(0);
                            transition2.setToX(0);

                            Image10.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));
                            Image02.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));

                            transition2.setAutoReverse(true);
                            transition2.setCycleCount(2);
                            transition2.play();

                            ChangeAnchor.setVisible(false);

                            String Value2 = deal1[0];
                            List<String> list2 = new ArrayList<>(Arrays.asList(deal1));
                            list2.remove(Value2);
                            deal1 = list2.toArray(new String[0]);
                            break;
                        case 3:
                            TranslateTransition transition3 = new TranslateTransition();
                            transition3.setDuration(Duration.millis(250));
                            transition3.setNode(Image15);
                            transition3.setToY(0);
                            transition3.setToX(0);

                            Image15.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));
                            Image03.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));

                            transition3.setAutoReverse(true);
                            transition3.setCycleCount(2);
                            transition3.play();

                            ChangeAnchor.setVisible(false);

                            String Value3 = deal1[0];
                            List<String> list3 = new ArrayList<>(Arrays.asList(deal1));
                            list3.remove(Value3);
                            deal1 = list3.toArray(new String[0]);
                            break;
                        case 4:
                            TranslateTransition transition4 = new TranslateTransition();
                            transition4.setDuration(Duration.millis(250));
                            transition4.setNode(Image20);
                            transition4.setToY(0);
                            transition4.setToX(0);

                            Image20.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));
                            Image04.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));

                            transition4.setAutoReverse(true);
                            transition4.setCycleCount(2);
                            transition4.play();

                            ChangeAnchor.setVisible(false);

                            String Value4 = deal1[0];
                            List<String> list4 = new ArrayList<>(Arrays.asList(deal1));
                            list4.remove(Value4);
                            deal1 = list4.toArray(new String[0]);
                            break;
                        case 5:
                            TranslateTransition transition5 = new TranslateTransition();
                            transition5.setDuration(Duration.millis(250));
                            transition5.setNode(Image25);
                            transition5.setToY(0);
                            transition5.setToX(0);

                            Image25.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));
                            Image05.setImage(new Image(getClass().getResourceAsStream("res/Images/cards/" + deal1[0])));

                            transition5.setAutoReverse(true);
                            transition5.setCycleCount(2);
                            transition5.play();

                            ChangeAnchor.setVisible(false);

                            String Value5 = deal1[0];
                            List<String> list5 = new ArrayList<>(Arrays.asList(deal1));
                            list5.remove(Value5);
                            deal1 = list5.toArray(new String[0]);
                            break;
                    }
                    break;
            }

//                    timer1.cancel();
//                }
//            },1*1000);
//            TranslateTransition transition190 = new TranslateTransition(); 
//            transition190.setDuration(Duration.millis(250));
//            transition190.setNode(Image2);
//            transition190.setToY(-200);
//            transition190.setToX(-290);
//            transition190.play();
        }

        private void coins() {
            System.out.println(coinResult);

            ChangeCoinAnchor.setVisible(false);
            FadeTransition fadeout = new FadeTransition(javafx.util.Duration.seconds(2), ChangeCoinAnchor);
            fadeout.setFromValue(1);
            fadeout.setToValue(0);
            fadeout.setCycleCount(1);
            fadeout.play();
            //Coins.adjustValue(0);
        }

        private void Raise() {
            ChangeCoinAnchor.setVisible(true);
            FadeTransition fadein = new FadeTransition(javafx.util.Duration.seconds(1), ChangeCoinAnchor);
            fadein.setFromValue(0);
            fadein.setToValue(3);
            fadein.setCycleCount(1);
            fadein.play();

        }
    }

}
