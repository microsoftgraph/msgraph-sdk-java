package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharePointIdentity extends Identity implements Parsable {
    /**
     * Instantiates a new SharePointIdentity and sets the default values.
     */
    public SharePointIdentity() {
        super();
        this.setOdataType("#microsoft.graph.sharePointIdentity");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SharePointIdentity
     */
    @jakarta.annotation.Nonnull
    public static SharePointIdentity createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharePointIdentity();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("loginName", (n) -> { this.setLoginName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the loginName property value. The sign in name of the SharePoint identity.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLoginName() {
        return this.backingStore.get("loginName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("loginName", this.getLoginName());
    }
    /**
     * Sets the loginName property value. The sign in name of the SharePoint identity.
     * @param value Value to set for the loginName property.
     */
    public void setLoginName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("loginName", value);
    }
}
