package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CommsNotification implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The changeType property */
    private ChangeType _changeType;
    /** The OdataType property */
    private String _odataType;
    /** URI of the resource that was changed. */
    private String _resourceUrl;
    /**
     * Instantiates a new commsNotification and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CommsNotification() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.commsNotification");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a commsNotification
     */
    @javax.annotation.Nonnull
    public static CommsNotification createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CommsNotification();
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
     * Gets the changeType property value. The changeType property
     * @return a changeType
     */
    @javax.annotation.Nullable
    public ChangeType getChangeType() {
        return this._changeType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CommsNotification currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(3);
        deserializerMap.put("changeType", (n) -> { currentObject.setChangeType(n.getEnumValue(ChangeType.class)); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("resourceUrl", (n) -> { currentObject.setResourceUrl(n.getStringValue()); });
        return deserializerMap
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
     * Gets the resourceUrl property value. URI of the resource that was changed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getResourceUrl() {
        return this._resourceUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("changeType", this.getChangeType());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("resourceUrl", this.getResourceUrl());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the changeType property value. The changeType property
     * @param value Value to set for the changeType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChangeType(@javax.annotation.Nullable final ChangeType value) {
        this._changeType = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the resourceUrl property value. URI of the resource that was changed.
     * @param value Value to set for the resourceUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceUrl(@javax.annotation.Nullable final String value) {
        this._resourceUrl = value;
    }
}
