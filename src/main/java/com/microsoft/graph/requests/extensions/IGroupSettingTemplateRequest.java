// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GroupSettingTemplate;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Setting Template Request.
 */
public interface IGroupSettingTemplateRequest extends IHttpRequest {

    /**
     * Gets the GroupSettingTemplate from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super GroupSettingTemplate> callback);

    /**
     * Gets the GroupSettingTemplate from the service
     *
     * @return the GroupSettingTemplate from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupSettingTemplate get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super GroupSettingTemplate> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this GroupSettingTemplate with a source
     *
     * @param sourceGroupSettingTemplate the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final GroupSettingTemplate sourceGroupSettingTemplate, final ICallback<? super GroupSettingTemplate> callback);

    /**
     * Patches this GroupSettingTemplate with a source
     *
     * @param sourceGroupSettingTemplate the source object with updates
     * @return the updated GroupSettingTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupSettingTemplate patch(final GroupSettingTemplate sourceGroupSettingTemplate) throws ClientException;

    /**
     * Posts a GroupSettingTemplate with a new object
     *
     * @param newGroupSettingTemplate the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final GroupSettingTemplate newGroupSettingTemplate, final ICallback<? super GroupSettingTemplate> callback);

    /**
     * Posts a GroupSettingTemplate with a new object
     *
     * @param newGroupSettingTemplate the new object to create
     * @return the created GroupSettingTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupSettingTemplate post(final GroupSettingTemplate newGroupSettingTemplate) throws ClientException;

    /**
     * Posts a GroupSettingTemplate with a new object
     *
     * @param newGroupSettingTemplate the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final GroupSettingTemplate newGroupSettingTemplate, final ICallback<? super GroupSettingTemplate> callback);

    /**
     * Posts a GroupSettingTemplate with a new object
     *
     * @param newGroupSettingTemplate the object to create/update
     * @return the created GroupSettingTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupSettingTemplate put(final GroupSettingTemplate newGroupSettingTemplate) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IGroupSettingTemplateRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IGroupSettingTemplateRequest expand(final String value);

}
