package abl.evaluable1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Actividad1 : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_actividad1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // --- --- Declaraciones --- --- //
        var _campo: EditText = findViewById(R.id.campo);
        var _boton: Button = findViewById(R.id.boton1);
        var _https: String = "https://";

        _boton.setOnClickListener()
        {
            if (!_campo.text.equals("") && _campo.text != null)
            {
                val _intent = Intent(Intent.ACTION_VIEW);
                _intent.data = Uri.parse(_campo.text.toString());

                if (_campo.text.toString().isValidUrl())
                    startActivity(_intent)
                else
                    Toast.makeText(this, String.format(getString(R.string.error), "URL no valida"), Toast.LENGTH_SHORT).show()
            }
        }
    }
}

fun String.isValidUrl(): Boolean
{
    return Patterns.WEB_URL.matcher(this).matches()
}