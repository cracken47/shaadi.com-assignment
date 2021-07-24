package com.karan.shaadidotcom.ui.adapter

interface MatchesActionsInterface {

    suspend fun setStatus(position: Int, uuid: String, newStatus: Int)
}