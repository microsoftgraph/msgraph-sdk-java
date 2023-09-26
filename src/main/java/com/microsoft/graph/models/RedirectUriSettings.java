package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RedirectUriSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The index property
     */
    private Integer index;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The uri property
     */
    private String uri;
    /**
     * Instantiates a new RedirectUriSettings and sets the default values.
     */
    public RedirectUriSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RedirectUriSettings
     */
    @jakarta.annotation.Nonnull
    public static RedirectUriSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RedirectUriSettings();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("index", (n) -> { this.setIndex(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("uri", (n) -> { this.setUri(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the index property value. The index property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getIndex() {
        return this.index;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the uri property value. The uri property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUri() {
        return this.uri;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("index", this.getIndex());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("uri", this.getUri());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the index property value. The index property
     * @param value Value to set for the index property.
     */
    public void setIndex(@jakarta.annotation.Nullable final Integer value) {
        this.index = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the uri property value. The uri property
     * @param value Value to set for the uri property.
     */
    public void setUri(@jakarta.annotation.Nullable final String value) {
        this.uri = value;
    }
}
