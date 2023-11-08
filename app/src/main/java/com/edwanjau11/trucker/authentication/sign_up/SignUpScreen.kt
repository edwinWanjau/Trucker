package com.edwanjau11.trucker.authentication.sign_up

import androidx.compose.runtime.Composable
import com.edwanjau11.trucker.authentication.sign_up.components.SignUpContent
import androidx.compose.material.Scaffold
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.edwanjau11.trucker.authentication.core.Constants.VERIFY_EMAIL_MESSAGE
import com.edwanjau11.trucker.authentication.core.Utils.Companion.showMessage
import com.edwanjau11.trucker.authentication.sign_up.components.SendEmailVerification
import com.edwanjau11.trucker.authentication.sign_up.components.SignUp
import com.edwanjau11.trucker.authentication.sign_up.components.SignUpTopBar

@Composable
@ExperimentalComposeUiApi
fun SignUpScreen(
    viewModel: SignUpViewModel = hiltViewModel(),
    navigateBack: () -> Unit
) {
    val context = LocalContext.current

    Scaffold(
        topBar = {
            SignUpTopBar(
                navigateBack = navigateBack
            )
        },
        content = { padding ->
            SignUpContent(
                padding = padding,
                signUp = { email, password ->
                    viewModel.signUpWithEmailAndPassword(email, password)
                },
                navigateBack = navigateBack
            )
        }
    )

    SignUp(
        sendEmailVerification = {
            viewModel.sendEmailVerification()
        },
        showVerifyEmailMessage = {
            showMessage(context, VERIFY_EMAIL_MESSAGE)
        }
    )

    SendEmailVerification()
}