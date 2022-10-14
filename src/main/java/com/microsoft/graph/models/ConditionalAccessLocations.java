package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConditionalAccessLocations implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Location IDs excluded from scope of policy. */
    private java.util.List<String> _excludeLocations;
    /** Location IDs in scope of policy unless explicitly excluded, All, or AllTrusted. */
    private java.util.List<String> _includeLocations;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new conditionalAccessLocations and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConditionalAccessLocations() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.conditionalAccessLocations");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a conditionalAccessLocations
     */
    @javax.annotation.Nonnull
    public static ConditionalAccessLocations createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessLocations();
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
     * Gets the excludeLocations property value. Location IDs excluded from scope of policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getExcludeLocations() {
        return this._excludeLocations;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ConditionalAccessLocations currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("excludeLocations", (n) -> { currentObject.setExcludeLocations(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("includeLocations", (n) -> { currentObject.setIncludeLocations(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the includeLocations property value. Location IDs in scope of policy unless explicitly excluded, All, or AllTrusted.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getIncludeLocations() {
        return this._includeLocations;
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
        writer.writeCollectionOfPrimitiveValues("excludeLocations", this.getExcludeLocations());
        writer.writeCollectionOfPrimitiveValues("includeLocations", this.getIncludeLocations());
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
     * Sets the excludeLocations property value. Location IDs excluded from scope of policy.
     * @param value Value to set for the excludeLocations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExcludeLocations(@javax.annotation.Nullable final java.util.List<String> value) {
        this._excludeLocations = value;
    }
    /**
     * Sets the includeLocations property value. Location IDs in scope of policy unless explicitly excluded, All, or AllTrusted.
     * @param value Value to set for the includeLocations property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIncludeLocations(@javax.annotation.Nullable final java.util.List<String> value) {
        this._includeLocations = value;
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
