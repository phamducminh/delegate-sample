package com.minhpd.example.delegatesample

/**
 * Copyright 2019 Google LLC.
   SPDX-License-Identifier: Apache-2.0
 */

class ListWithTrash <T>(
    private val innerList: MutableList<T> = ArrayList<T>()
) : MutableCollection<T> by innerList {
    var deletedItem : T? = null
    override fun remove(element: T): Boolean {
        deletedItem = element
        return innerList.remove(element)
    }
    fun recover(): T? {
        return deletedItem
    }
}