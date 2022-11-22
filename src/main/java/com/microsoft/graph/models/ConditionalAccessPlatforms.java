package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConditionalAccessPlatforms implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Possible values are: android, iOS, windows, windowsPhone, macOS, linux, all, unknownFutureValue. */
    private java.util.List<ConditionalAccessDevicePlatform> _excludePlatforms;
    /** Possible values are: android, iOS, windows, windowsPhone, macOS, linux, all, unknownFutureValue. */
    private java.util.List<ConditionalAccessDevicePlatform> _includePlatforms;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new conditionalAccessPlatforms and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConditionalAccessPlatforms() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a conditionalAccessPlatforms
     */
    @javax.annotation.Nonnull
    public static ConditionalAccessPlatforms createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessPlatforms();
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
     * Gets the excludePlatforms property value. Possible values are: android, iOS, windows, windowsPhone, macOS, linux, all, unknownFutureValue.
     * @return a conditionalAccessDevicePlatform
     */
    @javax.annotation.Nullable
    public java.util.List<ConditionalAccessDevicePlatform> getExcludePlatforms() {
        return this._excludePlatforms;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(3);
        deserializerMap.put("excludePlatforms", (n) -> { this.setExcludePlatforms(n.getCollectionOfEnumValues(ConditionalAccessDevicePlatform.class)); });
        deserializerMap.put("includePlatforms", (n) -> { this.setIncludePlatforms(n.getCollectionOfEnumValues(ConditionalAccessDevicePlatform.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the includePlatforms property value. Possible values are: android, iOS, windows, windowsPhone, macOS, linux, all, unknownFutureValue.
     * @return a conditionalAccessDevicePlatform
     */
    @javax.annotation.Nullable
    public java.util.List<ConditionalAccessDevicePlatform> getIncludePlatforms() {
        return this._includePlatforms;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfEnumValues("excludePlatforms", this.getExcludePlatforms());
        writer.writeCollectionOfEnumValues("includePlatforms", this.getIncludePlatforms());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the excludePlatforms property value. Possible values are: android, iOS, windows, windowsPhone, macOS, linux, all, unknownFutureValue.
     * @param value Value to set for the excludePlatforms property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludePlatforms(@javax.annotation.Nullable final java.util.List<ConditionalAccessDevicePlatform> value) {
        this._excludePlatforms = value;
    }
    /**
     * Sets the includePlatforms property value. Possible values are: android, iOS, windows, windowsPhone, macOS, linux, all, unknownFutureValue.
     * @param value Value to set for the includePlatforms property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludePlatforms(@javax.annotation.Nullable final java.util.List<ConditionalAccessDevicePlatform> value) {
        this._includePlatforms = value;
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
}
