package com.karan.shaadidotcom.ui

interface MatchesActionsInterface {

    suspend fun setStatus(position: Int, uuid: String, newStatus: Int)
}