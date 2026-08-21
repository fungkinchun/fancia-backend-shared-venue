package com.fancia.backend.shared.venue.core.exception

import com.fancia.backend.shared.common.core.exception.DomainException
import java.util.UUID

class VenueBookingNotFoundException(
    val bookingId: UUID? = null,
    message: String = "Venue booking not found",
    title: String = "Venue Booking Not Found",
    errorCode: String = "VENUE_BOOKING_NOT_FOUND",
) : DomainException(title, message, errorCode)
