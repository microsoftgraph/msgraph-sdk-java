// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AttendanceRecord;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Attendance Record Request.
 */
public class AttendanceRecordRequest extends BaseRequest<AttendanceRecord> {
	
    /**
     * The request for the AttendanceRecord
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AttendanceRecordRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AttendanceRecord.class);
    }

    /**
     * Gets the AttendanceRecord from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AttendanceRecord> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AttendanceRecord from the service
     *
     * @return the AttendanceRecord from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AttendanceRecord get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AttendanceRecord> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AttendanceRecord delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AttendanceRecord with a source
     *
     * @param sourceAttendanceRecord the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AttendanceRecord> patchAsync(@Nonnull final AttendanceRecord sourceAttendanceRecord) {
        return sendAsync(HttpMethod.PATCH, sourceAttendanceRecord);
    }

    /**
     * Patches this AttendanceRecord with a source
     *
     * @param sourceAttendanceRecord the source object with updates
     * @return the updated AttendanceRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AttendanceRecord patch(@Nonnull final AttendanceRecord sourceAttendanceRecord) throws ClientException {
        return send(HttpMethod.PATCH, sourceAttendanceRecord);
    }

    /**
     * Creates a AttendanceRecord with a new object
     *
     * @param newAttendanceRecord the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AttendanceRecord> postAsync(@Nonnull final AttendanceRecord newAttendanceRecord) {
        return sendAsync(HttpMethod.POST, newAttendanceRecord);
    }

    /**
     * Creates a AttendanceRecord with a new object
     *
     * @param newAttendanceRecord the new object to create
     * @return the created AttendanceRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AttendanceRecord post(@Nonnull final AttendanceRecord newAttendanceRecord) throws ClientException {
        return send(HttpMethod.POST, newAttendanceRecord);
    }

    /**
     * Creates a AttendanceRecord with a new object
     *
     * @param newAttendanceRecord the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AttendanceRecord> putAsync(@Nonnull final AttendanceRecord newAttendanceRecord) {
        return sendAsync(HttpMethod.PUT, newAttendanceRecord);
    }

    /**
     * Creates a AttendanceRecord with a new object
     *
     * @param newAttendanceRecord the object to create/update
     * @return the created AttendanceRecord
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AttendanceRecord put(@Nonnull final AttendanceRecord newAttendanceRecord) throws ClientException {
        return send(HttpMethod.PUT, newAttendanceRecord);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AttendanceRecordRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public AttendanceRecordRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
