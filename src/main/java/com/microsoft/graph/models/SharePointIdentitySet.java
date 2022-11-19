package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SharePointIdentitySet extends IdentitySet implements Parsable {
    /** The group associated with this action. Optional. */
    private Identity _group;
    /** The SharePoint group associated with this action. Optional. */
    private SharePointIdentity _siteGroup;
    /** The SharePoint user associated with this action. Optional. */
    private SharePointIdentity _siteUser;
    /**
     * Instantiates a new SharePointIdentitySet and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SharePointIdentitySet() {
        super();
        this.setOdataType("#microsoft.graph.sharePointIdentitySet");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SharePointIdentitySet
     */
    @javax.annotation.Nonnull
    public static SharePointIdentitySet createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharePointIdentitySet();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SharePointIdentitySet currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("group", (n) -> { currentObject.setGroup(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("siteGroup", (n) -> { currentObject.setSiteGroup(n.getObjectValue(SharePointIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("siteUser", (n) -> { currentObject.setSiteUser(n.getObjectValue(SharePointIdentity::createFromDiscriminatorValue)); });
        return deserializerMap
    }
    /**
     * Gets the group property value. The group associated with this action. Optional.
     * @return a identity
     */
    @javax.annotation.Nullable
    public Identity getGroup() {
        return this._group;
    }
    /**
     * Gets the siteGroup property value. The SharePoint group associated with this action. Optional.
     * @return a sharePointIdentity
     */
    @javax.annotation.Nullable
    public SharePointIdentity getSiteGroup() {
        return this._siteGroup;
    }
    /**
     * Gets the siteUser property value. The SharePoint user associated with this action. Optional.
     * @return a sharePointIdentity
     */
    @javax.annotation.Nullable
    public SharePointIdentity getSiteUser() {
        return this._siteUser;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("group", this.getGroup());
        writer.writeObjectValue("siteGroup", this.getSiteGroup());
        writer.writeObjectValue("siteUser", this.getSiteUser());
    }
    /**
     * Sets the group property value. The group associated with this action. Optional.
     * @param value Value to set for the group property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroup(@javax.annotation.Nullable final Identity value) {
        this._group = value;
    }
    /**
     * Sets the siteGroup property value. The SharePoint group associated with this action. Optional.
     * @param value Value to set for the siteGroup property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSiteGroup(@javax.annotation.Nullable final SharePointIdentity value) {
        this._siteGroup = value;
    }
    /**
     * Sets the siteUser property value. The SharePoint user associated with this action. Optional.
     * @param value Value to set for the siteUser property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSiteUser(@javax.annotation.Nullable final SharePointIdentity value) {
        this._siteUser = value;
    }
}
