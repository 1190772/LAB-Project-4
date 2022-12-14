import eapli.base.category.domain.model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CategoryTest {

    private Category category;
    private AlphaNumericCode alphaNumericCode;
    private Description description;

    public void CategoryTest() throws AlphaNumericCodeException, DescriptionException {
        this.alphaNumericCode = new AlphaNumericCode("55AA");
        this.description = new Description("descricao");

        this.category = new Category(alphaNumericCode,description );
    }

    @Test
    void testToString() {
        String s = String.format("AlphaNumeric Code: %s - Description: %s ", this.alphaNumericCode, this.description);
        Assertions.assertEquals(s, this.category.toString());
    }

    @Test
    void alphaNumericCode() {
        Assertions.assertEquals("55AA", this.category.alphaNumericCode().toString());
    }


}
