package Product;

import eapli.base.category.domain.model.AlphaNumericCode;
import eapli.base.category.domain.model.Category;
import eapli.base.category.domain.model.Description;
import eapli.base.product.domain.model.*;
import eapli.framework.general.domain.model.Money;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProductTest {
/*
    private static final Category DECORACAO_PRODUCT_CATEGORY = new Category(new AlphaNumericCode("123456"), new Description("decoraçãoDecoraçãoDecoração"));
    private static final InternalCode PRODUCT_INTENAL_CODE = InternalCode.valueOf("a123456789");
    private static final ShortDescription PRODUCT_SHORT_DESCRIPTION = ShortDescription.shortDescriptedAs("candeiro");
    private static final ExtendedDescription PRODUCT_EXTENDED_DESCRIPTION = ExtendedDescription.extendedDescriptedAs("candeiro de pé com lampadas incluidas e muito feio");
    private static final TechnicalDescription PRODUCT_TEHCNICAL_DESCRIPTION = TechnicalDescription.tehcnincalDescriptedAs("candeiro de pé com lampada incluida mais qualquer coisa");
    private static final Brand PRODUCT_BRAND = Brand.fromBrand("IKEA");
    private static final Reference PRODUCT_REFERENCE = Reference.withReference("b123456789");
    private static final ProductionCode PRODUCT_PRODUCTION_CODE = ProductionCode.productedCodedAs("c123456789");
    private static final Barcode PRODUCT_BARCODE = Barcode.withBarcode(1111111111111L);
    private static final Money PRODUCT_PRICE = Money.euros(7.0);
    private static final Mesurements PRODUCT_MESUREMENTS = Mesurements.withMesurments(20, 30, 10, 1000);

//    @Test
//    public void testC() {
//
//
//            SpecifyProductController controllerViaDomain = new SpecifyProductController();
//            controllerViaDomain.registerProduct(DECORACAO_PRODUCT_CATEGORY,"a123456789","candeiro","candeiro de pé com lampadas incluidas e muito feio",
//            "candeiro de pé com lampada incluida mais qualquer coisa","IKEA","b123456789","c123456789","1111111111111",
//            20.0,30.0,10.0,1000.0,new
//            StorageArea(1,2,3),123.0);
//}

    /**
     * Test method for
     * {@link eapli.base.productmanagement.domain.Product}.
     */

  /*  @Test
    public void ensureProductWithProductCategoryShortDescriptionExtendedDescriptionAndBarcode() {
        new Product(DECORACAO_PRODUCT_CATEGORY, PRODUCT_INTENAL_CODE, PRODUCT_SHORT_DESCRIPTION, PRODUCT_EXTENDED_DESCRIPTION, PRODUCT_BARCODE);
        assertTrue(true);
    }


    ///////////////////////
    @Test
    public void ensureCanBuildProductWithAllInfo() {
        final Product subject = new ProductBuilder()
                .ofType(DECORACAO_PRODUCT_CATEGORY)
                .internalCoded(PRODUCT_INTENAL_CODE)
                .shortDesignated(PRODUCT_SHORT_DESCRIPTION)
                .extendedDesignated(PRODUCT_EXTENDED_DESCRIPTION)
                .barcoded(PRODUCT_BARCODE)
                .technicalDesignated(PRODUCT_TEHCNICAL_DESCRIPTION)
                .branded(PRODUCT_BRAND)
                .referenced(PRODUCT_REFERENCE)
                .productionCoded(PRODUCT_PRODUCTION_CODE)
                .mesuring(PRODUCT_MESUREMENTS)
                //   .located(PRODUCT_LOCATION)
                .costing(PRODUCT_PRICE)
                .build();
        assertNotNull(subject);
    }


    //Product Category
    @Test(expected = IllegalStateException.class)
    public void ensureCannotBuildWithNullProductCategory() {
        new ProductBuilder()
                .ofType(null)
                .internalCoded(PRODUCT_INTENAL_CODE)
                .shortDesignated(PRODUCT_SHORT_DESCRIPTION)
                .extendedDesignated(PRODUCT_EXTENDED_DESCRIPTION)
                .barcoded(PRODUCT_BARCODE)
                .technicalDesignated(PRODUCT_TEHCNICAL_DESCRIPTION)
                .branded(PRODUCT_BRAND)
                .referenced(PRODUCT_REFERENCE)
                .productionCoded(PRODUCT_PRODUCTION_CODE)
                .mesuring(PRODUCT_MESUREMENTS)
                //   .located(PRODUCT_LOCATION)
                .costing(PRODUCT_PRICE)
                .build();
    }

    @Test(expected = IllegalStateException.class)
    public void ensureCannotBuildWithNulProductCategory2() {
        new ProductBuilder()
                .internalCoded(PRODUCT_INTENAL_CODE)
                .shortDesignated(PRODUCT_SHORT_DESCRIPTION)
                .extendedDesignated(PRODUCT_EXTENDED_DESCRIPTION)
                .barcoded(PRODUCT_BARCODE)
                .technicalDesignated(PRODUCT_TEHCNICAL_DESCRIPTION)
                .branded(PRODUCT_BRAND)
                .referenced(PRODUCT_REFERENCE)
                .productionCoded(PRODUCT_PRODUCTION_CODE)
                .mesuring(PRODUCT_MESUREMENTS)
                //    .located(PRODUCT_LOCATION)
                .costing(PRODUCT_PRICE)
                .build();
    }

    //Internal Code
    @Test(expected = IllegalArgumentException.class)
    public void ensureCannotBuildWithNullInternalCode() {
        new ProductBuilder()
                .ofType(DECORACAO_PRODUCT_CATEGORY)
                .internalCoded(InternalCode.valueOf(null))
                .shortDesignated(PRODUCT_SHORT_DESCRIPTION)
                .extendedDesignated(PRODUCT_EXTENDED_DESCRIPTION)
                .barcoded(PRODUCT_BARCODE)
                .technicalDesignated(PRODUCT_TEHCNICAL_DESCRIPTION)
                .branded(PRODUCT_BRAND)
                .referenced(PRODUCT_REFERENCE)
                .productionCoded(PRODUCT_PRODUCTION_CODE)
                .mesuring(PRODUCT_MESUREMENTS)
                //   .located(PRODUCT_LOCATION)
                .costing(PRODUCT_PRICE)
                .build();
    }

    @Test(expected = IllegalStateException.class)
    public void ensureCannotBuildWithNullInternalCode2() {
        new ProductBuilder()
                .ofType(DECORACAO_PRODUCT_CATEGORY)
                .shortDesignated(PRODUCT_SHORT_DESCRIPTION)
                .extendedDesignated(PRODUCT_EXTENDED_DESCRIPTION)
                .barcoded(PRODUCT_BARCODE)
                .technicalDesignated(PRODUCT_TEHCNICAL_DESCRIPTION)
                .branded(PRODUCT_BRAND)
                .referenced(PRODUCT_REFERENCE)
                .productionCoded(PRODUCT_PRODUCTION_CODE)
                .mesuring(PRODUCT_MESUREMENTS)
                //  .located(PRODUCT_LOCATION)
                .costing(PRODUCT_PRICE)
                .build();
    }


    //Short Description
    @Test(expected = IllegalStateException.class)
    public void ensureCannotBuildWithNullShortDescription() {
        new ProductBuilder()
                .ofType(DECORACAO_PRODUCT_CATEGORY)
                .internalCoded(PRODUCT_INTENAL_CODE)
                .shortDesignated(null)
                .extendedDesignated(PRODUCT_EXTENDED_DESCRIPTION)
                .barcoded(PRODUCT_BARCODE)
                .technicalDesignated(PRODUCT_TEHCNICAL_DESCRIPTION)
                .branded(PRODUCT_BRAND)
                .referenced(PRODUCT_REFERENCE)
                .productionCoded(PRODUCT_PRODUCTION_CODE)
                .mesuring(PRODUCT_MESUREMENTS)
                //  .located(PRODUCT_LOCATION)
                .costing(PRODUCT_PRICE)
                .build();
    }

    @Test(expected = IllegalStateException.class)
    public void ensureCannotBuildWithNullShortDescription2() {
        new ProductBuilder()
                .ofType(DECORACAO_PRODUCT_CATEGORY)
                .internalCoded(PRODUCT_INTENAL_CODE)
                .extendedDesignated(PRODUCT_EXTENDED_DESCRIPTION)
                .barcoded(PRODUCT_BARCODE)
                .technicalDesignated(PRODUCT_TEHCNICAL_DESCRIPTION)
                .branded(PRODUCT_BRAND)
                .referenced(PRODUCT_REFERENCE)
                .productionCoded(PRODUCT_PRODUCTION_CODE)
                .mesuring(PRODUCT_MESUREMENTS)
                //   .located(PRODUCT_LOCATION)
                .costing(PRODUCT_PRICE)
                .build();
    }


    //Extended Description
    @Test(expected = IllegalStateException.class)
    public void ensureCannotBuildWithNullExtendedDescription() {
        new ProductBuilder()
                .ofType(DECORACAO_PRODUCT_CATEGORY)
                .internalCoded(PRODUCT_INTENAL_CODE)
                .shortDesignated(PRODUCT_SHORT_DESCRIPTION)
                .extendedDesignated(null)
                .barcoded(PRODUCT_BARCODE)
                .technicalDesignated(PRODUCT_TEHCNICAL_DESCRIPTION)
                .branded(PRODUCT_BRAND)
                .referenced(PRODUCT_REFERENCE)
                .productionCoded(PRODUCT_PRODUCTION_CODE)
                .mesuring(PRODUCT_MESUREMENTS)
                //  .located(PRODUCT_LOCATION)
                .costing(PRODUCT_PRICE)
                .build();
    }

    @Test(expected = IllegalStateException.class)
    public void ensureCannotBuildWithNullExtendedDescription2() {
        new ProductBuilder()
                .ofType(DECORACAO_PRODUCT_CATEGORY)
                .internalCoded(PRODUCT_INTENAL_CODE)
                .shortDesignated(PRODUCT_SHORT_DESCRIPTION)
                .barcoded(PRODUCT_BARCODE)
                .technicalDesignated(PRODUCT_TEHCNICAL_DESCRIPTION)
                .branded(PRODUCT_BRAND)
                .referenced(PRODUCT_REFERENCE)
                .productionCoded(PRODUCT_PRODUCTION_CODE)
                .mesuring(PRODUCT_MESUREMENTS)
                // .located(PRODUCT_LOCATION)
                .costing(PRODUCT_PRICE)
                .build();
    }

    //Barcode
    @Test(expected = IllegalStateException.class)
    public void ensureCannotBuildWithNullBarcode() {
        new ProductBuilder()
                .ofType(DECORACAO_PRODUCT_CATEGORY)
                .internalCoded(PRODUCT_INTENAL_CODE)
                .shortDesignated(PRODUCT_SHORT_DESCRIPTION)
                .extendedDesignated(PRODUCT_EXTENDED_DESCRIPTION)
                .barcoded(null)
                .technicalDesignated(PRODUCT_TEHCNICAL_DESCRIPTION)
                .branded(PRODUCT_BRAND)
                .referenced(PRODUCT_REFERENCE)
                .productionCoded(PRODUCT_PRODUCTION_CODE)
                .mesuring(PRODUCT_MESUREMENTS)
                //   .located(PRODUCT_LOCATION)
                .costing(PRODUCT_PRICE)
                .build();
    }

    @Test(expected = IllegalStateException.class)
    public void ensureCannotBuildWithNullBarcode2() {
        new ProductBuilder()
                .ofType(DECORACAO_PRODUCT_CATEGORY)
                .internalCoded(PRODUCT_INTENAL_CODE)
                .shortDesignated(PRODUCT_SHORT_DESCRIPTION)
                .extendedDesignated(PRODUCT_EXTENDED_DESCRIPTION)
                .technicalDesignated(PRODUCT_TEHCNICAL_DESCRIPTION)
                .branded(PRODUCT_BRAND)
                .referenced(PRODUCT_REFERENCE)
                .productionCoded(PRODUCT_PRODUCTION_CODE)
                .mesuring(PRODUCT_MESUREMENTS)
                //  .located(PRODUCT_LOCATION)
                .costing(PRODUCT_PRICE)
                .build();
    }


    //////////////////////////////////////
    @Test
    public void ensureCanBuildWithNullParameters() {
        final Product subject = buildProduct();
        assertNotNull(subject);
    }


    //Technical Description
    @Test(expected = IllegalArgumentException.class)
    public void ensureCannotBuildWithNullTechnicalDescription() {
        new ProductBuilder()
                .ofType(DECORACAO_PRODUCT_CATEGORY)
                .internalCoded(PRODUCT_INTENAL_CODE)
                .shortDesignated(PRODUCT_SHORT_DESCRIPTION)
                .extendedDesignated(PRODUCT_EXTENDED_DESCRIPTION)
                .barcoded(PRODUCT_BARCODE)
                .technicalDesignated(null)
                .branded(PRODUCT_BRAND)
                .referenced(PRODUCT_REFERENCE)
                .productionCoded(PRODUCT_PRODUCTION_CODE)
                .mesuring(PRODUCT_MESUREMENTS)
                //  .located(PRODUCT_LOCATION)
                .costing(PRODUCT_PRICE)
                .build();
    }

    //Brand
    @Test(expected = IllegalArgumentException.class)
    public void ensureCannotBuildWithNullBrand() {
        new ProductBuilder()
                .ofType(DECORACAO_PRODUCT_CATEGORY)
                .internalCoded(PRODUCT_INTENAL_CODE)
                .shortDesignated(PRODUCT_SHORT_DESCRIPTION)
                .extendedDesignated(PRODUCT_EXTENDED_DESCRIPTION)
                .barcoded(PRODUCT_BARCODE)
                .technicalDesignated(PRODUCT_TEHCNICAL_DESCRIPTION)
                .branded(null)
                .referenced(PRODUCT_REFERENCE)
                .productionCoded(PRODUCT_PRODUCTION_CODE)
                .mesuring(PRODUCT_MESUREMENTS)
                //  .located(PRODUCT_LOCATION)
                .costing(PRODUCT_PRICE)
                .build();
    }

    //Reference
    @Test(expected = IllegalArgumentException.class)
    public void ensureCannotBuildWithNullReference() {
        new ProductBuilder()
                .ofType(DECORACAO_PRODUCT_CATEGORY)
                .internalCoded(PRODUCT_INTENAL_CODE)
                .shortDesignated(PRODUCT_SHORT_DESCRIPTION)
                .extendedDesignated(PRODUCT_EXTENDED_DESCRIPTION)
                .barcoded(PRODUCT_BARCODE)
                .technicalDesignated(PRODUCT_TEHCNICAL_DESCRIPTION)
                .branded(PRODUCT_BRAND)
                .referenced(null)
                .productionCoded(PRODUCT_PRODUCTION_CODE)
                .mesuring(PRODUCT_MESUREMENTS)
                // .located(PRODUCT_LOCATION)
                .costing(PRODUCT_PRICE)
                .build();
    }

    //Production Code
    @Test(expected = IllegalArgumentException.class)
    public void ensureCannotBuildWithNullProductionCode() {
        new ProductBuilder()
                .ofType(DECORACAO_PRODUCT_CATEGORY)
                .internalCoded(PRODUCT_INTENAL_CODE)
                .shortDesignated(PRODUCT_SHORT_DESCRIPTION)
                .extendedDesignated(PRODUCT_EXTENDED_DESCRIPTION)
                .barcoded(PRODUCT_BARCODE)
                .technicalDesignated(PRODUCT_TEHCNICAL_DESCRIPTION)
                .branded(PRODUCT_BRAND)
                .referenced(PRODUCT_REFERENCE)
                .productionCoded(null)
                .mesuring(PRODUCT_MESUREMENTS)
                //   .located(PRODUCT_LOCATION)
                .costing(PRODUCT_PRICE)
                .build();
    }

    //PRODUCT_MESUREMENTS
    @Test(expected = IllegalArgumentException.class)
    public void ensureCannotBuildWithNullMesurments() {
        new ProductBuilder()
                .ofType(DECORACAO_PRODUCT_CATEGORY)
                .internalCoded(PRODUCT_INTENAL_CODE)
                .shortDesignated(PRODUCT_SHORT_DESCRIPTION)
                .extendedDesignated(PRODUCT_EXTENDED_DESCRIPTION)
                .barcoded(PRODUCT_BARCODE)
                .technicalDesignated(PRODUCT_TEHCNICAL_DESCRIPTION)
                .branded(PRODUCT_BRAND)
                .referenced(PRODUCT_REFERENCE)
                .productionCoded(PRODUCT_PRODUCTION_CODE)
                .mesuring(null)
                //     .located(PRODUCT_LOCATION)
                .costing(PRODUCT_PRICE)
                .build();
    }


    //PRODUCT_LOCATION
//    @Test(expected = IllegalArgumentException.class)
//    public void ensureCannotBuildWithNullProductLocation() {
//        new ProductBuilder()
//                .ofType(DECORACAO_PRODUCT_CATEGORY)
//                .internalCoded(PRODUCT_INTENAL_CODE)
//                .shortDesignated(PRODUCT_SHORT_DESCRIPTION)
//                .extendedDesignated(PRODUCT_EXTENDED_DESCRIPTION)
//                .barcoded(PRODUCT_BARCODE)
//                .technicalDesignated(PRODUCT_TEHCNICAL_DESCRIPTION)
//                .branded(PRODUCT_BRAND)
//                .referenced(PRODUCT_REFERENCE)
//                .productionCoded(PRODUCT_PRODUCTION_CODE)
//                .mesuring(PRODUCT_MESUREMENTS)
//         //       .located(null)
//                .costing(PRODUCT_PRICE)
//                .build();
//    }

    //Price
    @Test(expected = IllegalStateException.class)
    public void ensureCannotBuildWithNullPrice() {
        new ProductBuilder()
                .ofType(DECORACAO_PRODUCT_CATEGORY)
                .shortDesignated(PRODUCT_SHORT_DESCRIPTION)
                .extendedDesignated(PRODUCT_EXTENDED_DESCRIPTION)
                .barcoded(PRODUCT_BARCODE)
                .technicalDesignated(PRODUCT_TEHCNICAL_DESCRIPTION)
                .branded(PRODUCT_BRAND)
                .referenced(PRODUCT_REFERENCE)
                .productionCoded(PRODUCT_PRODUCTION_CODE)
                .mesuring(PRODUCT_MESUREMENTS)
                //         .located(PRODUCT_LOCATION)
                .costing(null)
                .build();
    }


    //Tem de Ter
    @Test(expected = IllegalArgumentException.class)
    public void ensureMustHaveroductCategory() {
        new Product(null, PRODUCT_INTENAL_CODE, PRODUCT_SHORT_DESCRIPTION, PRODUCT_EXTENDED_DESCRIPTION, PRODUCT_BARCODE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureMustHaveInternalCode() {
        new Product(DECORACAO_PRODUCT_CATEGORY, null, PRODUCT_SHORT_DESCRIPTION, PRODUCT_EXTENDED_DESCRIPTION, PRODUCT_BARCODE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureMustHaveShortDescription() {
        new Product(DECORACAO_PRODUCT_CATEGORY, PRODUCT_INTENAL_CODE, null, PRODUCT_EXTENDED_DESCRIPTION, PRODUCT_BARCODE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureMustHaveExtendedDescription() {
        new Product(DECORACAO_PRODUCT_CATEGORY, PRODUCT_INTENAL_CODE, PRODUCT_SHORT_DESCRIPTION, null, PRODUCT_BARCODE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ensureMustHaveBarcode() {
        new Product(DECORACAO_PRODUCT_CATEGORY, PRODUCT_INTENAL_CODE, PRODUCT_SHORT_DESCRIPTION, PRODUCT_EXTENDED_DESCRIPTION, null);
    }


    private Product buildProduct() {
        return new ProductBuilder()
                .ofType(DECORACAO_PRODUCT_CATEGORY)
                .internalCoded(PRODUCT_INTENAL_CODE)
                .shortDesignated(PRODUCT_SHORT_DESCRIPTION)
                .extendedDesignated(PRODUCT_EXTENDED_DESCRIPTION)
                .barcoded(PRODUCT_BARCODE)
                .technicalDesignated(PRODUCT_TEHCNICAL_DESCRIPTION)
                .branded(PRODUCT_BRAND)
                .referenced(PRODUCT_REFERENCE)
                .productionCoded(PRODUCT_PRODUCTION_CODE)
                .mesuring(PRODUCT_MESUREMENTS)
                //       .located(PRODUCT_LOCATION)
                .costing(PRODUCT_PRICE)
                .build();
    }
*/

    /**
     * Test of changeShortDescriptionTo method, of class Product.
     */

/*    @Test(expected = IllegalArgumentException.class)
    public void ensureCannotChangeShortDescriptionToNull() {
        System.out.println("changeShortDescriptionTo -New Short Description must not be null");
        final Product subject = buildProduct();
        subject.changeShortDescriptionTo(null);
    }

    /**
     * Test of changeExtendedDescriptionTo method, of class Product.
     */

  /*  @Test(expected = IllegalArgumentException.class)
    public void ensureCannotChangeExtendedDescriptionToNull() {
        System.out.println("ChangeExtendedDescriptionTo -New Extended Description must not be null");
        final Product subject = buildProduct();
        subject.changeExtendedDescriptionTo(null);
    }

    /**
     * Test of changeTechnicalDescriptionTo method, of class Product.
     */
  /*  @Test(expected = IllegalArgumentException.class)
    public void ensureCannotChangeTechnicalDescriptionToNull() {
        System.out.println("ChangeTechnicalDescriptionTo -New Technical Description must not be null");
        final Product subject = buildProduct();
        subject.changeTechnicalDescriptionTo(null);
    }

    /**
     * Test of changeBrandTo method, of class Product.
     */
  /*  @Test(expected = IllegalArgumentException.class)
    public void ensureCannotChangeBrandToNull() {
        System.out.println("ChangeBrandTo -New Brand must not be null");
        final Product subject = buildProduct();
        subject.changeShortDescriptionTo(null);
    }

   */
}