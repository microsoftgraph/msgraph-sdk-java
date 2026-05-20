package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IdentifierUriRestriction implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link IdentifierUriRestriction} and sets the default values.
     */
    public IdentifierUriRestriction() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IdentifierUriRestriction}
     */
    @jakarta.annotation.Nonnull
    public static IdentifierUriRestriction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IdentifierUriRestriction();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the excludeActors property value. Collection of custom security attribute exemptions. If an actor user or service principal has the custom security attribute defined in this section, they&apos;re exempted from the restriction.  This means that calls the user or service principal makes to create or update apps are exempt from this policy enforcement.
     * @return a {@link AppManagementPolicyActorExemptions}
     */
    @jakarta.annotation.Nullable
    public AppManagementPolicyActorExemptions getExcludeActors() {
        return this.backingStore.get("excludeActors");
    }
    /**
     * Gets the excludeAppsReceivingV2Tokens property value. If true, the restriction isn&apos;t enforced for applications that are configured to receive V2 tokens in Microsoft Entra ID; else, the restriction is enforced for those applications.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getExcludeAppsReceivingV2Tokens() {
        return this.backingStore.get("excludeAppsReceivingV2Tokens");
    }
    /**
     * Gets the excludeSaml property value. If true, the restriction isn&apos;t enforced for SAML applications in Microsoft Entra ID; else, the restriction is enforced for those applications.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getExcludeSaml() {
        return this.backingStore.get("excludeSaml");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("excludeActors", (n) -> { this.setExcludeActors(n.getObjectValue(AppManagementPolicyActorExemptions::createFromDiscriminatorValue)); });
        deserializerMap.put("excludeAppsReceivingV2Tokens", (n) -> { this.setExcludeAppsReceivingV2Tokens(n.getBooleanValue()); });
        deserializerMap.put("excludeSaml", (n) -> { this.setExcludeSaml(n.getBooleanValue()); });
        deserializerMap.put("isStateSetByMicrosoft", (n) -> { this.setIsStateSetByMicrosoft(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("restrictForAppsCreatedAfterDateTime", (n) -> { this.setRestrictForAppsCreatedAfterDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(AppManagementRestrictionState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isStateSetByMicrosoft property value. If true, Microsoft sets the identifierUriRestriction state. If false, the tenant modifies the identifierUriRestriction state. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsStateSetByMicrosoft() {
        return this.backingStore.get("isStateSetByMicrosoft");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the restrictForAppsCreatedAfterDateTime property value. Specifies the date from which the policy restriction applies to newly created applications. For existing applications, the enforcement date can be retroactively applied.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRestrictForAppsCreatedAfterDateTime() {
        return this.backingStore.get("restrictForAppsCreatedAfterDateTime");
    }
    /**
     * Gets the state property value. The state property
     * @return a {@link AppManagementRestrictionState}
     */
    @jakarta.annotation.Nullable
    public AppManagementRestrictionState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("excludeActors", this.getExcludeActors());
        writer.writeBooleanValue("excludeAppsReceivingV2Tokens", this.getExcludeAppsReceivingV2Tokens());
        writer.writeBooleanValue("excludeSaml", this.getExcludeSaml());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeOffsetDateTimeValue("restrictForAppsCreatedAfterDateTime", this.getRestrictForAppsCreatedAfterDateTime());
        writer.writeEnumValue("state", this.getState());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the excludeActors property value. Collection of custom security attribute exemptions. If an actor user or service principal has the custom security attribute defined in this section, they&apos;re exempted from the restriction.  This means that calls the user or service principal makes to create or update apps are exempt from this policy enforcement.
     * @param value Value to set for the excludeActors property.
     */
    public void setExcludeActors(@jakarta.annotation.Nullable final AppManagementPolicyActorExemptions value) {
        this.backingStore.set("excludeActors", value);
    }
    /**
     * Sets the excludeAppsReceivingV2Tokens property value. If true, the restriction isn&apos;t enforced for applications that are configured to receive V2 tokens in Microsoft Entra ID; else, the restriction is enforced for those applications.
     * @param value Value to set for the excludeAppsReceivingV2Tokens property.
     */
    public void setExcludeAppsReceivingV2Tokens(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("excludeAppsReceivingV2Tokens", value);
    }
    /**
     * Sets the excludeSaml property value. If true, the restriction isn&apos;t enforced for SAML applications in Microsoft Entra ID; else, the restriction is enforced for those applications.
     * @param value Value to set for the excludeSaml property.
     */
    public void setExcludeSaml(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("excludeSaml", value);
    }
    /**
     * Sets the isStateSetByMicrosoft property value. If true, Microsoft sets the identifierUriRestriction state. If false, the tenant modifies the identifierUriRestriction state. Read-only.
     * @param value Value to set for the isStateSetByMicrosoft property.
     */
    public void setIsStateSetByMicrosoft(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isStateSetByMicrosoft", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the restrictForAppsCreatedAfterDateTime property value. Specifies the date from which the policy restriction applies to newly created applications. For existing applications, the enforcement date can be retroactively applied.
     * @param value Value to set for the restrictForAppsCreatedAfterDateTime property.
     */
    public void setRestrictForAppsCreatedAfterDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("restrictForAppsCreatedAfterDateTime", value);
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final AppManagementRestrictionState value) {
        this.backingStore.set("state", value);
    }
}
