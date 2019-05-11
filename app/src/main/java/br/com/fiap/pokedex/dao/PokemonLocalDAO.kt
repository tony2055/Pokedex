package br.com.fiap.pokedex.dao

import br.com.fiap.pokedex.model.Pokemon

class PokemonLocalDAO{

    fun listarPokemons() : List<Pokemon> {
            return listOf(
                    getHypno(),
                    getCharmander(),
                    getPiplup(),
                    getMagikarp(),
                    getRattata(),
                    getCaterpie()
            )
        }

    fun getHypno() : Pokemon{
        return  Pokemon(
                "Hypno",
                "Psíquico",
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/097.png",
                "Hypno segura um pêndulo na mão. O movimento de arco e o brilho do pêndulo acalmam o inimigo em um estado profundo de hipnose. Enquanto este Pokémon procura por presa, ele lustra o pêndulo.",
                1
            )
        }

    fun getCharmander(): Pokemon {
        return Pokemon(
                "Charmander",
                "Fogo",
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/004.png",
                "A chama que queima na ponta da cauda é uma indicação de suas emoções. A chama oscila quando Charmander está se divertindo. Se o Pokémon ficar enfurecido, a chama arderá ferozmente.",
                1
        )
    }

    fun getPiplup(): Pokemon {
        return Pokemon(
                "Piplup",
                "Água",
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/393.png",
                "Não gosta de ser cuidado. É difícil vincular-se, pois não vai ouvir o seu treinador.",
                3
        )
    }

    fun getMagikarp(): Pokemon {
        return Pokemon(
                "Magikarp",
                "Água",
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/129.png",
                "Magikarp é uma desculpa patética para um Pokémon que só é capaz de cair e espirrar. Esse comportamento levou os cientistas a realizar pesquisas sobre o assunto.",
                1
        )
    }

    fun getRattata(): Pokemon {
        return Pokemon(
                "Rattata",
                "Normal",
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/019.png",
                "Rattata é cauteloso ao extremo. Mesmo enquanto dorme, escuta constantemente movendo suas orelhas ao redor. Não é exigente sobre onde vive - fará seu ninho em qualquer lugar.",
                1
        )
    }

    fun getCaterpie(): Pokemon {
        return Pokemon(
                "Caterpie",
                "Bug",
                "https://assets.pokemon.com/assets/cms2/img/pokedex/full/010.png",
                "Caterpie tem um apetite voraz. Pode devorar folhas maiores que seu corpo diante de seus olhos. De sua antena, este Pokémon libera um odor terrivelmente forte.",
                1
        )
    }












}