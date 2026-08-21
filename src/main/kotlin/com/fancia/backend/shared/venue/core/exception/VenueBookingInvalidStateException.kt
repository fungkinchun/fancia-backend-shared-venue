package com.fancia.backend.shared.venue.core.exception

import com.fancia.backend.shared.common.core.exception.DomainException
import java.util.UUID

class VenueBookingInvalidStateException(
    message: String,
    val bookingId: UUID? = null,
    title: String = "Venue Booking Invalid State",
    errorCode: String = "VENUE_BOOKING_INVALID_STATE",
) : DomainException(title, message, errorCode)
