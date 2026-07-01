package br.com.lotoanalisepro.ui.generator

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.lotoanalisepro.generator.LotteryGenerator

@Composable
fun GeneratorScreen() {

    var result by remember { mutableStateOf(listOf<List<Int>>()) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Button(onClick = {
            result = LotteryGenerator.generateGame(
                quantity = 5,
                numbersRange = 1..60,
                numbersPerGame = 6
            )
        }) {
            Text("Gerar Jogos")
        }

        Spacer(modifier = Modifier.height(16.dp))

        result.forEachIndexed { index, game ->
            Text("Jogo ${index + 1}: ${game.joinToString(" ")}")
        }
    }
}
