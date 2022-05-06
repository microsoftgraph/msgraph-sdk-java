package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConditionalAccessApplications implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The list of application IDs explicitly excluded from the policy.  */
    private java.util.List<String> _excludeApplications;
    /** The list of application IDs the policy applies to, unless explicitly excluded (in excludeApplications). Can also be set to All.  */
    private java.util.List<String> _includeApplications;
    /** Authentication context class references include. Supported values are c1 through c25.  */
    private java.util.List<String> _includeAuthenticationContextClassReferences;
    /** User actions to include. Supported values are urn:user:registersecurityinfo and urn:user:registerdevice  */
    private java.util.List<String> _includeUserActions;
    /**
     * Instantiates a new conditionalAccessApplications and sets the default values.
     * @return a void
     */
    public ConditionalAccessApplications() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a conditionalAccessApplications
     */
    @javax.annotation.Nonnull
    public static ConditionalAccessApplications createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessApplications();
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
     * Gets the excludeApplications property value. The list of application IDs explicitly excluded from the policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getExcludeApplications() {
        return this._excludeApplications;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ConditionalAccessApplications currentObject = this;
        return new HashMap<>(4) {{
            this.put("excludeApplications", (n) -> { currentObject.setExcludeApplications(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("includeApplications", (n) -> { currentObject.setIncludeApplications(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("includeAuthenticationContextClassReferences", (n) -> { currentObject.setIncludeAuthenticationContextClassReferences(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("includeUserActions", (n) -> { currentObject.setIncludeUserActions(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the includeApplications property value. The list of application IDs the policy applies to, unless explicitly excluded (in excludeApplications). Can also be set to All.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getIncludeApplications() {
        return this._includeApplications;
    }
    /**
     * Gets the includeAuthenticationContextClassReferences property value. Authentication context class references include. Supported values are c1 through c25.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getIncludeAuthenticationContextClassReferences() {
        return this._includeAuthenticationContextClassReferences;
    }
    /**
     * Gets the includeUserActions property value. User actions to include. Supported values are urn:user:registersecurityinfo and urn:user:registerdevice
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getIncludeUserActions() {
        return this._includeUserActions;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("excludeApplications", this.getExcludeApplications());
        writer.writeCollectionOfPrimitiveValues("includeApplications", this.getIncludeApplications());
        writer.writeCollectionOfPrimitiveValues("includeAuthenticationContextClassReferences", this.getIncludeAuthenticationContextClassReferences());
        writer.writeCollectionOfPrimitiveValues("includeUserActions", this.getIncludeUserActions());
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
     * Sets the excludeApplications property value. The list of application IDs explicitly excluded from the policy.
     * @param value Value to set for the excludeApplications property.
     * @return a void
     */
    public void setExcludeApplications(@javax.annotation.Nullable final java.util.List<String> value) {
        this._excludeApplications = value;
    }
    /**
     * Sets the includeApplications property value. The list of application IDs the policy applies to, unless explicitly excluded (in excludeApplications). Can also be set to All.
     * @param value Value to set for the includeApplications property.
     * @return a void
     */
    public void setIncludeApplications(@javax.annotation.Nullable final java.util.List<String> value) {
        this._includeApplications = value;
    }
    /**
     * Sets the includeAuthenticationContextClassReferences property value. Authentication context class references include. Supported values are c1 through c25.
     * @param value Value to set for the includeAuthenticationContextClassReferences property.
     * @return a void
     */
    public void setIncludeAuthenticationContextClassReferences(@javax.annotation.Nullable final java.util.List<String> value) {
        this._includeAuthenticationContextClassReferences = value;
    }
    /**
     * Sets the includeUserActions property value. User actions to include. Supported values are urn:user:registersecurityinfo and urn:user:registerdevice
     * @param value Value to set for the includeUserActions property.
     * @return a void
     */
    public void setIncludeUserActions(@javax.annotation.Nullable final java.util.List<String> value) {
        this._includeUserActions = value;
    }
}
