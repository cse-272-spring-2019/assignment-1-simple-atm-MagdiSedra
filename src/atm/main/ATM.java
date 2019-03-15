/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.main;

import com.sun.jndi.cosnaming.CNCtx;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author JanetRadi
 */
public class ATM extends Application implements EventHandler<ActionEvent> {

    int flag = 0;
    Label cn, am, Show;
    Button btd, btn1, btd2, btn2, btn3, prev, next, BalanceInq;
    Client c;
    Scene scene2;
    TitledPane tp1, tp2;
    RadioButton rb1, rb2;

    @Override
    public void start(Stage primaryStage) {
        Stage s = primaryStage;
        c = new Client(0, "1234"); //<<<<<<<<<<<<<<<<<<<<<<<<<<<-----------------------  CARDNUMBER 

        Label l2 = new Label("ATM");
        l2.setFont(new Font(40));
        l2.setPadding(new Insets(12, 0, 0, 255));

        Label l1 = new Label("CardNumber : ");
        cn = new Label();
        l1.setFont(new Font(25));

        Button bt0 = new Button("0");
        Button bt1 = new Button("1");
        Button bt2 = new Button("2");
        Button bt3 = new Button("3");
        Button bt4 = new Button("4");
        Button bt5 = new Button("5");
        Button bt6 = new Button("6");
        Button bt7 = new Button("7");
        Button bt8 = new Button("8");
        Button bt9 = new Button("9");
        btd = new Button("<-");
        bt0.setFont(new Font(15));
        bt1.setFont(new Font(15));
        bt2.setFont(new Font(15));
        bt3.setFont(new Font(15));
        bt4.setFont(new Font(15));
        bt5.setFont(new Font(15));
        bt6.setFont(new Font(15));
        bt7.setFont(new Font(15));
        bt8.setFont(new Font(15));
        bt9.setFont(new Font(15));
        btd.setFont(new Font(15));
        HBox hb1 = new HBox(bt0, bt1, bt2);
        HBox hb2 = new HBox(bt3, bt4, bt5);
        HBox hb3 = new HBox(bt6, bt7, bt8);
        HBox hb4 = new HBox(bt9, btd);
        VBox vb2 = new VBox(hb1, hb2, hb3, hb4);
        btn1 = new Button("OK");

        bt0.setOnAction(this);
        bt1.setOnAction(this);
        bt2.setOnAction(this);
        bt3.setOnAction(this);
        bt4.setOnAction(this);
        bt5.setOnAction(this);
        bt6.setOnAction(this);
        bt7.setOnAction(this);
        bt8.setOnAction(this);
        bt9.setOnAction(this);
        btd.setOnAction(this);

        HBox hb5 = new HBox(l1, cn);
        l1.setPadding(new Insets(0, 0, 0, 20));
        hb5.setPadding(new Insets(20, 20, 20, 10));
        hb5.setSpacing(80);
        HBox hb6 = new HBox(btn1, vb2);
        hb6.setAlignment(Pos.CENTER);
        hb6.setSpacing(80);
        VBox vb1 = new VBox(l2, hb5, hb6);
        cn.setFont(new Font(27));
        btn1.setFont(new Font(20));

        Scene scene = new Scene(vb1, 600, 300);

        primaryStage.setTitle("Main Menu");
        primaryStage.setScene(scene);
        primaryStage.show();

        rb1 = new RadioButton("Withdraw / Deposit");
        rb2 = new RadioButton("History Navigation / Balance Inquiry");
        ToggleGroup tg = new ToggleGroup();
        rb1.setToggleGroup(tg);
        rb2.setToggleGroup(tg);
        rb1.setOnAction(this);
        rb2.setOnAction(this);
        rb1.setPadding(new Insets(0, 0, 0, 27));
        HBox hb19 = new HBox(rb1, rb2);
        hb19.setSpacing(80);
        hb19.setPadding(new Insets(30, 0, 0, 45));

        Label l8 = new Label("Amount : ");
        l8.setFont(new Font(23));
        am = new Label();
        am.setFont(new Font(25));
        HBox hb20 = new HBox(l8, am);
        hb20.setSpacing(10);
        hb20.setPadding(new Insets(20, 20, 20, 0));
        btn2 = new Button("Withdraw");
        btn3 = new Button("Deposit");
        btn2.setOnAction(this);
        btn3.setOnAction(this);

        Button btt0 = new Button("0");
        Button btt1 = new Button("1");
        Button btt2 = new Button("2");
        Button btt3 = new Button("3");
        Button btt4 = new Button("4");
        Button btt5 = new Button("5");
        Button btt6 = new Button("6");
        Button btt7 = new Button("7");
        Button btt8 = new Button("8");
        Button btt9 = new Button("9");
        btd2 = new Button("<-");
        btt0.setFont(new Font(15));
        btt1.setFont(new Font(15));
        btt2.setFont(new Font(15));
        btt3.setFont(new Font(15));
        btt4.setFont(new Font(15));
        btt5.setFont(new Font(15));
        btt6.setFont(new Font(15));
        btt7.setFont(new Font(15));
        btt8.setFont(new Font(15));
        btt9.setFont(new Font(15));
        btd2.setFont(new Font(15));
        HBox hb22 = new HBox(btt0, btt1, btt2);
        HBox hb23 = new HBox(btt3, btt4, btt5);
        HBox hb24 = new HBox(btt6, btt7, btt8);
        HBox hb25 = new HBox(btt9, btd2);
        VBox vb3 = new VBox(hb22, hb23, hb24, hb25);
        VBox vb4 = new VBox(btn2, btn3);
        vb4.setSpacing(10);
        HBox hb30 = new HBox(vb4, vb3);
        hb30.setSpacing(40);
        hb30.setPadding(new Insets(0, 20, 5, 0));
        btt0.setOnAction(this);
        btt1.setOnAction(this);
        btt2.setOnAction(this);
        btt3.setOnAction(this);
        btt4.setOnAction(this);
        btt5.setOnAction(this);
        btt6.setOnAction(this);
        btt7.setOnAction(this);
        btt8.setOnAction(this);
        btt9.setOnAction(this);
        btd2.setOnAction(this);
        VBox vb30 = new VBox(hb20, hb30);
        vb30.setSpacing(20);
        vb30.setPadding(new Insets(0, 0, 0, 30));

        tp1 = new TitledPane("Withdraw / Deposit", vb30);
        tp1.setVisible(false);
        tp1.setLayoutY(70);
        tp1.setLayoutX(35);
        tp1.setPadding(new Insets(0, 0, 0, 115));

        prev = new Button("Previous");
        next = new Button("Next");
        prev.setOnAction(this);
        next.setOnAction(this);
        BalanceInq = new Button("Balance Inquiry");
        BalanceInq.setOnAction(this);
        VBox HNaBI = new VBox(prev, next, BalanceInq);
        HNaBI.setSpacing(20);
        Show = new Label();
        Show.setPadding(new Insets(30, 0, 0, 10));
        Show.setFont(new Font(23));
        HBox hn = new HBox(HNaBI, Show);
        hn.setSpacing(10);
        tp2 = new TitledPane("History Navigation / Balance Inquiry", hn);
        tp2.setVisible(false);
        tp2.setLayoutY(90);
        tp2.setPadding(new Insets(0, 0, 0, 63));
        tp2.setMinWidth(490);

        Group g = new Group(hb19, tp1, tp2);
        Scene sc2 = new Scene(g, 550, 350);

        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                if (cn.getText().length() == 0) 
                    JOptionPane.showMessageDialog(null, "Please enter the CardNumber");
                 else {
                    if (cn.getText().equals(c.getCardNumber())) {
                        {
                            primaryStage.hide();
                            s.setScene(sc2);
                            s.show();

                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "The CardNumber you entered is not correct");
                        cn.setText("");
                    }
                }
            }
        });

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == btd) {
            if (cn.getText() != null && cn.getText().length() > 0) {
                cn.setText(cn.getText().substring(0, cn.getText().length() - 1));
            }
        } else if (event.getSource() == btd2) {
            if (am.getText() != null && am.getText().length() > 0) {
                am.setText(am.getText().substring(0, am.getText().length() - 1));
            }
        } else if (event.getSource() == rb1) {
            tp2.setVisible(false);
            tp1.setVisible(true);
            flag = 1;
            
        } else if (event.getSource() == rb2) {
            c.setCurrent();
            tp1.setVisible(false);
            tp2.setVisible(true);
            Show.setText("Info is displayed HERE");
        } else if (event.getSource() == prev) {
            String s = c.Previous();
            Show.setText(s);
        } else if (event.getSource() == next) {
            String s = c.Next();
            Show.setText(s);
        } else if (event.getSource() == BalanceInq) {
            String s = c.balanceInquiry();
            Show.setText(s);
        } else if (event.getSource() == btn2) {
            if (am.getText().equals("0") || am.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please enter a valid Amount");
            } else {
                String s = c.withDraw(Double.parseDouble(am.getText()));
                JOptionPane.showMessageDialog(null, s);
                am.setText("");
            }
        } else if (event.getSource() == btn3) {
            if (am.getText().equals("0") || am.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please enter a valid Amount");
            } else {
                String s = c.Deposit(Double.parseDouble(am.getText()));
                JOptionPane.showMessageDialog(null, s);
                am.setText("");
            }
        } else if (flag == 0) {
                if(cn.getText().length()!=15)
                    cn.setText(cn.getText() + ((Button) event.getSource()).getText());
                else
                    JOptionPane.showMessageDialog(null, "Maximum number of digits reached");
                    
        } else if (flag == 1) {
                if(am.getText().length()!=6)
                    am.setText(am.getText() + ((Button) event.getSource()).getText());
                else
                    JOptionPane.showMessageDialog(null, "Maximum number of digits reached");
        }

    }
}
