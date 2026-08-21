package com.fancia.backend.shared.venue.core.exception

import com.fancia.backend.shared.common.core.exception.DomainException
import java.util.UUID

class VenueSlotNotFoundException(
    val slotId: UUID,
    title: String = "Venue Slot Not Found",
    message: String = "Venue slot not found with id: $slotId",
    errorCode: String = "VENUE_SLOT_NOT_FOUND",
) : DomainException(title, message, errorCode)
