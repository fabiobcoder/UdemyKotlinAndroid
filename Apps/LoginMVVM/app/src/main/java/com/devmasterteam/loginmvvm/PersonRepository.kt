package com.devmasterteam.loginmvvm

class PersonRepository {
    fun login(name: String): Boolean {
        return name != ""
    }
}