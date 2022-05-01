package eapli.base.app.backoffice.console.presentation.validations;

import eapli.framework.io.util.Console;

import java.util.Objects;

public class Validate {

    public static String ValidateSort(String sort, int i) {
        String x;
        while(i == 0){
            x = Console.readLine("Sort by (1.Internal Code , 2.Brand , 3.Category , 4.Unit Price :");
            if(Objects.equals(x, "1")) {
                sort = "p.products.internalCode";
                i++;
            }
            else if(Objects.equals(x, "2")){
                sort = "p.products.brand";
                i++;
            }
            else if(Objects.equals(x, "3")){
                sort = "p.products.productCategory";
                i++;
            }
            else if(Objects.equals(x, "4")){
                sort = "p.products.priceWithTaxes";
                i++;
            }else{
                i = 0;
                System.out.println("Please enter a valid number!");
            }
        }
        return sort;
    }

}
