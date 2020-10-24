package com.minhpd.example.delegatesample

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * Copyright 2019 Google LLC.
SPDX-License-Identifier: Apache-2.0
  */

class FormatDelegate : ReadWriteProperty<Any?, String> {
    private var formattedString: String = ""

    override fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return formattedString
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        if (thisRef is Person) {
            thisRef.updateCount++
        }
        formattedString = value.toLowerCase().capitalize()
    }
}