package belinchon.sergio.apppoke.tipos

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import belinchon.sergio.apppoke.R

class TiposActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_tipos)


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

    fun onBackPressed(view: View) {}
}