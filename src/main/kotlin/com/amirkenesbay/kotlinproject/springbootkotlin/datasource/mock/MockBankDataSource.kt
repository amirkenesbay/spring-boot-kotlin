package com.amirkenesbay.kotlinproject.springbootkotlin.datasource.mock

import com.amirkenesbay.kotlinproject.springbootkotlin.datasource.BankDataSource
import com.amirkenesbay.kotlinproject.springbootkotlin.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {
    override fun getBanks(): Collection<Bank> {
        return emptyList()
    }
}