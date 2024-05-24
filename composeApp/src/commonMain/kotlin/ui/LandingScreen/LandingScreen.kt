import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun LandingScreen() {

    MaterialTheme {
        Scaffold(topBar = { TopAppBar() }) {

        }
    }

}

@Composable
fun TopAppBar() {
    Column {
        Text("Landing screen")
    }
}