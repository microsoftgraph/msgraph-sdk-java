package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamsTabConfiguration implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Url used for rendering tab contents in Teams. Required.
     */
    private String contentUrl;
    /**
     * Identifier for the entity hosted by the tab provider.
     */
    private String entityId;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Url called by Teams client when a Tab is removed using the Teams Client.
     */
    private String removeUrl;
    /**
     * Url for showing tab contents outside of Teams.
     */
    private String websiteUrl;
    /**
     * Instantiates a new teamsTabConfiguration and sets the default values.
     */
    public TeamsTabConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamsTabConfiguration
     */
    @jakarta.annotation.Nonnull
    public static TeamsTabConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamsTabConfiguration();
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
     * Gets the contentUrl property value. Url used for rendering tab contents in Teams. Required.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getContentUrl() {
        return this.contentUrl;
    }
    /**
     * Gets the entityId property value. Identifier for the entity hosted by the tab provider.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getEntityId() {
        return this.entityId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("contentUrl", (n) -> { this.setContentUrl(n.getStringValue()); });
        deserializerMap.put("entityId", (n) -> { this.setEntityId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("removeUrl", (n) -> { this.setRemoveUrl(n.getStringValue()); });
        deserializerMap.put("websiteUrl", (n) -> { this.setWebsiteUrl(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the removeUrl property value. Url called by Teams client when a Tab is removed using the Teams Client.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRemoveUrl() {
        return this.removeUrl;
    }
    /**
     * Gets the websiteUrl property value. Url for showing tab contents outside of Teams.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getWebsiteUrl() {
        return this.websiteUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("contentUrl", this.getContentUrl());
        writer.writeStringValue("entityId", this.getEntityId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("removeUrl", this.getRemoveUrl());
        writer.writeStringValue("websiteUrl", this.getWebsiteUrl());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the contentUrl property value. Url used for rendering tab contents in Teams. Required.
     * @param value Value to set for the contentUrl property.
     */
    public void setContentUrl(@jakarta.annotation.Nullable final String value) {
        this.contentUrl = value;
    }
    /**
     * Sets the entityId property value. Identifier for the entity hosted by the tab provider.
     * @param value Value to set for the entityId property.
     */
    public void setEntityId(@jakarta.annotation.Nullable final String value) {
        this.entityId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the removeUrl property value. Url called by Teams client when a Tab is removed using the Teams Client.
     * @param value Value to set for the removeUrl property.
     */
    public void setRemoveUrl(@jakarta.annotation.Nullable final String value) {
        this.removeUrl = value;
    }
    /**
     * Sets the websiteUrl property value. Url for showing tab contents outside of Teams.
     * @param value Value to set for the websiteUrl property.
     */
    public void setWebsiteUrl(@jakarta.annotation.Nullable final String value) {
        this.websiteUrl = value;
    }
}
