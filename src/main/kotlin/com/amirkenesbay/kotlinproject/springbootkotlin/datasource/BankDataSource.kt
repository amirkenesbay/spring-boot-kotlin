package com.amirkenesbay.kotlinproject.springbootkotlin.datasource

import com.amirkenesbay.kotlinproject.springbootkotlin.model.Bank

interface BankDataSource {
    fun retrieveBanks(): Collection<Bank>

}