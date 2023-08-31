package com.example.mvvm.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvvm.ui.theme.screens.home.Homescreen
import com.example.mvvm.ui.theme.screens.login.LoginScreen
import com.example.mvvm.ui.theme.screens.register.RegisterScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,navController:NavHostController= rememberNavController(),
               startDestination:String= ROUT_LOGIN){
    NavHost(navController = navController,modifier=modifier, startDestination = startDestination){
        composable(ROUT_HOME){
            Homescreen(navController)
        }
        composable(ROUT_HOME){
            LoginScreen(navController)
        }
        composable(ROUT_HOME){
            RegisterScreen(navController)
        }




    }
}