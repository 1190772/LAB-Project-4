package eapli.base.application;

public class SpecifyProductController {
 /*   //    private AuthorizationService authorizationService;
    private StorageAreaRepository productStorageArea =  PersistenceContext.repositories().storageAreas();
    private ProductCategoryRepository productCategoryRepository =  PersistenceContext.repositories().productCategories();
    private final ProductRepository productRepository = PersistenceContext.repositories().products();

    @Transactional
    public Product registerProduct(final Category produtCategory, final String internalCode, final String shortDescription,
                                   final String extendedDescription, final String technicalDeescription, final String brand, final String reference,
                                   final String productionCode, final Long barcode, final Double width, final Double length
            , final Double height, final Double weight, final StorageArea productLocation, final double price) {

        return registerProduct(produtCategory, internalCode,shortDescription,extendedDescription,technicalDeescription,
                brand, reference, productionCode, barcode,width,length,height,weight,productLocation,  price, null);
    }

    /**
     * This method registers a new Product in the database
     *
     * @return the instance saved in the database
     */
 /*   @Transactional
    public Product registerProduct(final Category produtCategory, final String internalCode,final String shortDescription,
                                   final String extendedDescription,final String technicalDeescription,final String brand,final String reference,
                                   final String productionCode, final Long barcode,final Double width,final Double length
            ,final Double height,final Double weight,final StorageArea productLocation, final double price, final Set<byte[]> photos) {

//        authorizationService.ensureAuthenticatedUserHasAnyOf(CafeteriaRoles.POWER_USER,
//                CafeteriaRoles.MENU_MANAGER);
        final Product newProduct = new ProductBuilder()
                .ofType(produtCategory)
                .internalCoded(InternalCode.valueOf(internalCode))
                .shortDesignated(ShortDescription.shortDescriptedAs(shortDescription))
                .extendedDesignated(ExtendedDescription.extendedDescriptedAs(extendedDescription))
                .technicalDesignated(TechnicalDescription.tehcnincalDescriptedAs(technicalDeescription))
                .branded(Brand.fromBrand(brand))
                .referenced(Reference.withReference(reference))
                .productionCoded(ProductionCode.productedCodedAs(productionCode))
                .barcoded(Barcode.withBarcode(barcode))
                .mesuring(new Mesurements(width,length,height,weight))
                .located(productLocation)
                .costing(Price.pricedAs(price))
                .withPhotos(photos)
                .build();
        return productRepository.save(newProduct);
    }

    public Iterable<Category> getCategories() {
        return this.productCategoryRepository.findAll();
    }

/*    public Iterable<StorageArea> getAvailableStorageAreas() {
        return this.productStorageArea.availableStorageAreas() ;
    }
 */
}
