package com.defneersungur.a487project



import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var productList: RecyclerView
    private lateinit var menuLayoutIcon: ImageView
    private lateinit var gridLayoutIcon: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        productList = findViewById(R.id.productList)
        menuLayoutIcon = findViewById(R.id.menuLayoutIcon)
        gridLayoutIcon = findViewById(R.id.gridLayoutIcon)

        // Başlangıçta list layout'u göster
        setRecyclerViewLayout(false)

        menuLayoutIcon.setOnClickListener {
            setRecyclerViewLayout(false)
        }

        gridLayoutIcon.setOnClickListener {
            setRecyclerViewLayout(true)
        }



    }

    private fun setRecyclerViewLayout(useGridLayout: Boolean) {
        if (useGridLayout) {
            productList.layoutManager = GridLayoutManager(this, 2)
            productList.adapter = ProductAdapter(this, R.layout.item_grid_product)
        } else {
            productList.layoutManager = LinearLayoutManager(this)
            productList.adapter = ProductAdapter(this, R.layout.item_product)
        }
    }
}