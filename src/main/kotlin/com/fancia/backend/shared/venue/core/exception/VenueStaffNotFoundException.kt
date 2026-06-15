package com.fancia.backend.shared.venue.core.exception

import com.fancia.backend.shared.common.core.exception.DomainException
import java.util.*

class VenueStaffNotFoundException(
    val venueId: UUID,
    val userId: UUID,
    title: String = "Venue staff not found",
    message: String = "Venue staff not found with venueId: $venueId userId: $userId",
    errorCode: String = "VENUE_STAFF_NOT_FOUND"
) : DomainException(title, message, errorCode)
