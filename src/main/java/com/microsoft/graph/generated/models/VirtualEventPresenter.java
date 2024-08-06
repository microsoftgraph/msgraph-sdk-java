package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VirtualEventPresenter extends Entity implements Parsable {
    /**
     * Instantiates a new {@link VirtualEventPresenter} and sets the default values.
     */
    public VirtualEventPresenter() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VirtualEventPresenter}
     */
    @jakarta.annotation.Nonnull
    public static VirtualEventPresenter createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEventPresenter();
    }
    /**
     * Gets the email property value. Email address of the presenter.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmail() {
        return this.backingStore.get("email");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("email", (n) -> { this.setEmail(n.getStringValue()); });
        deserializerMap.put("identity", (n) -> { this.setIdentity(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("presenterDetails", (n) -> { this.setPresenterDetails(n.getObjectValue(VirtualEventPresenterDetails::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the identity property value. Identity information of the presenter. The supported identities are: communicationsGuestIdentity and communicationsUserIdentity.
     * @return a {@link Identity}
     */
    @jakarta.annotation.Nullable
    public Identity getIdentity() {
        return this.backingStore.get("identity");
    }
    /**
     * Gets the presenterDetails property value. Other details about the presenter. This property returns null when the virtual event type is virtualEventTownhall.
     * @return a {@link VirtualEventPresenterDetails}
     */
    @jakarta.annotation.Nullable
    public VirtualEventPresenterDetails getPresenterDetails() {
        return this.backingStore.get("presenterDetails");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("email", this.getEmail());
        writer.writeObjectValue("identity", this.getIdentity());
        writer.writeObjectValue("presenterDetails", this.getPresenterDetails());
    }
    /**
     * Sets the email property value. Email address of the presenter.
     * @param value Value to set for the email property.
     */
    public void setEmail(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("email", value);
    }
    /**
     * Sets the identity property value. Identity information of the presenter. The supported identities are: communicationsGuestIdentity and communicationsUserIdentity.
     * @param value Value to set for the identity property.
     */
    public void setIdentity(@jakarta.annotation.Nullable final Identity value) {
        this.backingStore.set("identity", value);
    }
    /**
     * Sets the presenterDetails property value. Other details about the presenter. This property returns null when the virtual event type is virtualEventTownhall.
     * @param value Value to set for the presenterDetails property.
     */
    public void setPresenterDetails(@jakarta.annotation.Nullable final VirtualEventPresenterDetails value) {
        this.backingStore.set("presenterDetails", value);
    }
}
