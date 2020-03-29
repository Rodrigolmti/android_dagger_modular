package br.com.rodrigolmti.authentication.di

interface AuthenticationComponentProvider {

    fun providesAuthenticationComponent(): AuthenticationSubComponent
}