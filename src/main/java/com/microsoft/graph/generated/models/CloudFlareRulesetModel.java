package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudFlareRulesetModel implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link CloudFlareRulesetModel} and sets the default values.
     */
    public CloudFlareRulesetModel() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudFlareRulesetModel}
     */
    @jakarta.annotation.Nonnull
    public static CloudFlareRulesetModel createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudFlareRulesetModel();
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("phaseName", (n) -> { this.setPhaseName(n.getStringValue()); });
        deserializerMap.put("rulesetId", (n) -> { this.setRulesetId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. Friendly name for the ruleset, used in UIs and logs to help administrators identify the ruleset.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
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
     * Gets the phaseName property value. Name of the phase during which the ruleset is evaluated (for example, httprequestfirewallmanaged, httprequestfirewallcustom, or provider-specific phase names). This indicates when in the request/response lifecycle the rules apply.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPhaseName() {
        return this.backingStore.get("phaseName");
    }
    /**
     * Gets the rulesetId property value. Unique identifier assigned to the ruleset by Cloudflare or the integration.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRulesetId() {
        return this.backingStore.get("rulesetId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("phaseName", this.getPhaseName());
        writer.writeStringValue("rulesetId", this.getRulesetId());
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
     * Sets the name property value. Friendly name for the ruleset, used in UIs and logs to help administrators identify the ruleset.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the phaseName property value. Name of the phase during which the ruleset is evaluated (for example, httprequestfirewallmanaged, httprequestfirewallcustom, or provider-specific phase names). This indicates when in the request/response lifecycle the rules apply.
     * @param value Value to set for the phaseName property.
     */
    public void setPhaseName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("phaseName", value);
    }
    /**
     * Sets the rulesetId property value. Unique identifier assigned to the ruleset by Cloudflare or the integration.
     * @param value Value to set for the rulesetId property.
     */
    public void setRulesetId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("rulesetId", value);
    }
}
