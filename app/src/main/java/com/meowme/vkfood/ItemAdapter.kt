package com.meowme.vkfood

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.isVisible
import androidx.databinding.ObservableField
import org.w3c.dom.Text

internal class ItemAdapter(
    private val context: Context,
    private val mNames: Array<String>,
    private val mDescription: Array<String>,
    private val mPrices: Array<String>,
    private val playerImages: IntArray):BaseAdapter(){

    private var layoutInflater: LayoutInflater? = null
    private lateinit var imageView: ImageView
    private lateinit var name: TextView
    private lateinit var description: TextView
    private lateinit var price: TextView
    private lateinit var button: ImageView
    private lateinit var layout: ConstraintLayout

    override fun getCount(): Int {
        return mNames.size
    }
    override fun getItem(position: Int): Any? {
        return null
    }
    override fun getItemId(position: Int): Long {
        return 0
    }


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var convertView = convertView
        if (layoutInflater == null) {
            layoutInflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        }
        if (convertView == null) {
                convertView = layoutInflater!!.inflate(R.layout.menu_item, null)
        }

        layout = convertView!!.findViewById(R.id.main)
        imageView = convertView!!.findViewById(R.id.photo)
        name = convertView.findViewById(R.id.name)
        description = convertView.findViewById(R.id.description)
        price = convertView.findViewById(R.id.price)
        button = convertView.findViewById(R.id.button)

        imageView.setImageResource(playerImages[position])
        name.setText(mNames[position])
        description.setText(mDescription[position])
        price.setText(mPrices[position])


        return convertView
    }




}