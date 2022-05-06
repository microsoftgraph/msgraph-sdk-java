package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CallRoute implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The final property  */
    private IdentitySet _final_escaped;
    /** The original property  */
    private IdentitySet _original;
    /** Possible values are: forwarded, lookup, selfFork.  */
    private RoutingType _routingType;
    /**
     * Instantiates a new callRoute and sets the default values.
     * @return a void
     */
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
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CallRoute currentObject = this;
        return new HashMap<>(3) {{
            this.put("final", (n) -> { currentObject.setFinal(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("original", (n) -> { currentObject.setOriginal(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("routingType", (n) -> { currentObject.setRoutingType(n.getEnumValue(RoutingType.class)); });
        }};
    }
    /**
     * Gets the final property value. The final property
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getFinal() {
        return this._final_escaped;
    }
    /**
     * Gets the original property value. The original property
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getOriginal() {
        return this._original;
    }
    /**
     * Gets the routingType property value. Possible values are: forwarded, lookup, selfFork.
     * @return a routingType
     */
    @javax.annotation.Nullable
    public RoutingType getRoutingType() {
        return this._routingType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("final", this.getFinal());
        writer.writeObjectValue("original", this.getOriginal());
        writer.writeEnumValue("routingType", this.getRoutingType());
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
     * Sets the final property value. The final property
     * @param value Value to set for the final property.
     * @return a void
     */
    public void setFinal(@javax.annotation.Nullable final IdentitySet value) {
        this._final_escaped = value;
    }
    /**
     * Sets the original property value. The original property
     * @param value Value to set for the original property.
     * @return a void
     */
    public void setOriginal(@javax.annotation.Nullable final IdentitySet value) {
        this._original = value;
    }
    /**
     * Sets the routingType property value. Possible values are: forwarded, lookup, selfFork.
     * @param value Value to set for the routingType property.
     * @return a void
     */
    public void setRoutingType(@javax.annotation.Nullable final RoutingType value) {
        this._routingType = value;
    }
}
