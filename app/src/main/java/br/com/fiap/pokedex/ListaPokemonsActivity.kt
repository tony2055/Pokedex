package br.com.fiap.pokedex

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.StaggeredGridLayoutManager
import br.com.fiap.pokedex.dao.PokemonLocalDAO
import kotlinx.android.synthetic.main.activity_lista_pokemons.*

class ListaPokemonsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_pokemons)

        val pokemonDAO = PokemonLocalDAO()
        val pokemons = pokemonDAO.listarPokemons()

        rvPokemons.adapter = ListaPokemonAdapter(pokemons,
                this, {
            val intent = Intent(this, PokemonActivity::class.java)
            intent.putExtra("POKEMON", it)
            startActivity(intent)
        })

        //rvPokemons.layoutManager = LinearLayoutManager(this)
        rvPokemons.layoutManager = GridLayoutManager(this, 3)

    }
}
