//Brian Boland
//hw02
//Arithmetic
//This program will summarize and calculate the costs of a purchase including tax and print out a summary of the findings at the end.

public class Arithmetic {
    public static void main(String[] args) {
        int nSocks=3; //decalring the number of socks purchased
        double sockCost$=2.58; //cost of each sock ($ is part of the variable name)
        int nGlasses=6; //number of glasses purchased
        double glassCost$=2.29; //cost of each glass
        int nEnvelopes=1; // amount of envelopes purchased
        double envelopeCost$=3.25; //cost of each of envelope
        double taxPercent=0.06; //PA sales tax rate
        
        double totalCostSocks$= nSocks * sockCost$; //This group of code will find the total cost of each type of purchase before tax
        double totalCostGlass$= nGlasses * glassCost$;
        double totalCostEnvelope$= nEnvelopes * envelopeCost$;
        
        double sockTax= taxPercent * totalCostSocks$; //This group of code will find the sales tax on each group of purchases, and will be unrounded
        double glassTax= taxPercent * totalCostGlass$;
        double envelopeTax= taxPercent * totalCostEnvelope$;
        
        double finalSockTax = sockTax*100; //This group of code is rounding the tax for the sock purchases to two decimal places
        int finalSockTax2 = (int) finalSockTax;
        double finalSockTax3 = (double) finalSockTax2/100;
        
        double finalGlassTax = glassTax*100; //This group of code is rounding the tax for the glass purchases to two decimal places
        int finalGlassTax2 = (int) finalGlassTax;
        double finalGlassTax3 = (double) finalGlassTax2/100;
        
        double finalEnvelopeTax = envelopeTax*100; //This group of code is rounding the tax for the envelope purchases to two decimal places
        int finalEnvelopeTax2 = (int) finalEnvelopeTax;
        double finalEnvelopeTax3 = (double) finalEnvelopeTax2/100;
        
        double allCostSock= finalSockTax3 + totalCostSocks$; //This group of code is to find the total cost with tax of each purchase
        double allCostGlass= finalGlassTax3 + totalCostGlass$;
        double allCostEnvelope= finalEnvelopeTax3 + totalCostEnvelope$;
        
        System.out.println("Socks"); //The next couple groups of code are print out statements summarizing our claculations above. Each line definitively states what is being printed.
        System.out.println("Number of socks purchased: " + nSocks);
        System.out.println("Cost per sock: $" + sockCost$);
        System.out.println("Total cost of socks before tax: $" + totalCostSocks$);
        System.out.println("Sales tax on socks: $" + finalSockTax3);
        System.out.println("Total cost of socks including tax: $" + allCostSock);
        
        System.out.println(); //This line of code is simply to seperate blocks of text in the final print out for organizational purposes
        
        System.out.println("Drinking Glasses");
        System.out.println("Number of glasses purchased: " + nGlasses);
        System.out.println("Cost per glass: $" + glassCost$);
        System.out.println("Total cost of glasses before tax: $" + totalCostGlass$);
        System.out.println("Sales tax on glasses: $" + finalGlassTax3);
        System.out.println("Total cost of glasses including tax: $" + allCostGlass);
        
        System.out.println(); //This line of code is simply to seperate blocks of text in the final print out for organizational purposes
        
        System.out.println("Envelopes");
        System.out.println("Number of envelopes purchased: " + nEnvelopes);
        System.out.println("Cost per envelope: $" + envelopeCost$);
        System.out.println("Total cost of envelopes before tax: $" + totalCostEnvelope$);
        System.out.println("Sales tax on envelopes: $" + finalEnvelopeTax3);
        System.out.println("Total cost of envelopes including tax: $" + allCostEnvelope);
        
        System.out.println(); //This line of code is simply to seperate blocks of text in the final print out for organizational purposes
        
        System.out.println("Total cost of purchases before tax: $" + (totalCostSocks$ + totalCostGlass$ + totalCostEnvelope$));
        System.out.println("Total amount of sales tax: $" + (finalSockTax3 + finalGlassTax3 + finalEnvelopeTax3));
        System.out.println("Total cost of purchases with tax: $" + (finalSockTax3 + totalCostSocks$ + finalGlassTax3 + totalCostGlass$ + finalEnvelopeTax3 + totalCostEnvelope$));
        
        
        
    }
}