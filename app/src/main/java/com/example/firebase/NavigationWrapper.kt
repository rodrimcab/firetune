package com.example.firebase

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.firebase.presentation.firstPage.FirstScreen
import com.example.firebase.presentation.login.LoginScreen
import com.example.firebase.presentation.register.RegisterScreen
import com.google.firebase.auth.FirebaseAuth

@Composable
fun NavigationWrapper(navHostController: NavHostController, auth: FirebaseAuth) {
    NavHost(navController = navHostController, startDestination = "firstPage") {
        composable("firstPage"){
            FirstScreen(
                navigateToLogin = { navHostController.navigate("login") },
                navigateToRegister = { navHostController.navigate("register") }
            )
        }
        composable("login") {
            LoginScreen(auth)
        }
        composable("register"){
            RegisterScreen(auth)
        }
    }
}