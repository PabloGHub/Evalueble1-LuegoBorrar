package abl.evaluable1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Actividad3 : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_actividad3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        var _ppal31: Button = findViewById(R.id.ppal31);
        var _ppal32: Button = findViewById(R.id.ppal32);
        var _ppal33: Button = findViewById(R.id.ppal33);
        var _ppal34: Button = findViewById(R.id.ppal34);


        _ppal31.setOnClickListener()
        {
            startActivity(Intent(this, Actividad3_1::class.java));
        }
        _ppal32.setOnClickListener()
        {
            startActivity(Intent(this, Actividad3_2::class.java));
        }
        _ppal33.setOnClickListener()
        {
            startActivity(Intent(this, Actividad3_3::class.java));
        }
        _ppal34.setOnClickListener()
        {
            startActivity(Intent(this, Actividad3_4::class.java));
        }

    }
}