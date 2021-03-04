/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//sviluppare un applicativo client server che generi tanti thread quanti dichiarati dall'utente attraverso un thread a lui dedicato ogmi thread alla variabile globale contenuta nel server il proprio valore incrementale assegnatgli da server da 1 a n dove n è il numero dei thread il server killera ogni processo dopo che avrà svolto l'operazione quando tutti i processi saranno killatiil server stampera a console il risultato

package clientbase;

import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pogliani.mattia
 */
public class ClientBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Apertua connessione");
        try {
            Socket server = new Socket("127.0.0.1", 5500);

            PrintWriter out
                    = new PrintWriter(server.getOutputStream(), true);
            Scanner tastiera = new Scanner(System.in);
            int s;
            System.out.println("Inserire N:");
            s = tastiera.nextInt();
            out.println(s);
            server.close();
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(ClientBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
