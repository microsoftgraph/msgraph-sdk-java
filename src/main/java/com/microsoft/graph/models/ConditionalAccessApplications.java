package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConditionalAccessApplications implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The applicationFilter property
     */
    private ConditionalAccessFilter applicationFilter;
    /**
     * Can be one of the following:  The list of client IDs (appId) explicitly excluded from the policy. Office365 - For the list of apps included in Office365, see Conditional Access target apps: Office 365
     */
    private java.util.List<String> excludeApplications;
    /**
     * Can be one of the following:  The list of client IDs (appId) the policy applies to, unless explicitly excluded (in excludeApplications)  All  Office365 - For the list of apps included in Office365, see Conditional Access target apps: Office 365
     */
    private java.util.List<String> includeApplications;
    /**
     * The includeAuthenticationContextClassReferences property
     */
    private java.util.List<String> includeAuthenticationContextClassReferences;
    /**
     * User actions to include. Supported values are urn:user:registersecurityinfo and urn:user:registerdevice
     */
    private java.util.List<String> includeUserActions;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new conditionalAccessApplications and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessApplications() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a conditionalAccessApplications
     */
    @jakarta.annotation.Nonnull
    public static ConditionalAccessApplications createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessApplications();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the applicationFilter property value. The applicationFilter property
     * @return a conditionalAccessFilter
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessFilter getApplicationFilter() {
        return this.applicationFilter;
    }
    /**
     * Gets the excludeApplications property value. Can be one of the following:  The list of client IDs (appId) explicitly excluded from the policy. Office365 - For the list of apps included in Office365, see Conditional Access target apps: Office 365
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getExcludeApplications() {
        return this.excludeApplications;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("applicationFilter", (n) -> { this.setApplicationFilter(n.getObjectValue(ConditionalAccessFilter::createFromDiscriminatorValue)); });
        deserializerMap.put("excludeApplications", (n) -> { this.setExcludeApplications(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("includeApplications", (n) -> { this.setIncludeApplications(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("includeAuthenticationContextClassReferences", (n) -> { this.setIncludeAuthenticationContextClassReferences(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("includeUserActions", (n) -> { this.setIncludeUserActions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the includeApplications property value. Can be one of the following:  The list of client IDs (appId) the policy applies to, unless explicitly excluded (in excludeApplications)  All  Office365 - For the list of apps included in Office365, see Conditional Access target apps: Office 365
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIncludeApplications() {
        return this.includeApplications;
    }
    /**
     * Gets the includeAuthenticationContextClassReferences property value. The includeAuthenticationContextClassReferences property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIncludeAuthenticationContextClassReferences() {
        return this.includeAuthenticationContextClassReferences;
    }
    /**
     * Gets the includeUserActions property value. User actions to include. Supported values are urn:user:registersecurityinfo and urn:user:registerdevice
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIncludeUserActions() {
        return this.includeUserActions;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("applicationFilter", this.getApplicationFilter());
        writer.writeCollectionOfPrimitiveValues("excludeApplications", this.getExcludeApplications());
        writer.writeCollectionOfPrimitiveValues("includeApplications", this.getIncludeApplications());
        writer.writeCollectionOfPrimitiveValues("includeAuthenticationContextClassReferences", this.getIncludeAuthenticationContextClassReferences());
        writer.writeCollectionOfPrimitiveValues("includeUserActions", this.getIncludeUserActions());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the applicationFilter property value. The applicationFilter property
     * @param value Value to set for the applicationFilter property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setApplicationFilter(@jakarta.annotation.Nullable final ConditionalAccessFilter value) {
        this.applicationFilter = value;
    }
    /**
     * Sets the excludeApplications property value. Can be one of the following:  The list of client IDs (appId) explicitly excluded from the policy. Office365 - For the list of apps included in Office365, see Conditional Access target apps: Office 365
     * @param value Value to set for the excludeApplications property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setExcludeApplications(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.excludeApplications = value;
    }
    /**
     * Sets the includeApplications property value. Can be one of the following:  The list of client IDs (appId) the policy applies to, unless explicitly excluded (in excludeApplications)  All  Office365 - For the list of apps included in Office365, see Conditional Access target apps: Office 365
     * @param value Value to set for the includeApplications property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIncludeApplications(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.includeApplications = value;
    }
    /**
     * Sets the includeAuthenticationContextClassReferences property value. The includeAuthenticationContextClassReferences property
     * @param value Value to set for the includeAuthenticationContextClassReferences property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIncludeAuthenticationContextClassReferences(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.includeAuthenticationContextClassReferences = value;
    }
    /**
     * Sets the includeUserActions property value. User actions to include. Supported values are urn:user:registersecurityinfo and urn:user:registerdevice
     * @param value Value to set for the includeUserActions property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setIncludeUserActions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.includeUserActions = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
