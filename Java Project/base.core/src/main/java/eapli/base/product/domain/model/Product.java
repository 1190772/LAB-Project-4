package eapli.base.product.domain.model;

import eapli.base.category.domain.model.Category;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.validations.Preconditions;

import javax.persistence.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Entity
public class Product implements AggregateRoot<InternalCode>, Comparable<InternalCode> {

    public Product() {
    }

    /**
     * Immutable empty set of photos for the situations where a product does not
     * contain any photo.
     */
    @SuppressWarnings("squid:S2386")
    public static final Set<Photo> NO_PHOTOS = Collections.emptySet();

    @Version
    private Long version;


    @OneToOne
    private Category productCategory;

  /*  @OneToOne
    private StorageArea storageArea;
*/
    @EmbeddedId
    private InternalCode internalCode;

    @Embedded
    private ShortDescription shortDescription;

    @Embedded
    private ExtendedDescription extendedDescription;

    @Embedded
    private TechnicalDescription technicalDescription;

    @Embedded
    private Brand brand;

    @Embedded
    private Reference reference;

    @Embedded
    private ProductionCode productionCode;

    @Embedded
    private Barcode barcode;

    @Embedded
    @JoinColumn(name = "PriceWithTaxes")
    private Price priceWithTaxes;

    @Embedded
    @Transient
    private Price priceWithoutTaxes;

    @Embedded
    private Mesurements mesurements;

    private boolean productStatus;


    @ElementCollection
    private final Set<Photo> photos = new HashSet<>();


   public Product(Category productCategory, InternalCode internalCode, ShortDescription shortDescription,
                  ExtendedDescription extendedDescription, TechnicalDescription technicalDeescription,
                  Brand brand, Reference reference, ProductionCode productionCode, Barcode barcode, Price priceWithTaxes, Price priceWithoutTaxes
    ) {
        Preconditions.noneNull(productCategory, internalCode, shortDescription, extendedDescription, barcode);
        this.productCategory = productCategory;
        this.internalCode = internalCode;
        this.shortDescription = shortDescription;
        this.extendedDescription = extendedDescription;
        this.technicalDescription = technicalDeescription;
        this.brand = brand;
        this.reference = reference;
        this.productionCode = productionCode;
        this.barcode = barcode;
        this.priceWithTaxes = priceWithTaxes;
        this.priceWithoutTaxes = priceWithoutTaxes;
        this.productStatus = true;
   }

    @Override
    public InternalCode identity() {
        return internalCode;
    }

    public Category getProductCategory() {
        return productCategory;
    }

    public InternalCode getInternalCode() { return internalCode; }

    public ShortDescription getShortDescription() {
        return shortDescription;
    }

    public ExtendedDescription getExtendedDescription() {
        return extendedDescription;
    }

    public Barcode getBarcode() { return barcode; }

    public Boolean productStatus() { return productStatus; }

    /**
     * @return the TechnicalDescription of this Product
     */
    public Optional<TechnicalDescription> technicalDescription() {
        return Optional.ofNullable(technicalDescription);
    }

    /**
     * @return the Brand of this Product
     */
    public Brand brand() { return brand;
    }

    /**
     * @return the Reference of this Product
     */
    public Optional<Reference> reference() {
        return Optional.ofNullable(reference);
    }

    /**
     * @return the ProductionCode of this Product
     */
    public Optional<ProductionCode> productionCode() {
        return Optional.ofNullable(productionCode);
    }

    /**
     * @return the Price with taxes of this Product
     */
    public Optional<Price> priceWithTaxes() {
        return Optional.ofNullable(priceWithTaxes);
    }

    public Price priceWithTaxesCatalog() {
        return priceWithTaxes;
    }

    /**
     * @return the Price with taxes of this Product
     */
    public Optional<Price> priceWithoutTaxes() {
        return Optional.ofNullable(priceWithoutTaxes);
    }

    /**
     * @return the Mesurements of this Product
     */
    public Optional<Mesurements> mesurements() {
        return Optional.ofNullable(mesurements);
    }


    /**
     * @param photo
     * @return
     */
    public boolean addPhoto(final byte photo[]) {
        return photos.add(new Photo(photo));
    }

    /**
     * @return a read-only set of Allergens in Dish
     */
    public Set<Photo> photos() {
        // notice the unmodifiable "copy" we are returning to keep with the Information
        // Expert
        // principle and disallow callers to change "our" attributes
        return Collections.unmodifiableSet(photos);
    }

    @Override
    public boolean equals(final Object o) {
        return DomainEntities.areEqual(this, o);
    }

    @Override
    public int hashCode() {
        return DomainEntities.hashCode(this);
    }

    @Override
    public boolean sameAs(final Object other) {
        if (!(other instanceof Product)) {
            return false;
        }

        final Product that = (Product) other;
        if (this == that) {
            return true;
        }

        return identity().equals(that.identity());
    }


    /**
     * Toggles the state of the dish, activating it or deactivating it accordingly.
     *
     * @return whether the product is active or not
     */
    public boolean toogleState() {
        this.productStatus = !this.productStatus;
        return productStatus();
    }


    /**
     * Changes the shortDescription info of the product.
     *
     * @param shortDescription The new ShortDescription.
     */
    public void changeShortDescriptionTo(final ShortDescription shortDescription) {
        if (shortDescription == null) {
            throw new IllegalArgumentException();
        }
        this.shortDescription = shortDescription;
    }

    /**
     * Changes the extendedDescription info of the product.
     *
     * @param extendedDescription The new ExtendedDescription.
     */
    public void changeExtendedDescriptionTo(final ExtendedDescription extendedDescription) {
        if (extendedDescription == null) {
            throw new IllegalArgumentException();
        }
        this.extendedDescription = extendedDescription;
    }

    /**
     * Changes the technicalDescription info of the product.
     *
     * @param technicalDescription The new TechnicalDescription.
     */
    public void changeTechnicalDescriptionTo(final TechnicalDescription technicalDescription) {
        if (technicalDescription == null) {
            throw new IllegalArgumentException();
        }
        this.technicalDescription = technicalDescription;
    }

    /**
     * Changes the brand info of the product.
     *
     * @param brand The new Brand.
     */
    public void changeBrandTo(final Brand brand) {
        if (brand == null) {
            throw new IllegalArgumentException();
        }
        this.brand = brand;
    }

    /**
     * Changes the reference info of the product.
     *
     * @param reference The new Reference.
     */
    public void changeReferenceTo(final Reference reference) {
        if (reference == null) {
            throw new IllegalArgumentException();
        }
        this.reference = reference;
    }

    /**
     * Changes the productionCode info of the product.
     *
     * @param productionCode The new Production Code.
     */
    public void changeProductionCodeTo(final ProductionCode productionCode) {
        if (productionCode == null) {
            throw new IllegalArgumentException();
        }
        this.productionCode = productionCode;
    }

    /**
     * Changes the barcode info of the product.
     *
     * @param barcode The new Barcode.
     */
    public void changeBarcodeTo(final Barcode barcode) {
        if (barcode == null) {
            throw new IllegalArgumentException();
        }
        this.barcode = barcode;
    }


    /**
     * Changes the Product price to a new price.
     *
     * @param newPriceWithoutTaxes the new price of this dish
     */
    public void changePriceTo(final Price newPriceWithoutTaxes) {
        if (newPriceWithoutTaxes == null) {
            throw new IllegalArgumentException();
        }
        this.priceWithoutTaxes = newPriceWithoutTaxes;
    }

    /**
     * Changes the mesurements info of the product.
     *
     * @param mesurements The new mesurements.
     */
    public void changeMesurementsTo(final Mesurements mesurements) {
        if (mesurements == null) {
            throw new IllegalArgumentException();
        }
        this.mesurements = mesurements;
    }

    /**
     * Changes the mesurements info of the product.
     *
     * @param storageArea The new mesurements.
     */

}
