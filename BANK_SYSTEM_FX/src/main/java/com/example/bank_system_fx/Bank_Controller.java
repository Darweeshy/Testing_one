package com.example.bank_system_fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Bank_Controller{
    @FXML
    Button SignupB;
    @FXML
    Button Login1 , signingup_final;
    @FXML
    private Stage stage;
    private Parent root;
    private Scene scene;

    @FXML
    TextArea textarea_name , textarea_DOB, textarea_ID , textarea_add , textarea_Emp ,  textarea_SOI, textArea_email;
    @FXML
    TextArea password;



    public void cust_Signup(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Signup.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }





    public void Signing_up(ActionEvent event)  throws  IOException
    {

        int x = Integer.parseInt(textarea_ID.getText());
        int Soii = Integer.parseInt(textarea_ID.getText());
        Customer customer = new Customer(textarea_name.getText(),x , textarea_DOB.getText(), textarea_Emp.getText() , Soii , textarea_add.getText(), textArea_email.getText() , password.getText());
        File file = new File("D:\\Java_Fx_proj\\BANK_SYSTEM_FX\\src\\main\\resources\\Customer.txt");
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(customer.toString());
        printWriter.close();





    }



}
