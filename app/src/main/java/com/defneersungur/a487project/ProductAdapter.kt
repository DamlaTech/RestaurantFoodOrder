package com.defneersungur.a487project


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ProductAdapter(private val context: Context, private val layoutResource: Int) : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(layoutResource, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Ürün bilgilerini bağlama işlemi burada yapılır.
    }

    override fun getItemCount(): Int {
        return 10 // Örnek veri sayısı
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}