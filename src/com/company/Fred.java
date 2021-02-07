package com.company;

public class Fred extends Thread {

    @Override
    public void run() {
        try {
            while (!Jobs.list.isEmpty()) {
                System.out.println(Jobs.getElement());
            }
        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
