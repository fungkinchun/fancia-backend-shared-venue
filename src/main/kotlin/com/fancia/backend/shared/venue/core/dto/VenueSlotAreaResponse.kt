package com.fancia.backend.shared.venue.core.dto

import java.time.LocalDateTime
import java.util.UUID

data class VenueSlotAreaResponse(
    val id: UUID?,
    val slotId: UUID,
    val name: String,
    val priceMinor: Long,
    val currency: String,
    val capacity: Int?,
    val sortOrder: Int,
    val createdBy: UUID?,
    val createdAt: LocalDateTime?,
)
