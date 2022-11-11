package jandira.sp.senai.br.turismo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import jandira.sp.senai.br.turismo.R
import jandira.sp.senai.br.turismo.dao.PontosTuristicosDAO
import jandira.sp.senai.br.turismo.model.PontoTuristico

class PontosTuristicosAdapter(val context: Context) : RecyclerView.Adapter<PontosTuristicosAdapter.HolderPt>() {

    private var pontosTuristicosList = listOf<PontoTuristico>()

    fun updatePontosTuristicosList(pontosTuristicos: List<PontoTuristico>){

        this.pontosTuristicosList = pontosTuristicos
        notifyDataSetChanged()

    }
    //criar uma inner class view == holder_layout
    class HolderPt(view: View): RecyclerView.ViewHolder(view){


        val textTituloPt = view.findViewById<TextView>(R.id.text_View_Titulo)
        val textDescricao = view.findViewById<TextView>(R.id.textViewDescription)
        val imageHolder = view.findViewById<ImageView>(R.id.imageView)
        val buttonDetalhes = view.findViewById<Button>(R.id.buttonDetalhes)

        fun bind(pontoTuristico: PontoTuristico){

            textTituloPt.text = pontoTuristico.nomePontoTuristico
            textDescricao.text = pontoTuristico.descricao
            imageHolder.setImageDrawable(pontoTuristico.imagem)


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderPt {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.holder_layout, parent, false)
        return HolderPt(view)

    }

    override fun onBindViewHolder(holder: HolderPt, position: Int) {

        holder.bind(pontosTuristicosList.get(position))

    }

    override fun getItemCount(): Int {

        return pontosTuristicosList.size

    }

}