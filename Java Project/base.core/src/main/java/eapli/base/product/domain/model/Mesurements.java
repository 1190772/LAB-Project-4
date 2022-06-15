package eapli.base.product.domain.model;


import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Mesurements implements ValueObject, Serializable {

        private Double width;
        private Double length;
        private Double height;
        private Double weight;

        public Mesurements(Double width, Double length, Double height, Double weight) {
            Preconditions.noneNull(width,length,height,weight);
            if(!validateIfIsNegative(width))
                throw new IllegalArgumentException("invalid width can't be negtive");
            this.width = width;
            if(!validateIfIsNegative(length))
                throw new IllegalArgumentException("invalid length can't be negtive");
            this.length = length;
            if(!validateIfIsNegative(height))
                throw new IllegalArgumentException("invalid height can't be negtive");
            this.height = height;
            if(!validateIfIsNegative(weight))
                throw new IllegalArgumentException("invalid weight can't be negtive");
            this.weight = weight;
        }

        protected Mesurements() {
        }

        public static boolean validateIfIsNegative(Double mesurment) {
            return mesurment >= 0;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Mesurements that = (Mesurements) o;
            return Double.compare(that.width, width) == 0 && Double.compare(that.length, length) == 0 && Double.compare(that.height, height) == 0 && Double.compare(that.weight, weight) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(width, length, height, weight);
        }

        @Override
        public String toString() {
            return "Mesurements{" +
                    "width=" + width +
                    ", length=" + length +
                    ", height=" + height +
                    ", weight=" + weight +
                    '}';
        }
}
