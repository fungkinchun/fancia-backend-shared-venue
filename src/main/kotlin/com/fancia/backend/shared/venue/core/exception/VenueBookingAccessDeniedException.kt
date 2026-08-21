package com.fancia.backend.shared.venue.core.exception

import com.fancia.backend.shared.common.core.exception.DomainException
import java.util.UUID

class VenueBookingAccessDeniedException(
    val bookingId: UUID? = null,
    val userId: UUID? = null,
    message: String = "Not allowed to change this venue booking",
    title: String = "Venue Booking Access Denied",
    errorCode: String = "VENUE_BOOKING_ACCESS_DENIED",
) : DomainException(title, message, errorCode)
