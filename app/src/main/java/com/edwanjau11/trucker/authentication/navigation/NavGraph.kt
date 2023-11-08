package com.edwanjau11.trucker.authentication.navigation



import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.edwanjau11.trucker.authentication.navigation.Screen.SignUpScreen
import com.edwanjau11.trucker.authentication.navigation.Screen.LoginScreen
import com.edwanjau11.trucker.authentication.navigation.Screen.VerifyEmailScreen
import com.edwanjau11.trucker.authentication.navigation.Screen.ProfileScreen
import com.edwanjau11.trucker.authentication.navigation.Screen.ForgotPassScreen
import com.edwanjau11.trucker.authentication.sign_up.SignUpScreen
import com.edwanjau11.trucker.authentication.login.LoginScreen
import com.edwanjau11.trucker.authentication.verifyemail.VerifyEmailScreen
import com.edwanjau11.trucker.authentication.forgotpass.ForgotPassScreen
import com.edwanjau11.trucker.profile.ProfileScreen



@Composable
@ExperimentalComposeUiApi
fun NavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = SignUpScreen.route
    ) {
        composable(
            route = SignUpScreen.route
        ) {
            SignUpScreen(
                navigateBack = {
                    navController.popBackStack()
                }
            )
        }
        /*
        composable(
            route = ForgotPassScreen.route
        ) {
            ForgotPassScreen(
                navigateBack = {
                    navController.popBackStack()
                }
            )
        }
        composable(
            route = LoginScreen.route
        ) {
            LoginScreen(
                navigateToForgotPasswordScreen = {
                    navController.navigate(ForgotPassScreen.route)
                },
                navigateToSignUpScreen = {
                    navController.navigate(SignUpScreen.route)
                }
            )
        }
        composable(
            route = VerifyEmailScreen.route
        ) {
            VerifyEmailScreen(
                navigateToProfileScreen = {
                    navController.navigate(ProfileScreen.route) {
                        popUpTo(navController.graph.id) {
                            inclusive = true
                        }
                    }
                }
            )
        }
        composable(
            route = ProfileScreen.route
        ) {
            ProfileScreen()
        }

         */
    }
}