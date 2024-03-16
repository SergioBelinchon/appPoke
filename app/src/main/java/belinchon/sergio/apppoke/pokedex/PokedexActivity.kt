package belinchon.sergio.apppoke.pokedex

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import belinchon.sergio.apppoke.R
import belinchon.sergio.apppoke.repositorio.PokemonRepositorio
import java.io.Serializable

class PokedexActivity : AppCompatActivity()
{


    private val pokemonRepositorio = PokemonRepositorio()
    private val pokedex = pokemonRepositorio.pokedex


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_pokedex)

        val btnPrimeraGeneracion = findViewById<Button>(R.id.btnPrimeraGeneracion)
        val btnSegundaGeneracion = findViewById<Button>(R.id.btnSegundaGeneracion)
        val btnTerceraGeneracion = findViewById<Button>(R.id.btnTerceraGeneracion)
        val btnCuartaGeneracion = findViewById<Button>(R.id.btnCuartaGeneracion)
        val btnQuintaGeneracion = findViewById<Button>(R.id.btnQuintaGeneracion)
        val btnSextaGeneracion = findViewById<Button>(R.id.btnSextaGeneracion)
        val btnSeptimaGeneracion = findViewById<Button>(R.id.btnSeptimaGeneracion)
        val btnOctavaGeneracion = findViewById<Button>(R.id.btnOctavaGeneracion)
        val btnNovenaGeneracion = findViewById<Button>(R.id.btnNovenaGeneracion)


        val btnVolver = findViewById<Button>(R.id.btnVolver)

        btnPrimeraGeneracion.setOnClickListener { navigateToPrimeraGen() }
        btnSegundaGeneracion.setOnClickListener { navigateToSegundaGen() }
        btnTerceraGeneracion.setOnClickListener { navigateToTerceraGen() }
        btnCuartaGeneracion.setOnClickListener { navigateToCuartaGen() }
        btnQuintaGeneracion.setOnClickListener { navigateToQuintaGen() }
        btnSextaGeneracion.setOnClickListener { navigateToSextaGen() }
        btnSeptimaGeneracion.setOnClickListener { navigateToSeptimaGen() }
        btnOctavaGeneracion.setOnClickListener { navigateToOctavaGen() }
        btnNovenaGeneracion.setOnClickListener { navigateToNovenaGen() }

        btnVolver.setOnClickListener {
            onBackPressed()
        }
    }

    private fun navigateToNovenaGen() {

        val novenaGenPokedex = pokedex.filter { it.numero in 906..1025 }


        val intent = Intent(this, NovenaGenActivity::class.java)
        intent.putExtra("novenaGenPokedex", novenaGenPokedex as Serializable)
        startActivity(intent)
    }

    private fun navigateToOctavaGen() {

        val octavaGenPokedex = pokedex.filter { it.numero in 810..905 }


        val intent = Intent(this, OctavaGenActivity::class.java)
        intent.putExtra("octavaGenPokedex", octavaGenPokedex as Serializable)
        startActivity(intent)
    }

    private fun navigateToSeptimaGen() {

        val septimaGenPokedex = pokedex.filter { it.numero in 722..809 }


        val intent = Intent(this, SeptimaGenActivity::class.java)
        intent.putExtra("septimaGenPokedex", septimaGenPokedex as Serializable)
        startActivity(intent)
    }

    private fun navigateToSextaGen() {

        val sextaGenPokedex = pokedex.filter { it.numero in 650..721 }


        val intent = Intent(this, SextaGenActivity::class.java)
        intent.putExtra("sextaGenPokedex", sextaGenPokedex as Serializable)
        startActivity(intent)
    }

    private fun navigateToQuintaGen() {

        val quintaGenPokedex = pokedex.filter { it.numero in 494..649 }


        val intent = Intent(this, QuintaGenActivity::class.java)
        intent.putExtra("quintaGenPokedex", quintaGenPokedex as Serializable)
        startActivity(intent)
    }

    private fun navigateToCuartaGen() {

        val cuartaGenPokedex = pokedex.filter { it.numero in 387..493 }


        val intent = Intent(this, CuartaGenActivity::class.java)
        intent.putExtra("cuartaGenPokedex", cuartaGenPokedex as Serializable)
        startActivity(intent)
    }


    private fun navigateToPrimeraGen() {

        val primeraGenPokedex = pokedex.filter { it.numero in 1..151 }


        val intent = Intent(this, PrimeraGenActivity::class.java)
        intent.putExtra("primeraGenPokedex", primeraGenPokedex as Serializable)
        startActivity(intent)
    }

    private fun navigateToSegundaGen()
    {
        val segundaGenPokedex = pokedex.filter { it.numero in 152..251 }


        val intent = Intent(this, SegundaGenActivity::class.java)
        intent.putExtra("segundaGenPokedex", segundaGenPokedex as Serializable)
        startActivity(intent)
    }

    private fun navigateToTerceraGen()
    {
        val terceraGenPokedex = pokedex.filter { it.numero in 252..386 }


        val intent = Intent(this, TerceraGenActivity::class.java)
        intent.putExtra("terceraGenPokedex", terceraGenPokedex as Serializable)
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