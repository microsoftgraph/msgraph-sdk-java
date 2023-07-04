package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CallRoute implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The final property
     */
    private IdentitySet finalEscaped;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The original property
     */
    private IdentitySet original;
    /**
     * The routingType property
     */
    private RoutingType routingType;
    /**
     * Instantiates a new callRoute and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CallRoute() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a callRoute
     */
    @javax.annotation.Nonnull
    public static CallRoute createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CallRoute();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("final", (n) -> { this.setFinal(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("original", (n) -> { this.setOriginal(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("routingType", (n) -> { this.setRoutingType(n.getEnumValue(RoutingType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the final property value. The final property
     * @return a IdentitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getFinal() {
        return this.finalEscaped;
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
     * Gets the original property value. The original property
     * @return a IdentitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getOriginal() {
        return this.original;
    }
    /**
     * Gets the routingType property value. The routingType property
     * @return a RoutingType
     */
    @javax.annotation.Nullable
    public RoutingType getRoutingType() {
        return this.routingType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("final", this.getFinal());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("original", this.getOriginal());
        writer.writeEnumValue("routingType", this.getRoutingType());
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
     * Sets the final property value. The final property
     * @param value Value to set for the final property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFinal(@javax.annotation.Nullable final IdentitySet value) {
        this.finalEscaped = value;
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
     * Sets the original property value. The original property
     * @param value Value to set for the original property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOriginal(@javax.annotation.Nullable final IdentitySet value) {
        this.original = value;
    }
    /**
     * Sets the routingType property value. The routingType property
     * @param value Value to set for the routingType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoutingType(@javax.annotation.Nullable final RoutingType value) {
        this.routingType = value;
    }
}
