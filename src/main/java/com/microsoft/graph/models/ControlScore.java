package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ControlScore implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Control action category (Identity, Data, Device, Apps, Infrastructure). */
    private String controlCategory;
    /** Control unique name. */
    private String controlName;
    /** Description of the control. */
    private String description;
    /** The OdataType property */
    private String odataType;
    /** Tenant achieved score for the control (it varies day by day depending on tenant operations on the control). */
    private Double score;
    /**
     * Instantiates a new controlScore and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ControlScore() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a controlScore
     */
    @javax.annotation.Nonnull
    public static ControlScore createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ControlScore();
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
     * Gets the controlCategory property value. Control action category (Identity, Data, Device, Apps, Infrastructure).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getControlCategory() {
        return this.controlCategory;
    }
    /**
     * Gets the controlName property value. Control unique name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getControlName() {
        return this.controlName;
    }
    /**
     * Gets the description property value. Description of the control.
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
        deserializerMap.put("controlCategory", (n) -> { this.setControlCategory(n.getStringValue()); });
        deserializerMap.put("controlName", (n) -> { this.setControlName(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("score", (n) -> { this.setScore(n.getDoubleValue()); });
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
     * Gets the score property value. Tenant achieved score for the control (it varies day by day depending on tenant operations on the control).
     * @return a double
     */
    @javax.annotation.Nullable
    public Double getScore() {
        return this.score;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("controlCategory", this.getControlCategory());
        writer.writeStringValue("controlName", this.getControlName());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeDoubleValue("score", this.getScore());
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
     * Sets the controlCategory property value. Control action category (Identity, Data, Device, Apps, Infrastructure).
     * @param value Value to set for the controlCategory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setControlCategory(@javax.annotation.Nullable final String value) {
        this.controlCategory = value;
    }
    /**
     * Sets the controlName property value. Control unique name.
     * @param value Value to set for the controlName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setControlName(@javax.annotation.Nullable final String value) {
        this.controlName = value;
    }
    /**
     * Sets the description property value. Description of the control.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
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
     * Sets the score property value. Tenant achieved score for the control (it varies day by day depending on tenant operations on the control).
     * @param value Value to set for the score property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScore(@javax.annotation.Nullable final Double value) {
        this.score = value;
    }
}
