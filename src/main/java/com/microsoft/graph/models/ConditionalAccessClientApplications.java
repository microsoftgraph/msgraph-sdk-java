package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConditionalAccessClientApplications implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Service principal IDs excluded from the policy scope. */
    private java.util.List<String> _excludeServicePrincipals;
    /** Service principal IDs included in the policy scope, or ServicePrincipalsInMyTenant. */
    private java.util.List<String> _includeServicePrincipals;
    /**
     * Instantiates a new conditionalAccessClientApplications and sets the default values.
     * @return a void
     */
    public ConditionalAccessClientApplications() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a conditionalAccessClientApplications
     */
    @javax.annotation.Nonnull
    public static ConditionalAccessClientApplications createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessClientApplications();
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
     * Gets the excludeServicePrincipals property value. Service principal IDs excluded from the policy scope.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getExcludeServicePrincipals() {
        return this._excludeServicePrincipals;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ConditionalAccessClientApplications currentObject = this;
        return new HashMap<>(2) {{
            this.put("excludeServicePrincipals", (n) -> { currentObject.setExcludeServicePrincipals(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("includeServicePrincipals", (n) -> { currentObject.setIncludeServicePrincipals(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the includeServicePrincipals property value. Service principal IDs included in the policy scope, or ServicePrincipalsInMyTenant.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getIncludeServicePrincipals() {
        return this._includeServicePrincipals;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("excludeServicePrincipals", this.getExcludeServicePrincipals());
        writer.writeCollectionOfPrimitiveValues("includeServicePrincipals", this.getIncludeServicePrincipals());
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
     * Sets the excludeServicePrincipals property value. Service principal IDs excluded from the policy scope.
     * @param value Value to set for the excludeServicePrincipals property.
     * @return a void
     */
    public void setExcludeServicePrincipals(@javax.annotation.Nullable final java.util.List<String> value) {
        this._excludeServicePrincipals = value;
    }
    /**
     * Sets the includeServicePrincipals property value. Service principal IDs included in the policy scope, or ServicePrincipalsInMyTenant.
     * @param value Value to set for the includeServicePrincipals property.
     * @return a void
     */
    public void setIncludeServicePrincipals(@javax.annotation.Nullable final java.util.List<String> value) {
        this._includeServicePrincipals = value;
    }
}
