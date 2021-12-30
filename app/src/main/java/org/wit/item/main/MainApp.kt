package org.wit.item.main

import android.app.Application
import org.wit.item.models.ItemModel
import timber.log.Timber
import timber.log.Timber.i

class MainApp: Application(){

    val items = ArrayList<ItemModel>()

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        i("Item App started")
        items.add(ItemModel("One", "About one..."))
        items.add(ItemModel("Two", "About two..."))
        items.add(ItemModel("Three", "About three..."))
    }
}