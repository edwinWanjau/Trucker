package com.edwanjau11.trucker.authentication.sign_up.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.hilt.navigation.compose.hiltViewModel
import com.edwanjau11.trucker.authentication.components.ProgressBar
import com.edwanjau11.trucker.authentication.core.Utils.Companion.print
import com.edwanjau11.trucker.authentication.domain.model.Response.*
import com.edwanjau11.trucker.authentication.sign_up.SignUpViewModel

@Composable
fun SendEmailVerification(
    viewModel: SignUpViewModel = hiltViewModel()
) {
    when(val sendEmailVerificationResponse = viewModel.sendEmailVerificationResponse) {
        is Loading -> ProgressBar()
        is Success -> Unit
        is Failure -> sendEmailVerificationResponse.apply {
            LaunchedEffect(e) {
                print(e)
            }
        }
    }
}