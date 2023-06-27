package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ItemActionStat implements AdditionalDataHolder, Parsable {
    /**
     * The number of times the action took place. Read-only.
     */
    private Integer actionCount;
    /**
     * The number of distinct actors that performed the action. Read-only.
     */
    private Integer actorCount;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new itemActionStat and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ItemActionStat() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a itemActionStat
     */
    @javax.annotation.Nonnull
    public static ItemActionStat createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemActionStat();
    }
    /**
     * Gets the actionCount property value. The number of times the action took place. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getActionCount() {
        return this.actionCount;
    }
    /**
     * Gets the actorCount property value. The number of distinct actors that performed the action. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getActorCount() {
        return this.actorCount;
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("actionCount", (n) -> { this.setActionCount(n.getIntegerValue()); });
        deserializerMap.put("actorCount", (n) -> { this.setActorCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("actionCount", this.getActionCount());
        writer.writeIntegerValue("actorCount", this.getActorCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the actionCount property value. The number of times the action took place. Read-only.
     * @param value Value to set for the actionCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActionCount(@javax.annotation.Nullable final Integer value) {
        this.actionCount = value;
    }
    /**
     * Sets the actorCount property value. The number of distinct actors that performed the action. Read-only.
     * @param value Value to set for the actorCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActorCount(@javax.annotation.Nullable final Integer value) {
        this.actorCount = value;
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
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
