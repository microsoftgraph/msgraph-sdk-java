// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Verify Windows Enrollment Auto Discovery Parameter Set.
 */
public class DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryParameterSet {
    /**
     * The domain Name.
     * 
     */
    @SerializedName(value = "domainName", alternate = {"DomainName"})
    @Expose
	@Nullable
    public String domainName;


    /**
     * Instiaciates a new DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryParameterSet
     */
    public DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryParameterSet() {}
    /**
     * Instiaciates a new DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryParameterSet(@Nonnull final DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryParameterSetBuilder builder) {
        this.domainName = builder.domainName;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryParameterSetBuilder newBuilder() {
        return new DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryParameterSetBuilder();
    }
    /**
     * Fluent builder for the DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryParameterSet
     */
    public static final class DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryParameterSetBuilder {
        /**
         * The domainName parameter value
         */
        @Nullable
        protected String domainName;
        /**
         * Sets the DomainName
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryParameterSetBuilder withDomainName(@Nullable final String val) {
            this.domainName = val;
            return this;
        }
        /**
         * Instanciates a new DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryParameterSetBuilder
         */
        @Nullable
        protected DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryParameterSet build() {
            return new DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.domainName != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("domainName", domainName));
        }
        return result;
    }
}