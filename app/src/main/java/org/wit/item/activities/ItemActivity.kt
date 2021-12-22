package org.wit.item.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import org.wit.item.databinding.ActivityItemBinding
import org.wit.item.models.ItemModel
import timber.log.Timber
import timber.log.Timber.i

class ItemActivity : AppCompatActivity() {

    private lateinit var binding: ActivityItemBinding
    var item = ItemModel()
    val items = ArrayList<ItemModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityItemBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Timber.plant(Timber.DebugTree())
        i("Item Activity started..")

        binding.btnAdd.setOnClickListener() {
            item.name = binding.itemName.text.toString()
            item.description = binding.description.text.toString()
            if (item.name.isNotEmpty()) {
                items.add(item.copy())
                i("add Button Pressed: $item")
                for (i in items.indices)
                { i("Item[$i]:${this.items[i]}") }
            }
            else {
                Snackbar
                    .make(it,"Please Enter an Item", Snackbar.LENGTH_LONG)
                    .show()
            }
        }
    }
}