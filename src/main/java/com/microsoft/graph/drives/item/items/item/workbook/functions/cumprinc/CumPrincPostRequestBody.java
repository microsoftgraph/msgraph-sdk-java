package com.microsoft.graph.drives.item.items.item.workbook.functions.cumprinc;

import com.microsoft.graph.models.Json;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CumPrincPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The endPeriod property
     */
    private Json endPeriod;
    /**
     * The nper property
     */
    private Json nper;
    /**
     * The pv property
     */
    private Json pv;
    /**
     * The rate property
     */
    private Json rate;
    /**
     * The startPeriod property
     */
    private Json startPeriod;
    /**
     * The type property
     */
    private Json type;
    /**
     * Instantiates a new cumPrincPostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CumPrincPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cumPrincPostRequestBody
     */
    @javax.annotation.Nonnull
    public static CumPrincPostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CumPrincPostRequestBody();
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
     * Gets the endPeriod property value. The endPeriod property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getEndPeriod() {
        return this.endPeriod;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("endPeriod", (n) -> { this.setEndPeriod(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("nper", (n) -> { this.setNper(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("pv", (n) -> { this.setPv(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("rate", (n) -> { this.setRate(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("startPeriod", (n) -> { this.setStartPeriod(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getObjectValue(Json::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the nper property value. The nper property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getNper() {
        return this.nper;
    }
    /**
     * Gets the pv property value. The pv property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getPv() {
        return this.pv;
    }
    /**
     * Gets the rate property value. The rate property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getRate() {
        return this.rate;
    }
    /**
     * Gets the startPeriod property value. The startPeriod property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getStartPeriod() {
        return this.startPeriod;
    }
    /**
     * Gets the type property value. The type property
     * @return a Json
     */
    @javax.annotation.Nullable
    public Json getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("endPeriod", this.getEndPeriod());
        writer.writeObjectValue("nper", this.getNper());
        writer.writeObjectValue("pv", this.getPv());
        writer.writeObjectValue("rate", this.getRate());
        writer.writeObjectValue("startPeriod", this.getStartPeriod());
        writer.writeObjectValue("type", this.getType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the endPeriod property value. The endPeriod property
     * @param value Value to set for the endPeriod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndPeriod(@javax.annotation.Nullable final Json value) {
        this.endPeriod = value;
    }
    /**
     * Sets the nper property value. The nper property
     * @param value Value to set for the nper property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNper(@javax.annotation.Nullable final Json value) {
        this.nper = value;
    }
    /**
     * Sets the pv property value. The pv property
     * @param value Value to set for the pv property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPv(@javax.annotation.Nullable final Json value) {
        this.pv = value;
    }
    /**
     * Sets the rate property value. The rate property
     * @param value Value to set for the rate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRate(@javax.annotation.Nullable final Json value) {
        this.rate = value;
    }
    /**
     * Sets the startPeriod property value. The startPeriod property
     * @param value Value to set for the startPeriod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartPeriod(@javax.annotation.Nullable final Json value) {
        this.startPeriod = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final Json value) {
        this.type = value;
    }
}
