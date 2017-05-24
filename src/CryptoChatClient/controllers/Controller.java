package CryptoChatClient.controllers;

import CryptoChatClient.models.RSA;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.math.BigInteger;
import java.security.KeyPair;
import java.security.interfaces.RSAPublicKey;
import java.util.Base64;

public class Controller {

    @FXML Label label1;

    public void initialize(){
        try {

            //Creating the RSA keys
            KeyPair pair = RSA.generateKeyPair();

            //Extracting the public key
            RSAPublicKey pubKey = (RSAPublicKey) pair.getPublic();
            BigInteger modulus = pubKey.getModulus();
            System.out.println(Base64.getEncoder().encodeToString(modulus.toByteArray()));

        }catch (Exception e){
            System.out.println("Error: Impossible to create RSA keys");
        }



    }

}
