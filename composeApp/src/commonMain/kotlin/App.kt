import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.delay


@Composable
fun App(viewModel: LandingScreenViewModel = LandingScreenViewModel()) {

    val coroutineScope = rememberCoroutineScope()
    val showSplashScreen = remember { mutableStateOf(true) }



    AppTheme {

        LaunchedEffect(Unit) {

            showSplashScreen.value = true
            delay(3000L)
            showSplashScreen.value = false

        }


        if(showSplashScreen.value) {
            SplashScreen()
        } else {
            MaterialTheme {
                Scaffold{
                    SignUpScreen()
                }
            }
        }
    }

}

