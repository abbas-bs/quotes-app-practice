package com.example.quotecomposeapp.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.dailyquotes.models.Quote

@Composable
fun QuoteList(data: Array<Quote>, onClick: () -> Unit) {
    LazyColumn {
        items(data) { quote ->
            QuoteListItem(quote = quote) {
                onClick()
            }
        }
    }
}