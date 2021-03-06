/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2020_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains information about an API error.
 */
public class ErrorResponse {
    /**
     * Describes a particular API error with an error code and a message.
     */
    @JsonProperty(value = "error")
    private ErrorResponseBody error;

    /**
     * Get describes a particular API error with an error code and a message.
     *
     * @return the error value
     */
    public ErrorResponseBody error() {
        return this.error;
    }

    /**
     * Set describes a particular API error with an error code and a message.
     *
     * @param error the error value to set
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse withError(ErrorResponseBody error) {
        this.error = error;
        return this;
    }

}
