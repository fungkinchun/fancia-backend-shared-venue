package com.fancia.backend.shared.venue.core.dto

import com.fancia.backend.shared.venue.core.enums.VenueBookingStatus
import java.time.LocalDateTime
import java.util.UUID

data class VenueBookingResponse(
    val id: UUID?,
    val venueId: UUID,
    val slotId: UUID,
    val areaId: UUID?,
    val areaName: String?,
    val requesterUserId: UUID,
    val status: VenueBookingStatus,
    val priceMinor: Long,
    val currency: String,
    val stripeCheckoutSessionId: String?,
    val paidAt: LocalDateTime?,
    val createdBy: UUID?,
    val createdAt: LocalDateTime?,
)
