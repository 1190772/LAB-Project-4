/*
 * Copyright (c) 2013-2022 the original author or authors.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package eapli.framework.domains.domain.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 *
 * @author Paulo Gandra de Sousa
 *
 */
class C5_I_IntervalCompareTest extends IntervalCompareTestBase {

    //
    // [x, +I[
    //
    private final Interval<Integer> subject = C5_I;

    @Test
    void ensureIsAfterEmpty() {
        assertEquals(1, subject.compareTo(E));
    }

    @Test
    void ensureIsAfterUniversal() {
        assertEquals(1, subject.compareTo(U));
    }

    @Test
    void ensureIsSame() {
        assertEquals(0, subject.compareTo(subject));
    }

    // TODO other comparison scenarios
    // IOX;
    // ICX;
    // CXCY;
    // CXOY;
    // OXCY;
    // OXOY;
    // CXI;
    // OXI;
}
