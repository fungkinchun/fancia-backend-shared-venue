package com.fancia.backend.shared.venue.core.exception

import com.fancia.backend.shared.common.core.exception.DomainException

class VenueStaffStatusChangeAccessDeniedException(
    title: String = "Access denied for changing venue staff status",
    message: String = "Only admins can change status (except withdrawal)",
    errorCode: String = "VENUE_STAFF_STATUS_CHANGE_ACCESS_DENIED"
) : DomainException(title, message, errorCode)
