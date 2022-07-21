package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ExternalDomainFederation extends IdentitySource implements Parsable {
    /** The name of the identity source, typically also the domain name. Read only. */
    private String _displayName;
    /** The domain name. Read only. */
    private String _domainName;
    /** The issuerURI of the incoming federation. Read only. */
    private String _issuerUri;
    /**
     * Instantiates a new ExternalDomainFederation and sets the default values.
     * @return a void
     */
    public ExternalDomainFederation() {
        super();
        this.setOdataType("#microsoft.graph.externalDomainFederation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ExternalDomainFederation
     */
    @javax.annotation.Nonnull
    public static ExternalDomainFederation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExternalDomainFederation();
    }
    /**
     * Gets the displayName property value. The name of the identity source, typically also the domain name. Read only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the domainName property value. The domain name. Read only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDomainName() {
        return this._domainName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ExternalDomainFederation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("domainName", (n) -> { currentObject.setDomainName(n.getStringValue()); });
            this.put("issuerUri", (n) -> { currentObject.setIssuerUri(n.getStringValue()); });
        }};
    }
    /**
     * Gets the issuerUri property value. The issuerURI of the incoming federation. Read only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIssuerUri() {
        return this._issuerUri;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("domainName", this.getDomainName());
        writer.writeStringValue("issuerUri", this.getIssuerUri());
    }
    /**
     * Sets the displayName property value. The name of the identity source, typically also the domain name. Read only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the domainName property value. The domain name. Read only.
     * @param value Value to set for the domainName property.
     * @return a void
     */
    public void setDomainName(@javax.annotation.Nullable final String value) {
        this._domainName = value;
    }
    /**
     * Sets the issuerUri property value. The issuerURI of the incoming federation. Read only.
     * @param value Value to set for the issuerUri property.
     * @return a void
     */
    public void setIssuerUri(@javax.annotation.Nullable final String value) {
        this._issuerUri = value;
    }
}
