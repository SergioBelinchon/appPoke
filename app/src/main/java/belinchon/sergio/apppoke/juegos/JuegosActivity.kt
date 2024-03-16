package belinchon.sergio.apppoke.juegos

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import belinchon.sergio.apppoke.R
import belinchon.sergio.apppoke.regiones.PaldeaActivity

class JuegosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_juegos)

        val btnPrimeraGeneracion = findViewById<Button>(R.id.btnPrimeraGeneracion)
        val btnSegundaGeneracion = findViewById<Button>(R.id.btnSegundaGeneracion)
        val btnTerceraGeneracion = findViewById<Button>(R.id.btnTerceraGeneracion)
        val btnCuartaGeneracion = findViewById<Button>(R.id.btnCuartaGeneracion)
        val btnQuintaGeneracion = findViewById<Button>(R.id.btnQuintaGeneracion)



        val btnVolver = findViewById<Button>(R.id.btnVolver)

        btnPrimeraGeneracion.setOnClickListener { navigateToPrimeraGen() }
        btnSegundaGeneracion.setOnClickListener { navigateToSegundaGen() }
        btnTerceraGeneracion.setOnClickListener { navigateToTerceraGen() }
        btnCuartaGeneracion.setOnClickListener { navigateToCuartaGen() }
        btnQuintaGeneracion.setOnClickListener { navigateToQuintaaGen() }




        btnVolver.setOnClickListener {
            onBackPressed()
        }
    }

    private fun navigateToQuintaaGen() {
        val intent = Intent(this, JuegosQuintaGenActivity::class.java)
        startActivity(intent)      }

    private fun navigateToCuartaGen() {
        val intent = Intent(this, JuegosCuartaGenActivity::class.java)
        startActivity(intent)      }

    private fun navigateToTerceraGen() {
        val intent = Intent(this, JuegosTerceraGenActivity::class.java)
        startActivity(intent)    }

    private fun navigateToSegundaGen()
    {
        val intent = Intent(this, JuegosSegundaGenActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToPrimeraGen()
    {
        val intent = Intent(this, JuegosPrimeraGenActivity::class.java)
        startActivity(intent)
    }

    @Deprecated(message = "Use OnBackPressedDispatcher instead",
        level = DeprecationLevel.WARNING,
        replaceWith = ReplaceWith("super.onBackPressed()", "androidx.appcompat.app.AppCompatActivity")
    )
    override fun onBackPressed() {
        super.onBackPressed()
    }

    fun onBackPressed(view: View) {}
}