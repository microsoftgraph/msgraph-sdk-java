package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConditionalAccessSessionControls implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Session control to enforce application restrictions. Only Exchange Online and Sharepoint Online support this session control. */
    private ApplicationEnforcedRestrictionsSessionControl applicationEnforcedRestrictions;
    /** Session control to apply cloud app security. */
    private CloudAppSecuritySessionControl cloudAppSecurity;
    /** Session control that determines whether it is acceptable for Azure AD to extend existing sessions based on information collected prior to an outage or not. */
    private Boolean disableResilienceDefaults;
    /** The OdataType property */
    private String odataType;
    /** Session control to define whether to persist cookies or not. All apps should be selected for this session control to work correctly. */
    private PersistentBrowserSessionControl persistentBrowser;
    /** Session control to enforce signin frequency. */
    private SignInFrequencySessionControl signInFrequency;
    /**
     * Instantiates a new conditionalAccessSessionControls and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConditionalAccessSessionControls() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a conditionalAccessSessionControls
     */
    @javax.annotation.Nonnull
    public static ConditionalAccessSessionControls createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessSessionControls();
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
     * Gets the applicationEnforcedRestrictions property value. Session control to enforce application restrictions. Only Exchange Online and Sharepoint Online support this session control.
     * @return a applicationEnforcedRestrictionsSessionControl
     */
    @javax.annotation.Nullable
    public ApplicationEnforcedRestrictionsSessionControl getApplicationEnforcedRestrictions() {
        return this.applicationEnforcedRestrictions;
    }
    /**
     * Gets the cloudAppSecurity property value. Session control to apply cloud app security.
     * @return a cloudAppSecuritySessionControl
     */
    @javax.annotation.Nullable
    public CloudAppSecuritySessionControl getCloudAppSecurity() {
        return this.cloudAppSecurity;
    }
    /**
     * Gets the disableResilienceDefaults property value. Session control that determines whether it is acceptable for Azure AD to extend existing sessions based on information collected prior to an outage or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisableResilienceDefaults() {
        return this.disableResilienceDefaults;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("applicationEnforcedRestrictions", (n) -> { this.setApplicationEnforcedRestrictions(n.getObjectValue(ApplicationEnforcedRestrictionsSessionControl::createFromDiscriminatorValue)); });
        deserializerMap.put("cloudAppSecurity", (n) -> { this.setCloudAppSecurity(n.getObjectValue(CloudAppSecuritySessionControl::createFromDiscriminatorValue)); });
        deserializerMap.put("disableResilienceDefaults", (n) -> { this.setDisableResilienceDefaults(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("persistentBrowser", (n) -> { this.setPersistentBrowser(n.getObjectValue(PersistentBrowserSessionControl::createFromDiscriminatorValue)); });
        deserializerMap.put("signInFrequency", (n) -> { this.setSignInFrequency(n.getObjectValue(SignInFrequencySessionControl::createFromDiscriminatorValue)); });
        return deserializerMap;
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
     * Gets the persistentBrowser property value. Session control to define whether to persist cookies or not. All apps should be selected for this session control to work correctly.
     * @return a persistentBrowserSessionControl
     */
    @javax.annotation.Nullable
    public PersistentBrowserSessionControl getPersistentBrowser() {
        return this.persistentBrowser;
    }
    /**
     * Gets the signInFrequency property value. Session control to enforce signin frequency.
     * @return a signInFrequencySessionControl
     */
    @javax.annotation.Nullable
    public SignInFrequencySessionControl getSignInFrequency() {
        return this.signInFrequency;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("applicationEnforcedRestrictions", this.getApplicationEnforcedRestrictions());
        writer.writeObjectValue("cloudAppSecurity", this.getCloudAppSecurity());
        writer.writeBooleanValue("disableResilienceDefaults", this.getDisableResilienceDefaults());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("persistentBrowser", this.getPersistentBrowser());
        writer.writeObjectValue("signInFrequency", this.getSignInFrequency());
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
     * Sets the applicationEnforcedRestrictions property value. Session control to enforce application restrictions. Only Exchange Online and Sharepoint Online support this session control.
     * @param value Value to set for the applicationEnforcedRestrictions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationEnforcedRestrictions(@javax.annotation.Nullable final ApplicationEnforcedRestrictionsSessionControl value) {
        this.applicationEnforcedRestrictions = value;
    }
    /**
     * Sets the cloudAppSecurity property value. Session control to apply cloud app security.
     * @param value Value to set for the cloudAppSecurity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudAppSecurity(@javax.annotation.Nullable final CloudAppSecuritySessionControl value) {
        this.cloudAppSecurity = value;
    }
    /**
     * Sets the disableResilienceDefaults property value. Session control that determines whether it is acceptable for Azure AD to extend existing sessions based on information collected prior to an outage or not.
     * @param value Value to set for the disableResilienceDefaults property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisableResilienceDefaults(@javax.annotation.Nullable final Boolean value) {
        this.disableResilienceDefaults = value;
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
     * Sets the persistentBrowser property value. Session control to define whether to persist cookies or not. All apps should be selected for this session control to work correctly.
     * @param value Value to set for the persistentBrowser property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPersistentBrowser(@javax.annotation.Nullable final PersistentBrowserSessionControl value) {
        this.persistentBrowser = value;
    }
    /**
     * Sets the signInFrequency property value. Session control to enforce signin frequency.
     * @param value Value to set for the signInFrequency property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSignInFrequency(@javax.annotation.Nullable final SignInFrequencySessionControl value) {
        this.signInFrequency = value;
    }
}
