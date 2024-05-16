import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import com.looser.helper.theme.primaryColor
import com.looser.helper.theme.secondaryColor

private val DarkColorPalette = darkColors(
    primary = primaryColor,
    primaryVariant = primaryColor,
    secondary = secondaryColor,
)

private val LightColorPalette = lightColors(
    primary = primaryColor,
    primaryVariant = primaryColor,
    secondary = secondaryColor,
)

@Composable
fun AppTheme(
    isDarkTheme: Boolean = false,
    content: @Composable () -> Unit
) {

    val colors = if(isDarkTheme) DarkColorPalette else LightColorPalette

    MaterialTheme(
        colors = colors,
        shapes = shapes,
        content = content
    )

}