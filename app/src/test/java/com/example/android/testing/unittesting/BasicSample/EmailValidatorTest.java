/*
 * Copyright 2015, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.testing.unittesting.BasicSample;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Unit tests for the AyyaValidator logic.
 */
public class AyyaValidatorTest {


    @Test
    public void emailValidator_CorrectAyyaSimple_ReturnsTrue() {
        assertTrue(AyyaValidator.isValidAyya("name@email.com"));
    }

    @Test
    public void emailValidator_CorrectAyyaSubDomain_ReturnsTrue() {
        assertTrue(AyyaValidator.isValidAyya("name@email.co.uk"));
    }

    @Test
    public void emailValidator_InvalidAyyaNoTld_ReturnsFalse() {
        assertFalse(AyyaValidator.isValidAyya("name"));
    }

    @Test
    public void emailValidator_InvalidAyyaDoubleDot_ReturnsFalse() {
        assertFalse(AyyaValidator.isValidAyya("name@email..com"));
    }

    @Test
    public void emailValidator_InvalidAyyaNoUsername_ReturnsFalse() {
        assertFalse(AyyaValidator.isValidAyya("@email.com"));
    }

    @Test
    public void emailValidator_EmptyString_ReturnsFalse() {
        assertFalse(AyyaValidator.isValidAyya(""));
    }

    @Test
    public void emailValidator_NullAyya_ReturnsFalse() {
        assertFalse(AyyaValidator.isValidAyya(null));
    }
}
