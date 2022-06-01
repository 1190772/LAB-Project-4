package eapli.base.product.domain.model;

import eapli.base.category.domain.model.AlphaNumericCode;
import eapli.base.category.domain.model.Category;
import eapli.framework.domain.model.DomainFactory;
import org.hibernate.loader.collection.plan.AbstractLoadPlanBasedCollectionInitializer;

import java.util.Set;

public class ProductBuilder implements DomainFactory<Product> {

    private Product product;

    private Category category;

    private AlphaNumericCode alphaNumericCode;

    private InternalCode internalCode;

    private ShortDescription shortDescription;

    private ExtendedDescription extendedDescription;

    private TechnicalDescription technicalDeescription;

    private Price priceWithTaxes;

    private Price priceWithoutTaxes;

    private Reference reference;

    private Brand brand;

    private ProductionCode productionCode;

    private Barcode barcode;

    public ProductBuilder ofType(final Category categoriaProduto) {
        category = categoriaProduto;
        return this;
    }

    public ProductBuilder ofType(final AlphaNumericCode alphaNumericCodeProduto) {
        alphaNumericCode = alphaNumericCodeProduto;
        return this;
    }


    public ProductBuilder internalCoded(final InternalCode code) {
        this.internalCode = code;
        return this;
    }

    public ProductBuilder shortDesignated(final ShortDescription shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }


    public ProductBuilder extendedDesignated(final ExtendedDescription extendedDescription) {
        this.extendedDescription = extendedDescription;
        return this;
    }


    public ProductBuilder barcoded(final Barcode barcode) {
        this.barcode = barcode;
        return this;
    }


    public ProductBuilder branded(final Brand brand) {
        buildOrThrow();
        product.changeBrandTo(brand);
        return this;
    }

    public ProductBuilder technicalDesignated(final TechnicalDescription technicalDescription) {
        buildOrThrow();
        product.changeTechnicalDescriptionTo(technicalDescription);
        return this;
    }

    public ProductBuilder referenced(final Reference reference) {
        buildOrThrow();
        product.changeReferenceTo(reference);
        return this;
    }

    public ProductBuilder productionCoded(final ProductionCode productionCode) {
        buildOrThrow();
        product.changeProductionCodeTo(productionCode);
        return this;
    }

    public ProductBuilder costing(final Price pricewithoutTax) {
        buildOrThrow();
        product.changePriceTo(priceWithoutTaxes);
        return this;
    }

    public ProductBuilder mesuring(final Mesurements mesurements) {
        buildOrThrow();
        product.changeMesurementsTo(mesurements);
        return this;
    }



    private Product buildOrThrow() {
        if (product != null) {
            return product;
        } else if (category != null && internalCode != null && shortDescription != null && extendedDescription != null && barcode != null) {
            product = new Product(category ,  internalCode,  shortDescription,
                     extendedDescription,  technicalDeescription,
                     brand,  reference,  productionCode,  barcode, priceWithTaxes,priceWithoutTaxes);
            return product;
        } else {
            throw new IllegalStateException();
        }
    }


    public ProductBuilder withPhotos(final Set<byte[]> photos) {
        // we will simply ignore if we receive a null set
        if (photos != null) {
            photos.forEach(this::withPhoto);
        }
        return this;
    }


    public ProductBuilder withPhoto(final byte[] photo) {
        buildOrThrow();
        product.addPhoto(photo);
        return this;
    }


    @Override
    public Product build() {
        final Product ret = buildOrThrow();
        // make sure we will create a new instance if someone reuses this builder and do not change
        // the previously built dish.
        product = null;
        return ret;
    }

}