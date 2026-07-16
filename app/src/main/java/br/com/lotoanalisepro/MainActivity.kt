package br.com.lotoanalisepro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import br.com.lotoanalisepro.ui.theme.LotoAnaliseProTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            LotoAnaliseProTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { padding ->

                    DashboardScreen(
                        modifier = Modifier.padding(padding)
                    )

                }
            }
        }
    }
}

@Composable
fun DashboardScreen(
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(20.dp),

        horizontalAlignment = Alignment.CenterHorizontally,

        verticalArrangement = Arrangement.Top

    ) {

        Text(
            text = "🍀 Loto Análise Pro",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(24.dp))

        Card(
            modifier = Modifier.fillMaxWidth()
        ) {

            Column(
                modifier = Modifier.padding(16.dp)
            ) {

                Text("⭐ Mega-Sena")

                Text("Último concurso")

                Text("Em breve...")

            }

        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {}
        ) {

            Text("Estatísticas")

        }

    }

}

@Preview(showBackground = true)
@Composable
fun DashboardPreview() {

    LotoAnaliseProTheme {

        DashboardScreen()

    }

}