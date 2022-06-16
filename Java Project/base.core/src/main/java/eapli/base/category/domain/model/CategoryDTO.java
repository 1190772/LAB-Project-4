package eapli.base.category.domain.model;

public class CategoryDTO {

    public String alphaNumericCode;
    public String description;

    public CategoryDTO(String alphaNumericCode, String description) {
        this.alphaNumericCode = alphaNumericCode;
        this.description = description;
    }
}
