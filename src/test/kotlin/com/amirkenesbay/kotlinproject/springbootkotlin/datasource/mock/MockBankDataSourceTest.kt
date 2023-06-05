package com.amirkenesbay.kotlinproject.springbootkotlin.datasource.mock

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest {
    private val mockDataSource = MockBankDataSource()
    @Test
    fun `shoud `() {
        // given
        
        
        
        // when
        val banks = mockDataSource.retrieveBanks()
        
        
        // then
        Assertions.assertThat(banks).isNotEmpty


        
    }
    
}