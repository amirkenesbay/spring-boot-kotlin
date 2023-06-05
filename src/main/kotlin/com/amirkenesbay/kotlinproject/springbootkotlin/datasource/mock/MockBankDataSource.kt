package com.amirkenesbay.kotlinproject.springbootkotlin.datasource.mock

import com.amirkenesbay.kotlinproject.springbootkotlin.datasource.BankDataSource
import com.amirkenesbay.kotlinproject.springbootkotlin.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {
    val banks = listOf(
        Bank("12345", 3.14, 20),
        Bank("1010", 5.15, 0),
        Bank("1234", 0.0, 13)
    )

    override fun retrieveBanks(): Collection<Bank> = banks
}