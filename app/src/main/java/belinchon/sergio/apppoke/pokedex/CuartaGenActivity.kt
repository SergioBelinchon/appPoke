package belinchon.sergio.apppoke.pokedex

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import belinchon.sergio.apppoke.R
import belinchon.sergio.apppoke.modelo.Pokemon

class CuartaGenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_cuarta_gen)

        val cuartaGenPokedex = intent.getSerializableExtra("cuartaGenPokedex") as List<Pokemon>?
        displayPokemonTable(cuartaGenPokedex)

        val btnVolver = findViewById<Button>(R.id.btnVolver)

        btnVolver.setOnClickListener {
            onBackPressed()
        }
    }

    private fun displayPokemonTable(pokemonList: List<Pokemon>?) {
        val tableLayout: TableLayout = findViewById(R.id.tableLayout)

        pokemonList?.forEach { pokemon ->
            val tableRow = TableRow(this)

            addTextViewToRow(tableRow, pokemon.numero.toString())
            addTextViewToRow(tableRow, pokemon.nombre)
            addTextViewToRow(tableRow, "Sinnoh")


            tableRow.setOnClickListener {
                val intent = Intent(this@CuartaGenActivity, PokemonDetailActivity::class.java)
                intent.putExtra("pokemon", pokemon)
                startActivity(intent)
            }

            tableLayout.addView(tableRow)

        }
    }

    private fun addTextViewToRow(row: TableRow, text: String) {
        val textView = TextView(this)
        textView.text = text
        textView.setBackgroundResource(R.drawable.cell_border)
        textView.setPadding(8, 8, 8, 8)
        row.addView(textView)
    }

    @Deprecated(message = "Use OnBackPressedDispatcher instead",
        level = DeprecationLevel.WARNING,
        replaceWith = ReplaceWith("super.onBackPressed()", "androidx.appcompat.app.AppCompatActivity")
    )
    override fun onBackPressed() {
        super.onBackPressed()
    }

}


