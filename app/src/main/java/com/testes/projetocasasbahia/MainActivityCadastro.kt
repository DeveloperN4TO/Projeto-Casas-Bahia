package com.testes.projetocasasbahia

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.utils.widget.ImageFilterButton


class MainActivityCadastro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_cadastro)

        val closeButton: ImageFilterButton = findViewById(R.id.bt_closed)

        closeButton.setOnClickListener {
            finish()
        }


    }
}