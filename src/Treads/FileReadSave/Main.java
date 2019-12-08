package Treads.FileReadSave;

import Treads.Start.MyRunnable;


import static Treads.Start.ThreadColor.*;

public class Main {
    public static void main(String[] args) {

        Thread zapis = new Thread(new Zapis());
        zapis.run();


        Thread myRunnable =new Thread(new Odczyt());
        myRunnable.start();//naspisanie dla jednego konkretnego wywołania
        myRunnable=new Thread(new Odczyt() {
            @Override
            public void run() {
                try {
                   zapis.join(); // wykonuj ten wątek dopiero jak skończy się AnotherThread
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }});
           myRunnable.start();
    }
}
