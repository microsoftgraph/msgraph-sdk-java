package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UserFlowApiConnectorConfiguration implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The postAttributeCollection property */
    private IdentityApiConnector _postAttributeCollection;
    /** The postFederationSignup property */
    private IdentityApiConnector _postFederationSignup;
    /**
     * Instantiates a new userFlowApiConnectorConfiguration and sets the default values.
     * @return a void
     */
    public UserFlowApiConnectorConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userFlowApiConnectorConfiguration
     */
    @javax.annotation.Nonnull
    public static UserFlowApiConnectorConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserFlowApiConnectorConfiguration();
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
        final UserFlowApiConnectorConfiguration currentObject = this;
        return new HashMap<>(2) {{
            this.put("postAttributeCollection", (n) -> { currentObject.setPostAttributeCollection(n.getObjectValue(IdentityApiConnector::createFromDiscriminatorValue)); });
            this.put("postFederationSignup", (n) -> { currentObject.setPostFederationSignup(n.getObjectValue(IdentityApiConnector::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the postAttributeCollection property value. The postAttributeCollection property
     * @return a identityApiConnector
     */
    @javax.annotation.Nullable
    public IdentityApiConnector getPostAttributeCollection() {
        return this._postAttributeCollection;
    }
    /**
     * Gets the postFederationSignup property value. The postFederationSignup property
     * @return a identityApiConnector
     */
    @javax.annotation.Nullable
    public IdentityApiConnector getPostFederationSignup() {
        return this._postFederationSignup;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("postAttributeCollection", this.getPostAttributeCollection());
        writer.writeObjectValue("postFederationSignup", this.getPostFederationSignup());
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
     * Sets the postAttributeCollection property value. The postAttributeCollection property
     * @param value Value to set for the postAttributeCollection property.
     * @return a void
     */
    public void setPostAttributeCollection(@javax.annotation.Nullable final IdentityApiConnector value) {
        this._postAttributeCollection = value;
    }
    /**
     * Sets the postFederationSignup property value. The postFederationSignup property
     * @param value Value to set for the postFederationSignup property.
     * @return a void
     */
    public void setPostFederationSignup(@javax.annotation.Nullable final IdentityApiConnector value) {
        this._postFederationSignup = value;
    }
}
