package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudFlareVerifiedDetailsModel extends WebApplicationFirewallVerifiedDetails implements Parsable {
    /**
     * Instantiates a new {@link CloudFlareVerifiedDetailsModel} and sets the default values.
     */
    public CloudFlareVerifiedDetailsModel() {
        super();
        this.setOdataType("#microsoft.graph.cloudFlareVerifiedDetailsModel");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudFlareVerifiedDetailsModel}
     */
    @jakarta.annotation.Nonnull
    public static CloudFlareVerifiedDetailsModel createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudFlareVerifiedDetailsModel();
    }
    /**
     * Gets the enabledCustomRules property value. Collection of Cloudflare custom rules that are currently enabled for the zone or host.
     * @return a {@link java.util.List<CloudFlareRuleModel>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudFlareRuleModel> getEnabledCustomRules() {
        return this.backingStore.get("enabledCustomRules");
    }
    /**
     * Gets the enabledRecommendedRulesets property value. Collection of Cloudflare recommended rulesets that are enabled for the zone or host.
     * @return a {@link java.util.List<CloudFlareRulesetModel>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudFlareRulesetModel> getEnabledRecommendedRulesets() {
        return this.backingStore.get("enabledRecommendedRulesets");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("enabledCustomRules", (n) -> { this.setEnabledCustomRules(n.getCollectionOfObjectValues(CloudFlareRuleModel::createFromDiscriminatorValue)); });
        deserializerMap.put("enabledRecommendedRulesets", (n) -> { this.setEnabledRecommendedRulesets(n.getCollectionOfObjectValues(CloudFlareRulesetModel::createFromDiscriminatorValue)); });
        deserializerMap.put("zoneId", (n) -> { this.setZoneId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the zoneId property value. Cloudflare-assigned identifier for the DNS zone associated with the verified host (for example, the Cloudflare Zone ID). This ID is used to correlate verification details with the Cloudflare account and to perform configuration operations via the provider&apos;s API.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getZoneId() {
        return this.backingStore.get("zoneId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("enabledCustomRules", this.getEnabledCustomRules());
        writer.writeCollectionOfObjectValues("enabledRecommendedRulesets", this.getEnabledRecommendedRulesets());
        writer.writeStringValue("zoneId", this.getZoneId());
    }
    /**
     * Sets the enabledCustomRules property value. Collection of Cloudflare custom rules that are currently enabled for the zone or host.
     * @param value Value to set for the enabledCustomRules property.
     */
    public void setEnabledCustomRules(@jakarta.annotation.Nullable final java.util.List<CloudFlareRuleModel> value) {
        this.backingStore.set("enabledCustomRules", value);
    }
    /**
     * Sets the enabledRecommendedRulesets property value. Collection of Cloudflare recommended rulesets that are enabled for the zone or host.
     * @param value Value to set for the enabledRecommendedRulesets property.
     */
    public void setEnabledRecommendedRulesets(@jakarta.annotation.Nullable final java.util.List<CloudFlareRulesetModel> value) {
        this.backingStore.set("enabledRecommendedRulesets", value);
    }
    /**
     * Sets the zoneId property value. Cloudflare-assigned identifier for the DNS zone associated with the verified host (for example, the Cloudflare Zone ID). This ID is used to correlate verification details with the Cloudflare account and to perform configuration operations via the provider&apos;s API.
     * @param value Value to set for the zoneId property.
     */
    public void setZoneId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("zoneId", value);
    }
}
