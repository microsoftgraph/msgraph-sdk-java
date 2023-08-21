package com.microsoft.graph.teams.item.installedapps.item.upgrade;

import com.microsoft.graph.models.TeamsAppPermissionSet;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpgradePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The consentedPermissionSet property
     */
    private TeamsAppPermissionSet consentedPermissionSet;
    /**
     * Instantiates a new upgradePostRequestBody and sets the default values.
     */
    public UpgradePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a upgradePostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static UpgradePostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpgradePostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the consentedPermissionSet property value. The consentedPermissionSet property
     * @return a teamsAppPermissionSet
     */
    @jakarta.annotation.Nullable
    public TeamsAppPermissionSet getConsentedPermissionSet() {
        return this.consentedPermissionSet;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("consentedPermissionSet", (n) -> { this.setConsentedPermissionSet(n.getObjectValue(TeamsAppPermissionSet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("consentedPermissionSet", this.getConsentedPermissionSet());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the consentedPermissionSet property value. The consentedPermissionSet property
     * @param value Value to set for the consentedPermissionSet property.
     */
    public void setConsentedPermissionSet(@jakarta.annotation.Nullable final TeamsAppPermissionSet value) {
        this.consentedPermissionSet = value;
    }
}
