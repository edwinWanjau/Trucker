package com.edwanjau11.trucker.authentication.sign_up

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.edwanjau11.trucker.authentication.domain.model.Response
import com.edwanjau11.trucker.authentication.domain.model.Response.Loading
import com.edwanjau11.trucker.authentication.domain.model.Response.Success
import com.edwanjau11.trucker.authentication.domain.repository.AuthRepository
import com.edwanjau11.trucker.authentication.domain.repository.SendEmailVerificationResponse
import com.edwanjau11.trucker.authentication.domain.repository.SignUpResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(
    private val repo: AuthRepository
): ViewModel() {
    var signUpResponse by mutableStateOf<SignUpResponse>(Success(false))
        private set
    var sendEmailVerificationResponse by mutableStateOf<SendEmailVerificationResponse>(
        Response.Success(
            false
        )
    )
        private set

    fun signUpWithEmailAndPassword(email: String, password: String) = viewModelScope.launch {
        signUpResponse = Loading
        signUpResponse = repo.firebaseSignUpWithEmailAndPassword(email, password)
    }

    fun sendEmailVerification() = viewModelScope.launch {
        sendEmailVerificationResponse = Loading
        sendEmailVerificationResponse = repo.sendEmailVerification()
    }
}