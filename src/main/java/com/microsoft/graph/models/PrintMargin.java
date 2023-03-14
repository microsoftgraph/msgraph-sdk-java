package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PrintMargin implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The margin in microns from the bottom edge. */
    private Integer bottom;
    /** The margin in microns from the left edge. */
    private Integer left;
    /** The OdataType property */
    private String odataType;
    /** The margin in microns from the right edge. */
    private Integer right;
    /** The margin in microns from the top edge. */
    private Integer top;
    /**
     * Instantiates a new printMargin and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PrintMargin() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a printMargin
     */
    @javax.annotation.Nonnull
    public static PrintMargin createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PrintMargin();
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
     * Gets the bottom property value. The margin in microns from the bottom edge.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getBottom() {
        return this.bottom;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("bottom", (n) -> { this.setBottom(n.getIntegerValue()); });
        deserializerMap.put("left", (n) -> { this.setLeft(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("right", (n) -> { this.setRight(n.getIntegerValue()); });
        deserializerMap.put("top", (n) -> { this.setTop(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the left property value. The margin in microns from the left edge.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getLeft() {
        return this.left;
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
     * Gets the right property value. The margin in microns from the right edge.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRight() {
        return this.right;
    }
    /**
     * Gets the top property value. The margin in microns from the top edge.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTop() {
        return this.top;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("bottom", this.getBottom());
        writer.writeIntegerValue("left", this.getLeft());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("right", this.getRight());
        writer.writeIntegerValue("top", this.getTop());
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
     * Sets the bottom property value. The margin in microns from the bottom edge.
     * @param value Value to set for the bottom property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBottom(@javax.annotation.Nullable final Integer value) {
        this.bottom = value;
    }
    /**
     * Sets the left property value. The margin in microns from the left edge.
     * @param value Value to set for the left property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLeft(@javax.annotation.Nullable final Integer value) {
        this.left = value;
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
     * Sets the right property value. The margin in microns from the right edge.
     * @param value Value to set for the right property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRight(@javax.annotation.Nullable final Integer value) {
        this.right = value;
    }
    /**
     * Sets the top property value. The margin in microns from the top edge.
     * @param value Value to set for the top property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTop(@javax.annotation.Nullable final Integer value) {
        this.top = value;
    }
}
