package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConditionalAccessLocations implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Location IDs excluded from scope of policy.
     */
    private java.util.List<String> excludeLocations;
    /**
     * Location IDs in scope of policy unless explicitly excluded, All, or AllTrusted.
     */
    private java.util.List<String> includeLocations;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new ConditionalAccessLocations and sets the default values.
     */
    public ConditionalAccessLocations() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConditionalAccessLocations
     */
    @jakarta.annotation.Nonnull
    public static ConditionalAccessLocations createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessLocations();
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
     * Gets the excludeLocations property value. Location IDs excluded from scope of policy.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getExcludeLocations() {
        return this.excludeLocations;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("excludeLocations", (n) -> { this.setExcludeLocations(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("includeLocations", (n) -> { this.setIncludeLocations(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the includeLocations property value. Location IDs in scope of policy unless explicitly excluded, All, or AllTrusted.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getIncludeLocations() {
        return this.includeLocations;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("excludeLocations", this.getExcludeLocations());
        writer.writeCollectionOfPrimitiveValues("includeLocations", this.getIncludeLocations());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the excludeLocations property value. Location IDs excluded from scope of policy.
     * @param value Value to set for the excludeLocations property.
     */
    public void setExcludeLocations(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.excludeLocations = value;
    }
    /**
     * Sets the includeLocations property value. Location IDs in scope of policy unless explicitly excluded, All, or AllTrusted.
     * @param value Value to set for the includeLocations property.
     */
    public void setIncludeLocations(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.includeLocations = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
