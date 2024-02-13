package com.company;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;
    private int totalPagesPrinted = 0;

    public Printer(int tonerLevel, int pagesPrinted, boolean isDuplex) {

        if (tonerLevel >= 0 && tonerLevel  <= 100){
            this.tonerLevel = tonerLevel;

        }
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.isDuplex = isDuplex;
    }
    public void refillToner() {

        this.tonerLevel = 100;
        System.out.println(" Toner filled to " + tonerLevel);

    }

    public int printPages(int pagesPrinted){
        int tonerCheck = this.tonerLevel;
        if(isDuplex){pagesPrinted = pagesPrinted / 2;}


        if  (tonerCheck - (pagesPrinted * 5) >= 0){
            this.pagesPrinted = pagesPrinted;
            this.tonerLevel = tonerLevel - (pagesPrinted * 5);

            totalPagesPrinted = this.pagesPrinted + totalPagesPrinted;

            System.out.println(this.pagesPrinted + " printed pages");

            System.out.println("total pages printed is: " + totalPagesPrinted);

            return pagesPrinted;
        }else System.out.println(" you do not have enough toner to do that, please refill ");
            return 0;

        }


    public int getTonerLevel() {
        return tonerLevel;
    }


    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}