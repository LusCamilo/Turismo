package jandira.sp.senai.br.turismo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import jandira.sp.senai.br.turismo.adapter.PontosTuristicosAdapter
import jandira.sp.senai.br.turismo.dao.PontosTuristicosDAO

class MainActivity : AppCompatActivity() {

    lateinit var rvPontosTuristicos: RecyclerView
    lateinit var adapterPontosTuristicos: PontosTuristicosAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // criar instancia do recycle view
        rvPontosTuristicos = findViewById(R.id.rv_pontos_turisticos)

        //determinar o layout da recicleview
        rvPontosTuristicos.layoutManager =
            LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
            )
        //criar instancia do adapter
        adapterPontosTuristicos = PontosTuristicosAdapter(this)
        adapterPontosTuristicos.updatePontosTuristicosList(PontosTuristicosDAO.getPontosTuristicos(this))

        rvPontosTuristicos.adapter = adapterPontosTuristicos
    }
}