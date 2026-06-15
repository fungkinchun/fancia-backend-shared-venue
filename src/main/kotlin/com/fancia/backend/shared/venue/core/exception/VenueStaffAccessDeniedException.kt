package com.fancia.backend.shared.venue.core.exception

import com.fancia.backend.shared.common.core.exception.DomainException
import java.util.*

class VenueStaffAccessDeniedException(
    val venueId: UUID,
    val userId: UUID,
    title: String = "Access denied to create venue staff",
    message: String = "Only admins or the staff member themselves can create staff in venue $venueId for user $userId",
    errorCode: String = "VENUE_STAFF_ACCESS_DENIED"
) : DomainException(title, message, errorCode)
