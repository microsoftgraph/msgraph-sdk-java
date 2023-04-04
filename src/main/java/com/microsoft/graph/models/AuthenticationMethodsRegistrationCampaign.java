package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationMethodsRegistrationCampaign implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Users and groups of users that are excluded from being prompted to set up the authentication method. */
    private java.util.List<ExcludeTarget> excludeTargets;
    /** Users and groups of users that are prompted to set up the authentication method. */
    private java.util.List<AuthenticationMethodsRegistrationCampaignIncludeTarget> includeTargets;
    /** The OdataType property */
    private String odataType;
    /** Specifies the number of days that the user sees a prompt again if they select 'Not now' and snoozes the prompt. Minimum: 0 days. Maximum: 14 days. If the value is '0', the user is prompted during every MFA attempt. */
    private Integer snoozeDurationInDays;
    /** The state property */
    private AdvancedConfigState state;
    /**
     * Instantiates a new authenticationMethodsRegistrationCampaign and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuthenticationMethodsRegistrationCampaign() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationMethodsRegistrationCampaign
     */
    @javax.annotation.Nonnull
    public static AuthenticationMethodsRegistrationCampaign createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationMethodsRegistrationCampaign();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the excludeTargets property value. Users and groups of users that are excluded from being prompted to set up the authentication method.
     * @return a excludeTarget
     */
    @javax.annotation.Nullable
    public java.util.List<ExcludeTarget> getExcludeTargets() {
        return this.excludeTargets;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("excludeTargets", (n) -> { this.setExcludeTargets(n.getCollectionOfObjectValues(ExcludeTarget::createFromDiscriminatorValue)); });
        deserializerMap.put("includeTargets", (n) -> { this.setIncludeTargets(n.getCollectionOfObjectValues(AuthenticationMethodsRegistrationCampaignIncludeTarget::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("snoozeDurationInDays", (n) -> { this.setSnoozeDurationInDays(n.getIntegerValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(AdvancedConfigState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the includeTargets property value. Users and groups of users that are prompted to set up the authentication method.
     * @return a authenticationMethodsRegistrationCampaignIncludeTarget
     */
    @javax.annotation.Nullable
    public java.util.List<AuthenticationMethodsRegistrationCampaignIncludeTarget> getIncludeTargets() {
        return this.includeTargets;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the snoozeDurationInDays property value. Specifies the number of days that the user sees a prompt again if they select 'Not now' and snoozes the prompt. Minimum: 0 days. Maximum: 14 days. If the value is '0', the user is prompted during every MFA attempt.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSnoozeDurationInDays() {
        return this.snoozeDurationInDays;
    }
    /**
     * Gets the state property value. The state property
     * @return a advancedConfigState
     */
    @javax.annotation.Nullable
    public AdvancedConfigState getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("excludeTargets", this.getExcludeTargets());
        writer.writeCollectionOfObjectValues("includeTargets", this.getIncludeTargets());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("snoozeDurationInDays", this.getSnoozeDurationInDays());
        writer.writeEnumValue("state", this.getState());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the excludeTargets property value. Users and groups of users that are excluded from being prompted to set up the authentication method.
     * @param value Value to set for the excludeTargets property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludeTargets(@javax.annotation.Nullable final java.util.List<ExcludeTarget> value) {
        this.excludeTargets = value;
    }
    /**
     * Sets the includeTargets property value. Users and groups of users that are prompted to set up the authentication method.
     * @param value Value to set for the includeTargets property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludeTargets(@javax.annotation.Nullable final java.util.List<AuthenticationMethodsRegistrationCampaignIncludeTarget> value) {
        this.includeTargets = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the snoozeDurationInDays property value. Specifies the number of days that the user sees a prompt again if they select 'Not now' and snoozes the prompt. Minimum: 0 days. Maximum: 14 days. If the value is '0', the user is prompted during every MFA attempt.
     * @param value Value to set for the snoozeDurationInDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSnoozeDurationInDays(@javax.annotation.Nullable final Integer value) {
        this.snoozeDurationInDays = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final AdvancedConfigState value) {
        this.state = value;
    }
}
