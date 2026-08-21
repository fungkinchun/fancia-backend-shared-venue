package com.fancia.backend.shared.venue.core.exception

import com.fancia.backend.shared.common.core.exception.DomainException
import java.util.UUID

class VenueSlotInvalidStateException(
    message: String,
    val slotId: UUID? = null,
    title: String = "Venue Slot Invalid State",
    errorCode: String = "VENUE_SLOT_INVALID_STATE",
) : DomainException(title, message, errorCode)
