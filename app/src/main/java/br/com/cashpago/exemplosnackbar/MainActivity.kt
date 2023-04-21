package br.com.cashpago.exemplosnackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import br.com.cashpago.exemplosnackbar.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

     fun snackbar(view : View){
        Snackbar.make(view,"Olá mundo!!",Snackbar.LENGTH_LONG).show()
    }
    fun snackbar2(view : View){
       val snackbar = Snackbar.make(view,"Olá mundo!!",Snackbar.LENGTH_LONG)

        snackbar.setAction("Desfazer"){

        }
        snackbar.setActionTextColor(ContextCompat.getColor(this@MainActivity,android.R.color.holo_red_dark))
        snackbar.setTextColor(ContextCompat.getColor(this@MainActivity,R.color.black))
        snackbar.setBackgroundTint(ContextCompat.getColor(this@MainActivity,android.R.color.holo_green_dark))

        snackbar.show()
    }
}