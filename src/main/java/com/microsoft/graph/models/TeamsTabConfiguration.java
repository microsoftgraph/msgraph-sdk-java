package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamsTabConfiguration implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Url used for rendering tab contents in Teams. Required. */
    private String _contentUrl;
    /** Identifier for the entity hosted by the tab provider. */
    private String _entityId;
    /** The OdataType property */
    private String _odataType;
    /** Url called by Teams client when a Tab is removed using the Teams Client. */
    private String _removeUrl;
    /** Url for showing tab contents outside of Teams. */
    private String _websiteUrl;
    /**
     * Instantiates a new teamsTabConfiguration and sets the default values.
     * @return a void
     */
    public TeamsTabConfiguration() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.teamsTabConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamsTabConfiguration
     */
    @javax.annotation.Nonnull
    public static TeamsTabConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamsTabConfiguration();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the contentUrl property value. Url used for rendering tab contents in Teams. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContentUrl() {
        return this._contentUrl;
    }
    /**
     * Gets the entityId property value. Identifier for the entity hosted by the tab provider.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEntityId() {
        return this._entityId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamsTabConfiguration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(5) {{
            this.put("contentUrl", (n) -> { currentObject.setContentUrl(n.getStringValue()); });
            this.put("entityId", (n) -> { currentObject.setEntityId(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("removeUrl", (n) -> { currentObject.setRemoveUrl(n.getStringValue()); });
            this.put("websiteUrl", (n) -> { currentObject.setWebsiteUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the removeUrl property value. Url called by Teams client when a Tab is removed using the Teams Client.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRemoveUrl() {
        return this._removeUrl;
    }
    /**
     * Gets the websiteUrl property value. Url for showing tab contents outside of Teams.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getWebsiteUrl() {
        return this._websiteUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the contentUrl property value. Url used for rendering tab contents in Teams. Required.
     * @param value Value to set for the contentUrl property.
     * @return a void
     */
    public void setContentUrl(@javax.annotation.Nullable final String value) {
        this._contentUrl = value;
    }
    /**
     * Sets the entityId property value. Identifier for the entity hosted by the tab provider.
     * @param value Value to set for the entityId property.
     * @return a void
     */
    public void setEntityId(@javax.annotation.Nullable final String value) {
        this._entityId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the removeUrl property value. Url called by Teams client when a Tab is removed using the Teams Client.
     * @param value Value to set for the removeUrl property.
     * @return a void
     */
    public void setRemoveUrl(@javax.annotation.Nullable final String value) {
        this._removeUrl = value;
    }
    /**
     * Sets the websiteUrl property value. Url for showing tab contents outside of Teams.
     * @param value Value to set for the websiteUrl property.
     * @return a void
     */
    public void setWebsiteUrl(@javax.annotation.Nullable final String value) {
        this._websiteUrl = value;
    }
}
