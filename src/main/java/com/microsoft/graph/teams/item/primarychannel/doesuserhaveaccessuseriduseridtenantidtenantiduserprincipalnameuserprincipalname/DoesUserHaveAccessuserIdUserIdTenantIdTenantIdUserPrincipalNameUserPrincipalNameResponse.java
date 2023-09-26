package com.microsoft.graph.teams.item.primarychannel.doesuserhaveaccessuseriduseridtenantidtenantiduserprincipalnameuserprincipalname;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DoesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrincipalNameUserPrincipalNameResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The value property
     */
    private Boolean value;
    /**
     * Instantiates a new DoesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrincipalNameUserPrincipalNameResponse and sets the default values.
     */
    public DoesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrincipalNameUserPrincipalNameResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DoesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrincipalNameUserPrincipalNameResponse
     */
    @jakarta.annotation.Nonnull
    public static DoesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrincipalNameUserPrincipalNameResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DoesUserHaveAccessuserIdUserIdTenantIdTenantIdUserPrincipalNameUserPrincipalNameResponse();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("value", (n) -> { this.setValue(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The value property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("value", this.getValue());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final Boolean value) {
        this.value = value;
    }
}
