package eapli.base.product.application;

import eapli.base.category.domain.model.Category;
import eapli.base.category.domain.persistence.CategoryRepository;
import eapli.base.product.domain.persistence.ProductRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.product.domain.model.*;
import eapli.framework.infrastructure.authz.application.AuthorizationService;

import javax.transaction.Transactional;
import java.util.Set;

public class SpecifyProductController {
    private AuthorizationService authorizationService;
    private CategoryRepository categoryRepository =  PersistenceContext.repositories().category();
    private final ProductRepository productRepository = PersistenceContext.repositories().products();

    @Transactional
    public Product registerProduct(final Category productCategory, final String internalCode, final String shortDescription,
                                   final String extendedDescription, final String technicalDescription, final String brand, final String reference,
                                   final String productionCode, final Long barcode, final Double width, final Double length
            , final Double height, final Double weight, final double price) {

        return registerProduct(productCategory, internalCode,shortDescription,extendedDescription,technicalDescription,
                brand, reference, productionCode, barcode,width,length,height,weight, price, null);
    }

    /**
     * This method registers a new Product in the database
     *
     * @return the instance saved in the database
     */
  @Transactional
    public Product registerProduct(final Category productCategory, final String internalCode, final String shortDescription,
                                   final String extendedDescription, final String technicalDescription, final String brand, final String reference,
                                   final String productionCode, final Long barcode, final Double width, final Double length
          , final Double height, final Double weight, final double price, final Set<byte[]> photos) {


      final Product newProduct = new ProductBuilder()
              .ofType(productCategory)
              .internalCoded(InternalCode.valueOf(internalCode))
              .shortDesignated(ShortDescription.shortDescriptedAs(shortDescription))
              .extendedDesignated(ExtendedDescription.extendedDescriptedAs(extendedDescription))
              .technicalDesignated(TechnicalDescription.tehcnincalDescriptedAs(technicalDescription))
              .branded(Brand.fromBrand(brand))
              .referenced(Reference.withReference(reference))
              .productionCoded(ProductionCode.productedCodedAs(productionCode))
              .barcoded(Barcode.withBarcode(barcode))
              .mesuring(new Mesurements(width,length,height,weight))
              .costing(PriceWithoutTaxes.pricedAs(price))
              .withPhotos(photos)
              .build();
      return (Product) productRepository.save(newProduct);
  }


    public Iterable<Category> getCategories() {
        return this.categoryRepository.findAll();
    }


}
