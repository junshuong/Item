package org.wit.item.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.wit.item.R
import org.wit.item.main.MainApp

class ItemListActivity : AppCompatActivity() {

    lateinit var app: MainApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_list)
        app = application as MainApp
    }
}

