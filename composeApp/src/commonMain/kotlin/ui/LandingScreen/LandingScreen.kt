import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import journel_kmp.composeapp.generated.resources.Res
import journel_kmp.composeapp.generated.resources.logo
import org.jetbrains.compose.resources.painterResource

@Composable
fun LandingScreen() {

    MaterialTheme {
        Scaffold(topBar = { TopAppBar() }) {
            Box(
                modifier = Modifier.fillMaxSize()
                    .background(color = Color.White),
                contentAlignment = Alignment.Center
            ) {

            }
        }
    }

}

@Composable
fun TopAppBar() {
    Column {
        Text("Landing screen")
    }
}