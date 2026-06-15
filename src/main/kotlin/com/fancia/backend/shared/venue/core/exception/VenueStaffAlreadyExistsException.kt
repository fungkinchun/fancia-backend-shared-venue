package com.fancia.backend.shared.venue.core.exception

import com.fancia.backend.shared.common.core.exception.DomainException
import java.util.*

class VenueStaffAlreadyExistsException(
    val venueId: UUID,
    val userId: UUID,
    title: String = "Venue staff already exists",
    message: String = "User $userId already joined venue $venueId",
    errorCode: String = "VENUE_STAFF_ALREADY_EXISTS"
) : DomainException(title, message, errorCode)
