package belinchon.sergio.apppoke.pokedex

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TableLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.text.toLowerCase
import belinchon.sergio.apppoke.R
import belinchon.sergio.apppoke.modelo.Pokemon
import java.util.Locale

class PokemonDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon_detail)

        val pokemon = intent.getSerializableExtra("pokemon") as Pokemon

        val pokemonList = intent.getSerializableExtra("pokemonList") as ArrayList<Pokemon>?

        val nombrePokemon =
            pokemon.nombre.lowercase(Locale.ROOT) // Convertimos el nombre a minúsculas

        // Construir el nombre del recurso de imagen
        val nombreImagen = "${nombrePokemon}"

        val imageViewPokemon = findViewById<ImageView>(R.id.imageViewPokemon)

        // Obtener el identificador del recurso de imagen
        val resourceId = resources.getIdentifier(nombreImagen, "drawable", packageName)

        // Cargar la imagen del Pokémon en la ImageView
        imageViewPokemon.setImageResource(resourceId)

        val textViewName = findViewById<TextView>(R.id.textViewPokemonName)
        textViewName.text = "Nombre: ${pokemon.nombre}"
        val textViewPs = findViewById<TextView>(R.id.textViewPs)
        textViewPs.text = "Ps: ${pokemon.estadisticasBase["Ps"]}"
        val textViewAtaque = findViewById<TextView>(R.id.textViewAtaque)
        textViewAtaque.text = "Ataque: ${pokemon.estadisticasBase["Ataque"]}"
        val textViewDefensa = findViewById<TextView>(R.id.textViewDefensa)
        textViewDefensa.text = "Defensa: ${pokemon.estadisticasBase["Defensa"]}"
        val textViewAt_Esp = findViewById<TextView>(R.id.textViewAt_Esp)
        textViewAt_Esp.text = "At.Esp: ${pokemon.estadisticasBase["At. Esp"]}"
        val textViewDef_Esp = findViewById<TextView>(R.id.textViewDef_Esp)
        textViewDef_Esp.text = "Def. Esp: ${pokemon.estadisticasBase["Def. Esp"]}"
        val textViewVelocidad = findViewById<TextView>(R.id.textViewVelocidad)
        textViewVelocidad.text = "Velocidad: ${pokemon.estadisticasBase["Velocidad"]}"
        val textViewPokemonType = findViewById<TextView>(R.id.textViewPokemonType)
        textViewPokemonType.text = "Tipo(s): ${pokemon.tipo}"


        val btnVolver = findViewById<Button>(R.id.btnVolver)

        btnVolver.setOnClickListener {
            onBackPressed()
        }

    }


    @Deprecated(message = "Use OnBackPressedDispatcher instead",
        level = DeprecationLevel.WARNING,
        replaceWith = ReplaceWith("super.onBackPressed()", "androidx.appcompat.app.AppCompatActivity")
    )
    override fun onBackPressed() {
        super.onBackPressed()
    }
}