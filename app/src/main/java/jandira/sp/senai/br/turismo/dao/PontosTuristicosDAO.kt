package jandira.sp.senai.br.turismo.dao

import android.content.Context
import jandira.sp.senai.br.turismo.R
import jandira.sp.senai.br.turismo.model.PontoTuristico

class PontosTuristicosDAO() {

    //tudo que esta dentro do metodo companio é estatico
    companion object {

        fun getPontosTuristicos(context: Context): List<PontoTuristico>{

            val pt1 = PontoTuristico()

            pt1.codigo = 1
            pt1.nomePontoTuristico = "Osasco"
            pt1.descricao = "Osasco (pronúncia AFI: [o'zaskʊ]) é um município brasileiro localizado na Região Metropolitana de São Paulo,[8][9] no estado de São Paulo, no Brasil. Nascido como um bairro da capital paulista no final do século XIX"
            pt1.imagem = context.getDrawable(R.drawable.osasco)

            val pt2 = PontoTuristico()

            pt2.codigo = 2
            pt2.nomePontoTuristico = "Barueri"
            pt2.descricao = "Barueri é um município da Região Metropolitana de São Paulo, no estado de São Paulo, na Região Sudeste do Brasil. Dista 26 km da Praça da Sé, marco zero da capital paulista. O município é formado pela sede e pelos distritos de Aldeia, Jardim Belval e Jardim Silveira[7][8]."
            pt2.imagem = context.getDrawable(R.drawable.barueri)

            val pt3 = PontoTuristico()

            pt3.codigo = 3
            pt3.nomePontoTuristico = "Jandira"
            pt3.descricao = "Jandira é um município da microrregião de Osasco, na Região Metropolitana de São Paulo, no estado de São Paulo, no Brasil. Localiza-se na Zona Oeste da Grande São Paulo, em conformidade com a lei estadual nº 1.139, de 16 de junho de 2011[6] e, consequentemente, com o Plano de Desenvolvimento Urbano Integrado da Região Metropolitana de São Paulo (PDUI)[7]."
            pt3.imagem = context.getDrawable(R.drawable.jandira)

            val pt4 = PontoTuristico()

            pt4.codigo = 4
            pt4.nomePontoTuristico = "Itapevi"
            pt4.descricao = "Com origem Tupi Guarani, Itapevi, que significa pedra chata e lisa (Ita, “pedra”, e pevi , “chata e lisa”), surgiu como um bairro da cidade de Cotia por volta de 1850, com a chegada dos primeiros moradores – a família Abreu."
            pt4.imagem = context.getDrawable(R.drawable.itapevi)


            val pontosTuristicos = listOf<PontoTuristico>(pt1, pt2, pt3, pt4)

            return pontosTuristicos

        }
    }
}