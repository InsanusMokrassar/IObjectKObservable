package com.github.insanusmokrassar.IObjectKObservable

import com.github.insanusmokrassar.IObjectK.realisations.SimpleIObject

fun main(args: Array<String>) {
    val iobject = SimpleIObject().run {
        observable()
    }
    iobject.observable.subscribe {
        println("$it (${it.second ?.let { "upsert" } ?: "remove" })")
    }

    iobject["example1"] = "one"
    iobject["example2"] = "two"

    iobject.remove("example1")
}