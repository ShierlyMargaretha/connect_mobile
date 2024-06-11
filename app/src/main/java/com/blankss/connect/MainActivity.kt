package com.blankss.connect

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.blankss.connect.databinding.ActivityMainBinding
import com.blankss.connect.pkg.ApiClientBuilder
import java.util.concurrent.Executors

class MainActivity : AppCompatActivity() {
    //deklarasikan variabel ubtuk RC
    private var recyclerView : RecyclerView? = null
    private var adapter: RecyclerView.Adapter<*>? = null
    private var layoutManager: RecyclerView.LayoutManager? = null

    private lateinit var binding: ActivityMainBinding

    private val clientBuilder = ApiClientBuilder()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        recyclerView = findViewById(R.id.datalist)


        }
    }