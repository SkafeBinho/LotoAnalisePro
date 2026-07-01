package br.com.lotoanalisepro.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.lotoanalisepro.data.LotteryData

@Composable
fun HomeScreen() {

    val lotteries = LotteryData.getLotteries()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(androidx.compose.material3.MaterialTheme.colorScheme.background),
        contentPadding = PaddingValues(16.dp)
    ) {

        items(lotteries) { lottery ->
            LotteryCard(lottery)
        }
    }
}
