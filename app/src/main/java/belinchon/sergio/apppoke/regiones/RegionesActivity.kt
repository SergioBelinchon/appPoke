package belinchon.sergio.apppoke.regiones

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import belinchon.sergio.apppoke.R

class RegionesActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_regiones)

        val btnKanto = findViewById<Button>(R.id.btnKanto)
        val btnJohto = findViewById<Button>(R.id.btnJohto)
        val btnHoenn = findViewById<Button>(R.id.btnHoenn)
        val btnSinnoh = findViewById<Button>(R.id.btnSinnoh)
        val btnTeselia = findViewById<Button>(R.id.btnTeselia)
        val btnKalos = findViewById<Button>(R.id.btnKalos)
        val btnAlola = findViewById<Button>(R.id.btnAlola)
        val btnGalarHisui = findViewById<Button>(R.id.btnGalarHisui)
        val btnPaldea = findViewById<Button>(R.id.btnPaldea)
        val btnVolver = findViewById<Button>(R.id.btnVolver)


        btnKanto.setOnClickListener { navigateToKanto() }
        btnJohto.setOnClickListener { navigateToJohto() }
        btnHoenn.setOnClickListener { navigateToHoenn() }
        btnSinnoh.setOnClickListener { navigateToSinnoh() }
        btnTeselia.setOnClickListener { navigateToTeselia() }
        btnKalos.setOnClickListener { navigateToKalos() }
        btnAlola.setOnClickListener { navigateToAlola() }
        btnGalarHisui.setOnClickListener { navigateToGalar() }
        btnPaldea.setOnClickListener { navigateToPaldea() }


        btnVolver.setOnClickListener {
            onBackPressed()
        }
    }

    private fun navigateToPaldea() {
        val intent = Intent(this, PaldeaActivity::class.java)
        startActivity(intent)    }

    private fun navigateToGalar() {
        val intent = Intent(this, GalarActivity::class.java)
        startActivity(intent)    }

    private fun navigateToAlola() {
        val intent = Intent(this, AlolaActivity::class.java)
        startActivity(intent)    }

    private fun navigateToTeselia() {
        val intent = Intent(this, TeseliaActivity::class.java)
        startActivity(intent)    }

    private fun navigateToKalos() {
        val intent = Intent(this, KalosActivity::class.java)
        startActivity(intent)    }

    private fun navigateToSinnoh() {
        val intent = Intent(this, SinnohActivity::class.java)
        startActivity(intent)    }

    private fun navigateToHoenn() {
        val intent = Intent(this, HoennActivity::class.java)
        startActivity(intent)    }

    private fun navigateToKanto()
    {
        val intent = Intent(this, KantoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToJohto()
    {
        val intent = Intent(this, JohtoActivity::class.java)
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