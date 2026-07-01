package br.com.lotoanalisepro.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import br.com.lotoanalisepro.model.Lottery

@Composable
fun LotteryCard(lottery: Lottery) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 12.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(lottery.color)
        )
    ) {

        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = lottery.name,
                style = MaterialTheme.typography.titleLarge,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Último resultado:",
                color = Color.White.copy(alpha = 0.8f)
            )

            Text(
                text = lottery.lastResult,
                color = Color.White
            )
        }
    }
}
