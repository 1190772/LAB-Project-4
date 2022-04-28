/*
 * Copyright (c) 2013-2022 the original author or authors.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package eapli.framework.general.domain.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Paulo Gandra de Sousa
 *
 */
class MoneyAddTest {

    @Test
    void ensureAdd0() {
        final Money subject = Money.euros(1);
        final Money other = Money.euros(0);
        final Money expected = Money.euros(1);
        assertEquals(expected, subject.add(other));
    }

    @Test
    void ensureAdd1() {
        final Money subject = Money.euros(1);
        final Money other = Money.euros(1);
        final Money expected = Money.euros(2);
        assertEquals(expected, subject.add(other));
    }

    @Test
    void ensureAddCents() {
        final Money subject = Money.euros(0.99);
        final Money other = Money.euros(0.01);
        final Money expected = Money.euros(1);
        assertEquals(expected, subject.add(other));
    }

    @Test
    void ensureAddCents2() {
        final Money subject = Money.euros(1.65);
        final Money other = Money.euros(0.40);
        final Money expected = Money.euros(2.05);
        assertEquals(expected, subject.add(other));
    }

    @Test
    void ensureAdd50Cents() {
        final Money subject = Money.euros(1);
        final Money other = Money.euros(0.5);
        final Money expected = Money.euros(1.5);
        assertEquals(expected, subject.add(other));
    }

    @Test
    void ensureAddMinus1() {
        final Money subject = Money.euros(1);
        final Money other = Money.euros(-1);
        final Money expected = Money.euros(0);
        assertEquals(expected, subject.add(other));
    }

    @Test
    void ensureAddMinus50Cents() {
        final Money subject = Money.euros(1);
        final Money other = Money.euros(-0.5);
        final Money expected = Money.euros(0.5);
        assertEquals(expected, subject.add(other));
    }

    @Test
    void ensureCannotAddDifferentCurrencies() {
        final Money subject = Money.euros(1);
        final Money other = Money.dollars(0.5);
        Assertions.assertThrows(IllegalArgumentException.class, () -> subject.add(other));
    }
}
