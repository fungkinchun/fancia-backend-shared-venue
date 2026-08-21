package com.fancia.backend.shared.venue.core.dto

import com.fancia.backend.shared.venue.core.enums.VenueSlotStatus
import java.time.LocalDateTime
import java.util.UUID

data class VenueSlotResponse(
    val id: UUID?,
    val venueId: UUID,
    val startTime: LocalDateTime,
    val endTime: LocalDateTime,
    val priceMinor: Long,
    val currency: String,
    val status: VenueSlotStatus,
    val createdBy: UUID?,
    val createdAt: LocalDateTime?,
)
