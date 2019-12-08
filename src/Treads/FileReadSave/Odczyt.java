package Treads.FileReadSave;

import javax.xml.stream.events.EndDocument;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static Treads.Start.ThreadColor.ANSI_BLUE;
import static Treads.Start.ThreadColor.ANSI_GREEN;


public class Odczyt implements Runnable {

    public void run() {
        //System.out.println(ANSI_GREEN+"Hello from MyRunnable");
        File plik = new File("watek_zapis.txt");

        Scanner in = null;
        try {
            in = new Scanner(plik);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (in.hasNextLine()) {
            String tekst = in.nextLine();
            System.out.println(tekst);
        }
    }
    }

