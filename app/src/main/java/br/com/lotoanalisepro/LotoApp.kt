package br.com.lotoanalisepro

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import br.com.lotoanalisepro.navigation.AppNavigation
import br.com.lotoanalisepro.ui.theme.LotoTheme

@Composable
fun LotoApp() {
    LotoTheme {
        Surface {
            AppNavigation()
        }
    }
}
