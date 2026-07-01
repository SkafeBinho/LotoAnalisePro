package br.com.lotoanalisepro.ui.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.lotoanalisepro.data.LotteryData

@Composable
fun HomeScreen() {

    val lotteries = LotteryData.getLotteries()
    var showDialog by remember { mutableStateOf(false) }

    Scaffold(

        floatingActionButton = {
            FloatingActionButton(
                onClick = { showDialog = true }
            ) {
                Text("+")
            }
        }

    ) { padding ->

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            contentPadding = PaddingValues(16.dp)
        ) {

            items(lotteries) { lottery ->
                LotteryCard(lottery)
            }
        }

        if (showDialog) {
            AlertDialog(
                onDismissRequest = { showDialog = false },
                confirmButton = {
                    TextButton(onClick = { showDialog = false }) {
                        Text("OK")
                    }
                },
                title = {
                    Text("Gerador de Apostas")
                },
                text = {
                    Text("Em breve vamos gerar combinações inteligentes aqui 🚀")
                }
            )
        }
    }
}
