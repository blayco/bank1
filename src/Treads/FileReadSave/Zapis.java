package Treads.FileReadSave;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import static Treads.Start.ThreadColor.*;

public class Zapis implements Runnable {


    public void run() {
        PrintWriter zapis = null;
        try {
            zapis = new PrintWriter("watek_zapis.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        zapis.println(ANSI_GREEN + "Przykładowe zadanie \n"+ ANSI_BLUE  + "Do zapisu i odczytu\n" + ANSI_CYAN+  "Na zajeciach" );
        zapis.close();
    }}


