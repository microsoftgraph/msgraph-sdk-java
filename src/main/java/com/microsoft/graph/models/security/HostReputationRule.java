package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class HostReputationRule implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The description of the rule that gives more context.
     */
    private String description;
    /**
     * The name of the rule.
     */
    private String name;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Link to a web page with details related to this rule.
     */
    private String relatedDetailsUrl;
    /**
     * The severity property
     */
    private HostReputationRuleSeverity severity;
    /**
     * Instantiates a new hostReputationRule and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public HostReputationRule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a hostReputationRule
     */
    @javax.annotation.Nonnull
    public static HostReputationRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HostReputationRule();
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
     * Gets the description property value. The description of the rule that gives more context.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("relatedDetailsUrl", (n) -> { this.setRelatedDetailsUrl(n.getStringValue()); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getEnumValue(HostReputationRuleSeverity.class)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name of the rule.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
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
     * Gets the relatedDetailsUrl property value. Link to a web page with details related to this rule.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRelatedDetailsUrl() {
        return this.relatedDetailsUrl;
    }
    /**
     * Gets the severity property value. The severity property
     * @return a HostReputationRuleSeverity
     */
    @javax.annotation.Nullable
    public HostReputationRuleSeverity getSeverity() {
        return this.severity;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("relatedDetailsUrl", this.getRelatedDetailsUrl());
        writer.writeEnumValue("severity", this.getSeverity());
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
     * Sets the description property value. The description of the rule that gives more context.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the name property value. The name of the rule.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
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
     * Sets the relatedDetailsUrl property value. Link to a web page with details related to this rule.
     * @param value Value to set for the relatedDetailsUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRelatedDetailsUrl(@javax.annotation.Nullable final String value) {
        this.relatedDetailsUrl = value;
    }
    /**
     * Sets the severity property value. The severity property
     * @param value Value to set for the severity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSeverity(@javax.annotation.Nullable final HostReputationRuleSeverity value) {
        this.severity = value;
    }
}
