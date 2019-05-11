package br.com.fiap.pokedex

import android.content.Context
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.fiap.pokedex.model.Pokemon
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.pokemon_item.view.*

class ListaPokemonAdapter(private val pokemons: List<Pokemon>,
                          private val context: Context,
                          val listener: (Pokemon) -> Unit) : Adapter<ListaPokemonAdapter.ViewHolder>() {

    //Método que recebe o ViewHolder e a posição da lista.
    //Aqui é recuperado o objeto da lista de Objetos pela posição e associado à ViewHolder.
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val jogo= pokemons[position]
        holder?.let {
            it.bindView(jogo, listener)
        }
    }

    //Método que deverá retornar layout criado pelo ViewHolder já inflado em uma view.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.pokemon_item, parent, false)
        return ViewHolder(view)
    }

    //Método que deverá retornar quantos itens há na lista.
    override fun getItemCount(): Int {
        return pokemons.size
    }

    /*
    Com o ViewHolder iremos relacionar o layout criado e adicionar os valores a ele*/
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(pokemon: Pokemon,
                     listener: (Pokemon) -> Unit) = with(itemView) {

            Picasso.get()
                    .load(pokemon.imagem)
                    .into(ivImagemPokemon)

            tvNomePokemon.text = pokemon.nome
            tvTipoPokemon.text = pokemon.tipo

            setOnClickListener { listener(pokemon) }
        }
    }

    /*
    * Vale ressaltar que os métodos onCreateViewHolder e onBindViewHolder não são chamados
    * para todos os itens inicialmente, eles são chamados apenas para os itens visíveis para o usuário.
    * Quando o usuário sobe e desce a lista, estes dois métodos são chamados novamente associando a view
    * reciclada ao conteúdo daquela posição que agora será visível.
    * */
}

