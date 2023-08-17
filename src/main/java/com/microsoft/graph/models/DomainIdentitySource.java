package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DomainIdentitySource extends IdentitySource implements Parsable {
    /**
     * The name of the identity source, typically also the domain name. Read only.
     */
    private String displayName;
    /**
     * The domain name. Read only.
     */
    private String domainName;
    /**
     * Instantiates a new domainIdentitySource and sets the default values.
     */
    public DomainIdentitySource() {
        super();
        this.setOdataType("#microsoft.graph.domainIdentitySource");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a domainIdentitySource
     */
    @jakarta.annotation.Nonnull
    public static DomainIdentitySource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DomainIdentitySource();
    }
    /**
     * Gets the displayName property value. The name of the identity source, typically also the domain name. Read only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the domainName property value. The domain name. Read only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDomainName() {
        return this.domainName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("domainName", (n) -> { this.setDomainName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("domainName", this.getDomainName());
    }
    /**
     * Sets the displayName property value. The name of the identity source, typically also the domain name. Read only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the domainName property value. The domain name. Read only.
     * @param value Value to set for the domainName property.
     */
    public void setDomainName(@jakarta.annotation.Nullable final String value) {
        this.domainName = value;
    }
}
