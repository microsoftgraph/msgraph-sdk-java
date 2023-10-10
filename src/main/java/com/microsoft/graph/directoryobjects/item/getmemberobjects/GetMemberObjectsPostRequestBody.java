package com.microsoft.graph.directoryobjects.item.getmemberobjects;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetMemberObjectsPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The securityEnabledOnly property
     */
    private Boolean securityEnabledOnly;
    /**
     * Instantiates a new GetMemberObjectsPostRequestBody and sets the default values.
     */
    public GetMemberObjectsPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a GetMemberObjectsPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static GetMemberObjectsPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetMemberObjectsPostRequestBody();
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
        deserializerMap.put("securityEnabledOnly", (n) -> { this.setSecurityEnabledOnly(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the securityEnabledOnly property value. The securityEnabledOnly property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSecurityEnabledOnly() {
        return this.securityEnabledOnly;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("securityEnabledOnly", this.getSecurityEnabledOnly());
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
     * Sets the securityEnabledOnly property value. The securityEnabledOnly property
     * @param value Value to set for the securityEnabledOnly property.
     */
    public void setSecurityEnabledOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.securityEnabledOnly = value;
    }
}
