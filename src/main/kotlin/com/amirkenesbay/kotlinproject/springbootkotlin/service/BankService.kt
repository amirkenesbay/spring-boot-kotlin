package com.amirkenesbay.kotlinproject.springbootkotlin.service

import com.amirkenesbay.kotlinproject.springbootkotlin.datasource.BankDataSource
import com.amirkenesbay.kotlinproject.springbootkotlin.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()
}