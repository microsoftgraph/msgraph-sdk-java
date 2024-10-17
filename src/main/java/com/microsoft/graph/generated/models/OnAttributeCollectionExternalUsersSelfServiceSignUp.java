package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnAttributeCollectionExternalUsersSelfServiceSignUp extends OnAttributeCollectionHandler implements Parsable {
    /**
     * Instantiates a new {@link OnAttributeCollectionExternalUsersSelfServiceSignUp} and sets the default values.
     */
    public OnAttributeCollectionExternalUsersSelfServiceSignUp() {
        super();
        this.setOdataType("#microsoft.graph.onAttributeCollectionExternalUsersSelfServiceSignUp");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OnAttributeCollectionExternalUsersSelfServiceSignUp}
     */
    @jakarta.annotation.Nonnull
    public static OnAttributeCollectionExternalUsersSelfServiceSignUp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnAttributeCollectionExternalUsersSelfServiceSignUp();
    }
    /**
     * Gets the attributeCollectionPage property value. Required. The configuration for how attributes are displayed in the sign-up experience defined by a user flow, like the externalUsersSelfServiceSignupEventsFlow, specifically on the attribute collection page.
     * @return a {@link AuthenticationAttributeCollectionPage}
     */
    @jakarta.annotation.Nullable
    public AuthenticationAttributeCollectionPage getAttributeCollectionPage() {
        return this.backingStore.get("attributeCollectionPage");
    }
    /**
     * Gets the attributes property value. The attributes property
     * @return a {@link java.util.List<IdentityUserFlowAttribute>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<IdentityUserFlowAttribute> getAttributes() {
        return this.backingStore.get("attributes");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("attributeCollectionPage", (n) -> { this.setAttributeCollectionPage(n.getObjectValue(AuthenticationAttributeCollectionPage::createFromDiscriminatorValue)); });
        deserializerMap.put("attributes", (n) -> { this.setAttributes(n.getCollectionOfObjectValues(IdentityUserFlowAttribute::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("attributeCollectionPage", this.getAttributeCollectionPage());
        writer.writeCollectionOfObjectValues("attributes", this.getAttributes());
    }
    /**
     * Sets the attributeCollectionPage property value. Required. The configuration for how attributes are displayed in the sign-up experience defined by a user flow, like the externalUsersSelfServiceSignupEventsFlow, specifically on the attribute collection page.
     * @param value Value to set for the attributeCollectionPage property.
     */
    public void setAttributeCollectionPage(@jakarta.annotation.Nullable final AuthenticationAttributeCollectionPage value) {
        this.backingStore.set("attributeCollectionPage", value);
    }
    /**
     * Sets the attributes property value. The attributes property
     * @param value Value to set for the attributes property.
     */
    public void setAttributes(@jakarta.annotation.Nullable final java.util.List<IdentityUserFlowAttribute> value) {
        this.backingStore.set("attributes", value);
    }
}
