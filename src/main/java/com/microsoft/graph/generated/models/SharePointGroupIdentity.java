package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharePointGroupIdentity extends Identity implements Parsable {
    /**
     * Instantiates a new {@link SharePointGroupIdentity} and sets the default values.
     */
    public SharePointGroupIdentity() {
        super();
        this.setOdataType("#microsoft.graph.sharePointGroupIdentity");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SharePointGroupIdentity}
     */
    @jakarta.annotation.Nonnull
    public static SharePointGroupIdentity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharePointGroupIdentity();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("principalId", (n) -> { this.setPrincipalId(n.getStringValue()); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the principalId property value. The principal ID of the SharePoint group in the tenant. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrincipalId() {
        return this.backingStore.get("principalId");
    }
    /**
     * Gets the title property value. The title of the SharePoint group. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.backingStore.get("title");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("principalId", this.getPrincipalId());
        writer.writeStringValue("title", this.getTitle());
    }
    /**
     * Sets the principalId property value. The principal ID of the SharePoint group in the tenant. Read-only.
     * @param value Value to set for the principalId property.
     */
    public void setPrincipalId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("principalId", value);
    }
    /**
     * Sets the title property value. The title of the SharePoint group. Read-only.
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("title", value);
    }
}
