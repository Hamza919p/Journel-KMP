

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Checkbox
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SignUpScreen() {
    val userName = remember { mutableStateOf("") }
    val emailAddress = remember { mutableStateOf("") }
    val phoneNumber = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }

    Scaffold(topBar = { TopBar() }) {

        Column {
            LazyColumn {
                item {

                    Spacer(modifier = Modifier.height(30.dp))

                    OutlinedTextField(
                        modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
                        value = userName.value,
                        onValueChange = {
                            userName.value = it
                        },
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            cursorColor = Color.Black,
                            errorBorderColor = Color.Red
                        ),
                        label = { Text(text = "User Name") }
                    )

                    OutlinedTextField(
                        modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
                        value = emailAddress.value,
                        onValueChange = {
                            emailAddress.value = it
                        },
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            cursorColor = Color.Black,
                            errorBorderColor = Color.Red
                        ),
                        label = { Text(text = "Email Address") }
                    )

                    OutlinedTextField(
                        modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
                        value = phoneNumber.value,
                        onValueChange = {
                            phoneNumber.value = it
                        },
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            cursorColor = Color.Black,
                            errorBorderColor = Color.Red
                        ),
                        label = { Text(text = "Phone Number") }
                    )

                    OutlinedTextField(
                        modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
                        value = password.value,
                        onValueChange = {
                            password.value = it
                        },
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            cursorColor = Color.Black,
                            errorBorderColor = Color.Red
                        ),
                        label = { Text(text = "Password") }
                    )

                }

            }

            Button(
                modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp, top = 30.dp),
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = MaterialTheme.colors.primary
                )
            ) {
                Text(text = "Sign Up")
            }
        }

    }
}

@Composable
fun TopBar() {
    TopAppBar {

        IconButton(
            onClick = {},
        ) {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = null
            )
        }

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Sign Up",
            fontSize = 18.sp,
            color = Color.White,
            textAlign = TextAlign.Center
        )

    }
}