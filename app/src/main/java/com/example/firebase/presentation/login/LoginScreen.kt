package com.example.firebase.presentation.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firebase.R
import com.example.firebase.ui.theme.Black
import com.google.firebase.auth.FirebaseAuth

@Preview(showBackground = true)
@Composable
fun LoginScreen(/* auth: FirebaseAuth */) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Black)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_back),
            contentDescription = "Back",
            tint = Color.White,
            modifier = Modifier.padding(24.dp)
        )
    }
}