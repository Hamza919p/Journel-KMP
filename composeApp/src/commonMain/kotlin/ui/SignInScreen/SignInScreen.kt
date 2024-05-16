

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SignInScreen() {

    val emailTf = remember { mutableStateOf("") }
    val passTf = remember { mutableStateOf("") }
    val isPassVisible = remember { mutableStateOf(true) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.padding(bottom = 30.dp),
            textAlign = TextAlign.Center,
            text = "Welcome back! \nSign in to continue!",
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            fontSize = 24.sp
        )

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
            value = emailTf.value,
            onValueChange = {
                emailTf.value = it
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                cursorColor = Color.Black,
                errorBorderColor = Color.Red
            ),
            label = { Text(text = "Email") }
        )

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
            value = passTf.value,
            onValueChange = {
                passTf.value = it
            },
            visualTransformation = if(isPassVisible.value) VisualTransformation.None else PasswordVisualTransformation(),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                cursorColor = Color.Black,
                errorBorderColor = Color.Red

            ),
            trailingIcon = {
//                         val icon = if(isPassVisible.value) {
//                             Icons.Filled.Visibility
//                         } else {
//                             Icons.Filled.VisibilityOff
//                         }
//
//                IconButton(
//                    onClick = {
//                        isPassVisible.value = !isPassVisible.value
//                    }
//                ) {
//                    Icon(
//                        imageVector = icon,
//                        contentDescription = "Pass visibility"
//                    )
//                }

            },
            label = { Text(text = "Password") }
        )

        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth().padding(15.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = MaterialTheme.colors.primary
            )
        ) {
            Text(text = "Login", color = Color.White)
        }

        TextButton(
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            ) {
                Text(
                    text = "Forgot Password",
                    color = MaterialTheme.colors.primary,
                    fontSize = 16.sp
                )
            }

        TextButton(
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text(
                text = "Sign Up",
                color = MaterialTheme.colors.primary,
                fontSize = 16.sp
            )
        }

    }
}
