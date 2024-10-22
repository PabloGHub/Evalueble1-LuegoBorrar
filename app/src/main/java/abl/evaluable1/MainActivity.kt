package abl.evaluable1

import android.app.PendingIntent
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.provider.Telephony.Mms.Intents
import android.security.identity.PersonalizationData
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        // --- --- Decalraciones --- --- //
        var _btnAct1: Button = findViewById(R.id.btnAct1);
        var _btnAct2: Button = findViewById(R.id.btnAct2);
        var _btnAct3: Button = findViewById(R.id.btnAct3);
        var _btnAct4: Button = findViewById(R.id.btnAct4);
        var _btnAct5: Button = findViewById(R.id.btnAct5);
        var _btnAct6: Button = findViewById(R.id.btnAct6);


        // --- --- Metodos --- --- //
        _btnAct1.setOnClickListener()
        {
            val _intent = Intent(this, Actividad1::class.java);
            startActivity(_intent);
        }

        _btnAct2.setOnClickListener()
        {
            val _intent = Intent(this, Actividad2::class.java);
            val _pendiente = PendingIntent.getActivity(this, 0, _intent, PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE);


            Handler(Looper.getMainLooper()).postDelayed({

                try
                {
                    _pendiente.send();
                }
                catch (e: PendingIntent.CanceledException)
                {
                    e.printStackTrace();
                }
            }, 10000);

        }

        _btnAct3.setOnClickListener()
        {
            startActivity(Intent(this, Actividad3::class.java))
        }

        _btnAct4.setOnClickListener()
        {
            startActivity(Intent(this, Actividad4::class.java))
        }

        _btnAct5.setOnClickListener()
        {
            startActivity(Intent(this, Actividad5::class.java))
        }

        _btnAct6.setOnClickListener()
        {
            startActivity(Intent(this, Actividad6::class.java))
        }
    }
}