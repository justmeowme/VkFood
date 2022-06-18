package com.meowme.vkfood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast

class MenuActivity : AppCompatActivity() {

    lateinit var gridView: GridView
    private var mNames = arrayOf("Название блюда", "Название блюда", "Название блюда", "Название блюда", "Название блюда", "Название блюда")
    private var mDescription = arrayOf("500 г", "500 г", "500 г", "500 г", "500 г", "500 г")
    private var mPrices = arrayOf("500 ₽", "600 ₽", "400 ₽", "600 ₽", "500 ₽", "600 ₽");
    private var playerImages = intArrayOf(R.drawable.photo, R.drawable.photo, R.drawable.photo, R.drawable.photo, R.drawable.photo, R.drawable.photo)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)




        gridView = findViewById(R.id.gridView)
        val mainAdapter = ItemAdapter(this@MenuActivity, mNames, mDescription, mPrices, playerImages)
        gridView.adapter = mainAdapter
        gridView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            Toast.makeText(
                applicationContext,
                "You CLicked " + mNames[+position],
                Toast.LENGTH_SHORT
            ).show()


        }

    }
}