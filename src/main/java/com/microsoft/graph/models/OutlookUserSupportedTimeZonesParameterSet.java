// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.TimeZoneInformation;
import com.microsoft.graph.models.TimeZoneStandard;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Outlook User Supported Time Zones Parameter Set.
 */
public class OutlookUserSupportedTimeZonesParameterSet {
    /**
     * The time Zone Standard.
     * 
     */
    @SerializedName(value = "timeZoneStandard", alternate = {"TimeZoneStandard"})
    @Expose
	@Nullable
    public TimeZoneStandard timeZoneStandard;


    /**
     * Instiaciates a new OutlookUserSupportedTimeZonesParameterSet
     */
    public OutlookUserSupportedTimeZonesParameterSet() {}
    /**
     * Instiaciates a new OutlookUserSupportedTimeZonesParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected OutlookUserSupportedTimeZonesParameterSet(@Nonnull final OutlookUserSupportedTimeZonesParameterSetBuilder builder) {
        this.timeZoneStandard = builder.timeZoneStandard;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static OutlookUserSupportedTimeZonesParameterSetBuilder newBuilder() {
        return new OutlookUserSupportedTimeZonesParameterSetBuilder();
    }
    /**
     * Fluent builder for the OutlookUserSupportedTimeZonesParameterSet
     */
    public static final class OutlookUserSupportedTimeZonesParameterSetBuilder {
        /**
         * The timeZoneStandard parameter value
         */
        @Nullable
        protected TimeZoneStandard timeZoneStandard;
        /**
         * Sets the TimeZoneStandard
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public OutlookUserSupportedTimeZonesParameterSetBuilder withTimeZoneStandard(@Nullable final TimeZoneStandard val) {
            this.timeZoneStandard = val;
            return this;
        }
        /**
         * Instanciates a new OutlookUserSupportedTimeZonesParameterSetBuilder
         */
        @Nullable
        protected OutlookUserSupportedTimeZonesParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public OutlookUserSupportedTimeZonesParameterSet build() {
            return new OutlookUserSupportedTimeZonesParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.timeZoneStandard != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("timeZoneStandard", timeZoneStandard));
        }
        return result;
    }
}