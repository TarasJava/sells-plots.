import java.util.Scanner;

//A program for a brokerage firm that sells plots. Ein Programm für eine Maklerfirma, die Grundstücke verkauft.
public class C2plusvsJava {
    public static void main(String[] args) {
        Scanner scannerLength= new Scanner(System.in);
        Scanner scannerWidth= new Scanner(System.in);
        Scanner scanner2M= new Scanner(System.in); //Square meters

        double  Length, price1s2Ms,seitenBreite, totalPlotsSurface, plotsPrice, brokerFee,
                brokersTax19percent, totalPrice;

        System.out.println("Please enter the side length of the plot");
        Length= scannerLength.nextDouble();

        while (Length<=0) { // If you enter a number under nul or nul, you can't go to the next line *1
            System.out.println("Please write full number");
            Length= scannerLength.nextDouble();
        }
        Length = (int) (Length*100+0.5)/100.0; //Round up to after comma(,) numbers *2

        System.out.println("Please enter the latitude length of the plot");
        seitenBreite= scannerWidth.nextDouble();

        while (seitenBreite<=0) { //*1
            System.out.println("Please write full number");
            seitenBreite= scannerWidth.nextDouble();
        }
        seitenBreite = (int) (seitenBreite*100+0.5)/100.0; // *2

        totalPlotsSurface= Length * seitenBreite;
        totalPlotsSurface=(int) (totalPlotsSurface*100+0.5)/100.0; // *2
        System.out.println("This is the entire green space of the piece of the flot: " + totalPlotsSurface);

        System.out.println("Please enter the price of one square meter"); price1s2Ms=scanner2M.nextDouble();

        while (price1s2Ms<=0){ // *1
            System.out.println("Please write full number");
            price1s2Ms=scanner2M.nextDouble();

        }
        price1s2Ms=(int)(price1s2Ms*100+0.5)/100;// *2



        plotsPrice= totalPlotsSurface * price1s2Ms;
        plotsPrice=(int) (plotsPrice*100+0.5)/100; // *2
        System.out.println();
        System.out.println("The price of the flot is "+ plotsPrice + " Euro.");

        brokerFee= plotsPrice * 3 / 100;
        System.out.println("The 3% Mackler´s fee is: " + brokerFee+ " Euro");

        brokersTax19percent= brokerFee * 19 / 100;
        brokersTax19percent=(int)(brokersTax19percent*100+0.5)/100; // *2
        System.out.println(brokersTax19percent + " Euro is 19% tax from the Mackler fee");

        totalPrice= plotsPrice + brokerFee + brokersTax19percent;
        totalPrice=(int)(totalPrice*100+0.5)/100; // *2
        System.out.println(totalPrice + ": total price");
    }
}
