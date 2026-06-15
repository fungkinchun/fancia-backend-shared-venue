package com.fancia.backend.shared.venue.core.exception

import com.fancia.backend.shared.common.core.exception.DomainException
import java.util.*

class VenueNotFoundException(
    val venueId: UUID,
    title: String = "Venue not found",
    message: String = "Venue not found with id: $venueId",
    errorCode: String = "VENUE_NOT_FOUND"
) : DomainException(title, message, errorCode)
