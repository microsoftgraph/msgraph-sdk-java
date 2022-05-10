package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OptionalClaim implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Additional properties of the claim. If a property exists in this collection, it modifies the behavior of the optional claim specified in the name property. */
    private java.util.List<String> _additionalProperties;
    /** If the value is true, the claim specified by the client is necessary to ensure a smooth authorization experience for the specific task requested by the end user. The default value is false. */
    private Boolean _essential;
    /** The name of the optional claim. */
    private String _name;
    /** The source (directory object) of the claim. There are predefined claims and user-defined claims from extension properties. If the source value is null, the claim is a predefined optional claim. If the source value is user, the value in the name property is the extension property from the user object. */
    private String _source;
    /**
     * Instantiates a new optionalClaim and sets the default values.
     * @return a void
     */
    public OptionalClaim() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a optionalClaim
     */
    @javax.annotation.Nonnull
    public static OptionalClaim createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OptionalClaim();
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
     * Gets the additionalProperties property value. Additional properties of the claim. If a property exists in this collection, it modifies the behavior of the optional claim specified in the name property.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAdditionalProperties() {
        return this._additionalProperties;
    }
    /**
     * Gets the essential property value. If the value is true, the claim specified by the client is necessary to ensure a smooth authorization experience for the specific task requested by the end user. The default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEssential() {
        return this._essential;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OptionalClaim currentObject = this;
        return new HashMap<>(4) {{
            this.put("additionalProperties", (n) -> { currentObject.setAdditionalProperties(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("essential", (n) -> { currentObject.setEssential(n.getBooleanValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("source", (n) -> { currentObject.setSource(n.getStringValue()); });
        }};
    }
    /**
     * Gets the name property value. The name of the optional claim.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the source property value. The source (directory object) of the claim. There are predefined claims and user-defined claims from extension properties. If the source value is null, the claim is a predefined optional claim. If the source value is user, the value in the name property is the extension property from the user object.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSource() {
        return this._source;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("additionalProperties", this.getAdditionalProperties());
        writer.writeBooleanValue("essential", this.getEssential());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("source", this.getSource());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the additionalProperties property value. Additional properties of the claim. If a property exists in this collection, it modifies the behavior of the optional claim specified in the name property.
     * @param value Value to set for the additionalProperties property.
     * @return a void
     */
    public void setAdditionalProperties(@javax.annotation.Nullable final java.util.List<String> value) {
        this._additionalProperties = value;
    }
    /**
     * Sets the essential property value. If the value is true, the claim specified by the client is necessary to ensure a smooth authorization experience for the specific task requested by the end user. The default value is false.
     * @param value Value to set for the essential property.
     * @return a void
     */
    public void setEssential(@javax.annotation.Nullable final Boolean value) {
        this._essential = value;
    }
    /**
     * Sets the name property value. The name of the optional claim.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the source property value. The source (directory object) of the claim. There are predefined claims and user-defined claims from extension properties. If the source value is null, the claim is a predefined optional claim. If the source value is user, the value in the name property is the extension property from the user object.
     * @param value Value to set for the source property.
     * @return a void
     */
    public void setSource(@javax.annotation.Nullable final String value) {
        this._source = value;
    }
}
