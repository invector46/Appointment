package com.example.appointment.features.auth

sealed class AllEvents {
    data class LogOutSuccess(val message : String) : AllEvents()
    data class Message(val message : String) : AllEvents()
    data class ErrorCode(val code : Int):AllEvents()
    data class Error(val error : String) : AllEvents()
}