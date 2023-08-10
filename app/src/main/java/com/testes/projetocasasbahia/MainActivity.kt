package com.testes.projetocasasbahia

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.bottomsheet.BottomSheetDialog


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val searchEditText = findViewById<EditText>(R.id.searchEditText)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        // Configurar um ouvinte para tratar as seleções de item
        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.navigation_inicio -> {
                    // Lógica para a tela Home
                    true
                }

                R.id.navigation_departamento -> {
                    // Lógica para a tela de busca
                    true
                }

                R.id.navigation_favorito -> {
                    // Lógica para a tela do carrinho
                    true
                }

                R.id.navigation_carrinho -> {
                    // Lógica para a tela de perfil
                    true
                }

                R.id.navigation_conta -> {
                    // Lógica para a tela de perfil
                    true
                }

                else -> false
            }
        }
    }

    // Configurar ações para a barra de pesquisa, como ouvintes de clique e pesquisa
    // ...

    fun showCepBottomSheet(view: View) {
        val bottomSheetDialog = BottomSheetDialog(this)
        val bottomSheetView = layoutInflater.inflate(R.layout.bottom_sheet_cep, null)

        bottomSheetDialog.setContentView(bottomSheetView)
        bottomSheetDialog.show()
    }

    fun showBanner(view: View) {
        val bannerCardView = layoutInflater.inflate(R.layout.layout_banner, null)
        val bottomSheetDialog = BottomSheetDialog(this)
        bottomSheetDialog.setContentView(bannerCardView)
        bottomSheetDialog.show()
    }

    fun onNavegarCadastroButtonClick(view: View?) {
        val intent = Intent(this, MainActivityCadastro::class.java)
        startActivity(intent)
    }



}

