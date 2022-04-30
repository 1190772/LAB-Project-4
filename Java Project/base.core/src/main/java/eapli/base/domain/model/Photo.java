package eapli.base.domain.model;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;

import java.util.Arrays;

public class Photo implements ValueObject {
    private byte[] image;

    public Photo(byte[] image) {
        Preconditions.nonNull(image);
        changeImage(image);
    }

    protected Photo() {
    }

    public byte[] photo() {
        // defensive copy
        return Arrays.copyOf(image, image.length);
    }

    public boolean hasImage() {
        return image != null && image.length != 0;
    }

    public void changeImage(final byte[] image) {
        // defensive copy
        this.image = Arrays.copyOf(image, image.length);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Photo photo = (Photo) o;
        return Arrays.equals(image, photo.image);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(image);
    }

    @Override
    public String toString() {
        return "Photo" + Arrays.toString(image);
    }
}
