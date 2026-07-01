package br.com.lotoanalisepro.generator

import kotlin.random.Random

object LotteryGenerator {

    fun generateGame(quantity: Int, numbersRange: IntRange, numbersPerGame: Int): List<List<Int>> {

        val games = mutableListOf<List<Int>>()

        repeat(quantity) {

            val game = mutableSetOf<Int>()

            while (game.size < numbersPerGame) {
                game.add(Random.nextInt(numbersRange.first, numbersRange.last + 1))
            }

            games.add(game.sorted())
        }

        return games
    }
}
