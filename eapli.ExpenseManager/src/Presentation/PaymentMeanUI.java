package Presentation;

import Controllers.ExpenseRegisterController;
import Controllers.PaymentMeanController;
import Model.PaymentMean;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class PaymentMeanUI {
    public PaymentMeanUI() {

    }
    
    PaymentMeanController controller = new PaymentMeanController();
    
    public void run() {
        System.out.println("* * * REGISTER A PAYMENT MEAN * * *\n");
        
        int op;
        do {
            op=menu();
            switch(op) {
                case 0:
                    MainMenu mm = new MainMenu();
                    mm.mainLoop();
                    break;
                case 1:
                    controller.registerCash();
                    break;
                case 2:
                    String accountNumber = Console.readLine("Account number: ");
                    accountNumber = validarAccountNumber(accountNumber);
                    String checkNumber = Console.readLine("Check number: ");
                    validarCheckNumber(checkNumber);
                    String bank = Console.readLine("Bank: ");
                    controller.registerCheck(accountNumber, checkNumber, bank);
                    break;
                case 3:
                    String accountNumberCC = Console.readLine("Account number: ");
                    accountNumberCC = validarAccountNumber(accountNumberCC);
                    String CVC = Console.readLine("CVC: ");
                    validarCVC(CVC);
                    String bankCC = Console.readLine("Bank: ");
                    Date validadeCC = Console.readDate("Expiration value: ");
//                    Date validade = validarValidade();
                    controller.registerCreditCard(accountNumberCC, CVC, bankCC, validadeCC);
                    break;
                case 4:
                    String accountNumberDC = Console.readLine("Account number: ");
                    accountNumberDC = validarAccountNumber(accountNumberDC);
                    String bankDC = Console.readLine("Bank: ");
                    Date validadeDC = Console.readDate("Expiration value: ");
                    controller.registerDebitCard(accountNumberDC, bankDC, validadeDC);
                    break;
                case 5:
                    PaymentMeanController pmc= new PaymentMeanController();
                    List<PaymentMean> list = pmc.listAllPaymentMeans();
                    for(int i=0;i<list.size();i++){
                        System.out.println(list.get(i).toString());
                        System.out.println("");
                    }
                    break;
            }
        } while (op!= 0);
    }

    private int menu() {
        System.out.println("[1] Cash");
        System.out.println("[2] Check");
        System.out.println("[3] Credit Card");
        System.out.println("[4] Debit Card\n");
        System.out.println("[5] List Payment Means\n");
        System.out.println("[0] Cancel\n\n");
        
        int option = Console.readInteger("Please choose an option:\n");        
        return option;
    }
        
        
        //System.out.println("expense recorded.\n\n");

    private String validarAccountNumber(String accountNumber) {
        // falta validar letras
        while( accountNumber.length() != 16 ) {
                System.out.println("Invalid account number. 16 numbers needed\n");
                accountNumber = Console.readLine("Please insert a valid account number: ");
        }
        return accountNumber;
    }

    private String validarCheckNumber(String checkNumber) {
        // valida??o errada . validar letras
        while( checkNumber.length() != 16 ) {
                System.out.println("Invalid check number. 16 numbers needed\n");
                checkNumber = Console.readLine("Please insert a valid check number: ");
        }
        return checkNumber;
    }

    private void validarCVC(String CVC) {
        while( CVC.length() != 3 ) {
            System.out.println("Invalid CVC. 3 numbers needed\n");
            CVC = Console.readLine("Please insert a valid CVC: ");
        }
    }

 /*   private Date validarValidade() {
        int i=0;
        //char vec[] = new char[7]; 
        String aux;
        int year = Console.readInteger("Expiration value: ");
        int vec[]=new int[2];
        
        vec=Integer.parseInt(value.split("-"));
        if(vec[0]<Calendar.YEAR){
        }
        
            
        
    }*/
}
