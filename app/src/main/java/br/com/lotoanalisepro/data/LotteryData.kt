package br.com.lotoanalisepro.data

import br.com.lotoanalisepro.model.Lottery

object LotteryData {

    fun getLotteries(): List<Lottery> {
        return listOf(
            Lottery("Mega-Sena", 0xFF00C853, "01 05 12 23 34 56"),
            Lottery("Quina", 0xFF6200EA, "02 11 19 44 55"),
            Lottery("Lotofácil", 0xFF2962FF, "01 02 03 05 07 09"),
            Lottery("Lotomania", 0xFFFF6D00, "03 14 25 36 47 58"),
            Lottery("+Milionária", 0xFF00ACC1, "07 13 22 31 40"),
            Lottery("Timemania", 0xFF43A047, "04 08 15 19 27"),
            Lottery("Dupla Sena", 0xFFD50000, "10 20 30 40 50"),
            Lottery("Super Sete", 0xFF8E24AA, "1-3-5-7-2-4-6")
        )
    }
}
