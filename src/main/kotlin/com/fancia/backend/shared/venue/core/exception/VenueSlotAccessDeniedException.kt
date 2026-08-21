package com.fancia.backend.shared.venue.core.exception

import com.fancia.backend.shared.common.core.exception.DomainException
import java.util.UUID

class VenueSlotAccessDeniedException(
    val venueId: UUID,
    val userId: UUID,
    title: String = "Venue Slot Access Denied",
    message: String = "User $userId is not allowed to manage slots for venue $venueId",
    errorCode: String = "VENUE_SLOT_ACCESS_DENIED",
) : DomainException(title, message, errorCode)
