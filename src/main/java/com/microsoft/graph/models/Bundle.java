package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Bundle implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * If the bundle is an [album][], then the album property is included
     */
    private Album album;
    /**
     * Number of children contained immediately within this container.
     */
    private Integer childCount;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new bundle and sets the default values.
     */
    public Bundle() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bundle
     */
    @jakarta.annotation.Nonnull
    public static Bundle createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Bundle();
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
     * Gets the album property value. If the bundle is an [album][], then the album property is included
     * @return a album
     */
    @jakarta.annotation.Nullable
    public Album getAlbum() {
        return this.album;
    }
    /**
     * Gets the childCount property value. Number of children contained immediately within this container.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getChildCount() {
        return this.childCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("album", (n) -> { this.setAlbum(n.getObjectValue(Album::createFromDiscriminatorValue)); });
        deserializerMap.put("childCount", (n) -> { this.setChildCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("album", this.getAlbum());
        writer.writeIntegerValue("childCount", this.getChildCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the album property value. If the bundle is an [album][], then the album property is included
     * @param value Value to set for the album property.
     */
    public void setAlbum(@jakarta.annotation.Nullable final Album value) {
        this.album = value;
    }
    /**
     * Sets the childCount property value. Number of children contained immediately within this container.
     * @param value Value to set for the childCount property.
     */
    public void setChildCount(@jakarta.annotation.Nullable final Integer value) {
        this.childCount = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
