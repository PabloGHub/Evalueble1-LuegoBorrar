package abl.evaluable1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Actividad5 : AppCompatActivity() {

    lateinit var _numero: EditText;
    lateinit var _anterior: String;
    var _accion: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_actividad5)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        _numero = findViewById(R.id.numero)

        var _uno: Button = findViewById(R.id.uno);
        var _dos: Button = findViewById(R.id.dos);
        var _tres: Button = findViewById(R.id.tres);
        var _cuatro: Button = findViewById(R.id.cuatro);
        var _cinco: Button = findViewById(R.id.cinco);
        var _seis: Button = findViewById(R.id.seis);
        var _siete: Button = findViewById(R.id.siete);
        var _ocho: Button = findViewById(R.id.ocho);
        var _nueve: Button = findViewById(R.id.nueve);
        var _cero: Button = findViewById(R.id.cero);

        var _comilla: Button = findViewById(R.id.comilla);

        var _sumar: Button = findViewById(R.id.sumar);
        var _restar: Button = findViewById(R.id.restar);
        var _dividir: Button = findViewById(R.id.dividir);
        var _multiplicar: Button = findViewById(R.id.multiplicar);

        var _ce: Button = findViewById(R.id.ce);
        var _igual: Button = findViewById(R.id.igual);


        _uno.setOnClickListener()
        {
            _numero.setText("" + _numero.getText() + "1");
        }
        _dos.setOnClickListener()
        {
            _numero.setText("" + _numero.getText() + "2");
        }
        _tres.setOnClickListener()
        {
            _numero.setText("" + _numero.getText() + "3");
        }
        _cuatro.setOnClickListener()
        {
            _numero.setText("" + _numero.getText() + "4");
        }
        _cinco.setOnClickListener()
        {
            _numero.setText("" + _numero.getText() + "5");
        }
        _seis.setOnClickListener()
        {
            _numero.setText("" + _numero.getText() + "6");
        }
        _siete.setOnClickListener()
        {
            _numero.setText("" + _numero.getText() + "7");
        }
        _ocho.setOnClickListener()
        {
            _numero.setText("" + _numero.getText() + "8");
        }
        _nueve.setOnClickListener()
        {
            _numero.setText("" + _numero.getText() + "9");
        }
        _cero.setOnClickListener()
        {
            _numero.setText("" + _numero.getText() + "0");
        }


        _comilla.setOnClickListener()
        {
            _numero.setText("" + _numero.getText() + ",");
        }


        /* --- Cambio --- */
        _sumar.setOnClickListener()
        {
            _accion = 1;
            guar();
        }
        _restar.setOnClickListener()
        {
            _accion = 2;
            guar();
        }
        _dividir.setOnClickListener()
        {
            _accion = 3;
            guar();
        }
        _multiplicar.setOnClickListener()
        {
            _accion = 4;
            guar();
        }


        /* --- Operar --- */
        _igual.setOnClickListener()
        {
            var _var1: Float = aF(_anterior.replace(",", "."))
            var _var2: Float = aF(_numero.text.toString().replace(",", "."))
            var _var3: Float = 0.0f

            try
            {
                if (_accion == 1)
                    _var3 = _var1 + _var2
                else if (_accion == 2)
                    _var3 = _var1 - _var2
                else if (_accion == 3)
                    _var3 = _var1 / _var2
                else if (_accion == 4)
                    _var3 = _var1 * _var2
            }
            catch (e: ArithmeticException)
            {
                _numero.setText("Error: Artmetico, no se puede dividir entre 0");
            }
            catch (ee: Exception)
            {
                _numero.setText("Error");
            }

            var _var4: String = _var3.toString()
            _numero.setText(_var4);

        }


        /* --- Borrar --- */
        _ce.setOnClickListener()
        {
            _numero.setText("");
        }


    }

    fun guar()
    {
        if (_numero.text.toString() != "")
        {
            _anterior = _numero.text.toString();
            _numero.setText("");
        }
    }

    fun aF(_linea: String): Float
    {
        return _linea.toFloat();
    }
}
