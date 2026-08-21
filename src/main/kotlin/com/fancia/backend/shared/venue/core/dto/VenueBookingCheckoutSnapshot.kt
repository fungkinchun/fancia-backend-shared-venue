package com.fancia.backend.shared.venue.core.dto

import com.fancia.backend.shared.venue.core.enums.VenueBookingStatus
import java.util.UUID

data class VenueBookingCheckoutSnapshot(
    val bookingId: UUID,
    val venueId: UUID,
    val slotId: UUID,
    val requesterUserId: UUID,
    val ownerUserId: UUID,
    val status: VenueBookingStatus,
    val priceMinor: Long,
    val currency: String,
    val productName: String,
)
