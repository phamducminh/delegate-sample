package com.minhpd.example.delegatesample

/**
 * Copyright 2019 Google LLC.
SPDX-License-Identifier: Apache-2.0
  */

class Person(name: String, lastName: String) {
    var name: String by FormatDelegate()
    var lastName: String by FormatDelegate()
    var updateCount = 0
}