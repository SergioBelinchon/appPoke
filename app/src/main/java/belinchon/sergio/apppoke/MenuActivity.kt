package belinchon.sergio.apppoke

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import belinchon.sergio.apppoke.pokedex.PokedexActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        title = "AppPoke";

        val btnPokedexApp = findViewById<Button>(R.id.btnPokedexApp)
        val btnRegionesApp = findViewById<Button>(R.id.btnRegionesApp)
        val btnJuegosApp = findViewById<Button>(R.id.btnJuegosApp)
        val btnTiposApp = findViewById<Button>(R.id.btnTiposApp)

        btnPokedexApp.setOnClickListener { navigateToPokedexActivity() }
        btnRegionesApp.setOnClickListener { navigateToRegionesActivity() }
        btnJuegosApp.setOnClickListener { navigateToJuegosActivity() }
        btnTiposApp.setOnClickListener { navigateToTiposActivity() }
   }

    private fun navigateToTiposActivity()
    {
        val intent = Intent(this, belinchon.sergio.apppoke.tipos.TiposActivity::class.java)
        startActivity(intent)

    }

    private fun navigateToJuegosActivity()
    {
        val intent = Intent(this, belinchon.sergio.apppoke.juegos.JuegosActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToPokedexActivity() {
            val intent = Intent(this, PokedexActivity::class.java)
            startActivity(intent)
        }


        private fun navigateToRegionesActivity() {
            val intent = Intent(this, belinchon.sergio.apppoke.regiones.RegionesActivity::class.java)
            startActivity(intent)
        }
    }



