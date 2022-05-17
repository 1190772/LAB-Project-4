package eapli.base.app.backoffice.console.presentation.productCatalog;

import eapli.base.app.backoffice.console.presentation.validations.Validate;
import eapli.base.product.application.SearchProductCatalogByBrandController;
import eapli.base.product.domain.model.Brand;
import eapli.base.product.domain.model.Product;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

public class SearchProductCatalogByBrandUI extends AbstractUI {

    private final SearchProductCatalogByBrandController theController = new SearchProductCatalogByBrandController();

    @Override
    protected boolean doShow() {
        Brand brand;
        String sort = "InternalCode";
        int i = 0;
        do{
            brand = Brand.fromBrand(Console.readLine("Brand:"));
            if(brand.getBrand() == null){
                System.out.println("Please enter a valid Brand Name");
            }
        }while(brand.getBrand() == null);

        sort = Validate.ValidateSort(sort, i);

        System.out.println("Results with the Brand : " + brand);
        Brand brand1 = new Brand(brand.toString());
        for (Product cat: theController.findProductsByBrand(brand1, sort)) {
            System.out.println(cat.toString());
        }
        return false;
    }

    @Override
    public String headline() {
        return "Search Product Catalog by Brand";
    }
}
