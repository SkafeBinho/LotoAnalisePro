package br.com.lotoanalisepro

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable

@Composable
fun LotoApp() {
    MaterialTheme {
        Surface {
            AppNavigation()
        }
    }
}
