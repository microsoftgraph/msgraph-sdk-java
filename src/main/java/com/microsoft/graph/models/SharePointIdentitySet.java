package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharePointIdentitySet extends IdentitySet implements Parsable {
    /**
     * The group associated with this action. Optional.
     */
    private Identity group;
    /**
     * The SharePoint group associated with this action. Optional.
     */
    private SharePointIdentity siteGroup;
    /**
     * The SharePoint user associated with this action. Optional.
     */
    private SharePointIdentity siteUser;
    /**
     * Instantiates a new SharePointIdentitySet and sets the default values.
     */
    public SharePointIdentitySet() {
        super();
        this.setOdataType("#microsoft.graph.sharePointIdentitySet");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SharePointIdentitySet
     */
    @jakarta.annotation.Nonnull
    public static SharePointIdentitySet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharePointIdentitySet();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("group", (n) -> { this.setGroup(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("siteGroup", (n) -> { this.setSiteGroup(n.getObjectValue(SharePointIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("siteUser", (n) -> { this.setSiteUser(n.getObjectValue(SharePointIdentity::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the group property value. The group associated with this action. Optional.
     * @return a Identity
     */
    @jakarta.annotation.Nullable
    public Identity getGroup() {
        return this.group;
    }
    /**
     * Gets the siteGroup property value. The SharePoint group associated with this action. Optional.
     * @return a SharePointIdentity
     */
    @jakarta.annotation.Nullable
    public SharePointIdentity getSiteGroup() {
        return this.siteGroup;
    }
    /**
     * Gets the siteUser property value. The SharePoint user associated with this action. Optional.
     * @return a SharePointIdentity
     */
    @jakarta.annotation.Nullable
    public SharePointIdentity getSiteUser() {
        return this.siteUser;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("group", this.getGroup());
        writer.writeObjectValue("siteGroup", this.getSiteGroup());
        writer.writeObjectValue("siteUser", this.getSiteUser());
    }
    /**
     * Sets the group property value. The group associated with this action. Optional.
     * @param value Value to set for the group property.
     */
    public void setGroup(@jakarta.annotation.Nullable final Identity value) {
        this.group = value;
    }
    /**
     * Sets the siteGroup property value. The SharePoint group associated with this action. Optional.
     * @param value Value to set for the siteGroup property.
     */
    public void setSiteGroup(@jakarta.annotation.Nullable final SharePointIdentity value) {
        this.siteGroup = value;
    }
    /**
     * Sets the siteUser property value. The SharePoint user associated with this action. Optional.
     * @param value Value to set for the siteUser property.
     */
    public void setSiteUser(@jakarta.annotation.Nullable final SharePointIdentity value) {
        this.siteUser = value;
    }
}
